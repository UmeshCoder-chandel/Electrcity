package bill;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name ");
		String name=sc.next();
		System.out.println("enter the address ");
		String address=sc.next();
		int n=0;
		do {
			System.out.println("enter the number for home to press 1 and commerical press 2");
			int num=sc.nextInt();
			switch(num) {
			case 1: System.err.println("enter the unit ");
			double unit=sc.nextDouble();
			double FC=0;
			double EC=0;
		 //  double unit=units/100;
			if(unit<=50) {
				EC=unit*3.34;	
				System.out.println("20");
			}
			else if(unit>=51 && unit<=100) {
				EC=unit*4.27;
				System.out.println("30");
			}
			else if(unit>=101 && unit<=150) {
				EC=unit*5.23;
				System.out.println("40");
			}
			else if(unit>151 && unit<=200) {
				EC=unit*6.61;
				System.out.println("60");
			}
			else {
				EC=unit*6.80;
				System.out.println("70");
			}
			}
			
		}while(n==1);
	}

}
