
public class Passenger {
	private int rqstCart;
	private int passengerID;
	private float tagValid;
	private boolean isValid;

	public Passenger(float tagValid, boolean isValid, int passengerID, int rqstCart) {
		this.setRqstCart(rqstCart);
		this.setPassengerID(passengerID);
		this.setIsValid(isValid);
		this.setTagValid(tagValid);
	}

	public int getRqstCart() {
		return rqstCart;
	}

	public void setRqstCart(int rqstCart) {
		this.rqstCart = rqstCart;
	}

	public int getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}

	public float getTagValid() {
		return tagValid;
	}

	public void setTagValid(float tagValid) {
		this.tagValid = tagValid;
	}

	public boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(boolean isValid) {
		this.isValid = isValid;
	}

}
