package SpringAssignment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// Main1 file for running the file
public class Main1 
{
    public static void main( String[] args )
    {
        System.out.println( "The execution of project has started" );
        ApplicationContext context = new ClassPathXmlApplicationContext("con1.xml");
        Car car = (Car)context.getBean("car1"); //typecasting 
        System.out.println(car); //printing the values 
        System.out.println("Project Execution Ended");
    }
}
