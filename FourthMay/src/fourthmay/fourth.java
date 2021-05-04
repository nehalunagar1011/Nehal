package fourthmay;

public class fourth {

	String Cname = "Audi";
	String Cmodel = "A258";
	int Cprice = 1000000;
	int Cyear = 2017;
	int Bprice = (int)(0.2 * Cprice);
	
	while(true){
        System.out.println("Enter Year");
        int year= sc.nextInt();
        if(year==-1)
            break;
            
        int diff= year-Cyear;
        if(diff<=0)
            {
                System.out.println("Enter Valid Year");
                continue;
            }
        int price= Cprice;
        
        for(int i=0;i<diff;i++)
        {
            int x = (int)(price *.1);
            price-=x;
        }
        
        System.out.println("Resale price of car in " + year + " is " + Math.max(price,Bprice));
        
    }
    
 }
}
		
	}
}
