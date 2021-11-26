import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.*;
import java.awt.event.*;

public class AddOn_GUI extends JFrame implements ActionListener
{
	private JTextField jtfCombo[] = new JTextField[3];
	private JButton jbConfirm, jbBack;
	
	//Data
	public String movieName = "", date = "", time = "", hall = ""; //MovieList Class
	public int ticketType[] = new int[3]; //Ticketing Class
	public int ticketNumber = 0; //Ticketing Class
	public String seating[] = new String[10]; //Hall Class
	private int comboNumber[] = new int[3]; //AddOn Class
	
	public AddOn_GUI()
	{
		setTitle("Add-On");
		
		Container canvas = getContentPane();
		canvas.setLayout(new BorderLayout());
		
		//Title
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		JLabel title = new JLabel("       Add-On       ");
		p1.add(title);
		title.setFont(new Font("AR JULIAN", Font.BOLD, 25));
		
		//Combo1
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		JLabel jl2 = new JLabel("E-Combo A");
		p2.add(jl2);
		p2.add(jtfCombo[0] = new JTextField(5));
		jtfCombo[0].setText("0");
		
		//Combo2
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		JLabel jl3 = new JLabel("E-Combo B");
		p3.add(jl3);
		p3.add(jtfCombo[1] = new JTextField(5));
		jtfCombo[1].setText("0");
		
		//Combo3
		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout());
		JLabel jl4 = new JLabel("E-Combo C");
		p4.add(jl4);
		p4.add(jtfCombo[2] = new JTextField(5));
		jtfCombo[2].setText("0");
		
		//Confirm button
		JPanel p5 = new JPanel();
		p5.setLayout(new FlowLayout());
		p5.add(jbBack = new JButton("<")); 
		jbBack.setPreferredSize(new Dimension(45, 23));
		p5.add(jbConfirm = new JButton("Confirm"));
		
		//HeadPanel = p1
		
		//BodyPanel
		//merge p2-p4
		JPanel p2p3p4 = new JPanel();
		p2p3p4.setLayout(new BorderLayout());
		p2p3p4.add(p2, BorderLayout.NORTH);
		p2p3p4.add(p3, BorderLayout.CENTER);
		p2p3p4.add(p4, BorderLayout.SOUTH);
		
		//FootPanel = p5
		
		//assign panel to container
		canvas.add(p1, BorderLayout.NORTH);
		canvas.add(p2p3p4, BorderLayout.CENTER);
		canvas.add(p5, BorderLayout.SOUTH);
		
		//addActionListner
		jbConfirm.addActionListener(this);
		jbBack.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == jbConfirm)
		{
			boolean bool = true;
			
			for(int i=0; i<jtfCombo.length; i++)
			{
				//Exception for Combo input
				try
				{
					Integer.parseInt(jtfCombo[i].getText());
				}
					catch(NumberFormatException nfe)
					{
						bool = false;
						showMessageDialog(null, nfe.getMessage());
					}
			}
			
			//All input is correct
			if(bool == true)
			{
				//Assign comboNumber to int
				for(int i=0; i<comboNumber.length; i++)
				{
					comboNumber[i] = Integer.parseInt(jtfCombo[i].getText());
				}
				
				//Go to ReviewSummary Class
				OrderData next = new OrderData
				(this.movieName, this.hall, this.date, this.time, this.ticketType, this.seating, this.comboNumber);
				next.AddOnToReviewSummary();
				this.dispose();
			}
		}
		
		if(e.getSource() == jbBack)
		{
			OrderData back = new OrderData 
			(this.movieName, this.hall, this.date, this.time, this.ticketType, this.seating, this.comboNumber);
			back.ticketingToHall();
			this.dispose();
		}
	}
}
