/*
 * 
 *  The Employee class holds all employee attributes
 */
package companyDetails;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeEmailId;
	private double totalSalary;
	private double basicSalary;
	private double travelAllowance;

	public int getEmployeeId() {     //Getter method for employeeId
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {  //Setter method for employeeId
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {		//Getter method for employeeName
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {  //Setter method for employeeName
		this.employeeName = employeeName;
	}

	public String getEmployeeEmailId() {  		//Getter method for employeeEmailId
		return employeeEmailId;
	}

	public void setEmployeeEmailId(String employeeEmailId) {			//Setter method for employeeEmailId
		this.employeeEmailId = employeeEmailId;
	}

	public double getTotalSalary() {		// method for calculating total salary 
		return (this.basicSalary * this.travelAllowance) + this.basicSalary;
	}


	public double getBasicSalary() {		//Getter method for basicSalary
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {			//Setter method for basicSalary
		this.basicSalary = basicSalary;
	}

	public double getTravelAllowance() {  	//Getter method for travelAllowance
		return travelAllowance;
	}

	public void setTravelAllowance(double travelAllowance) { 	//Setter method for travelAllowance
		this.travelAllowance = travelAllowance;
	}

	public String toString() {   // Override Object class method toString() , is used to display Employee information
		return "Employee ID:" + getEmployeeId() + " Employee Name:" + getEmployeeName() + " Employee email: "
				+ getEmployeeEmailId() + "\nBasic Salary:" + getBasicSalary() + "\nTravel Allowance:"
				+ getTravelAllowance()+"%" + "\nTotal Salary:" + getTotalSalary();

	}

}
