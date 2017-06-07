package begin;

public class greater {

	private String format;
	
	public String greet(String guest){
		return String.format(format, guest);
		
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
	public static void main(String[] args){
		greater g = new greater();
		g.setFormat("%s 안녕하세요");
		String temp = g.greet("Spring");
		
		System.out.println(temp);
		
	}
}
