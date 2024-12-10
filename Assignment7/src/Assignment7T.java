import java.util.*;

class temp{
	List<Integer> list=new ArrayList();
	int n;
	Scanner sc=new Scanner(System.in);
	
	public temp() {
		System.out.println("Enter the size of the List:");
		n=Integer.parseInt(sc.nextLine());
		
	}
	
	public void addElem() {
		if(list.isEmpty()) {
			System.out.println("Enter the Element's");
			for(int i=0;i<n;i++) {
				int ele=Integer.parseInt(sc.nextLine());
				list.add(ele);
			}
		}else {
			System.out.println("The list is alredy populated");
		}
	}
	
	public void countElem() {
		System.out.println("Count:"+list.size());
		System.out.println("All element's: "+list);
	}
	
	public void even() {
		int c=0;
		
		for(int num:list) {
			if(num%2==0) {
				System.out.println(num);
				c++;
			}
		}
		
		System.out.println("Count of Even number"+c);
		
	}
	
	public void odd() {
		int c=0;
		for(int num:list) {
			if(num%2!=0) {
				System.out.println(num);
				c++;
			}
		}
		System.out.println("Count of Odd number"+c);
	}
	
	
	public void prime() {
		int c=0;
		
		for(int num:list) {
			boolean isPrime=true;
			
			if(num<=0)continue;
			for(int j=2;j<=Math.sqrt(j);j++) {
				if(num%j==0) {
					isPrime=false;
				}
				
			}
			
		
			if(isPrime) {
				System.out.println(num);
				c++;
			}
				
		}
		
		System.out.println("Count of prime numbers"+c);
	}
	
	public void palindrome() {
		int c=0;
		
		for(int num:list) {
			int rev=0,rem;
			int temp=num;
			
			while(num!=0) {
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			
			if(temp==rev) {
				System.out.println(temp);
				c++;
			}
		}
		
		System.out.println("Count of Palindrome number in the list:"+c);
		
	}
	
}

public class Assignment7T {

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	temp t=new temp();
	
	while(true) {
        System.out.println("------------------------------------");
        System.out.println("1. Get elements in a list");
        System.out.println("2. Count elements in a list");
        System.out.println("3. Even elements in a list");
        System.out.println("4. Odd elements in a list");
        System.out.println("5. Prime elements in a list");
        System.out.println("6. Palindrome elements in a list");
        System.out.println("7. Exit");
        System.out.println("------------------------------------");
        System.out.println("Enter your choice = ");
        int ch=Integer.parseInt(sc.nextLine());
        
        switch(ch) {
        case 1:
        	t.addElem();
        	break;
        	
        case 2:
        	t.countElem();
        	break;
        	
        case 3:
        	t.even();
        	break;
        	
        case 4:
        	t.odd();
        	break;
        
        case 5:
        	t.prime();
        	break;
        	
        case 6:
        	t.palindrome();
        	break;
        	
        case 7:
        	sc.close();
        	System.exit(0);
        	
        default:
        	System.out.println("Code Exited...");
        }
		
	}
		
	}
}
