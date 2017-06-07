package di_step2;
/*DI를 구현하기전에 특정 환경에 맞는
 * 스페셜한 클래스
 */
public class Oracle implements MyDb{
	public String getName(){
		return "오라클";
	}

	@Override
	public String getDB() {
		return getName();
	}
}
