import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MovieList_GUI extends JFrame implements ActionListener, ItemListener
{
	private JButton Movie[] = new JButton [4];
	private JRadioButton Date[] = new JRadioButton [5];
	private JRadioButton Time[] = new JRadioButton [24];
	private JButton jbProceed, jbReset;
	private ButtonGroup bg = new ButtonGroup();
	private int movieNumber = 0;
	
	//Data
	private String movieName = "", date = "", time = "", hall = ""; //MovieList Class
	private int ticketType[] = new int[3]; //Ticketing Class
	private int ticketNumber = 0; //Ticketing Class
	private String seating[] = new String[10]; //Hall Class
	private int comboNumber[] = new int[3]; //AddOn Class
	
	public MovieList_GUI()
	{
		setTitle("Home");
		
		Container canvas = getContentPane();
		canvas.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		JLabel title = new JLabel("Movie");
		p1.add(title);
		title.setFont(new Font("Algerian", Font.BOLD, 35));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(Movie[0] = new JButton("(Sing Along) Frozen 2"));
		Movie[0].setPreferredSize(new Dimension(200, 50));
		p2.add(Movie[1] = new JButton("Black Christmas"));
		Movie[1].setPreferredSize(new Dimension(200, 50));
		p2.add(Movie[2] = new JButton("Star War 3"));
		Movie[2].setPreferredSize(new Dimension(200, 50));
		p2.add(Movie[3] = new JButton("Jumanji:The Next Level"));
		Movie[3].setPreferredSize(new Dimension(200, 50));
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		JLabel selectDate = new JLabel("Select Date");
		p3.add(selectDate);
		selectDate.setFont(new Font("Consolas", Font.BOLD, 17));
		
		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout());
		p4.add( Date[0] = new JRadioButton("16/12/2019"));
		p4.add( Date[1] = new JRadioButton("17/12/2019"));
		p4.add( Date[2] = new JRadioButton("18/12/2019"));
		p4.add( Date[3] = new JRadioButton("19/12/2019"));
		p4.add( Date[4] = new JRadioButton("20/12/2019"));
		for(int i=0; i<5; i++)
		{Date[i].setFont(new Font("Aharoni", Font.PLAIN, 15));}
		
		for(int i=0; i<5; i++)
		{bg.add(Date[i]);}
		
		
		JPanel p5 = new JPanel();
		p5.setLayout(new FlowLayout());
		p5.add( Time[0] = new JRadioButton("11.00am"));
		
		JPanel p6 = new JPanel();
		p6.setLayout(new FlowLayout());
		p6.add( Time[1] = new JRadioButton("2.00pm"));

		JPanel p7 = new JPanel();
		p7.setLayout(new FlowLayout());
		p7.add( Time[2] = new JRadioButton("8.00pm"));
		
		JPanel p8 = new JPanel();
		p8.setLayout(new FlowLayout());
		p8.add( Time[3] = new JRadioButton("8.00am"));
		
		JPanel p9 = new JPanel();
		p9.setLayout(new FlowLayout());
		p9.add( Time[4] = new JRadioButton("1.00pm"));
		
		JPanel p10 = new JPanel();
		p10.setLayout(new FlowLayout());
		p10.add( Time[5] = new JRadioButton("5.00pm"));
		
		JPanel p11 = new JPanel();
		p11.setLayout(new FlowLayout());
		p11.add( Time[6] = new JRadioButton("8.00am"));
		
		JPanel p12 = new JPanel();
		p12.setLayout(new FlowLayout());
		p12.add( Time[7] = new JRadioButton("2.00pm"));
		
		JPanel p13 = new JPanel();
		p13.setLayout(new FlowLayout());
		p13.add( Time[8] = new JRadioButton("5.00pm"));
		
		JPanel p14 = new JPanel();
		p14.setLayout(new FlowLayout());
		p14.add( Time[9] = new JRadioButton("10.00am"));
		
		JPanel p15 = new JPanel();
		p15.setLayout(new FlowLayout());
		p15.add( Time[10] = new JRadioButton("2.00pm"));
		
		JPanel p16 = new JPanel();
		p16.setLayout(new FlowLayout());
		p16.add( Time[11] = new JRadioButton("7.00pm"));
		
		JPanel p17 = new JPanel();
		p17.setLayout(new FlowLayout());
		p17.add( Time[12] = new JRadioButton("2.00pm"));
		
		JPanel p18 = new JPanel();
		p18.setLayout(new FlowLayout());
		p18.add( Time[13] = new JRadioButton("8.00pm"));
		
		JPanel p19 = new JPanel();
		p19.setLayout(new FlowLayout());
		p19.add( Time[14] = new JRadioButton("12.00am"));
		
		JPanel p20 = new JPanel();
		p20.setLayout(new FlowLayout());
		p20.add( Time[15] = new JRadioButton("10.00am"));
		
		JPanel p21 = new JPanel();
		p21.setLayout(new FlowLayout());
		p21.add( Time[16] = new JRadioButton("2.30pm"));
		
		JPanel p22 = new JPanel();
		p22.setLayout(new FlowLayout());
		p22.add( Time[17] = new JRadioButton("8.30pm"));
		
		JPanel p23 = new JPanel();
		p23.setLayout(new FlowLayout());
		p23.add( Time[18] = new JRadioButton("12.00pm"));
		
		JPanel p24 = new JPanel();
		p24.setLayout(new FlowLayout());
		p24.add( Time[19] = new JRadioButton("4.00pm"));
		
		JPanel p25 = new JPanel();
		p25.setLayout(new FlowLayout());
		p25.add( Time[20] = new JRadioButton("8.00pm"));
		
		JPanel p26 = new JPanel();
		p26.setLayout(new FlowLayout());
		p26.add( Time[21] = new JRadioButton("12.00pm"));
		
		JPanel p27 = new JPanel();
		p27.setLayout(new FlowLayout());
		p27.add( Time[22] = new JRadioButton("4.00pm"));
		
		JPanel p28 = new JPanel();
		p28.setLayout(new FlowLayout());
		p28.add( Time[23] = new JRadioButton("10.00pm"));
		
		for(int i=0; i<24; i++)
		{Time[i].setFont(new Font("Aharoni", Font.PLAIN, 15));}
		
		
		for(int i=0; i<24; i++)
		{bg.add(Time[i]);}
		
		JPanel p29 = new JPanel();
		p29.setLayout(new FlowLayout());
		p29.add(jbReset = new JButton("Reset"));
		p29.add(jbProceed = new JButton("Proceed"));
		jbProceed.setEnabled(false);
		
		JPanel p2to4 = new JPanel();
		p2to4.setLayout(new BorderLayout());
		p2to4.add(p2, BorderLayout.NORTH);
		p2to4.add(p3, BorderLayout.CENTER);
		p2to4.add(p4, BorderLayout.SOUTH);
		
		JPanel p5to7 = new JPanel();
		p5to7.setLayout(new FlowLayout());
		p5to7.add(p5);
		p5to7.add(p6);
		p5to7.add(p7);
		
		JPanel p8to10 = new JPanel();
		p8to10.setLayout(new FlowLayout());
		p8to10.add(p8);
		p8to10.add(p9);
		p8to10.add(p10);
		
		JPanel p11to13 = new JPanel();
		p11to13.setLayout(new FlowLayout());
		p11to13.add(p11);
		p11to13.add(p12);
		p11to13.add(p13);
		
		JPanel p14to16 = new JPanel();
		p14to16.setLayout(new FlowLayout());
		p14to16.add(p14);
		p14to16.add(p15);
		p14to16.add(p16);
		
		JPanel p17to19 = new JPanel();
		p17to19.setLayout(new FlowLayout());
		p17to19.add(p17);
		p17to19.add(p18);
		p17to19.add(p19);
		
		JPanel p20to22 = new JPanel();
		p20to22.setLayout(new FlowLayout());
		p20to22.add(p20);
		p20to22.add(p21);
		p20to22.add(p22);
		
		JPanel p23to25 = new JPanel();
		p23to25.setLayout(new FlowLayout());
		p23to25.add(p23);
		p23to25.add(p24);
		p23to25.add(p25);
		
		JPanel p26to28 = new JPanel();
		p26to28.setLayout(new FlowLayout());
		p26to28.add(p26);
		p26to28.add(p27);
		p26to28.add(p28);
		
		JPanel p2to10 = new JPanel();
		p2to10.setLayout(new BorderLayout());
		p2to10.add(p2to4, BorderLayout.NORTH);
		p2to10.add(p5to7, BorderLayout.CENTER);
		p2to10.add(p8to10, BorderLayout.SOUTH);
		
		JPanel p11to19 = new JPanel();
		p11to19.setLayout(new BorderLayout());
		p11to19.add(p11to13, BorderLayout.NORTH);
		p11to19.add(p14to16, BorderLayout.CENTER);
		p11to19.add(p17to19, BorderLayout.SOUTH);
		
		JPanel p20to28 = new JPanel();
		p20to28.setLayout(new BorderLayout());
		p20to28.add(p20to22, BorderLayout.NORTH);
		p20to28.add(p23to25, BorderLayout.CENTER);
		p20to28.add(p26to28, BorderLayout.SOUTH);
		
		JPanel p2to28 = new JPanel();
		p2to28.setLayout(new BorderLayout());
		p2to28.add(p2to10, BorderLayout.NORTH);
		p2to28.add(p11to19, BorderLayout.CENTER);
		p2to28.add(p20to28, BorderLayout.SOUTH);
		
		
		for (int i=0;i<24;i++) 
		{
		  Time[i].setVisible(false);
		}
		
		for (int i=0;i<5;i++) 
		{
		  Date[i].setEnabled(false);
		}
		
		canvas.add(p1, BorderLayout.NORTH);
		canvas.add(p2to28, BorderLayout.CENTER);
		canvas.add(p29, BorderLayout.SOUTH);
		
	
		for(int i=0; i<4; i++)
		{
			Movie[i].addActionListener(this);
		}
		
		for(int i=0; i<5; i++)
		{
			Date[i].addItemListener(this);
		}
		
		for(int i=0; i<24; i++)
		{
			Time[i].addItemListener(this);
		}
		
		jbReset.addActionListener(this);
		jbProceed.addActionListener(this);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(movieNumber == 1)
		{
			if(e.getSource() instanceof JRadioButton)
			{
				
				if(Date[0].isSelected()) //monday
				{
					date = "16/12/2019";	
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[0].setBackground(Color.yellow);					
					Time[0].setVisible(true);
					Time[1].setVisible(true);
					Time[2].setVisible(true);
				}
					
				if(Date[1].isSelected())  //tuesday
				{
					date = "17/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[1].setBackground(Color.yellow);	
					Time[3].setVisible(true);
					Time[4].setVisible(true);
					Time[5].setVisible(true);
				}
					
				if(Date[2].isSelected()) //wednesday
				{
					date = "18/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[2].setBackground(Color.yellow);		
					Time[0].setVisible(true);
					Time[1].setVisible(true);
					Time[2].setVisible(true);				
				}
							
							
				if(Date[3].isSelected())  //thursday
				{
					date = "19/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[3].setBackground(Color.yellow);			
					Time[3].setVisible(true);
					Time[4].setVisible(true);
					Time[5].setVisible(true);			
				}
							
				if(Date[4].isSelected()) //friday
				{
					date = "20/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[4].setBackground(Color.yellow);				
					Time[0].setVisible(true);
					Time[1].setVisible(true);
					Time[2].setVisible(true);
							
				}
			}
		}
		
		
		else if(movieNumber == 2)
		{
			if(e.getSource() instanceof JRadioButton)
			{
					
				if(Date[0].isSelected()) //monday
				{
					date = "16/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[0].setBackground(Color.yellow);
					Time[6].setVisible(true);
					Time[7].setVisible(true);
					Time[8].setVisible(true);
				
				}
					
				if(Date[1].isSelected())  //tuesday
				{
					date = "17/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[1].setBackground(Color.yellow);
					Time[9].setVisible(true);
					Time[10].setVisible(true);
					Time[11].setVisible(true);
				
				}
					
				if(Date[2].isSelected()) //wednesday
				{
					date = "18/12/2019";
					
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[2].setBackground(Color.yellow);	
					Time[6].setVisible(true);
					Time[7].setVisible(true);
					Time[8].setVisible(true);
						
				}
							
							
				if(Date[3].isSelected())  //thursday
				{
					date = "19/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[3].setBackground(Color.yellow);
					Time[9].setVisible(true);
					Time[10].setVisible(true);
					Time[11].setVisible(true);
						
				}
							
				if(Date[4].isSelected()) //friday
				{
					date = "20/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[4].setBackground(Color.yellow);
					Time[6].setVisible(true);
					Time[7].setVisible(true);
					Time[8].setVisible(true);
						
				}
			}
		}
		
		else if(movieNumber == 3)
		{
			if(e.getSource() instanceof JRadioButton)
			{
					
				if(Date[0].isSelected()) //monday
				{
					date = "16/12/2019";	
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[0].setBackground(Color.yellow);
					Time[12].setVisible(true);
					Time[13].setVisible(true);
					Time[14].setVisible(true);
				
				}
					
				if(Date[1].isSelected())  //tuesday
				{
					date = "17/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[1].setBackground(Color.yellow);
					Time[15].setVisible(true);
					Time[16].setVisible(true);
					Time[17].setVisible(true);
				
				}
					
				if(Date[2].isSelected()) //wednesday
				{
					date = "18/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[2].setBackground(Color.yellow);
					Time[12].setVisible(true);
					Time[13].setVisible(true);
					Time[14].setVisible(true);
						
				}
							
							
				if(Date[3].isSelected())  //thursday
				{
					date = "19/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[3].setBackground(Color.yellow);
					Time[15].setVisible(true);
					Time[16].setVisible(true);
					Time[17].setVisible(true);
						
				}
							
				if(Date[4].isSelected()) //friday
				{
					date = "20/12/2019";
					
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[4].setBackground(Color.yellow);	
					Time[12].setVisible(true);
					Time[13].setVisible(true);
					Time[14].setVisible(true);
						
				}
			}
		}
	
		else if(movieNumber == 4)
		{
			if(e.getSource() instanceof JRadioButton)
			{
				
				date = "16/12/2019";
				if(Date[0].isSelected()) //monday
				{
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[0].setBackground(Color.yellow);
					Time[18].setVisible(true);
					Time[19].setVisible(true);
					Time[20].setVisible(true);
				
				}
					
				if(Date[1].isSelected())  //tuesday
				{
					date = "17/12/2019";
					
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[1].setBackground(Color.yellow);	
					Time[21].setVisible(true);
					Time[22].setVisible(true);
					Time[23].setVisible(true);
				
				}
					
				if(Date[2].isSelected()) //wednesday
				{
					date = "18/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[2].setBackground(Color.yellow);
					Time[18].setVisible(true);
					Time[19].setVisible(true);
					Time[20].setVisible(true);
						
				}
							
							
				if(Date[3].isSelected())  //thursday
				{
					date = "19/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[3].setBackground(Color.yellow);
					Time[21].setVisible(true);
					Time[22].setVisible(true);
					Time[23].setVisible(true);
						
				}
							
				if(Date[4].isSelected()) //friday
				{
					date = "20/12/2019";
						
					
					for(int i=0; i<5; i++)
					{
						Date[i].setEnabled(false);
						Date[i].setBackground(Color.black);
					}
					Date[4].setBackground(Color.yellow);
					Time[18].setVisible(true);
					Time[19].setVisible(true);
					Time[20].setVisible(true);
						
				}
				
				
			}
		}
		
		for(int i=0; i<24;i++)
		{
			if(Time[i].isSelected())
			{
				jbProceed.setEnabled(true);
			}
		}
		
		if(Time[0].isSelected())
		{
			time = "11.00am";
		}
		
		if(Time[1].isSelected())
		{
			time = "2.00pm";
		}

		if(Time[2].isSelected())
		{
			time = "8.00pm";
		}

		if(Time[3].isSelected())
		{
			time = "8.00am";
		}
		
		if(Time[4].isSelected())
		{
			time = "1.00pm";
		}
		
		if(Time[5].isSelected())
		{
			time = "5.00pm";
		}
		
		if(Time[6].isSelected())
		{
			time = "8.00am";
		}
		
		if(Time[7].isSelected())
		{
			time = "2.00pm";
		}
		
		if(Time[8].isSelected())
		{
			time = "5.00pm";
		}
		
		if(Time[9].isSelected())
		{
			time = "10.00am";
		}
		
		if(Time[10].isSelected())
		{
			time = "2.00pm";
		}
		
		if(Time[11].isSelected())
		{
			time = "7.00pm";
		}
		
		if(Time[12].isSelected())
		{
			time = "2.00pm";
		}
		
		if(Time[13].isSelected())
		{
			time = "8.00pm";
		}
		
		if(Time[14].isSelected())
		{
			time = "12.00am";
		}
		
		if(Time[15].isSelected())
		{
			time = "10.00am";
		}
		
		if(Time[16].isSelected())
		{
			time = "2.30am";
		}
		
		if(Time[17].isSelected())
		{
			time = "8.30pm";
		}
		
		if(Time[18].isSelected())
		{
			time = "12.00pm";
		}
		
		if(Time[19].isSelected())
		{
			time = "4.00pm";
		}
		
		if(Time[20].isSelected())
		{
			time = "8.0pm";
		}
		
		if(Time[21].isSelected())
		{
			time = "12.00pm";
		}
		
		if(Time[22].isSelected())
		{
			time = "4.00pm";
		}
		
		if(Time[23].isSelected())
		{
			time = "10.00pm";
		}
		
		
		if(Time[0].isSelected()||Time[3].isSelected()||Time[7].isSelected()||Time[10].isSelected()||Time[13].isSelected()||Time[16].isSelected()||Time[19].isSelected()||Time[23].isSelected())
		{
			//hallNumber = 1;
			hall = "Hall 1";
		}
		
		else if(Time[1].isSelected()||Time[4].isSelected()||Time[6].isSelected()||Time[9].isSelected()||Time[14].isSelected()||Time[15].isSelected()||Time[20].isSelected()||Time[21].isSelected())
		{
			//hallNumber = 2;
			hall = "Hall 2";
		}
		
		else if(Time[2].isSelected()||Time[5].isSelected()||Time[8].isSelected()||Time[11].isSelected()||Time[12].isSelected()||Time[17].isSelected()||Time[18].isSelected()||Time[22].isSelected())
		{
			//hallNumber = 3;
			hall = "Hall 3";
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//movie 1
		if(e.getSource() == Movie[0]) 
		{
			for(int i=0; i<4; i++)
			{
				Movie[i].setEnabled(false);
				Movie[i].setBackground(Color.black);
			}
			Movie[0].setBackground(Color.yellow);
			
			movieNumber = 1;
			movieName = "(Sing Along) Frozen 2";
		
		}
		
		else if(e.getSource() == Movie[1])
		{	//movie 2
			for(int i=0; i<4; i++)
			{
				Movie[i].setEnabled(false);
				Movie[i].setBackground(Color.black);
			}
			Movie[1].setBackground(Color.yellow);
			
			Movie[1].setEnabled(false);
			movieNumber = 2;
			movieName = "Black Christmas";
		}
			
		else if(e.getSource() == Movie[2])
		{
			for(int i=0; i<4; i++)
			{
				Movie[i].setEnabled(false);
				Movie[i].setBackground(Color.black);
			}
			Movie[2].setBackground(Color.yellow);
			
			Movie[2].setEnabled(false);
			movieNumber = 3;
			movieName = "Star War 3";
		}
			
		else if(e.getSource() == Movie[3])
		{
			for(int i=0; i<4; i++)
			{
				Movie[i].setEnabled(false);
				Movie[i].setBackground(Color.black);
			}
			Movie[3].setBackground(Color.yellow);
			
			Movie[3].setEnabled(false);
			movieNumber = 4;
			movieName = "Jumanji:The Next Level";
		}
		
		for(int i=0; i<4;i++)
		{
			if(e.getSource() == Movie[i])
			{
				for(int j=0; j<5; j++)
				{
					Date[j].setEnabled(true);
				}
			}
		}
		
		//Refresh to MovieList Class
		if(e.getSource() == jbReset)
		{
			LoginData gui = new LoginData();
			gui.WelcomeToMovieList(); //new
			this.dispose();
		}
		
		//Go to Ticketing Class
		if(e.getSource() == jbProceed)
		{
			OrderData next = new OrderData 
			(this.movieName, this.hall, this.date, this.time, this.ticketType, this.seating, this.comboNumber);//new
			next.movieListToTicketing();
			this.dispose();
		}
		
	}
}

