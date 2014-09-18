import javax.swing.JFrame;
import javax.swing.JLabel;


public class Credits extends JFrame {
	public Credits() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Credits");
		getContentPane().setLayout(null);
		
		JLabel lblDeveloped = new JLabel("Developed by");
		lblDeveloped.setBounds(183, 90, 67, 15);
		getContentPane().add(lblDeveloped);
		
		JLabel lblAbhasMittal = new JLabel("Abhas Mittal");
		lblAbhasMittal.setBounds(187, 106, 59, 15);
		getContentPane().add(lblAbhasMittal);
		
		JLabel lblEnrollmentNo = new JLabel("Enrollment No: 11120003");
		lblEnrollmentNo.setBounds(153, 122, 127, 15);
		getContentPane().add(lblEnrollmentNo);
		
		JLabel lblEmailMittalabhasgmailcom = new JLabel("Email: mittalabhas1@gmail.com");
		lblEmailMittalabhasgmailcom.setBounds(140, 138, 154, 15);
		getContentPane().add(lblEmailMittalabhasgmailcom);
		
		JLabel lblCopyrightsInformation = new JLabel("Copyrights 2014, IMG, IIT Roorkee");
		lblCopyrightsInformation.setBounds(132, 244, 169, 15);
		getContentPane().add(lblCopyrightsInformation);
	}
}
