
public class Admin {
	private int adminID;
	public Admin(int adminID) {
		this.setAdminID(adminID);
		
	}
	public void setupValidation(Validation valinput) {
		valinput.setIsSetup(true);
	}
	public void configureValidation(Validation valinput) {
		valinput.setIsSetup(false);
	}
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

}
