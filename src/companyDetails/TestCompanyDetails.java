/*
 * This class is used to initialize manger details and trainee details and print their salry details
 * 
 */


package companyDetails;

public class TestCompanyDetails {

	public static void main(String[] args) {
		Manager manager = new Manager(262378,"Sridhar","sridhar.venkatesh@gmail.com");   //initialize manger details 
		Trainee trainee = new Trainee(234567,"Amit","amit.kumar@gmail.com"); //initialize trainee details
		System.out.println("\t\t\t\tEmployee salary Details");
		System.out.println("\t\t\t\tManager Details");
		System.out.println(manager);  // printing manager details
		System.out.println("\t\t\t\tTrainee Details");
		System.out.println("\n\n"+trainee);  //printing Trainee details

	}

}
