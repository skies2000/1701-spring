package aop_begin;

public class ImpeCalculator implements Calculator{

	@Override
	public long factorial(long num) {
		long result = 1;
		for(int i=1; i<=num;num++){
			result *=i;
		}
		return result;
	}
}
