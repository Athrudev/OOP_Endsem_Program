import java.util.*;
import java.io.*;
import java.lang.*;

class Database{
	Scanner sc=new Scanner(System.in);
	public final static String FILENAME="records.txt";
	
	public static String DbEntry(String id,String name,String roll,String cls,String mark,String address) {
		return id+","+name+","+roll+","+cls+","+mark+","+address;
	}
	
	public void create() {
		try {
			FileWriter w=new FileWriter(FILENAME,true);
			
			System.out.println("Enter the Number of entries:");
			int n=Integer.parseInt(sc.nextLine());
			
			
			
			for(int i=0;i<n;i++) {
				System.out.println("Enter Entry for Student "+(i+1));
				System.out.println("Enter Student Id:");
				String id=sc.nextLine();
				System.out.println("Enter Student name:");
				String name=sc.nextLine();
				System.out.println("Enter Student roll:");
				String roll=sc.nextLine();
				System.out.println("Enter Student class:");
				String cls=sc.nextLine();
				System.out.println("Enter Student mark:");
				String mark=sc.nextLine();
				System.out.println("Enter Student address:");
				String address=sc.nextLine();	
				
				
				String data=DbEntry(id,name,roll,cls,mark,address);
				w.write(data+"\n");
			}
			w.close();
			System.out.println("Database Created Successfully");	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void display() {
		
		
		try {
			int c=0;
			Scanner sc=new Scanner(new File(FILENAME));
			while(sc.hasNextLine()) {
				String data=sc.nextLine();
				c++;
				String[] arr=data.split(",");
				
				System.out.println("Record no:"+c);
				System.out.println("ID: "+arr[0]);
				System.out.println("Name: "+arr[1]);
				System.out.println("Roll no: "+arr[2]);
				System.out.println("Class: "+arr[3]);
				System.out.println("Marks: "+arr[4]);
				System.out.println("Adress: "+arr[5]);
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void delete() {
		
		try {
			
			Scanner reader=new Scanner(new File(FILENAME));
			System.out.println("Enter a id to delete");
			String id=sc.nextLine();
			List<String> arr=new ArrayList();
			boolean found=false;
			
			while(reader.hasNextLine()) {
				String line=reader.nextLine();
				if(line.startsWith(id+",")) {
					found=true;
				}else {
					arr.add(line);
				}
			}
			
			try {
				if(found) {
					FileWriter w=new FileWriter(FILENAME);
					for(String ele:arr) {
						w.write(ele+"\n");
					}
					w.close();
					System.out.println("Data deleted successfully");
					
				}else {
					System.out.println("Data no found");
				}
			}catch(Exception e) {
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void update() {
		
		try {
			Scanner reader=new Scanner(new File(FILENAME));
			System.out.println("Enter an id to update");
			String id=sc.nextLine();
			int index;
			List<String> arr=new ArrayList();
			boolean found=false;
			
			while(reader.hasNextLine()) {
				String data=reader.nextLine();
				arr.add(data);
			}
			
			for(int i=0;i<arr.size();i++) {
				if(arr.get(i).startsWith(id+",")) {
					System.out.println("Ente new details:");
					
					System.out.println("Enter Student Id:");
					String newid=sc.nextLine();
					System.out.println("Enter Student name:");
					String name=sc.nextLine();
					System.out.println("Enter Student roll:");
					String roll=sc.nextLine();
					System.out.println("Enter Student class:");
					String cls=sc.nextLine();
					System.out.println("Enter Student mark:");
					String mark=sc.nextLine();
					System.out.println("Enter Student address:");
					String address=sc.nextLine();	
					
					String data=DbEntry(newid,name,roll,cls,mark,address);
					arr.set(i, data);
					
					found =true;
				}
			}
			
			
			try {
				if(found) {
					FileWriter w=new FileWriter(FILENAME);
					for(String ele:arr) {
						w.write(ele+"\n");
					}
					w.close();
					System.out.println("Data Updated Successfully");
				}else {
					System.out.println("no Data found");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void search() {
		
	}
	
}

public class Assignment8 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Database d=new Database();
		while(true) {
			System.out.println("Enter you choice");
			int ch=Integer.parseInt(sc.nextLine());
			switch(ch) {
			
			case 1:
				d.create();
				break;
				
			case 2:
				d.display();
				break;
				
			case 3:
				d.delete();
				break;
				
			case 4:
				d.update();
				break;
				
			case 5:
				d.search();
				break;
				
			case 6:
				sc.close();
				System.exit(0);
				
			default:
				System.out.println("Invalid Option");
				
				
				
			
			}
		}
	}

}

