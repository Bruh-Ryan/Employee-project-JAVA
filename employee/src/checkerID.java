public class checkerID extends App{

    public checkerID(GetEmp empID) {

		String getID=empID.empID;

		sendCheck(getID);
    }
	
	public static GetEmp sendCheck(String get){
		
		for (GetEmp emp : App.dbms) {
            if (emp.empID.equals(get)) {
                return emp;
            }
        }
        return null; // not found
		
	}
	
}