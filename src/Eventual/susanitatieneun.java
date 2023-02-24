package Eventual;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class susanitatieneun extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					susanitatieneun frame = new susanitatieneun();
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
	private JComboBox comboBox;
	private JSpinner spinner;
	
	@SuppressWarnings("unchecked")
	public susanitatieneun() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		spinner = new JSpinner();
		spinner.setBounds(67, 57, 89, 20);
		spinner.setModel(new SpinnerNumberModel(0,0,100,25));
		contentPane.add(spinner);
		
		comboBox = new JComboBox();
		comboBox.setBounds(245, 56, 150, 22);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Izquierdo", "Derecho"}));
		contentPane.add(comboBox);
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 113, 146, 61);
		contentPane.add(progressBar);
		
		JPanel panel = new JPanel();
		panel.setBounds(245, 113, 150, 137);
		contentPane.add(panel);
		
		spinner.addChangeListener(new ChangeListener() {  
			public void stateChanged(ChangeEvent e) {
				repaint();
			}
		});
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				repaint();
			}
		});
			 
		
	}
		
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		g.drawRect(215,120,120,150);
		g.drawRect(50,120, 80, 20);
		if(comboBox.getSelectedItem().toString().equals("Izquierdo")) {
			g.fillRect(215,120, 60, 60);
			g.setColor(Color.gray);
			g.fillOval(215,120,60,60);
		}
		else {
			g.fillRect(275,120, 60, 60);
			g.setColor(Color.gray);
			g.fillOval(275,120,60,60);
		}
		if(spinner.getValue().equals(0)) {
			g.setColor(Color.red);
			g.fillRect(50,120, 20, 20);
		}
		else if(spinner.getValue().equals(25)){
			g.setColor(Color.orange);
			g.fillRect(50,120, 40, 20);
		}
		else if(spinner.getValue().equals(50)){
			g.setColor(Color.green);
			g.fillRect(50,120, 80, 20);
		}
	}
}
