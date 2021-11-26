import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JOptionPane.*;

public class Register_GUI extends JFrame implements ActionListener, ItemListener
{
	private JTextField jtfName, jtfMobileNumber, jtfBirthDate, jtfEmail, jtfPassword, jtfReEnterPassword;
	private JCheckBox jcbTnc;
	private JButton jbBack, jbRegister;
	private String name = "", mobilenumber = "", birthdate = "", email = "" , password = "", reenterpassword = "";
	
	public Register_GUI()
	{
		setTitle("Register");
		
		Container canvas = getContentPane();
		canvas.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		JLabel title = new JLabel("       REGISTER       ");
		p1.setLayout(new FlowLayout());
		p1.add(title);
		title.setFont(new Font("AR JULIAN", Font.BOLD, 25));
		//p1.add(new JLabel("-------------------------------------------------------------------------"));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		JLabel name = new JLabel("Name:                  ");
		p2.add(name);
		p2.add(jtfName = new JTextField(17));
		name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		JLabel mobilenumber = new JLabel("Mobile Number:     ");
		p3.add(mobilenumber);
		p3.add(jtfMobileNumber = new JTextField(17));
		mobilenumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout());
		JLabel birthdate = new JLabel("Birth Date:            ");
		p4.add(birthdate);
		p4.add(jtfBirthDate = new JTextField(17));
		birthdate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel p5 = new JPanel();
		p5.setLayout(new FlowLayout());
		JLabel email = new JLabel("Email:                   ");
		p5.add(email);
		p5.add(jtfEmail = new JTextField(17));
		email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel p6 = new JPanel();
		p6.setLayout(new FlowLayout());
		JLabel password = new JLabel("Password:             ");
		p6.add(password);
		p6.add(jtfPassword = new JTextField(17));
		password.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel p7 = new JPanel();
		p7.setLayout(new FlowLayout());
		JLabel reenterpassword = new JLabel("Re-enter Password:");
		p7.add(reenterpassword);
		p7.add(jtfReEnterPassword = new JTextField(17));
		reenterpassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel p8 = new JPanel();
		p8.setLayout(new FlowLayout());
		jcbTnc = new JCheckBox("By submitting this form, I agree to GSL's Terms & Conditions and Privacy Policy.");
		p8.add(jcbTnc);
		
		JPanel p9 = new JPanel();
		p9.setLayout(new FlowLayout());
		jbBack = new JButton("<");
		p9.add(jbBack);
		jbBack.setPreferredSize(new Dimension(45, 23));
		jbRegister = new JButton("Register");
		p9.add(jbRegister);
		jbRegister.setEnabled(false);
		//jbRegister.setFont(new Font("Tahoma", Font.PLAIN, 10));
	 
		JPanel p1p2p3 = new JPanel();
		p1p2p3.setLayout(new BorderLayout());
		p1p2p3.add(p1, BorderLayout.NORTH);
		p1p2p3.add(p2, BorderLayout.CENTER);
		p1p2p3.add(p3, BorderLayout.SOUTH);
		
		JPanel p4p5p6 = new JPanel();
		p4p5p6.setLayout(new BorderLayout());
		p4p5p6.add(p4, BorderLayout.NORTH);
		p4p5p6.add(p5, BorderLayout.CENTER);
		p4p5p6.add(p6, BorderLayout.SOUTH);
		
		JPanel p7p8p9 = new JPanel();
		p7p8p9.setLayout(new BorderLayout());
		p7p8p9.add(p7, BorderLayout.NORTH);
		p7p8p9.add(p8, BorderLayout.CENTER);
		p7p8p9.add(p9, BorderLayout.SOUTH);
		
		canvas.add(p1p2p3, BorderLayout.NORTH);
		canvas.add(p4p5p6, BorderLayout.CENTER);
		canvas.add(p7p8p9, BorderLayout.SOUTH);
		
		jcbTnc.addItemListener(this);
		jbRegister.addActionListener(this);
		jbBack.addActionListener(this);
	}

	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() instanceof JCheckBox)
		{
			if(jcbTnc.isSelected())
			{
				jbRegister.setEnabled(true);
			}
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == jbRegister)
		{
			boolean bool = true;
			
			try 
			{
				if(jtfPassword.getText().equals(""))
				{
					bool = false;
					throw new Exception("Password cannot be blank");
				}
			}
				catch(Exception ex) 
				{
					showMessageDialog(null, ex.getMessage());
				}
			
			try 
			{
				if(!jtfPassword.getText().equals(jtfReEnterPassword.getText()))
				{
					bool = false;
					jtfPassword.setBackground(Color.pink);
					jtfReEnterPassword.setBackground(Color.pink);
					throw new Exception("Password does not match");
				}
			}
				catch(Exception ex) 
				{
					showMessageDialog(null, ex.getMessage());
				}
			
			try 
			{
				jtfName.getText();
				
				if(!jtfName.getText().matches("[A-Za-z ]+" ))
				{
					bool = false;
					throw new Exception("Name cannot have numbers/symbols");
				}
				
				
		     }
			
			catch(Exception ex) 
			{
				showMessageDialog(null, ex.getMessage());
			}

		
			try 
			{
				Integer.parseInt(jtfMobileNumber.getText());
			}
			catch(NumberFormatException nfe)
			{
				bool = false;
				showMessageDialog(null, nfe.getMessage());
			}
			
			if(bool == true)
			{
				name = jtfName.getText();
				mobilenumber = jtfMobileNumber.getText();
				birthdate = jtfBirthDate.getText();
				email = jtfEmail.getText();
				password = jtfPassword.getText();
				reenterpassword = jtfReEnterPassword.getText();
			
				CustomerData use = new CustomerData(this.name,this.mobilenumber,this.birthdate,this.email,this.password,this.reenterpassword);
				
				use.RegisterToWelcome();
				
				Successful_GUI gui = new Successful_GUI();
				gui.setVisible(true);
				gui.pack();
				gui.setLocationRelativeTo(null);
				this.dispose();
			}	
		}
		
		if(e.getSource() == jbBack)
		{
			CustomerData back = new CustomerData();
			back.RegisterToWelcome();
			this.dispose();
		}	
	}

//end
}
	


