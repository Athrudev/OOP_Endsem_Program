import java.util.*;

class Template {
    Scanner sc = new Scanner(System.in);
    List<Integer> listNumbers;
    int s;

    Template() {
        System.out.println("Enter size for list =");
        while (true) {
            try {
                s = Integer.parseInt(sc.nextLine());
                if (s > 0) break;
                else System.out.println("Size must be greater than 0. Try again.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        listNumbers = new ArrayList<>(s);
    }

    void getElements() {
        if (listNumbers.isEmpty()) {
            for (int i = 0; i < s; i++) {
                System.out.println("Enter element " + (i + 1) + " = ");
                while (true) {
                    try {
                        int ele = Integer.parseInt(sc.nextLine());
                        listNumbers.add(ele);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid integer.");
                    }
                }
            }
        } else {
            System.out.println("List already populated!");
        }
    }

    void countNumbers() {
        System.out.println("------------------------------------");
        System.out.println("Count of numbers in list = " + listNumbers.size());
        System.out.println("All elements = " + listNumbers);
        System.out.println("------------------------------------");
    }

    void countEvenNumbers() {
        int c = 0;
        System.out.println("------------------------------------");
        System.out.println("Even numbers in the list =");
        for (int num : listNumbers) {
            if (num % 2 == 0) {
                System.out.println(num);
                c++;
            }
        }
        System.out.println("Count of even numbers = " + c);
        System.out.println("------------------------------------");
    }

    void countOddNumbers() {
        int c = 0;
        System.out.println("------------------------------------");
        System.out.println("Odd numbers in the list =");
        for (int num : listNumbers) {
            if (num % 2 != 0) {
                System.out.println(num);
                c++;
            }
        }
        System.out.println("Count of odd numbers = " + c);
        System.out.println("------------------------------------");
    }

    void prime() {
        int c = 0;
        System.out.println("------------------------------------");
        System.out.println("Prime numbers in the list =");
        for (int num : listNumbers) {
            if (num <= 1) continue;  // 1 and negative numbers are not prime
            boolean isPrime = true;
            for (int j = 2; j * j <= num; j++) {  // Check divisibility up to the square root of the number
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
                c++;
            }
        }
        System.out.println("Count of prime numbers = " + c);
        System.out.println("------------------------------------");
    }

    void palindrome() {
        int c = 0;
        System.out.println("------------------------------------");
        System.out.println("Palindrome numbers in the list =");
        for (int num : listNumbers) {
            int temp = num, original = num, rev = 0, rem;
            while (temp != 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
            }
            if (original == rev) {
                System.out.println(original);
                c++;
            }
        }
        System.out.println("Count of Palindrome numbers = " + c);
        System.out.println("------------------------------------");
    }
}

public class TemplateA7 {

    public static void main(String[] args) {
        int choice;
        Template t1 = new Template();
        Scanner sc = new Scanner(System.in);

        do {
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
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    t1.getElements();
                    break;
                case 2:
                    t1.countNumbers();
                    break;
                case 3:
                    t1.countEvenNumbers();
                    break;
                case 4:
                    t1.countOddNumbers();
                    break;
                case 5:
                    t1.prime();
                    break;
                case 6:
                    t1.palindrome();
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Please enter a valid choice!");
            }
        } while (choice != 7);
    }
}