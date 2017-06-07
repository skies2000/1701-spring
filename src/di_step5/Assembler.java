package di_step5;
//DI를 구현하기 위한 외부 조립기
//외부에서 객체를 생성한 후 변환하는 목적
public class Assembler {
	private MyDb db;
	
	public Assembler(MyDb db){
		this.db = db;
	}

	public MyDb getDb() {
		return db;
	}
	
}
