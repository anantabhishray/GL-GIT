
public class DriverEmployee {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.empID = 5000;
		employee1.empName = "Abhishray Anant";
		employee1.empAddress = "Bangalore, India";
		
		employee1.displayEmpData();
		
		Employee employee2 = new Employee();
		employee2.empID = 5001;
		employee2.empName = "Mr.X";
		employee2.empAddress = "Tillaiya, India";
		
		employee2.displayEmpData();
		
	}

}
