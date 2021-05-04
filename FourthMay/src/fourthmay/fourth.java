package fourthmay;

public class fourth {

	String Cname = "Audi";
	String Cmodel = "A258";
	int Cprice = 1000000;
	
	public int Carprice() {
		
		int b = Cprice/10;
		Cprice = Cprice - b;
		
		return Cprice;
	}
	
	fourth(){}
	
	public static void main(String args[]) {
		
		fourth c1 = new fourth();
		
		System.out.println("Car Name : " + c1.Cname);
		System.out.println("Car Model : " + c1.Cmodel);
		System.out.println("Car Price in 2017 : " + c1.Cprice);
		
		int a = c1.Carprice();
		System.out.println("Car price in 2018 : " + a);
		
		int c = c1.Carprice();
		System.out.println("Car price in 2019 : " + c);
		
		
	}
}
