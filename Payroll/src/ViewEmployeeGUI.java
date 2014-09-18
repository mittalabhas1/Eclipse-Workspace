import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ViewEmployeeGUI extends GUIClass {

	public ViewEmployeeGUI() {
		super();
		
		JButton btnViewEmployee = new JButton("View Employee");
		btnViewEmployee.setBounds(428, 344, 188, 25);
		getContentPane().add(btnViewEmployee);
		
		JLabel label = new JLabel("Select Class");
		label.setBounds(260, 213, 136, 15);
		getContentPane().add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Class A", "Class B", "Class C", "Class D", "Class E", "Class F", "Class G", "Class H"}));
		comboBox.setBounds(428, 211, 188, 25);
		getContentPane().add(comboBox);
		
		JLabel label_1 = new JLabel("Select Employee");
		label_1.setBounds(260, 278, 136, 15);
		getContentPane().add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(428, 276, 188, 25);
		getContentPane().add(comboBox_1);	
		
	}
}
