package di_constructor;

public class ValueObjectProperty {
	int sdan;
	int edan;
	
	public void output(){
		String str="";
		for(int i=sdan; i<edan;i++){
			for(int j=1; j<10; j++){
				str = String.format("%d * %d = %d", i ,j,j*i );
				System.out.println(str);
			}
		}
	}

	public void setSdan(int sdan) {
		this.sdan = sdan;
	}

	public void setEdan(int edan) {
		this.edan = edan;
	}
	
}
