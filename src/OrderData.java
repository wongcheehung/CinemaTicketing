
public class OrderData 
{
	private String movieName, date, time, hall; //MovieList Class
	private int ticketType[] = new int[3];
	private int ticketNumber; //Ticketing Class
	private String seating[] = new String[10]; //Hall Class
	private String seats; //Hall Class
	private int comboNumber[] = new int[3]; //AddOn Class
	private double price[] = new double[6]; //ReviewSummary Class
	private double total; //ReviewSummary Class
	
	public String getMovieName() {
		return movieName;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String getHall() {
		return hall;
	}

	public int[] getTicketType() {
		return ticketType;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public String[] getSeating() {
		return seating;
	}
	
	public String getSeats() {
		return seats;
	}

	public int[] getComboNumber() {
		return comboNumber;
	}

	public double[] getPrice() {
		return price;
	}

	public double getTotal() {
		return total;
	}

	public OrderData() 
	{
		this.movieName = "";
		this.date = "";
		this.time = ""; 
		this.hall = ""; 
		for(int i=0; i<ticketType.length; i++)
		{
			this.ticketType[i] = 0;
			this.ticketNumber = 0;
			this.ticketNumber += this.ticketType[i];
		}
		for(int i=0; i<seating.length; i++)
		{
			this.seating[i] = "";
		}
		this.seats = "";
		for(int i=0; i<comboNumber.length; i++)
		{
			this.comboNumber[i] = 0;
		}
		for(int i=0; i<price.length; i++)
		{
			this.price[i] = 0.0;
		}
		this.total = 0.0;
	}
	
	public OrderData
	(String movieName, String hall, String date, String time, int ticketType[], String seating[], int comboNumber[])//new
	{
		this.movieName = movieName;
		this.hall = hall;
		this.date = date;
		this.time = time;
		for(int i=0; i<ticketType.length; i++)
		{
			this.ticketType[i] = ticketType[i];
			this.ticketNumber += this.ticketType[i];
		}
		for(int i=0; i<seating.length; i++)
		{
			this.seating[i] = seating[i];
		}
		this.seats = seating[0];
		for(int i=1; i<this.ticketNumber; i++)
		{
			this.seats += " " + this.seating[i];
		}
		for(int i=0; i<comboNumber.length; i++)
		{
			this.comboNumber[i] = comboNumber[i];
		}
		for(int i=0; i<price.length; i++)
		{
			this.price[i] = (10-i);
		}
		this.total = 0.0;
		this.total = (ticketType[0] * price[0]) + (ticketType[1] * price[1]) + (ticketType[2] * price[2]) +
				 	 (comboNumber[0] * price[3]) + (comboNumber[1] * price[4]) + (comboNumber[2] * price[5]);
	}
	
	public void movieListToTicketing()
	{
		Ticketing_GUI gui = new Ticketing_GUI();
		
		//Bring forward data
		gui.movieName = this.movieName;
		gui.date = this.date;
		gui.time = this.time;
		gui.hall = this.hall;
		
		//set JLabel
		gui.jlMovie.setText("       " + this.movieName + "       ");
		gui.jlDate.setText(this.date);
		gui.jlTime.setText(this.time);
		gui.jlHall.setText(this.hall);
		
		//show GUI
		gui.setVisible(true);
		gui.pack();
		gui.setLocationRelativeTo(null);
	}
	
	public void ticketingToHall()
	{
		if(this.hall.equals("Hall 1"))
		{
			Hall1_GUI gui = new Hall1_GUI();
			
			//Bring forward data
			gui.movieName = this.movieName;
			gui.date = this.date;
			gui.time = this.time;
			gui.hall = this.hall;
			for(int i=0; i<ticketType.length; i++)
			{
				gui.ticketType[i] = this.ticketType[i];
				gui.ticketNumber += this.ticketType[i];
			}
			
			//show GUI
			gui.setVisible(true);
			gui.pack();
			gui.setLocationRelativeTo(null);
		}
		
		else if(this.hall.equals("Hall 2"))
		{
			Hall2_GUI gui = new Hall2_GUI();
			
			//Bring forward data
			gui.movieName = this.movieName;
			gui.date = this.date;
			gui.time = this.time;
			gui.hall = this.hall;
			for(int i=0; i<ticketType.length; i++)
			{
				gui.ticketType[i] = this.ticketType[i];
				gui.ticketNumber += this.ticketType[i];
			}
			
			//show GUI
			gui.setVisible(true);
			gui.pack();
			gui.setLocationRelativeTo(null);
		}
		
		else if(this.hall.equals("Hall 3"))
		{
			Hall3_GUI gui = new Hall3_GUI();
			
			//Bring forward data
			gui.movieName = this.movieName;
			gui.date = this.date;
			gui.time = this.time;
			gui.hall = this.hall;
			for(int i=0; i<ticketType.length; i++)
			{
				gui.ticketType[i] = this.ticketType[i];
				gui.ticketNumber += this.ticketType[i];
			}
			
			//show GUI
			gui.setVisible(true);
			gui.pack();
			gui.setLocationRelativeTo(null);
		}
	}
	
	public void hallToAddOn()
	{
		AddOn_GUI gui = new AddOn_GUI();
		
		//Bring forward data
		gui.movieName = this.movieName;
		gui.date = this.date;
		gui.time = this.time;
		gui.hall = this.hall;
		for(int i=0; i<ticketType.length; i++)
		{
			gui.ticketType[i] = this.ticketType[i];
			gui.ticketNumber += this.ticketType[i];
		}
		for(int i=0; i<seating.length; i++)
		{
			gui.seating[i] = this.seating[i];
		}
		
		//show GUI
		gui.setVisible(true);
		gui.pack();
		gui.setLocationRelativeTo(null);
	}
	
	public void AddOnToReviewSummary()
	{
		ReviewSummary_GUI gui = new ReviewSummary_GUI();
		
		//Bring forward data
		gui.movieName = this.movieName;
		gui.date = this.date;
		gui.time = this.time;
		gui.hall = this.hall;
		for(int i=0; i<ticketType.length; i++)
		{
			gui.ticketType[i] = this.ticketType[i];
			gui.ticketNumber += this.ticketType[i];
		}
		for(int i=0; i<seating.length; i++)
		{
			gui.seating[i] = this.seating[i];
		}
		for(int i=0; i<comboNumber.length; i++)
		{
			gui.comboNumber[i] = this.comboNumber[i];
		}
		
		//set JTextField
		gui.jtfMovie.setText(this.movieName);
		gui.jtfHall.setText(this.hall);
		gui.jtfTime.setText(this.date + "  " + this.time);
		gui.jtfSeats.setText(this.seats);
		for(int i=0; i<price.length; i++)
		{
			gui.jtfPrice[i].setText("" + this.price[i]);
		}
		for(int i=0; i<ticketType.length; i++)
		{
			gui.jtfTicketType[i].setText(this.ticketType[i] + "");
		}
		for(int i=0; i<comboNumber.length; i++)
		{
			gui.jtfCombo[i].setText(this.comboNumber[i] + "");
		}
		gui.jtfTotal.setText("" + this.total);
		
		//show GUI
		gui.setVisible(true);
		gui.pack();
		gui.setLocationRelativeTo(null);
	}
	
	
//end
}
	
	

