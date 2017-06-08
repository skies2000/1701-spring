package di_constructor;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DiMain {
	public DiMain(){
		//스프링이 제공한 외부 조립기
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(
						"di_constructor/value_constructor.xml");
		//생성자의 매개변수가 기본형인 클래스 테스트
		ValueObject o = ctx.getBean("obj",ValueObject.class);
		
		//sdan~edan
		ValueObjectProperty op = ctx.getBean("obj2",ValueObjectProperty.class);
		System.out.println("-----------obj2--------------");
		op.output();
		
	}
	public static void main(String[] args) {
		new DiMain();
	}

}
