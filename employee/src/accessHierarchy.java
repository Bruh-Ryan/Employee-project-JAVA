import javax.swing.JOptionPane;
public class accessHierarchy {
    private boolean senior = false;
    private boolean junior = false;
    private boolean intern = false;

        public accessHierarchy(GetEmp emp){ //Constructor: Special method that initializes objects. Same name as class
            String ID= emp.empID;//uska object banaya as emp is from same class aur firr usse empID ko call kiye attibute

            if(ID.length()>=3){
                String lastThree = ID.substring(ID.length() - 3); //eturns a string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string.
                                                                //Examples:
                                                                //"unhappy".substring(2) returns "happy"
                int code=Integer.parseInt(lastThree);
                if(code>=700)
                    senior=true;
                
                else if(code>=500||code<700)
                    junior=true;
                    
                else
                    intern=true;
            }

        }
        public void accessDisplay(){
            if(senior)
                JOptionPane.showMessageDialog(null, "Employee Access\n Senior"); //for the gui can be changed for simple CUI by simple return
            else if(junior)
                JOptionPane.showMessageDialog(null, "Employee Access\n Junior" );
             else if(intern)
                JOptionPane.showMessageDialog(null, "Employee Access\n Intern");
        }

	}
