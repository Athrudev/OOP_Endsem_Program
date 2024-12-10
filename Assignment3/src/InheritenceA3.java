import java.util.*;
import java.util.regex.Pattern;
class Employee{
	Scanner sc=new Scanner(System.in);
	String mail,id,name,address;
	int num;
	
	double bp,da,hra,pf,scf;
	
	public void getData(String post) {
		System.out.println("\n\nEnter the Information for the "+post);
		System.out.println("Enter employee name:");
		name=sc.nextLine();
		System.out.println("Enter employee ID:");
		id=sc.nextLine();
		
		
		while(true) {
			System.out.println("Enter employee mail:");
			mail=sc.nextLine();
			if(isValidEmail(mail)) {
				break;
			}else {
				System.out.println("Invalid email");
			}
		}
		
		System.out.println("Enter employee address:");
		address=sc.nextLine();
		
		
		while(true) {
			System.out.println("Enter employee Number:");
			String input=sc.nextLine();
			
			if(input.length()==10 && input.matches("\\d+")) {
				num=Integer.parseInt(input);
				break;
			}else {
				System.out.println("Invalid Number");
			}
		}
		
	}
	
	 void printSalarySlip(String post) {
		System.out.println("-------------------------");
		System.out.println("\tPay Slip");
		System.out.println("-------------------------");
		System.out.println("Post:"+post);
		System.out.println("-------------------------");
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("mail:"+mail);
		System.out.println("number:"+num);
		System.out.println("-------------------------");
		System.out.println("Basic Pay:"+bp);
		System.out.println("DA:"+da);
		System.out.println("hra:"+hra);
		double gross=bp+da+hra;
		System.out.println("Gross:"+gross);
		System.out.println("PF:"+pf);
		System.out.println("Staff Club fund:"+scf);
		double netSalary=bp-pf-scf;
		System.out.println("Net Salary:"+netSalary);
	}
	 
	 private boolean isValidEmail(String mail) {
			String regex="^[A-Za-z0-9+._-]+@(.+)$";
			return Pattern.matches(regex, mail);
		}
}

class Programmer extends Employee{
	
	Programmer(){
	bp=50000;
	da=bp*0.97;
	hra=bp*0.1;
	pf=bp*0.12;
	scf=bp*0.01;
	
	}
	
	void generatePaySlip() {
		printSalarySlip("Programmer");
	}
}

class AssistantProfessor extends Employee{

	AssistantProfessor(){
	bp=65000;
	da=bp*0.97;
	hra=bp*0.1;
	pf=bp*0.12;
	scf=bp*0.01;
	
	}
	
	void generatePaySlip() {
		printSalarySlip("Assistant Professor");
	}
	
}

class AssociateProfessor extends Employee{
	
	AssociateProfessor(){
	bp=40000;
	da=bp*0.97;
	hra=bp*0.1;
	pf=bp*0.12;
	scf=bp*0.01;
	
	}
	
	void generatePaySlip() {
		printSalarySlip("Associate Professor");
	}
}

class Professor extends Employee{
	Professor(){
	bp=70000;
	da=bp*0.97;
	hra=bp*0.1;
	pf=bp*0.12;
	scf=bp*0.01;
	
	}
	
	void generatePaySlip() {
		printSalarySlip("Professor");
	}
	
}
public class InheritenceA3 {
	
	public static void main(String args[]) {
		
		Programmer p=new Programmer();
		p.getData("Programmer");
				
		AssistantProfessor ap=new AssistantProfessor();
		ap.getData("Assistant Professor");
			
		AssociateProfessor apr=new AssociateProfessor();
		apr.getData("Associate Professor");
			
		Professor pro=new Professor();
		pro.getData("Professor");
		
		p.generatePaySlip();
		ap.generatePaySlip();
		apr.generatePaySlip();
		pro.generatePaySlip();
	}

}
