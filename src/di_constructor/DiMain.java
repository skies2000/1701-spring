package di_constructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DiMain {
	public DiMain(){
		//스프링이 제공한 외부 조립기
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(
						"di_constructor/value_constructor.xml");
		//생성자의 매개변수가 기본형인 클래스 테스트
		/*ValueObject o = ctx.getBean("obj",ValueObject.class);*/
		
		//sdan~edan
		ValueObjectProperty op = ctx.getBean("obj2",ValueObjectProperty.class);
		// ValueObjectProperty op2 = (ValueObjectProperty)ctx.getBean("obj2"); 위에랑 같은 개념
		System.out.println("-----------obj2--------------");
		op.output();
		
		SpringDBConnect db = ctx.getBean("db",SpringDBConnect.class);
		Connection conn = db.getConn();
		ResultSet rs = null;
		PreparedStatement ps = null;
		String sql = "";
		try {
			sql = "select * from board";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				System.out.println("시리얼 번호 : "+rs.getInt("serial"));
				System.out.println("날짜 : "+rs.getString("mdate"));
				System.out.println("작성자 : "+rs.getString("worker"));
				System.out.println("제목 : "+rs.getString("subject"));
				System.out.println("내용 : "+rs.getString("content"));
			}
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	public static void main(String[] args) {
		new DiMain();
	}

}
