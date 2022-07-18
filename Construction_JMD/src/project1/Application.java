package project1;


public class Application{

		public static void main(String[] args) {
			
			Building a = new Building("Gaines House", "123 Main Street", 2345 ,"Assembly", "A-1");
			System.out.println(a);
			Business b = new Business("Koko Office", "1620 Ivey Ave", 3200, "Business", "B", 50);
			System.out.println(b);
			Residential c = new Residential("Lyman Living", "800 Shelby Street", 3000, "Residential", "R-1",5, 4, true);
			System.out.println(c);
			Mall d = new Mall("Hyperplex Mall", "1000 Davidson Street", 200000, "Mercantile", "M", 100, 70, 800, 500);
			System.out.println(d);
			Apartment e = new Apartment("Highlow Apartment", "8542 Downtown Centre", 1000, "Residential", "R-2", 3, 2, false, 3, 250, true);
			System.out.println(e);
			SingleFamilyHome f = new SingleFamilyHome("Jones House", "909 Main Street", 2550, "Residential", "R-1", 4, 4, true, true);
			System.out.println(f);
		}//end main
}
//end class


