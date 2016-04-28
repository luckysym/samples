package shiym.samples.spring;

import acc.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void doMain( String[] args )
    {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("sample01.xml");

        Person person = (Person)ctx.getBean("american");
        System.out.println(person.sayHello("Shi Yimin"));
        System.out.println(person.sayGoodBye("Shi Yimin"));
        person.useAxe();   // 通过IoC设置了Axe

        person = (Person)ctx.getBean("chinese");
        System.out.println(person.sayHello("Shi Yimin"));
        System.out.println(person.sayGoodBye("Shi Yimin"));
        person.useAxe();   // 通过IoC设置了Axe
    }
}
