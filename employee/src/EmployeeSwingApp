import java.awt.GridLayout;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EmployeeSwingApp {
    static LinkedList<GetEmp> dbms = new LinkedList<>();

    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Employee Manager");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        // Buttons
        JButton addButton = new JButton("Add Employee");
        JButton showButton = new JButton("Show Last Employee");
        JButton searchButton = new JButton("Search by ID");
        JButton deleteButton = new JButton("Delete by ID");
        JButton exitButton = new JButton("Exit");

        // Add buttons to frame
        frame.add(addButton);
        frame.add(showButton);
        frame.add(searchButton);
        frame.add(deleteButton);
        frame.add(exitButton);

        // Add action listeners
        addButton.addActionListener(e -> addEmployee());
        showButton.addActionListener(e -> showLastEmployee());
        searchButton.addActionListener(e -> searchEmployee());
        deleteButton.addActionListener(e -> deleteEmployee());
        exitButton.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }

    static void addEmployee() {
        String name = JOptionPane.showInputDialog("Enter Your Name:");
        String email = JOptionPane.showInputDialog("Enter Email:");
        String empID = JOptionPane.showInputDialog("Enter EmpID:");

        GetEmp emp = new GetEmp(email, empID, name);
        dbms.add(emp);

        JOptionPane.showMessageDialog(null, "Employee added successfully!\n" + emp);

        int accessConfirm = JOptionPane.showConfirmDialog(null, "View Access Level?", "Access", JOptionPane.YES_NO_OPTION);
        if (accessConfirm == JOptionPane.YES_OPTION) {
            emp.access.accessDisplay();
            
        }
    }

    static void showLastEmployee() {
        if (dbms.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No employee data found.");
            return;
        }
        GetEmp emp = dbms.getLast();
        JOptionPane.showMessageDialog(null, emp.toString());
    }

    static void searchEmployee() {
        String id = JOptionPane.showInputDialog("Enter Employee ID to search:");
        GetEmp result = checkerID.sendCheck(id);

        if (result == null) {
            JOptionPane.showMessageDialog(null, "No employee found with ID: " + id);
        } else {
            JOptionPane.showMessageDialog(null, result.toString());
            
        }
    }

    static void deleteEmployee() {
        String id = JOptionPane.showInputDialog("Enter Employee ID to delete:");
        GetEmp result = checkerID.sendCheck(id);

        if (result == null) {
            JOptionPane.showMessageDialog(null, "No employee found with ID: " + id);
            
        } else {
            dbms.remove(result);
            JOptionPane.showMessageDialog(null, "Deleted employee: \n" + result);
            
        }
    }
     public static void display(GetEmp emp) {
            System.out.println("Name: " + emp.name);
            System.out.println("Email: " + emp.email);
            System.out.println("EmpID: " + emp.empID);
        }
}
