package spring.boot.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring/boot/Autowiring/Bean/beans.xml");
       
       Logger logger =(Logger) context.getBean("logger");
       
       logger.writeConsole("hello there");
       logger.FileWriter("hi there");
    }
}
