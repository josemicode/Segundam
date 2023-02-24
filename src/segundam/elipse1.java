package segundam;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;


import javax.swing.Timer;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;

public class elipse1 extends JFrame {

	private JPanel contentPane1;
	private JPanel contentPane2;
	private JPanel contentPane3;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					elipse1 frame = new elipse1();
					frame.setResizable(false);
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
	public elipse1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane1 = new JPanel();
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane1.setBackground(new Color(255,255,255));

		contentPane2 = new JPanel();
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane2.setBackground(new Color(255,255,255));

		contentPane3 = new JPanel();
		contentPane3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane3.setBackground(new Color(255,255,255));

		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		contentPane3.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(182, 11, 226, 172);
		ImageIcon img2 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\elipse\\imgs\\elipsologo.png");
		lblNewLabel.setIcon(new ImageIcon(img2.getImage().getScaledInstance(225,155,110)));
		contentPane1.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Install JDK");
		chckbxNewCheckBox.setBounds(10, 117, 97, 23);
		chckbxNewCheckBox.setBackground(new Color(255,255,255));
		contentPane1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Create Desktop Shortcut");
		chckbxNewCheckBox_1.setBounds(10, 143, 166, 23);
		chckbxNewCheckBox_1.setBackground(new Color(255,255,255));
		contentPane1.add(chckbxNewCheckBox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 55, 162, 22);
		comboBox.addItem("Java 17+ VM");
		
		comboBox.addItem("JRE 18.0.2.1 - https://download.eclipse.org/justj/jres/18/updates/release/latest");
		comboBox.addItem("https://download.eclipse.org/justj/jres/17/updates/release/latest");
		
		contentPane1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("Installation Folder");
		
		comboBox_1.addItem("C:\\Users\\Usuario\\eclipse\\java-2022-092");
		comboBox_1.addItem("C:\\Users\\Sistema\\Documentos\\eclipse\\java-2022-093");
		
		comboBox_1.setBounds(10, 88, 162, 22);
		
		contentPane1.add(comboBox_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(141, 194, 146, 14);
		contentPane2.add(progressBar);
				
		
		
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(contentPane2);
				validate();
				
				Timer t = null;
		
			t = new Timer(500,  new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean bool = false;
				
				int tcount = 0;
				do {
					tcount++;
				}while(tcount<100);
				
				//System.out.println(tcount);
				progressBar.setValue(progressBar.getValue()+5);
				
				if (progressBar.getValue()>=100) {
					
					((Timer)e.getSource()).stop();
						
					setContentPane(contentPane3);
					validate();
				}
			}
		});
			t.start();
			
			}
		});
		btnNewButton.setBounds(317, 194, 107, 56);
		btnNewButton.setBackground(new Color(255,255,255));
		ImageIcon img1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\elipse\\imgs\\dwn.png");
		btnNewButton.setIcon(new ImageIcon(img1.getImage().getScaledInstance(40,40,40)));
		
		contentPane1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("ELIPSE® Ha sido instalado exitosamente. ¡Disfruta!");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane3.add(lblNewLabel_1);
		lblNewLabel_1.setBounds(20, 10, 398, 34);
		
		
	}
}
