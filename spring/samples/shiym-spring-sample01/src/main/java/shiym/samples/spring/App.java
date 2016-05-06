package shiym.samples.spring;

import acc.*;
import auto.*;
import aspect.*;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void doMain( String[] args )
    {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("sample01.xml");
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("sample01.xml");
        Person person = (Person)ctx.getBean("american");
        System.out.println(person.sayHello("Shi Yimin"));
        System.out.println(person.sayGoodBye("Shi Yimin"));
        person.useAxe();   // 通过IoC设置了Axe

        person = (Person)ctx.getBean("chinese");
        System.out.println(person.sayHello("Shi Yimin"));
        System.out.println(person.sayGoodBye("Shi Yimin"));
        person.useAxe();   // 通过IoC设置了Axe

        // 从db.properties中获取字段内容
        String username = ctx.getMessage("jdbc.username", null, Locale.getDefault());
        System.out.println("username="+username);
    }

    public static void doAuto(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("sample01-auto.xml");
        Building build = (Building)ctx.getBean("building");
        System.out.println("Build: " + build.toString());
    }
    
    public static void doAspect() {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("aspect/sample01-aop.xml");
    	Reception reception = (Reception)ctx.getBean("reception");
    	reception.serveCustomer("Shi Yimin");
    	
    	Reception reception2 = (Reception)ctx.getBean("reception2");
    	reception2.serveCustomer("Shi Xianjin");
    }
}
