package spring.patient.patientHello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	org.springframework.context.ApplicationContext context = new  ClassPathXmlApplicationContext ("spring/patient/patientHello/beans/beans.xml"); 
    	
       Patient patient1 =(Patient) context.getBean("patient");
       Patient patient2 =(Patient) context.getBean("patient");
    //   Address address =(Address) context.getBean("address");
       
       patient1.setName("Sohel Sorowar");
       System.out.println(patient2);
    //   System.out.println(address);
       
       ((ClassPathXmlApplicationContext) context).close();
    }
}
