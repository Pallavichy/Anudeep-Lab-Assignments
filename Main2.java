package SpringAssignment;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main2 
{
	public static void main(String[] args) 
	{
		        System.out.println( "The execution of project has started" );
		        ApplicationContext context = new
		        ClassPathXmlApplicationContext("SpringAssignment/con2.xml");
		        Bus bus = context.getBean("bus1", Bus.class);
		        System.out.println(bus);
		        System.out.println("Project Execution Ended");
	}
}
