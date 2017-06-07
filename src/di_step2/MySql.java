package di_step2;

public class MySql implements MyDb{
	public String getAgent(){
		return "My Sql";
	}

	@Override
	public String getDB() {
		return getAgent();
	}
}
