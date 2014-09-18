import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;


public class LoginGUI extends GUIClass {
	private JTextField textField;
	private JPasswordField passwordField;
	
	public LoginGUI(){
		super();
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(252, 196, 82, 15);
		getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setToolTipText("Enter Your Username Here");
		textField.setBounds(420, 186, 200, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(252, 250, 82, 15);
		getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter Your Password Here");
		passwordField.setBounds(420, 240, 200, 25);
		getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(420, 301, 117, 25);
		getContentPane().add(btnLogin);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblUsername, lblPassword, passwordField, btnLogin, textField}));
	}
}
