package aspect;
import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object obj) throws Throwable {
		String customName = (String)args[0];
		System.out.println("Nice to see you, " + customName + ", follow me please.");
	}
}
