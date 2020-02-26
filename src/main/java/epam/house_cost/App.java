package epam.house_cost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class Construction
{
	public static Logger LOGGER=LogManager.getLogger(Construction.class);
	int standard,house_area;
	Construction(int std,int area)
	{
		standard=std;
		house_area=area;
	}
	void calculateCost()
	{
		if(standard==1) {
			LOGGER.debug("LOW STANDARD CHOOSED");
			System.out.println("Construction Cost: "+house_area*12000);
		}
		else if(standard==2) {
			LOGGER.debug("ABOVE STANDARD CHOOSED");
			System.out.println("Construction Cost: "+house_area*15000);
		}
		else if(standard==3) {
			LOGGER.debug("HIGH STANDARD CHOOSED");
			System.out.println("Construction Cost:"+house_area*18000);
		}
		else {
			LOGGER.debug("HIGH STANDARD AND FULLY AUTOMATED CHOOSED");
			System.out.println("Construction Cost:"+house_area*25000);
		}
	}
}


