
public class Validation {
	private int rqstCart;
	private int passengerID;
	private float tagValid;
	private boolean isValid;
	private boolean isSetup;

	public Validation(float tagValid, boolean isValid, int passengerID, int rqstCart, boolean isSetup) {
		this.setRqstCart(rqstCart);
		this.setPassengerID(passengerID);
		this.setIsValid(isValid);
		this.setTagValid(tagValid);
		this.setIsSetup(isSetup);
	}
	public void validateRqst(Passenger passInput) {
		if((isSetup == true) && (passInput.getPassengerID() == getPassengerID())) {
			setIsValid(true);
			passInput.setIsValid(true);
			passInput.setTagValid(passInput.getRqstCart());
			setTagValid(passInput.getRqstCart());
		}
		else {
			System.out.println("Error, validation system not responding.");
		}
	}
	public boolean getIsSetup() {
		return isSetup;
	}
	public void setIsSetup(boolean isSetup) {
		this.isSetup = isSetup;
	}
	public boolean getIsValid() {
		return isValid;
	}
	public void setIsValid(boolean isValid) {
		this.isValid = isValid;
	}
	public float getTagValid() {
		return tagValid;
	}
	public void setTagValid(float tagValid) {
		this.tagValid = tagValid;
	}
	public int getPassengerID() {
		return passengerID;
	}
	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}
	public int getRqstCart() {
		return rqstCart;
	}
	public void setRqstCart(int rqstCart) {
		this.rqstCart = rqstCart;
	}

}
