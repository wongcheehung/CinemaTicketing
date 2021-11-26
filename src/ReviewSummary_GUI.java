import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ReviewSummary_GUI extends JFrame implements ActionListener
{
	public JTextField jtfMovie, jtfTime, jtfSeats, jtfTotal, jtfHall, jtfDate;
	public JTextField jtfTicketType[] = new JTextField[3]; 
	public JTextField jtfCombo[] = new JTextField[3];
	public JTextField jtfPrice[] = new JTextField[6];
	
	private JButton jbPay,jbBack;
	
	//Data
	public String movieName = "", date = "", time = "", hall = ""; //MovieList Class
	public int ticketType[] = new int[3]; //Ticketing Class
	public int ticketNumber = 0; //Ticketing Class
	public String seating[] = new String[10]; //Hall Class
	public int comboNumber[] = new int[3]; //AddOn Class
	
	public ReviewSummary_GUI() {
		
		setTitle("Review Summary");
		Container canvas1 = getContentPane();
		canvas1.setLayout(new BorderLayout());
		
		JPanel title = new JPanel();
		title.setLayout(new FlowLayout());
		JLabel jlTitle = new JLabel("Review Summary");
		title.add(jlTitle);
		jlTitle.setFont(new Font("AR JULIAN", Font.BOLD, 25));
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("Movie"));
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(jtfMovie = new JTextField(20));
		jtfMovie.setEditable(false);
		jtfMovie.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel hall = new JPanel();
		hall.setLayout(new FlowLayout());
		hall.add(new JLabel("Hall"));
		JPanel hall1 = new JPanel();
		hall1.setLayout(new FlowLayout());
		hall1.add(jtfHall = new JTextField(20));
		jtfHall.setEditable(false);
		jtfHall.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel p3= new JPanel();
		p3.setLayout(new FlowLayout());
		p3.add(new JLabel("Time"));
		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout());
		p4.add(jtfTime = new JTextField(20));
		jtfTime.setEditable(false);
		jtfTime.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		JPanel p5 = new JPanel();
		p5.setLayout(new FlowLayout());
		p5.add(new JLabel("Seat(s)"));
		JPanel p6 = new JPanel();
		p6.setLayout(new FlowLayout());
		p6.add(jtfSeats = new JTextField(20));
		jtfSeats.setEditable(false);
		jtfSeats.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel line1 = new JPanel();
		line1.setLayout(new FlowLayout());
		line1.add(new JLabel("-------------------------------------------------------------------------"));
		
		JPanel tickets = new JPanel();
		tickets.setLayout(new FlowLayout());
		tickets.add(new JLabel("Ticket(s)"));
		
		JPanel adult = new JPanel();
		adult.setLayout(new FlowLayout());
		adult.add(new JLabel("Adult x "));
		adult.add(jtfTicketType[0] = new JTextField(3));
		adult.add(new JLabel("RM"));
		adult.add(jtfPrice[0] = new JTextField(6));
		jtfPrice[0].setEditable(false);
		jtfPrice[0].setHorizontalAlignment(SwingConstants.CENTER);
		jtfTicketType[0].setEditable(false);
		jtfTicketType[0].setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel child = new JPanel();
		child.setLayout(new FlowLayout());
		child.add(new JLabel("Child x "));
		child.add(jtfTicketType[1] = new JTextField(3));
		child.add(new JLabel("RM"));
		child.add(jtfPrice[1] = new JTextField(6));
		jtfPrice[1].setEditable(false);
		jtfPrice[1].setHorizontalAlignment(SwingConstants.CENTER);
		jtfTicketType[1].setEditable(false);
		jtfTicketType[1].setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel student = new JPanel();
		student.setLayout(new FlowLayout());
		student.add(new JLabel("Student x "));
		student.add(jtfTicketType[2] = new JTextField(3));
		student.add(new JLabel("RM"));
		student.add(jtfPrice[2] = new JTextField(6));
		jtfPrice[2].setEditable(false);
		jtfPrice[2].setHorizontalAlignment(SwingConstants.CENTER);
		jtfTicketType[2].setEditable(false);
		jtfTicketType[2].setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel e_combo = new JPanel();
		e_combo.setLayout(new FlowLayout());
		e_combo.add(new JLabel("e-Combo"));
		
		JPanel comboA = new JPanel();
		comboA.setLayout(new FlowLayout());
		comboA.add(new JLabel("Combo A x "));
		comboA.add(jtfCombo[0] = new JTextField(3));
		comboA.add(new JLabel("RM"));
		comboA.add(jtfPrice[3] = new JTextField(6));
		jtfPrice[3].setEditable(false);
		jtfPrice[3].setHorizontalAlignment(SwingConstants.CENTER);
		jtfCombo[0].setEditable(false);
		jtfCombo[0].setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel comboB = new JPanel();
		comboB.setLayout(new FlowLayout());
		comboB.add(new JLabel("Combo B x "));
		comboB.add(jtfCombo[1] = new JTextField(3));
		comboB.add(new JLabel("RM"));
		comboB.add(jtfPrice[4] = new JTextField(6));
		jtfPrice[4].setEditable(false);
		jtfPrice[4].setHorizontalAlignment(SwingConstants.CENTER);
		jtfCombo[1].setEditable(false);
		jtfCombo[1].setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel comboC = new JPanel();
		comboC.setLayout(new FlowLayout());
		comboC.add(new JLabel("Combo C x "));
		comboC.add(jtfCombo[2] = new JTextField(3));
		comboC.add(new JLabel("RM"));
		comboC.add(jtfPrice[5] = new JTextField(6));
		jtfPrice[5].setEditable(false);
		jtfPrice[5].setHorizontalAlignment(SwingConstants.CENTER);
		jtfCombo[2].setEditable(false);
		jtfCombo[2].setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel line2 = new JPanel();
		line2.setLayout(new FlowLayout());
		line2.add(new JLabel("-------------------------------------------------------------------------"));
		
		JPanel total = new JPanel();
		total.setLayout(new FlowLayout());
		total.add(new JLabel("Total :        RM"));
		total.add(jtfTotal = new JTextField(6));
		jtfTotal.setEditable(false);
		jtfTotal.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel button = new JPanel();
		button.setLayout(new FlowLayout());
		button.add(jbBack = new JButton("<"));
		jbBack.setPreferredSize(new Dimension(45, 23));
		button.add(jbPay = new JButton("PAY"));
		
	
		JPanel p1p2 = new JPanel();
		p1p2.setLayout(new BorderLayout());
		p1p2.add(p1, BorderLayout.NORTH);
		p1p2.add(p2, BorderLayout.CENTER);
		
		JPanel titlep1p2 = new JPanel();
		titlep1p2.setLayout(new BorderLayout());
		titlep1p2.add(title, BorderLayout.NORTH);
		titlep1p2.add(p1p2, BorderLayout.CENTER);
		
		JPanel up = new JPanel();
		up.setLayout(new BorderLayout());
		up.add(titlep1p2, BorderLayout.NORTH);
		up.add(hall, BorderLayout.CENTER);
		up.add(hall1, BorderLayout.SOUTH);
		
		JPanel p3p4p5 = new JPanel();
		p3p4p5.setLayout(new BorderLayout());
		p3p4p5.add(p3, BorderLayout.NORTH);
		p3p4p5.add(p4, BorderLayout.CENTER);
		p3p4p5.add(p5, BorderLayout.SOUTH);
		
		JPanel p6lineticket = new JPanel();
		p6lineticket.setLayout(new BorderLayout());
		p6lineticket.add(p6, BorderLayout.NORTH);
		p6lineticket.add(line1, BorderLayout.CENTER);
		p6lineticket.add(tickets, BorderLayout.SOUTH);
		
		JPanel ticketadult = new JPanel();
		ticketadult.setLayout(new BorderLayout());
		ticketadult.add(tickets, BorderLayout.NORTH);
		ticketadult.add(adult, BorderLayout.CENTER);
		
		JPanel childstudent = new JPanel();
		childstudent.setLayout(new BorderLayout());
		childstudent.add(child, BorderLayout.NORTH);
		childstudent.add(student, BorderLayout.CENTER);
		
		JPanel combos = new JPanel();
		combos.setLayout(new BorderLayout());
		combos.add(comboA, BorderLayout.NORTH);
		combos.add(comboB, BorderLayout.CENTER);
		combos.add(comboC, BorderLayout.SOUTH);
		
		JPanel calTotal = new JPanel();
		calTotal.setLayout(new BorderLayout());
		calTotal.add(line2, BorderLayout.NORTH);
		calTotal.add(total, BorderLayout.CENTER);
		
		JPanel north = new JPanel();
		north.setLayout(new BorderLayout());
		north.add(up, BorderLayout.NORTH);
		north.add(p3p4p5, BorderLayout.CENTER);
		north.add(p6lineticket, BorderLayout.SOUTH);
		
		JPanel center = new JPanel();
		center.setLayout(new BorderLayout());
		center.add(ticketadult, BorderLayout.NORTH);
		center.add(childstudent, BorderLayout.CENTER);
		center.add(e_combo, BorderLayout.SOUTH);
		
		JPanel south = new JPanel();
		south.setLayout(new BorderLayout());
		south.add(combos, BorderLayout.NORTH);
		south.add(calTotal, BorderLayout.CENTER);
		south.add(button, BorderLayout.SOUTH);
	
		canvas1.add(north, BorderLayout.NORTH);
		canvas1.add(center, BorderLayout.CENTER);
		canvas1.add(south, BorderLayout.SOUTH);
		
		jbPay.addActionListener(this);
		jbBack.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		//Go to Payment
		if(e.getSource() == jbPay) 
		{
			PaymentData next = new PaymentData
			(this.movieName, this.hall, this.date, this.time, this.ticketType, this.seating, this.comboNumber);
			next.ReviewSummaryToPayment();
			this.dispose();
		}
		
		//Back to AddOn
		else if(e.getSource() == jbBack) 
		{
			OrderData next = new OrderData
			(this.movieName, this.hall, this.date, this.time, this.ticketType, this.seating, this.comboNumber);
			next.hallToAddOn();
			this.dispose();
		}
	}
	
//end
}
