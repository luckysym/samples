package shiym.samples.spring;

import acc.*;
import auto.*;
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

    public static void doAuto(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("sample01-auto.xml");
        Building build = (Building)ctx.getBean("building");
        System.out.println("Build: " + build.toString());
    }
}
