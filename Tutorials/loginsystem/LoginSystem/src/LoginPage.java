import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class LoginPage implements ActionListener {
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
	HashMap<String,String> logininfo = new HashMap<String,String>();
	JLabel messageLabel = new JLabel();// can put text in the constructor for something under the login and password
	
	
	LoginPage(HashMap<String,String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal; // For the HashMap
		
		userIDLabel.setBounds(50,100,75,25);// set the bounds for text of "userId" 
		userPasswordLabel.setBounds(50,150,75,25);// set the bounds for text of "password"
		
		messageLabel.setBounds(125, 250, 250, 35);// set the bounds for the message under the password and user 
		messageLabel.setFont(new Font(null,Font.ITALIC, 25));
		
		userIDField.setBounds(125,100,200,25);// allows the text field for user
		userPasswordField.setBounds(125,150,200,25);//allows the text field for password
		
		loginButton.setBounds(125,200,100,25);
		
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.addActionListener(this);
		
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == resetButton) {
			
			userIDField.setText("");
			userPasswordField.setText("");
		}
		if(e.getSource()==loginButton) {
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful");
					frame.dispose(); //  disposes frame before the new frame or window page
					WelcomePage welcomePage = new WelcomePage(userID);
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong Password");
					
				}
				}else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Username Not Found");
					
				}
		}
		
	}

}
