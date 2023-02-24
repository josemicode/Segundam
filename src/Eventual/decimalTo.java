package Eventual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class decimalTo extends JFrame {

	private JPanel contentPane;
	private JTextField valorA;
	private JTextField valorB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					decimalTo frame = new decimalTo();
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
	public boolean decimal = true;
	public boolean binary = false;
	public boolean octal = false;
	public boolean hexadecimal = false;

	public decimalTo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		valorA = new JTextField();
		valorA.setBounds(66, 55, 86, 20);
		contentPane.add(valorA);
		valorA.setColumns(10);

		valorB = new JTextField();
		valorB.setBounds(267, 55, 86, 20);
		contentPane.add(valorB);
		valorB.setColumns(10);

		JLabel labelResultado = new JLabel("Resultado:");
		labelResultado.setBounds(81, 140, 71, 14);
		contentPane.add(labelResultado);

		JLabel editarResultado = new JLabel("");
		editarResultado.setBounds(187, 140, 120, 14);
		contentPane.add(editarResultado);

		JButton botonSumar = new JButton("+");
		botonSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(valorA.getText());
				int n2 = Integer.parseInt(valorB.getText());

				int res = n1 + n2;

				editarResultado.setText(String.valueOf(res));
				decimal = true;
			}
		});
		botonSumar.setBounds(187, 29, 43, 23);
		contentPane.add(botonSumar);

		JButton botonRestar = new JButton("-");
		botonRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(valorA.getText());
				int n2 = Integer.parseInt(valorB.getText());

				int res = n1 - n2;

				editarResultado.setText(String.valueOf(res));
				decimal = true;
			}
		});
		botonRestar.setBounds(187, 86, 43, 23);
		contentPane.add(botonRestar);
		
		String items[] = {"Binario", "Decimal", "Octal", "Hexadecimal"};
		JComboBox<Object> comboBox = new JComboBox<Object>(items);
		comboBox.setBounds(127, 194, 149, 22);
		contentPane.add(comboBox);
		
		JButton botonConversor = new JButton("Convertir");
		botonConversor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch((String)comboBox.getSelectedItem()) {
				case "Decimal":
					if (!decimal) {
						
						int radix = 0;

						if (binary) {
							radix = 2;
							binary = false;
						} else if (octal) {
							radix = 8;
							octal = false;
						} else if (hexadecimal) {
							radix = 16;
							hexadecimal = false;
						}

						int res = Integer.parseInt(editarResultado.getText(), radix);

						editarResultado.setText(String.valueOf(res));
						decimal = true;
					}					
					break;
				
				case "Binario":
					if (decimal) {
						int num = Integer.parseInt(editarResultado.getText());
						String res = Integer.toBinaryString(num);

						editarResultado.setText(res);

						binary = true;
						decimal = false;
					}
					break;
					
				case "Octal":
					if (decimal) {
						int num = Integer.parseInt(editarResultado.getText());
						String res = Integer.toOctalString(num);

						editarResultado.setText(res);

						octal = true;
						decimal = false;
					}
					break;
					
				case "Hexadecimal":
					if (decimal) {
						int num = Integer.parseInt(editarResultado.getText());
						String res = Integer.toHexString(num);

						editarResultado.setText(res);

						hexadecimal = true;
						decimal = false;
					}
					break;
				}
			}
		});
		botonConversor.setBounds(137, 227, 89, 23);
		contentPane.add(botonConversor);
		
		
	}
}
