import java.util.*;

interface Vehicle { 
void changeGear(int gear);    
void speedUp(int increment); 
void applyBrakes(int decrement); 
} 
 
class Bicycle implements Vehicle { 
int speed = 0;  
int gear = 1;  

@Override 
public void changeGear(int newGear) { 
gear = newGear; 
System.out.println(">> Bicycle gear changed to: " + gear); 
} 

@Override 
    public void speedUp(int increment) { 
        speed += increment; 
        System.out.println(">> Bicycle speed increased to: " + speed + " km/h"); 
    } 
 
   
    @Override 
    public void applyBrakes(int decrement) { 
        speed -= decrement; 
        if (speed < 0) speed = 0;  
        System.out.println(">> Bicycle speed reduced to: " + speed + " km/h"); 
    } 
} 
 
 
class Bike implements Vehicle { 
    int speed = 0;  
    int gear = 1;   
 
    
    @Override 
    public void changeGear(int newGear) { 
        gear = newGear; 
        System.out.println(">> Bike gear changed to: " + gear); 
    } 
 
   
    @Override 
    public void speedUp(int increment) { 
        speed += increment; 
        System.out.println(">> Bike speed increased to: " + speed + " km/h"); 
    } 
 
    
    @Override 
    public void applyBrakes(int decrement) { 
        speed -= decrement; 
        if (speed < 0) speed = 0;  
        System.out.println(">> Bike speed reduced to: " + speed + " km/h"); 
    } 
} 
 

class Car implements Vehicle { 
    int speed = 0;  
    int gear = 1;   
 
   
    @Override 
    public void changeGear(int newGear) { 
        gear = newGear; 
        System.out.println(">> Car gear changed to: " + gear); 
    } 
 
     
    @Override 
    public void speedUp(int increment) { 
        speed += increment; 
        System.out.println(">> Car speed increased to: " + speed + " km/h"); 
    } 
 
     
    @Override 
    public void applyBrakes(int decrement) { 
        speed -= decrement; 
        if (speed < 0) speed = 0;  
        System.out.println(">> Car speed reduced to: " + speed + " km/h"); 
    } 
} 
 

public class InterfaceA5 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);  
        Vehicle vehicle = null; 
 
 
        while (true) { 
            
            System.out.println("\nChoose a Vehicle: "); 
            System.out.println("1. Bicycle"); 
            System.out.println("2. Bike"); 
            System.out.println("3. Car"); 
            System.out.println("4. Exit"); 
            System.out.print("Enter your choice: "); 
 
            int vehicleChoice = sc.nextInt();  
            System.out.println("--------------------------------------"); 
 
            
            switch (vehicleChoice) { 
                case 1: 
                    System.out.println("You chose: Bicycle"); 
                    vehicle = new Bicycle();  
                    break; 
                case 2: 
                    System.out.println("You chose: Bike"); 
                    vehicle = new Bike();     
                    break; 
                case 3: 
                    System.out.println("You chose: Car"); 
                    vehicle = new Car();     
                    break; 
                case 4: 
                    System.out.println("Exiting the program..."); 
                    sc.close();               
                    return; 
                default: 
                    System.out.println("Invalid choice! Please choose again."); 
                    continue;  
            } 
 
           
            boolean continueOperations = true; 
            while (continueOperations) { 
                
                System.out.println("\n--------------------------------------"); 
                System.out.println("Choose an operation: "); 
                System.out.println("1. Change Gear"); 
                System.out.println("2. Speed Up"); 
                System.out.println("3. Apply Brakes"); 
                System.out.println("4. Choose another vehicle"); 
                System.out.println("5. Exit"); 
                System.out.print("Enter your choice: "); 
 
                int operationChoice = sc.nextInt();  
                System.out.println("--------------------------------------"); 
 
               
                switch (operationChoice) { 
                    case 1: 
                        System.out.print("Enter the new gear: "); 
                        int gear = sc.nextInt(); 
                        vehicle.changeGear(gear);  
                        break; 
                    case 2: 
                        System.out.print("Enter speed increment (km/h): "); 
                        int increment = sc.nextInt(); 
                        vehicle.speedUp(increment); 
                        break; 
                    case 3: 
                        System.out.print("Enter speed decrement (km/h): "); 
                        int decrement = sc.nextInt(); 
                        vehicle.applyBrakes(decrement);   
                        break; 
                    case 4: 
                        System.out.println("Returning to vehicle selection..."); 
                        continueOperations = false; 
                        break; 
                    case 5: 
                        System.out.println("Exiting the program..."); 
                        sc.close();  
                        return; 
                    default: 
                        System.out.println("Invalid choice! Please choose again."); 
                } 
            } 
        } 
    } 
}