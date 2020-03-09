package VJIT.DesignPattersTask;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Choose Design Pattern\n 1)Singleton Pattern\n 2)Builder Pattern\n 3)Adapter Pattern\n 4)Composite Pattern\n 5)Command Pattern\n 6)State Pattern\n");
        choice=sc.nextInt();
        switch(choice)
        {
        case 1:
        	SingletonPatternEx.main(null);
        	break;
        case 2:
        	BuilderPatternEx.main(null);
        	break;
        case 3:
        	AdapterPatternEx.main(null);
        	break;
        case 4:
        	CompositePatternEx.main(null);
        	break;
        case 5:
        	CommandPatternEx.main(null);
        	break;
        case 6:
        	StatePatternEx.main(null);
        	break;
        default:
        	System.out.println("Invalid Choice\n");
        	
        }
    }
    
}
