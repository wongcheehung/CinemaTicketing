import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.*;
import java.awt.*;

public class Ticketing_GUI extends JFrame implements ActionListener {
	
	public JLabel jlMovie, jlDate, jlTime, jlticketNumber, jlHall;
	private JTextField jtfAdult, jtfChild, jtfStudent;
	private JButton jbSeat, jbBack;
	
	//Data
	public String movieName = "", date = "", time = "", hall = ""; //MovieList Class
	private int ticketType[] = new int[3]; //Ticketing Class
	private int ticketNumber = 0; //Ticketing Class
	private String seating[] = new String[10]; //Hall Class
	private int comboNumber[] = new int[3]; //AddOn Class
	
	public Ticketing_GUI()
	{
		setTitle("Ticket");
		
		Container canvas = getContentPane();
		canvas.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(jlMovie = new JLabel());
		jlMovie.setFont(new Font("Felix Titling", Font.BOLD, 25));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(jlHall = new JLabel());
		jlHall.setFont(new Font("Felix Titling", Font.BOLD, 15));
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		p3.add(jlDate = new JLabel());
		jlDate.setFont(new Font("Felix Titling", Font.BOLD, 15));
	
		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout());
		p4.add(jlTime = new JLabel());
		jlTime.setFont(new Font("Felix Titling", Font.BOLD, 15));
		
		JPanel p5 = new JPanel();
		p5.setLayout(new FlowLayout());
		p5.add(jlticketNumber = new JLabel("Ticket:"));
		//jlticketNumber.setFont(new Font("Felix Titling", Font.BOLD, 10));
		
		JPanel p6 = new JPanel();
		p6.setLayout(new FlowLayout());
		JLabel adult = new JLabel("Adult: ");
		p6.add(adult);
		p6.add(jtfAdult = new JTextField(3));
		jtfAdult.setText("0");
		//jtfAdult.setFont(new Font("AR ESSENCE", Font.BOLD, 25));
		
		JPanel p7 = new JPanel();
		p7.setLayout(new FlowLayout());
		JLabel child = new JLabel("Child: ");
		p7.add(child);
		p7.add(jtfChild = new JTextField(3));
		jtfChild.setText("0");
		//jtfChild.setFont(new Font("AR ESSENCE", Font.BOLD, 25));
		
		JPanel p8 = new JPanel();
		p8.setLayout(new FlowLayout());
		JLabel student = new JLabel("Student: ");
		p8.add(student);
		p8.add(jtfStudent = new JTextField(3));
		jtfStudent.setText("0");
		//jtfStudent.setFont(new Font("AR ESSENCE", Font.BOLD, 25));
		
		JPanel p9 = new JPanel();
		p9.setLayout(new FlowLayout());
		p9.add(jbBack = new JButton("<")); 
		jbBack.setPreferredSize(new Dimension(45, 23));
		p9.add(jbSeat = new JButton("Seat"));
		
		JPanel p1to3 = new JPanel();
		p1to3.setLayout(new BorderLayout());
		p1to3.add(p1, BorderLayout.NORTH);
		p1to3.add(p2, BorderLayout.CENTER);
		p1to3.add(p3, BorderLayout.SOUTH);
		
		JPanel p4to6 = new JPanel();
		p4to6.setLayout(new BorderLayout());
		p4to6.add(p4, BorderLayout.NORTH);
		p4to6.add(p5, BorderLayout.CENTER);
		p4to6.add(p6, BorderLayout.SOUTH);
		
		JPanel p7to9 = new JPanel();
		p7to9.setLayout(new BorderLayout());
		p7to9.add(p7, BorderLayout.NORTH);
		p7to9.add(p8, BorderLayout.CENTER);
		p7to9.add(p9, BorderLayout.SOUTH);
		
		canvas.add(p1to3, BorderLayout.NORTH);
		canvas.add(p4to6, BorderLayout.CENTER);
		canvas.add(p7to9, BorderLayout.SOUTH);
		
		jbBack.addActionListener(this);
		jbSeat.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//Ensure max number of ticker is 10
		if(e.getSource() == jbSeat) 
		{			
			boolean bool = true;
			
			try
			{
				Integer.parseInt(jtfAdult.getText());
			}
				catch(NumberFormatException nfe)
				{
					bool = false;
					showMessageDialog(null, nfe.getMessage());
				}
			
			try 
			{
				Integer.parseInt(jtfChild.getText());
			}
				catch(NumberFormatException nfe)
				{
					bool = false;
					showMessageDialog(null, nfe.getMessage());
				}
			
			try 
			{
				Integer.parseInt(jtfStudent.getText());
			}
				catch(NumberFormatException nfe)
				{
					bool = false;
					showMessageDialog(null, nfe.getMessage());
				}
			
			if (bool == true)
			{
				ticketType[0] = Integer.parseInt(jtfAdult.getText());
				ticketType[1] = Integer.parseInt(jtfChild.getText());
				ticketType[2] = Integer.parseInt(jtfStudent.getText());
				ticketNumber = ticketType[0] + ticketType[1] + ticketType[2];
			}
		
			try 
			{	
				if(ticketNumber > 10 || ticketNumber < 1)
				{
					bool = false;
					throw new Exception("Must be One to Ten People");
				}
		     }
			catch(Exception ex) 
			{
				showMessageDialog(null, ex.getMessage());
			}
			
			if( bool == true) 
			{
				//Go to Hall Class
				OrderData next = new OrderData 
				(this.movieName, this.hall, this.date, this.time, this.ticketType, this.seating, this.comboNumber);//new
				next.ticketingToHall();
				this.dispose();
			}
		}
		
		//Back to MovieList
		if(e.getSource() == jbBack)
		{
			MovieList_GUI back = new MovieList_GUI();
			
			back.setVisible(true);
			back.pack();
			back.setLocationRelativeTo(null);
			this.dispose();
		}
	}
	
//end of the page	
}
