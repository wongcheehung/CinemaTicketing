
public class CustomerData extends LoginData
{
	private String email, mobileNumber, birthDate, reEnterPassword;
	
	public CustomerData() 
	{
		super();
		this.email = "";
		this.mobileNumber = "";
		this.birthDate = "";
		this.reEnterPassword = "";
	}
	
	public CustomerData(String userName, String mobileNumber, String birthDate, String email, String password, String reEnterPassword)
	{
		super(userName, password);
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.birthDate = birthDate;
		this.reEnterPassword = reEnterPassword;
	}
	
	public void RegisterToWelcome()
	{
		Welcome_GUI gui = new Welcome_GUI();
		
		gui.userName = super.getUserName(); 
		gui.mobileNumber = this.mobileNumber;
		gui.birthDate = this.birthDate;
		gui.email = this.email;
		gui.password = super.getPassword();
		gui.reEnterPassword = this.reEnterPassword;
		
		gui.jtfUserName.setText(super.getUserName());
		gui.jtfPassword.setText(super.getPassword());
		gui.jbLogin.setEnabled(true);
		
		gui.setVisible(true);
		gui.pack();
		gui.setLocationRelativeTo(null); 
	}

//end		
}
