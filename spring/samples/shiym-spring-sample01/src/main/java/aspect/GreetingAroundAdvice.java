package aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GreetingAroundAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		
		Object[] args = invocation.getArguments();
		String customerName = (String)args[0];
		System.out.println("Hello, " + customerName);
		
		Object obj = invocation.proceed();
		
		System.out.println("See you, " + customerName);
		
		return obj;
	}

}
