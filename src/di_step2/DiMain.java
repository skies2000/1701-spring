package di_step2;
/*DI형태의 구조물이 만들어지지 않은 상태로
 * 서로 다른 환경에서는 코드를 그때 그때 다시 디버깅해야 함
 */
public class DiMain {
	public static void prn(MyDb db){
		System.out.println(db.getDB());
	}
	public static void main(String[] args) {
		//김씨
		MyDb sql = new MySql();
		prn(sql);
		
		//박씨
		sql = new Oracle();
		prn(sql);
		
		//홍씨
		sql = new MsSql();
		prn(sql);
	}
	
}
