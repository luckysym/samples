package aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class GreetingAfterAdvice implements AfterReturningAdvice {


	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		if (arg2.length > 0) { 
			String customName = (String)arg2[0];
			System.out.println("Goodbye, " + customName + ".");
		} else {
			System.out.println("Here is a people");
		}
	}

}
