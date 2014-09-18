import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;


public class GUIClass extends JFrame {
	
	public GUIClass() {
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PAYROLL MANAGEMENT SOFTWARE");
		getContentPane().setLayout(null);
		
		JLabel lblAccountsDepartmentIit = new JLabel("Accounts Department, IIT Roorkee Saharanpur Campus");
		lblAccountsDepartmentIit.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAccountsDepartmentIit.setBounds(287, 11, 325, 15);
		getContentPane().add(lblAccountsDepartmentIit);
		
		JLabel lblCopyrightsInformation = new JLabel("Copyrights 2014, Information Management Group, IIT Roorkee |");
		lblCopyrightsInformation.setBounds(277, 546, 317, 15);
		getContentPane().add(lblCopyrightsInformation);
		
		JLabel lblCredits = new JLabel("Credits");
		lblCredits.setBounds(592, 546, 44, 15);
		getContentPane().add(lblCredits);
	}
}
