package SpringAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext
        		("SpringAssignment/AutoConfi.xml");
        Emp emp = context.getBean("emp", Emp.class); //object 
        System.out.println(emp); //printing the values 
    }
}
