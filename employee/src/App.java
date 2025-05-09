
import java.util.LinkedList;
import java.util.Scanner;

//to do: access hierarchy

public class App {
    static LinkedList<GetEmp> dbms = new LinkedList<>();
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
 
        
        System.out.println("Hello, World!");
        System.out.println("Program Starts");
        GetEmp emp=null;
        int choose=0;
        boolean running=true;
        while(running){
            System.out.println("Menu: 1.enter details 2.show details 3.delete details 4.exit details");
            choose = scan.nextInt();
            scan.nextLine();
            
            switch (choose) {
                
                case 1:
                    written_details();
                    break;
                case 2:
                try {
                    displayLast();
                    
                } catch (NullPointerException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
                case 3:
                    running=false;
                    break;
                default:
                    System.out.println("Enter Valid Choices");
                    
            }
            
        }
        
    }

    public static void written_details() {

        System.out.println("Enter name:");
        String name = scan.nextLine();

        System.out.println("Enter email:");
        String email = scan.nextLine();

        System.out.println("Enter empID:");
        String empID = scan.nextLine();
        GetEmp emp = new GetEmp(email, empID, name);
        System.out.println("________SAVED_________");
        
        dbms.add(emp);
        displayLast();
        }
        
        public static void display(GetEmp emp) {
            System.out.println("Name: " + emp.name);
            System.out.println("Email: " + emp.email);
            System.out.println("EmpID: " + emp.empID);
        }
    
        public static void displayLast() {
            if (dbms.isEmpty()) {
                throw new NullPointerException("No employee data found. Please add an employee first.");
            }
            GetEmp emp = dbms.getLast();
            display(emp);
            
        }
    }