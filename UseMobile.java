package For2;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "Oneplus";
		m1.colour = "Blue";
		m1.price = 30000;
		m1.year = 2020;

		Mobile m2 = new Mobile();
		m2.brand="Samsung";
		m2.colour="White";
		m2.price=10000;
		m2.year=2023;
		
		Mobile m3 = new Mobile();
		m3.brand = "Oppo";
		m3.colour="Red";
		m3.price=25000;
		m3.year=2021;
		
		Mobile m4 =new Mobile();
		m4.brand="Vivo";
		m4.colour="Black";
		m4.price=15000;
		m4.year=2022;
		
		Mobile m5= new Mobile();
		m5.brand="Realme";
		m5.brand="Yellow";
		m5.price=12000;
		m5.year=2019;
		
		// Normal For
		Mobile[] mob = {m1,m2,m3,m4,m5};
		for(int i=0; i<mob.length ; i++) {
//			System.out.println(mob[i].brand+" "+mob[i].colour+" "+mob[i].price+" "+mob[i].year);
//		}
//		
//		
//		// Enhance For
		for(Mobile a:mob) {
			System.out.println(a.brand+" "+a.colour+" "+a.price+" "+a.year);
			
		}
		
		//Max Price Mobile
		//Mobile max = mob[0];
		//for(int i=0;i<mob.length ; i++) {
		//	if (mob[i].price<20000 && mob[i].price>10000) {
				//max = mob[i];
	//	System.out.println(mob[i].brand+" "+mob[i].colour+" "+mob[i].price+" "+mob[i].year);
		//}
		}
	}
}

class Mobile {
	String brand;
	int price;
	String colour;
	int year;
}