public class GetEmp{

   String name;
   String email;
   String empID;
   public accessHierarchy access;
   
  

    public GetEmp(String email, String empID, String name) {
       
        setEmail(email);
        this.empID = empID;
        this.name = name;
        this.access= new accessHierarchy(this);
        
    }

    @Override
    public String toString() {
    return "Name: " + name + "\nEmail: " + email + "\nEmpID: " + empID;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        if (email.endsWith("@gmail.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format. Must end with @gmail.com");
            this.email = "invalid@gmail.com";
        }
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }
   
    public void displayDetails() {
        System.out.println("Email: " + email);
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        

}}
