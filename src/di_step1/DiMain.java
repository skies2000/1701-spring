package di_step1;
/*DI형태의 구조물이 만들어지지 않은 상태로
 * 서로 다른 환경에서는 코드를 그때 그때 다시 디버깅해야 함
 */
public class DiMain {

	public static void main(String[] args) {
		//김씨
		MySql sql = new MySql();
		String db = sql.getAgent();
		System.out.println(db);

		//박씨
		Oracle sql2 = new Oracle();
		String db2 = sql2.getName();
		System.out.println(db2);
		
		//홍씨
		MsSql sql3 = new MsSql();
		String db3 = sql3.getVender();
		System.out.println(db3);
	}

}
