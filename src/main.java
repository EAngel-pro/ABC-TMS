
public class main {

	public static void main(String[] args) {
		Passenger testPass = new Passenger(0, false, 12345, 123);
		Admin testAdmin = new Admin(54321);
		Validation tempVal = new Validation(testPass.getTagValid(), testPass.getIsValid(), testPass.getPassengerID(), testPass.getRqstCart(), false);
		System.out.println(testPass.getPassengerID());
		System.out.println(testPass.getRqstCart());
		System.out.println(testAdmin.getAdminID());
		System.out.println(tempVal.getIsSetup());
		tempVal.validateRqst(testPass);
		testAdmin.setupValidation(tempVal);
		System.out.println(tempVal.getIsSetup());
		System.out.println(tempVal.getPassengerID());
		System.out.println(tempVal.getRqstCart());
		System.out.println(testPass.getTagValid());
		tempVal.validateRqst(testPass);
		System.out.println(testPass.getTagValid());

	}

}
