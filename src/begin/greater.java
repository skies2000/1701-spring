package begin;

import org.springframework.context.support.GenericXmlApplicationContext;

public class greater {

	private String format;
	
	public String greet(String guest){
		return String.format(format, guest);
		
	} 

	public void setFormat(String format) {
		this.format = format;
	}
	
	public static void main(String[] args){
		/*
		 * 스프링의 환결 설정 파일인 app_context.xml 을
		 * 사용함으로써 같은 의미로 처리됨
		 * greater g = new greater();
		g.setFormat("%s 안녕하세요");
		*/
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("begin/app_context.xml");
		greater g = ctx.getBean("greater",greater.class);
		
		String temp = g.greet("Spring");
		System.out.println(temp);
		ctx.close();
		
	}
}
