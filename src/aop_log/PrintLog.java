package aop_log;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.aspectj.lang.JoinPoint;

public class PrintLog {
	public Object checkLog(JoinPoint point)throws Throwable{
		
		
		Calendar cal = Calendar.getInstance();
		String className = point.getSignature().getName();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh:mm:ss");
		String str = sdf.format(cal.getTime());
		str +=", 호출된 메소드 : "+className;
		System.out.println(str);
		
		return null;
	}

}
