
public class PaymentData 
{
	private CustomerData customerData;
	private OrderData orderData;
	private double price[] = new double[6]; //ReviewSummary Class
	private double total; //ReviewSummary Class
	
	public PaymentData()
	{
		this.customerData = new CustomerData();
		this.orderData = new OrderData();
		for(int i=0; i<price.length; i++)
		{
			this.price[i] = 0.0;
		}
		this.total = 0.0;
	}
	
	public PaymentData
	(String movieName, String hall, String date, String time, int ticketType[], String seating[], int comboNumber[])
	{
		this.orderData = new OrderData(movieName, hall, date, time, ticketType, seating, comboNumber);
		for(int i=0; i<price.length; i++)
		{
			this.price[i] = (10-i);
		}
		this.total = 0.0;
		this.total = (ticketType[0] * price[0]) + (ticketType[1] * price[1]) + (ticketType[2] * price[2]) +
				 	 (comboNumber[0] * price[3]) + (comboNumber[1] * price[4]) + (comboNumber[2] * price[5]);
	}
	
	public void ReviewSummaryToPayment()
	{
		Payment_GUI gui = new Payment_GUI();
		
		//Bring forward data
		gui.movieName = orderData.getMovieName();
		gui.date = orderData.getDate();
		gui.time = orderData.getTime();
		gui.hall = orderData.getHall();
		gui.ticketType = orderData.getTicketType();
		gui.ticketNumber = orderData.getTicketNumber();
		gui.seating = orderData.getSeating();
		gui.comboNumber = orderData.getComboNumber();
		
		//set JTextField
		gui.jtfTotal.setText(orderData.getTotal() + "");
		
		//show GUI
		gui.setVisible(true);
		gui.pack();
		gui.setLocationRelativeTo(null);
	}
	
	public void PaymentToCompleted()
	{
		ETicket_GUI gui = new ETicket_GUI();
		
		//Bring forward data
		gui.movieName = orderData.getMovieName();
		gui.date = orderData.getDate();
		gui.time = orderData.getTime();
		gui.hall = orderData.getHall();
		gui.ticketType = orderData.getTicketType();
		gui.ticketNumber = orderData.getTicketNumber();
		gui.seating = orderData.getSeating();
		gui.comboNumber = orderData.getComboNumber();
		
		//set JTextField
		gui.jlHall.setText(orderData.getHall());
		gui.jtfMovie.setText(orderData.getMovieName());
		gui.jtfDate.setText(orderData.getDate());
		gui.jtfTime.setText(orderData.getTime());
		gui.jtfSeats.setText(orderData.getSeats());
		
		//show GUI
		gui.setVisible(true);
		gui.pack();
		gui.setLocationRelativeTo(null);
	}
	
	
//end
}
