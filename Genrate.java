package bill;

import java.util.Scanner;

public class Genrate {
public static void main(String[] args) {
	double EC=0;
	double FX=0;
	double unit = 0;
	double tax = 0;
	double totalbill = 0;
	String a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	String name=sc.nextLine();
	System.out.println("enter the address");
	String address=sc.nextLine();
	System.out.println("enter the Bill number");
	String bill=sc.nextLine();
	System.out.println("Press 1 for home");
	System.out.println("Press 2 for commerical");
	int num=sc.nextInt();
	switch (num) {
	case 1:	System.out.println("enter the current reading");
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
	else {
		EC=(50*2.27)+(100*5.23)+(150*6.61)+(300*6.80)+(unit-500)*7.0;
		FX=80+60;
	}
    tax=EC*5/100;
	totalbill=EC+FX+tax;

		break;
	case 2:System.out.println("enter the current reading");
	 curr=sc.nextDouble();
	System.out.println("enter the previous reading");
	 pre=sc.nextDouble();	
	 unit=curr-pre;
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
	else {
		EC=(50*5.50)+(100*6.0)+(150*6.0)+(300*7.00)+(unit-500)*7.50;
		FX=200;
	}
     tax=EC*5/100;
	 totalbill=EC+FX+tax;

	break;
	}
	if(num==1) {
		    a="Home";
	}
	else {
		a="commerical";
	}
	System.out.println("---------------------------------------------------------------");
	System.out.println("-----------------------CUSTOMER DETAIL--------------------");
	System.out.println("| Name                                 |"+name+     "            |");
	System.out.println("| Address                              |"+address+  "            |");
	System.out.println("| Bill Number                          | "+bill+    "            |");
	System.out.println("| Bill Type                            | "+a+       "            |");
	System.out.println("-----------------------CUSTOMER BIll Detail--------------------");
	System.out.println("| Unit of Consumer                     |"+unit+     "            |");
	System.out.println("| Electricity bill                     |"+EC+       "            |");
	System.out.println("| Fixed Charge                         |"+FX+       "            |");
	System.out.println("| Tax                                  |"+tax+      "            |");
	System.out.println("| Total bill                           |"+totalbill+"            |");
	System.out.println("---------------------------------------------------------------");
}
}
