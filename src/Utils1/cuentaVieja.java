package Utils1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class cuentaVieja extends JFrame {

	private JPanel contentPane;
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtZ;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cuentaVieja frame = new cuentaVieja();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cuentaVieja() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		
		txtX = new JTextField();
		txtX.setText("x");
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		txtY = new JTextField();
		txtY.setText("y");
		contentPane.add(txtY);
		txtY.setColumns(10);
		
		txtZ = new JTextField();
		txtZ.setText("z");
		contentPane.add(txtZ);
		txtZ.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario\\Pictures\\Saved Pictures\\Screenshot_1.png"));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Regla de Tres");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText(deTres(Double.parseDouble(txtX.getText()), Double.parseDouble(txtY.getText()), Double.parseDouble(txtZ.getText())));
			}
		});
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("New label");
		contentPane.add(lblNewLabel_1);
	}
	
	public static String deTres(Double x, Double y, Double z) {
		Double aux = ((z*y)/x);
		String res = Double.toString(aux);
		return res;
	}

}
