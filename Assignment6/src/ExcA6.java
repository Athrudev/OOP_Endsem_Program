import java.util.*;
import java.lang.*;
public class ExcA6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
		
		int n1,n2;
		System.out.println("Enter First Number");
		n1=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Second Number");
		n2=Integer.parseInt(sc.nextLine());
		
		if(n2==0) {
			throw new ArithmeticException("Divide by zero is not allowed");
			
		}
		
		int res=n1/n2;
		
		int arr[]=new int[2];
		arr[2]=res;
		
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException occured");
		}
		
		finally {
			sc.close();
			System.out.println("Program Ended");
		}

	}

}
