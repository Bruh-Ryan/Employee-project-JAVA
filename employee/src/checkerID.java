public class checkerID extends EmployeeSwingApp{//change if you want to use CUI for App

    public checkerID(GetEmp empID) {

		String getID=empID.empID;
        String getID_for_swing=empID.empID;

		sendCheck(getID);
        sendCheck(getID_for_swing);
    }
	
	public static GetEmp sendCheck(String get){
		
		for (GetEmp emp : EmployeeSwingApp.dbms) {//change if you want to use CUI for App
            if (emp.empID.equals(get)) {
                return emp;
            }
        }
        return null; // not found
		
	}
	
}
