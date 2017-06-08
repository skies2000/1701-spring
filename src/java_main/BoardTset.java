package java_main;

import org.springframework.context.support.GenericXmlApplicationContext;

import bean.BoardDao;
import bean.BoardVo;
import bean.DBConnect;
import di_step5.Assembler;

public class BoardTset {
	public void run(){
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("bean/context.xml");
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
