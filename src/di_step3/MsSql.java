package di_step3;

public class MsSql implements MyDb{
	public String getVender(){
		return "MsSql";
	}

	@Override
	public String getDB() {
		return getVender();
	}
}
