package di_anno;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("di_anno/context.xml");
		BoardDao dao= ctx.getBean("dao",BoardDao.class);
		BoardVo vo = new BoardVo();
		vo.setSerial(64);
		vo = dao.view(vo);
		System.out.println(vo.getSerial());
		System.out.println(vo.getContent());
		System.out.println(vo.getmDate());
		System.out.println(vo.getWorker());
		System.out.println(vo.getSubject());
		System.out.println(vo.getHit());
	}
}
