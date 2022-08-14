package project1;
/**
 * This class is being used to test all the parts of the project
 * @author Joshua Domzalski
 * Programming Project 1
 * Summer 2022
 */

public class Application{

		public static void main(String[] args) {
			
			/**
			 * Created an object of each type, passed in data, and called the draw method for each object
			 */
			
			Building a = new Building("Gaines House", "123 Main Street", 2345 ,"Assembly", "A-1");
			System.out.println(a);
			a.draw();
			Business b = new Business("Koko Office", "1620 Ivey Ave", 3200, "Business", "B", 50);
			System.out.println(b);
			b.draw();
			Residential c = new Residential("Lyman Living", "800 Shelby Street", 3000, "Residential", "R-1",5, 4, true);
			System.out.println(c);
			c.draw();
			Mall d = new Mall("Hyperplex Mall", "1000 Davidson Street", 200000, "Mercantile", "M", 100, 70, 800, 500);
			System.out.println(d);
			d.draw();
			Apartment e = new Apartment("Highlow Apartment", "8542 Downtown Centre", 1000, "Residential", "R-2", 3, 2, false, 3, 250, true);
			System.out.println(e);
			e.draw();
			SingleFamilyHome f = new SingleFamilyHome("Jones House", "909 Main Street", 2550, "Residential", "R-1", 4, 4, true, true);
			System.out.println(f);
			f.draw();
			
			
		}//end main
}
//end class


