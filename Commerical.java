package bill;

import java.util.Scanner;

public class Commerical {
	Scanner sc =new Scanner(System.in);
	double EC=0;
	double FX=0;
	void calculation1() {
		System.out.println("enter the current reading");
		double curr=sc.nextDouble();
		System.out.println("enter the previous reading");
		double pre=sc.nextDouble();	
		double unit=curr-pre;
		System.out.println(unit);
		if(unit<=50){
			 EC=unit*5.50;
			 FX=100;
		}
		else if(unit>=51 && unit<150) {
			EC=(50*5.50)+((unit-50)*6.0);
			FX=100;
		}
		else if(unit>=151 && unit<300) {
			EC=(50*5.50)+(100*6.0)+((unit-150)*6.50);
			FX=100;
		}else if(unit>=301 && unit<500) {
			EC=(50*5.50)+(100*6.0)+(150*6.0)+((unit-300)*7.00);
			FX=170;
		}
        double tax=EC*5/100;
		double totalbill=EC+FX+tax;
	}

}
