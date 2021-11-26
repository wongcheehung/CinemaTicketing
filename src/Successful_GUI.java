import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Successful_GUI extends JFrame implements ActionListener
{
	private JButton jbSuccessful, jbLogin;
	
	public Successful_GUI() {
	
		Container canvas = getContentPane();
		canvas.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		JLabel title = new JLabel("Successful!");
		p1.setLayout(new FlowLayout());
		p1.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		jbLogin = new JButton("OK");
		p2.add(jbLogin);
		jbLogin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		canvas.add(p1, BorderLayout.NORTH);
		canvas.add(p2, BorderLayout.SOUTH);
		
		jbLogin.addActionListener(this);
	
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource() == jbLogin) 
		{

			this.dispose();
		}
	}
}
