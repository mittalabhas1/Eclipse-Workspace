import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class CreateEmployeeGUI extends GUIClass {
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblDateOfBirth;
	private JLabel lblDateOfAppointment;
	private JLabel label_5;
	private JLabel lblResidenceStatus;
	private JTextField textField_4;
	private JTextField txtYyyymmdd_1;
	private JTextField txtYyyymmdd;
	private JLabel lblBasicPay;
	private JTextField textField_8;
	private JLabel lblDearnessAllowance;
	private JTextField textField_9;
	public CreateEmployeeGUI() {
		super();
		
		JLabel lblName = new JLabel("Employee Name");
		lblName.setBounds(71, 156, 153, 15);
		getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(259, 154, 159, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(71, 197, 153, 15);
		getContentPane().add(lblEmployeeId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(259, 195, 159, 19);
		getContentPane().add(textField_1);
		
		label_1 = new JLabel("Name");
		label_1.setBounds(71, 241, 153, 15);
		getContentPane().add(label_1);
		
		label_2 = new JLabel("Name");
		label_2.setBounds(71, 282, 153, 15);
		getContentPane().add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(259, 280, 159, 19);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(259, 239, 159, 19);
		getContentPane().add(textField_3);
		
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
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(667, 237, 159, 19);
		getContentPane().add(textField_4);
		
		txtYyyymmdd_1 = new JTextField();
		txtYyyymmdd_1.setText("yyyy/mm/dd");
		txtYyyymmdd_1.setColumns(10);
		txtYyyymmdd_1.setBounds(667, 193, 159, 19);
		getContentPane().add(txtYyyymmdd_1);
		
		txtYyyymmdd = new JTextField();
		txtYyyymmdd.setText("yyyy/mm/dd");
		txtYyyymmdd.setColumns(10);
		txtYyyymmdd.setBounds(667, 152, 159, 19);
		getContentPane().add(txtYyyymmdd);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(395, 369, 117, 25);
		getContentPane().add(btnCreate);
		
		lblBasicPay = new JLabel("Basic Pay");
		lblBasicPay.setBounds(71, 327, 153, 15);
		getContentPane().add(lblBasicPay);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(259, 325, 159, 19);
		getContentPane().add(textField_8);
		
		lblDearnessAllowance = new JLabel("Dearness Allowance");
		lblDearnessAllowance.setBounds(479, 325, 153, 15);
		getContentPane().add(lblDearnessAllowance);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(667, 323, 159, 19);
		getContentPane().add(textField_9);
		
		JRadioButton rdbtnResiding = new JRadioButton("Residing");
		rdbtnResiding.setBounds(667, 264, 149, 23);
		getContentPane().add(rdbtnResiding);
		
		JRadioButton rdbtnNonresiding = new JRadioButton("Non-Residing");
		rdbtnNonresiding.setBounds(667, 292, 149, 23);
		getContentPane().add(rdbtnNonresiding);
	}
}
