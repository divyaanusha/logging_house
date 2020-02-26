package epam.house_cost;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class DataException extends Exception
{
 public DataException()
 {
	 
 }
 public DataException(String message)
 {
  super(message);
 }
}
public class Client
{
	public static Logger LOGGER=LogManager.getLogger(Client.class);
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int standard,area;
		System.out.println("Enter Material Standard\n1.standard\n2.above standard\n3.high standard\n4.high standard and fully automated home");
		LOGGER.info("CHOOSING THE STANDARD");
		LOGGER.warn("need to choose from range of standards");
		
		standard=sc.nextInt();
		try
		{
			if(standard>4)
			{
				throw new DataException(" ");
			}
		}
		catch (DataException e)
		{
			LOGGER.error("standard is not in the range specified");
			System.exit(0);
		}
		LOGGER.debug("choosing completed");
		System.out.println("Enter total area of the house in sq.ft");
		area=sc.nextInt();
		LOGGER.debug("area in square feet entered");
		Construction ob1=new Construction(standard,area);
		LOGGER.debug("reference ob1 is created");
		LOGGER.debug("calling the calculatecost()");
		ob1.calculateCost();
		sc.close();
	}
}