/*
 * this class holds all attributes foo Trainee
 * 
 */


package companyDetails;

public class Trainee extends Employee {
	private double BasicSalary = 40000.00;;
	private double TravelAllowance = 0.1;;

	Trainee(int employeeId, String employeeName, String employeeEmailId) {
		super.setEmployeeId(employeeId);
		super.setEmployeeName(employeeName);
		super.setEmployeeEmailId(employeeEmailId);
		super.setBasicSalary(this.BasicSalary); //calling parents class setBasizSalary() to initialize BasicSalary
		super.setTravelAllowance(this.TravelAllowance); //calling parents class setTravelAllowance() to initialize TravelAllowance

	}

	public double getBasicSalary() { // getter method for BasicSalary
		return BasicSalary;
	}

	public void setBasicSalary(double basicSalary) {   //setter method for BasicSalary
		BasicSalary = basicSalary;
	}

	public double getTravelAllowance() {  // getter method for TravelAllowance
		return TravelAllowance;
	}

	public void setTravelAllowance(double travelAllowance) {  //setter method for travelAllowance
		TravelAllowance = travelAllowance;
	}

}
