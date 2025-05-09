public class accessHierarchy {
    private boolean senior = false;
    private boolean junior = false;
    private boolean intern = false;

	//note: only do if you understand
}
//     public accessHierarchy(GetEmp emp) {
//         String empID = emp.getEmpID();
//         if (empID.length() < 3) {
//             System.out.println("Invalid empID for access level check.");
//             return;
//         }

//         // Extract last 3 characters
//         String lastThree = empID.substring(empID.length() - 3);

//         try {
//             int code = Integer.parseInt(lastThree);

//             if (code >= 700 && code <= 999) {
//                 senior = true;
//             } else if (code >= 300 && code <= 699) {
//                 junior = true;
//             } else {
//                 intern = true;
//             }
//         } catch (NumberFormatException e) {
//             System.out.println("empID does not end with numeric digits.");
//         }
//     }

//     public void displayAccess() {
//         System.out.println("Access Level:");
//         if (senior) System.out.println("Senior");
//         if (junior) System.out.println("Junior");
//         if (intern) System.out.println("Intern");
//     }

//     // Optionally, you could add getters if needed
// }