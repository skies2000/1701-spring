package aop_ano;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PrintLog {
	
	
	 
	@Around("execution(* aop_ano.*.*log(..))")
	public Object checkLog(ProceedingJoinPoint point)throws Throwable{
		
		
		Calendar cal = Calendar.getInstance();
		String className = point.getSignature().getName();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh:mm:ss");
		String str = sdf.format(cal.getTime());
		str +=", 호출된 메소드 : "+className;
		System.out.println(str);
		
		Object result = point.proceed(); 
		return result;
		
	}

}
