import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import static javax.swing.JOptionPane.*;

public class Payment_GUI extends JFrame implements ActionListener, ItemListener {

	public JTextField jtfTotal;
	public JRadioButton jrbCash, jrbCards, jrbOnlineBanking;
	public JButton jbProceed, jbBack;
	public ButtonGroup bg = new ButtonGroup();
	public String method =" ";
	
	//Data
	public String movieName = "", date = "", time = "", hall = ""; //MovieList Class
	public int ticketType[] = new int[3]; //Ticketing Class
	public int ticketNumber = 0; //Ticketing Class
	public String seating[] = new String[10]; //Hall Class
	public int comboNumber[] = new int[3]; //AddOn Class

	public Payment_GUI() {
		
		setTitle("Payment Method");
		Container canvas1 = getContentPane();
		canvas1.setLayout(new BorderLayout());
		
		JPanel title = new JPanel();
		title.setLayout(new FlowLayout());
		JLabel jlTitle = new JLabel("Payment Method");
		title.add(jlTitle);
		jlTitle.setFont(new Font("AR JULIAN", Font.BOLD, 25));
		
		JPanel line = new JPanel();
		line.setLayout(new FlowLayout());
		line.add(new Label("-----------------------------------------------------"));
		
		JPanel total = new JPanel();
		total.setLayout(new FlowLayout());
		total.add(new JLabel("Total : RM"));
		total.add(jtfTotal = new JTextField(6));
		jtfTotal.setEditable(false);
		
		JPanel memo = new JPanel();
		memo.setLayout(new FlowLayout());
		memo.add(new Label("Please select your payment method :)"));
		
		JPanel cash = new JPanel();
		cash.setLayout(new FlowLayout());
		cash.add(jrbCash = new JRadioButton("Cash"));
		bg.add(jrbCash);
		
		JPanel cards = new JPanel();
		cards.setLayout(new FlowLayout());
		cards.add(jrbCards = new JRadioButton("Credit/Debit Cards"));
		bg.add(jrbCards);
		
		JPanel Online = new JPanel();
		Online.setLayout(new FlowLayout());
		Online.add(jrbOnlineBanking = new JRadioButton("Online Banking"));
		bg.add(jrbOnlineBanking);
		
		JPanel line1 = new JPanel();
		line1.setLayout(new FlowLayout());
		line1.add(new Label("-----------------------------------------------------"));
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout());
		buttons.add(jbBack = new JButton("<"));
		jbBack.setPreferredSize(new Dimension(45, 23));
		buttons.add(jbProceed = new JButton("Proceed"));
		jbProceed.setEnabled(false);
		
		JPanel north = new JPanel();
		north.setLayout(new BorderLayout());
		north.add(title, BorderLayout.NORTH);
		north.add(line, BorderLayout.CENTER);
		north.add(memo, BorderLayout.SOUTH);
		
		JPanel center = new JPanel();
		center.setLayout(new BorderLayout());
		center.add(cash, BorderLayout.NORTH);
		center.add(cards, BorderLayout.CENTER);
		center.add(Online, BorderLayout.SOUTH);
		
		JPanel south = new JPanel();
		south.setLayout(new BorderLayout());
		south.add(line1, BorderLayout.NORTH);
		south.add(total, BorderLayout.CENTER);
		south.add(buttons, BorderLayout.SOUTH);
		
		canvas1.add(north, BorderLayout.NORTH);
		canvas1.add(center, BorderLayout.CENTER);
		canvas1.add(south, BorderLayout.SOUTH);
		
		jbBack.addActionListener(this);
		jbProceed.addActionListener(this);
		jrbCash.addItemListener(this);
		jrbCards.addItemListener(this);
		jrbOnlineBanking.addItemListener(this);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() instanceof JRadioButton) {
			if(jrbCash.isSelected()) {
				this.method="Cash";
			}
			else if(jrbCards.isSelected()) {
				this.method = "Credit/Debit Cards";
			}
			else if (jrbOnlineBanking.isSelected()) {
				this.method = "Online Banking";
			}
		}
		boolean bool = false;
		
		if(e.getSource() instanceof JRadioButton) 
		{
			if(jrbCash.isSelected() || jrbCards.isSelected() || jrbOnlineBanking.isSelected()) 
			{
				bool = true;
			}
			else
			{
				bool = false;
			}
		}

		if (bool == true) 
		{
			jbProceed.setEnabled(true);
		}
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		//Go to Completed
		if(e.getSource() == jbProceed)
		{
			PaymentData next = new PaymentData
			(this.movieName, this.hall, this.date, this.time, this.ticketType, this.seating, this.comboNumber);
			next.PaymentToCompleted();
			this.dispose();
		}
			
		//Back to ReviewSummary
		if(e.getSource() == jbBack) 
		{
			OrderData back = new OrderData
			(this.movieName, this.hall, this.date, this.time, this.ticketType, this.seating, this.comboNumber);
			back.AddOnToReviewSummary();
			this.dispose();
		}
	}
	
	
//end
}


	

