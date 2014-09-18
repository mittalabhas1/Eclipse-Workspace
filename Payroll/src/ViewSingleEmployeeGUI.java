import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class ViewSingleEmployeeGUI extends GUIClass {
	private JLabel label_1;
	private JLabel label_2;
	private JLabel lblDateOfBirth;
	private JLabel lblDateOfAppointment;
	private JLabel label_5;
	private JLabel lblResidenceStatus;
	private JLabel lblBasicPay;
	private JLabel lblDearnessAllowance;
	public ViewSingleEmployeeGUI() {
		super();
		
		JLabel lblName = new JLabel("Employee Name");
		lblName.setBounds(71, 156, 153, 15);
		getContentPane().add(lblName);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(71, 197, 153, 15);
		getContentPane().add(lblEmployeeId);
		
		label_1 = new JLabel("Name");
		label_1.setBounds(71, 241, 153, 15);
		getContentPane().add(label_1);
		
		label_2 = new JLabel("Name");
		label_2.setBounds(71, 282, 153, 15);
		getContentPane().add(label_2);
		
		lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(479, 154, 153, 15);
		getContentPane().add(lblDateOfBirth);
		
		lblDateOfAppointment = new JLabel("Date of Appointment");
		lblDateOfAppointment.setBounds(479, 195, 153, 15);
		getContentPane().add(lblDateOfAppointment);
		
		label_5 = new JLabel("Name");
		label_5.setBounds(479, 239, 153, 15);
		getContentPane().add(label_5);
		
		lblResidenceStatus = new JLabel("Residence Status");
		lblResidenceStatus.setBounds(479, 280, 153, 15);
		getContentPane().add(lblResidenceStatus);
		
		JButton btnCreate = new JButton("Edit");
		btnCreate.setBounds(395, 369, 117, 25);
		getContentPane().add(btnCreate);
		
		lblBasicPay = new JLabel("Basic Pay");
		lblBasicPay.setBounds(71, 327, 153, 15);
		getContentPane().add(lblBasicPay);
		
		lblDearnessAllowance = new JLabel("Dearness Allowance");
		lblDearnessAllowance.setBounds(479, 325, 153, 15);
		getContentPane().add(lblDearnessAllowance);
	}
}
