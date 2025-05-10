
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
            System.out.println("Menu: 1.enter details 2.show details 3.search details 4.delete details 5.exit");
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
                    try{
                    System.out.print("need your details, ID! \n::::::::\n ");
                     String searchCheck=scan.next();
                     scan.nextLine();
                     GetEmp searchResult=checkerID.sendCheck(searchCheck);
                            if (searchResult == null) {
                            throw new NullPointerException("No employee found with ID: " + searchCheck);
                     }
                     System.out.println(searchResult.toString());
                    }
                    catch (NullPointerException e) {
                    System.out.println("An error occurred while searching: " + e.getMessage());
                     }
                break;
                
                case 4:
                    System.out.print("need your details, ID! \n::::::::\n ");
                    String deleteCheck=scan.next();
                    GetEmp deleteResult=checkerID.sendCheck(deleteCheck);
                            if (deleteResult == null) {
                            throw new NullPointerException("Cannot delete. No employee found with ID: " + deleteCheck);
                    }
                    System.out.println(deleteResult+"\n--------is deleted----------");
                    App.dbms.remove(deleteResult);

                    break;
                case 5:
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
        System.out.println("\n________Note_________\n");

                System.out.print("Do you want to know the access? Level of your EmpID");
                String yes_no= scan.next();
                if(yes_no.equalsIgnoreCase("Yes")|| yes_no.contains("Y")|| yes_no.contains("y")){
                    System.out.println("Access authority:--------");
                    emp.access.accessDisplay();
                    System.out.println("-------Access authority:--------");

        }
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