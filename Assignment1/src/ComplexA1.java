import java.util.*;
class Complex{
	int real,imag;
	Complex(int real,int imag){
		this.real=real;
		this.imag=imag;
	}
	
	void add(Complex a,Complex b) {
		Complex sum=new Complex(0,0);	
		sum.real=a.real+b.real;
		sum.imag=a.imag+b.imag;
		
		System.out.println("Sum: "+sum.real+"+"+sum.imag+"i");
		
	}
	
	void sub(Complex a,Complex b) {
		Complex sum=new Complex(0,0);	
		sum.real=a.real-b.real;
		sum.imag=a.imag-b.imag;
		
		System.out.println("Sub: "+sum.real+"+"+sum.imag+"i");
		
	}
	
	void mul(Complex a,Complex b) {
		Complex sum=new Complex(0,0);	
		sum.real=a.real*b.real;
		sum.imag=a.imag*b.imag;
		
		System.out.println("Mul: "+sum.real+"+"+sum.imag+"i");
		
	}
	
	void div(Complex a,Complex b) {
		Complex sum=new Complex(0,0);	
		sum.real=a.real/b.real;
		sum.imag=a.imag/b.imag;
		
		System.out.println("Div: "+sum.real+"+"+sum.imag+"i");
		
	}
}

public class ComplexA1 {

	public static void main(String[] args) {
		int a1,a2;
		int b1,b2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the real part of the first no:");
		a1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the imaginary part of the first no:");
		a2=Integer.parseInt(sc.nextLine());
		
		
		System.out.println("Enter the real part of the Second no:");
		b1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the imaginary part of the Second no:");
		b2=Integer.parseInt(sc.nextLine());
		
		Complex c1=new Complex(a1,a2);
		Complex c2=new Complex(b1,b2);
		
		c1.add(c1, c2);
		c1.sub(c1, c2);
		c1.mul(c1, c2);
		c1.div(c1, c2);

	}

}
