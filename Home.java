package bill;

import java.util.Scanner;

public class Home {
	Scanner sc =new Scanner(System.in);
	double EC=0;
	double FX=0;
	double unit;
	void calculation() {
		System.out.println("enter the current reading");
		double curr=sc.nextDouble();
		System.out.println("enter the previous reading");
		double pre=sc.nextDouble();	
	//	System.out.println(unit);
		 unit=curr-pre;
		 if(unit<=50){
			 EC=unit*4.27;
			 
		}
		else if(unit>=51 && unit<150) {
			EC=(50*2.27)+((unit-50)*5.23);
			FX=80;
		}
		else if(unit>=151 && unit<300) {
			EC=(50*2.27)+(100*5.23)+((unit-150)*6.61);
			FX=80;
		}else if(unit>=301 && unit<500) {
			EC=(50*2.27)+(100*5.23)+(150*6.61)+((unit-300)*6.80);
			FX=80+60;
		}
        double tax=EC*5/100;
		double totalbill=EC+FX+tax;
	}

}
