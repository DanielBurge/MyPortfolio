package combobox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JComboBox;

public class MyFrame extends JFrame implements ActionListener{
	
	JComboBox comboBox;
	
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String [] animals = {"dog", "cat", "bird"};
		
		 comboBox = new JComboBox(animals);
		 comboBox.addActionListener(this);
		 
		 comboBox.setSelectedIndex(0);
		 comboBox.removeAllItems();
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedIndex());
			
		}
		
	}

}
