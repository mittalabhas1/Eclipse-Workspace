import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;


public class ChangePasswordGUI extends JFrame {
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	public ChangePasswordGUI() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Change Password");
		getContentPane().setLayout(null);
		
		JLabel lblOldPassword = new JLabel("Old Password");
		lblOldPassword.setBounds(58, 40, 156, 15);
		getContentPane().add(lblOldPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(221, 35, 156, 25);
		getContentPane().add(passwordField);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setBounds(58, 96, 156, 15);
		getContentPane().add(lblNewPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(221, 94, 156, 25);
		getContentPane().add(passwordField_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(58, 158, 156, 15);
		getContentPane().add(lblConfirmPassword);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(221, 156, 156, 25);
		getContentPane().add(passwordField_2);
		
		JButton btnChange = new JButton("Change");
		btnChange.setBounds(158, 209, 120, 25);
		getContentPane().add(btnChange);
	}
}
