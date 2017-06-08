package di_anno2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("sp4_chap04/anno_context.xml");
		AutoWired aw = ctx.getBean("autowire",AutoWired.class);
		Member mb = aw.getUser();
		System.out.println(mb.getIrum());
	}
}
