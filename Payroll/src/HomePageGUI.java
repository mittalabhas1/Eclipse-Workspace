import javax.swing.JLabel;
import javax.swing.JButton;

public class HomePageGUI extends GUIClass {
	public HomePageGUI() {
		super();
		
		JButton btnCreateNewEmployee = new JButton("Create Employee");
		btnCreateNewEmployee.setBounds(215, 170, 200, 80);
		getContentPane().add(btnCreateNewEmployee);
		
		JButton btnEdit = new JButton("View Employee");
		btnEdit.setBounds(215, 270, 200, 80);
		getContentPane().add(btnEdit);
		
		JButton btnViewAccountEntry = new JButton("View Account Entry");
		btnViewAccountEntry.setBounds(497, 270, 200, 80);
		getContentPane().add(btnViewAccountEntry);
		
		JButton btnNewAccountEntry = new JButton("New Account Entry");
		btnNewAccountEntry.setBounds(497, 170, 200, 80);
		getContentPane().add(btnNewAccountEntry);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setBounds(674, 64, 70, 15);
		getContentPane().add(lblWelcome);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setBounds(818, 87, 55, 15);
		getContentPane().add(lblLogout);
	}
}
