import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ETicket_GUI extends JFrame implements ActionListener 
{
	public JTextField jtfMovie, jtfTime, jtfSeats, jtfDate;
	public JLabel jlHall;
	public JButton bHome, bOK;

	//Data
	public String movieName = "", date = "", time = "", hall = ""; //MovieList Class
	public int ticketType[] = new int[3]; //Ticketing Class
	public int ticketNumber = 0; //Ticketing Class
	public String seating[] = new String[10]; //Hall Class
	public int comboNumber[] = new int[3]; //AddOn Class

	public ETicket_GUI() 
	{
		setTitle("eTicket");
		Container canvas1 = getContentPane();
		canvas1.setLayout(new BorderLayout());
		
		JPanel memo = new JPanel();
		memo.setLayout(new FlowLayout());
		memo.add(new JLabel("Payment Completed."));
		
		JPanel line = new JPanel();
		line.setLayout(new FlowLayout());
		line.add(new Label("-----------------------------------------------------"));
		
		JPanel title = new JPanel();
		title.setLayout(new FlowLayout());
		title.add(new JLabel("E-Ticket"));
		
		JPanel line1 = new JPanel();
		line1.setLayout(new FlowLayout());
		line1.add(new Label("-----------------------------------------------------"));
		
		JPanel halls = new JPanel();
		halls.setLayout(new FlowLayout());
		jlHall = new JLabel();
		halls.add(jlHall);
		
		JPanel movie = new JPanel();
		movie.setLayout(new FlowLayout());
		movie.add(new JLabel("Movie :"));
		movie.add(jtfMovie = new JTextField(20));
		jtfMovie.setEditable(false);
		jtfMovie.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel datetime = new JPanel();
		datetime.setLayout(new FlowLayout());
		datetime.add(new JLabel("Date :"));
		datetime.add(jtfDate = new JTextField(10));
		jtfDate.setEditable(false);
		jtfDate.setHorizontalAlignment(SwingConstants.CENTER);
		datetime.add(new JLabel("Time :"));
		datetime.add(jtfTime = new JTextField(5));
		jtfTime.setEditable(false);
		jtfTime.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel seats = new JPanel();
		seats.setLayout(new FlowLayout());
		seats.add(new JLabel("Seats :"));
		seats.add(jtfSeats = new JTextField(20));
		jtfSeats.setEditable(false);
		jtfSeats.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel line2 = new JPanel();
		line2.setLayout(new FlowLayout());
		line2.add(new Label("-----------------------------------------------------"));
		
		JPanel memo1 = new JPanel();
		memo1.setLayout(new FlowLayout());
		memo1.add(new JLabel("Enjoy the movie! :)"));
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout());
		buttons.add(bHome = new JButton("Home"));
		buttons.add(bOK = new JButton("   OK   "));
		
		JPanel bTitle = new JPanel();
		bTitle.setLayout(new BorderLayout());
		bTitle.add(line, BorderLayout.NORTH);
		bTitle.add(title, BorderLayout.CENTER);
		bTitle.add(line1, BorderLayout.SOUTH);
		
		JPanel Upper = new JPanel();
		Upper.setLayout(new BorderLayout());
		Upper.add(memo, BorderLayout.NORTH);
		Upper.add(bTitle, BorderLayout.CENTER);
		
		JPanel Mid = new JPanel();
		Mid.setLayout(new BorderLayout());
		Mid.add(halls, BorderLayout.NORTH);
		Mid.add(movie, BorderLayout.CENTER);
		Mid.add(datetime, BorderLayout.SOUTH);
		
		JPanel Bottom = new JPanel();
		Bottom.setLayout(new BorderLayout());
		Bottom.add(seats, BorderLayout.NORTH);
		Bottom.add(line2, BorderLayout.CENTER);
		Bottom.add(memo1, BorderLayout.SOUTH);
		
		JPanel eticket = new JPanel();
		eticket.setLayout(new BorderLayout());
		eticket.add(Mid, BorderLayout.NORTH);
		eticket.add(Bottom, BorderLayout.CENTER);
		
		canvas1.add(Upper, BorderLayout.NORTH);
		canvas1.add(eticket, BorderLayout.CENTER);
		canvas1.add(buttons, BorderLayout.SOUTH);
		
		bOK.addActionListener(this);
		bHome.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == bOK) 
		{
		this.dispose();
		}
		
		else if(e.getSource() == bHome) 
		{
			CustomerData gui = new CustomerData();
			gui.WelcomeToMovieList();
			this.dispose();
		}
	}
	
}
