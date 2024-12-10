import java.util.*;
abstract class Shape{
	double length,width;
	abstract void compute_area();
	abstract void getDimension();
	
}

class Triangle extends Shape{
	
	Scanner sc=new Scanner(System.in);
	public void getDimension() {
		while(true) {
			System.out.println("Enter the length: ");
			length=sc.nextDouble();
			if(length>0) {
				break;
			}else {
				System.out.println("Enter a positive number");
			}
		}
		
		
		while(true) {
		System.out.println("Enter the width: ");
		width=sc.nextDouble();
		if(length>0) {
			break;
		}else {
			System.out.println("Enter a positive number");
		}
		}
		
		
		
	}
	
	
	public void compute_area() {
		double area=0.5*length*width;
		System.out.println("Area of an Triangle is: "+area);
	}
}

class Rectangle extends Shape{
	
	Scanner sc=new Scanner(System.in);
	public void getDimension() {
		while(true) {
			System.out.println("Enter the length: ");
			length=sc.nextDouble();
			if(length>0) {
				break;
			}else {
				System.out.println("Enter a positive number");
			}
		}
		
		
		while(true) {
		System.out.println("Enter the width: ");
		width=sc.nextDouble();
		if(length>0) {
			break;
		}else {
			System.out.println("Enter a positive number");
		}
		}
		
		
		
	}
	
	
	public void compute_area() {
		double area=length*width;
		System.out.println("Area of an Rectangle is: "+area);
	}
}



public class BindingA4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true) {
			System.out.println("1.Triangle\n2.Rectangle\n3.Exit ");
			System.out.println("Enter Your Choice: ");
			ch=Integer.parseInt(sc.nextLine());
			
			
			
			switch(ch) {
				case 1:
					Shape t=new Triangle();
					t.getDimension();
					t.compute_area();
					break;
					
				case 2:
					Shape r=new Rectangle();
					r.getDimension();
					r.compute_area();
					break;
					
				case 3:
					sc.close();
					System.exit(0);
					
				default:
					System.out.println("Invalid Choice");
				
			}
		}

	}

}
