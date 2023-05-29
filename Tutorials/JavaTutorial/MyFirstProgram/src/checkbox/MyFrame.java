package checkbox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class MyFrame extends JFrame implements ActionListener{
	JButton Button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
	
		
	 Button = new JButton();
		Button.setText("submit");
		Button.addActionListener(this);
		
		
	
		JCheckBox checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
		
		this.add(Button);
		this.add(checkBox);
		this.pack();// size of frame adjust to component
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== Button){
			
			
			
		}
		
	}

}
