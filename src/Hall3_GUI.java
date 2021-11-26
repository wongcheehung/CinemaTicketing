import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hall3_GUI extends JFrame implements ActionListener
{
	//bring forward
	//private String movie, date, time;
	//private int hallNumber = 1;
	//private int ticketNumber;
		
	private JButton seat[] = new JButton[42];
	private JButton jbConfirm, jbReset, jbBack;
	private String seatNumber[] = new String[42];
	private JTextField jtfCustomerPick[] = new JTextField[10];
	private Boolean bool[] = new Boolean[42];
		
	//Data
	public String movieName = "", date = "", time = "", hall = ""; //MovieList Class
	public int ticketType[] = new int[3]; //Ticketing Class
	public int ticketNumber = 0; //Ticketing Class
	private String seating[] = new String[10]; //Hall Class
	private int comboNumber[] = new int[3]; //AddOn Class
	public String selectedSeatNumber[] = new String[80];
	
	public Hall3_GUI()
	{
		setTitle("Hall 3");
		
		Container canvas = getContentPane();
		canvas.setLayout(new BorderLayout());
		
		//HallName
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		JLabel title = new JLabel(" Hall 3");
		p1.add(title);
		title.setFont(new Font("Algerian", Font.BOLD, 35));
		
		//Screen
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		JLabel screen = new JLabel("SCREEN");
		p2.add(screen);
		
		//Row1(A)
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		JLabel jl3 = new JLabel("     A   ");
		p3.add(jl3);
		for(int i=0; i<7; i++)
		{
			//seat[i] = new JButton("A0" + (i+1));
			seatNumber[i] = "A0" + (i+1);
			p3.add(seat[i] = new JButton(seatNumber[i]));
			seat[i].setPreferredSize(new Dimension(60, 60));
		}
		
		//Row2(B)
		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout());
		JLabel jl4 = new JLabel("     B   ");
		p4.add(jl4);
		for(int i=7; i<14; i++)
		{
			seatNumber[i] = "B0" + (i-7+1);
			p4.add(seat[i] = new JButton(seatNumber[i]));
			seat[i].setPreferredSize(new Dimension(60, 60));
		}
		
		//Row3(C)
		JPanel p5 = new JPanel();
		p5.setLayout(new FlowLayout());
		JLabel jl5 = new JLabel("     C   ");
		p5.add(jl5);
		for(int i=14; i<21; i++)
		{
			seatNumber[i] = "C0" + (i-14+1);
			p5.add(seat[i] = new JButton(seatNumber[i]));
			seat[i].setPreferredSize(new Dimension(60, 60));
		}
		
		//Row4(D)
		JPanel p6 = new JPanel();
		p6.setLayout(new FlowLayout());
		JLabel jl6 = new JLabel("     D   ");
		p6.add(jl6);
		for(int i=21; i<28; i++)
		{
			seatNumber[i] = "D0" + (i-21+1);
			p6.add(seat[i] = new JButton(seatNumber[i]));
			seat[i].setPreferredSize(new Dimension(60, 60));
		}
		
		//Row5(E)
		JPanel p7 = new JPanel();
		p7.setLayout(new FlowLayout());
		JLabel jl7 = new JLabel("     E   ");
		p7.add(jl7);
		for(int i=28; i<35; i++)
		{
			seatNumber[i] = "E0" + (i-28+1);
			p7.add(seat[i] = new JButton(seatNumber[i]));
			seat[i].setPreferredSize(new Dimension(60, 60));
		}
		
		//Row6(F)
		JPanel p8 = new JPanel();
		p8.setLayout(new FlowLayout());
		JLabel jl8 = new JLabel("     F   ");
		p8.add(jl8);
		for(int i=35; i<42; i++)
		{
			seatNumber[i] = "F0" + (i-35+1);
			p8.add(seat[i] = new JButton(seatNumber[i]));
			seat[i].setPreferredSize(new Dimension(60, 60));
		}
		
		//CustomerPick
		JPanel p9 = new JPanel();
		p9.setLayout(new FlowLayout());
		for(int i=0; i<10; i++)
		{
			p9.add(jtfCustomerPick[i] = new JTextField(5));
			jtfCustomerPick[i].setEditable(false);
		}
		
		//Reset and Confirm Button
		JPanel p10 = new JPanel();
		p10.setLayout(new FlowLayout());
		p10.add(jbBack = new JButton("<")); 
		jbBack.setPreferredSize(new Dimension(45, 23));
		p10.add(jbReset = new JButton("Reset"));
		p10.add(jbConfirm = new JButton("Confirm"));
		jbConfirm.setEnabled(false);
		
		
		//HeadPanel
		//mergePanel (Hall name && Screen)
		JPanel p1p2 = new JPanel();
		p1p2.setLayout(new BorderLayout());
		p1p2.add(p1, BorderLayout.NORTH);
		p1p2.add(p2, BorderLayout.SOUTH);
		
		//BodyPanel
		//mergePanel (Row 1-3)
		JPanel p3p4p5 = new JPanel();
		p3p4p5.setLayout(new BorderLayout());
		p3p4p5.add(p3, BorderLayout.NORTH);
		p3p4p5.add(p4, BorderLayout.CENTER);
		p3p4p5.add(p5, BorderLayout.SOUTH);
		//mergePanel (Row 4-6)
		JPanel p6p7p8 = new JPanel();
		p6p7p8.setLayout(new BorderLayout());
		p6p7p8.add(p6, BorderLayout.NORTH);
		p6p7p8.add(p7, BorderLayout.CENTER);
		p6p7p8.add(p8, BorderLayout.SOUTH);
		//mergePanel (Row 1-6) *ALL*
		JPanel all = new JPanel();
		all.setLayout(new BorderLayout());
		all.add(p3p4p5, BorderLayout.NORTH);
		all.add(p6p7p8, BorderLayout.SOUTH);
		
		//FootPanel
		JPanel p9p10 = new JPanel();
		p9p10.setLayout(new BorderLayout());
		p9p10.add(p9, BorderLayout.NORTH);
		p9p10.add(p10, BorderLayout.SOUTH);
		
		//assign panel to container
		canvas.add(p1p2, BorderLayout.NORTH);
		canvas.add(all, BorderLayout.CENTER);
		canvas.add(p9p10, BorderLayout.SOUTH);
		
		//initiate boolean
		for(int i=0; i<42; i++)
		{
			bool[i] = false;
		}
		
		//addActionListener
		for(int i=0; i<42; i++)
		{
			seat[i].addActionListener(this);
		}
		jbConfirm.addActionListener(this);
		jbReset.addActionListener(this);
		jbBack.addActionListener(this);
	}
	
	//ActionListener
	public void actionPerformed(ActionEvent e)
	{
		int j = 0;
		
		for(int i=0; i<seat.length; i++)
		{
			//Set a button only can be click once
			if(e.getSource() == seat[i])
			{
				seat[i].setEnabled(false);
				seat[i].setBackground(Color.yellow);
				bool[i] = true;
			}
			
			//Record which button have been clicked
			if(bool[i] == true)
			{
				jtfCustomerPick[j].setText(seatNumber[i]);
				j++;
			}
		}
		
		if(j>=ticketNumber)
		{
			//User must pick all seat to press the confirm button
			jbConfirm.setEnabled(true);
			
			//Maximum seat the user can choose
			for(int i=0; i<seat.length; i++)
			{
				if(seat[i].isEnabled())
				{
					seat[i].setEnabled(false);
					seat[i].setBackground(Color.black);
				}
			}
		}
		
		//If confirm button is pressed
		if(e.getSource() == jbConfirm)
		{
			//Assign customer's seats to String
			for(int i=0; i<ticketNumber; i++)
			{
				seating[i] = jtfCustomerPick[i].getText();
			}
			
			//Go to AddOn Class
			OrderData next = new OrderData
			(this.movieName, this.hall, this.date, this.time, this.ticketType, this.seating, this.comboNumber);
			next.hallToAddOn();
			this.dispose();
		}
		
		//If reset button is pressed
		if(e.getSource() == jbReset)
		{
			//Refresh to Hall Class
			OrderData reset = new OrderData 
			(this.movieName, this.hall, this.date, this.time, this.ticketType, this.seating, this.comboNumber);
			reset.ticketingToHall();
			this.dispose();
		}
		
		if(e.getSource() == jbBack)
		{
			OrderData back = new OrderData 
			(this.movieName, this.hall, this.date, this.time, this.ticketType, this.seating, this.comboNumber);
			back.movieListToTicketing();
			this.dispose();
		}

	}
	
//end of the page
}
