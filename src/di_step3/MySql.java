package di_step3;

public class MySql implements MyDb{
	public String getAgent(){
		return "My Sql";
	}

	@Override
	public String getDB() {
		return getAgent();
	}
}
