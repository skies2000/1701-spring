package di_constructor;

public class ValueObject {
	
	public ValueObject(){
		
	}
	public ValueObject(int dan){
		int r = 0;
		for(int i=1; i<10 ;i++){
			String str = String.format("%d * %d = %d", dan,i,dan*i);
			System.out.println(str);
		}
	}
}
