package spring.boot.DataBaseConnection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring/boot/DataBaseConnection/Beans/Bean.xml");
       
      NoticesDAO noticesDao =(NoticesDAO) context.getBean("noticesDao");
      
      List<Notice> notices = noticesDao.getNotices();
      
      for(Notice notice: notices){
    	  
    	  System.out.println(notice);
      }
      
    }
}
