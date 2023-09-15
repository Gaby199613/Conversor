package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor_Temperatura extends JFrame implements ActionListener {

	private JPanel contentPane2;
	private JTextField txtValor;
	private JTextField txtResultado;
	private JButton btnLimpiar;
	private JButton btnSalir;
	
	double temperatura = 0;
	double conversion = 0;
	String t;
	String t2;
	private JButton btnMostrar;
	private JComboBox cboT1;
	private JComboBox cboT2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor_Temperatura frame = new Conversor_Temperatura();
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
	public Conversor_Temperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane2 = new JPanel();
		contentPane2.setBackground(new Color(4, 251, 158));
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane2);
		contentPane2.setLayout(null);
		
		JLabel lblConversor2 = new JLabel("Conversor de Temperatura");
		lblConversor2.setForeground(new Color(255, 128, 64));
		lblConversor2.setFont(new Font("Arial", Font.BOLD, 16));
		lblConversor2.setBounds(113, 23, 209, 13);
		contentPane2.add(lblConversor2);
		
		JLabel lblTemperatura = new JLabel("Ingrese la temperatura:");
		lblTemperatura.setForeground(new Color(0, 0, 128));
		lblTemperatura.setFont(new Font("Arial", Font.BOLD, 13));
		lblTemperatura.setBounds(10, 60, 162, 13);
		contentPane2.add(lblTemperatura);
		
		txtValor = new JTextField();
		txtValor.setForeground(new Color(0, 0, 0));
		txtValor.setFont(new Font("Arial", Font.PLAIN, 14));
		txtValor.setColumns(10);
		txtValor.setBounds(162, 57, 160, 19);
		contentPane2.add(txtValor);
		
		JLabel lblConvertir3 = new JLabel("Convertir:");
		lblConvertir3.setForeground(new Color(128, 0, 0));
		lblConvertir3.setFont(new Font("Arial", Font.BOLD, 13));
		lblConvertir3.setBounds(10, 109, 64, 13);
		contentPane2.add(lblConvertir3);
		
		cboT1 = new JComboBox();
		cboT1.addActionListener(this);
		cboT1.setModel(new DefaultComboBoxModel(new String[] {"Fahrenheit ", "Kelvin ", "Rankine ", "Celsius"}));
		cboT1.setToolTipText("");
		cboT1.setFont(new Font("Arial", Font.PLAIN, 12));
		cboT1.setBounds(84, 105, 88, 21);
		contentPane2.add(cboT1);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(this);
		btnMostrar.setForeground(Color.YELLOW);
		btnMostrar.setFont(new Font("Arial", Font.BOLD, 13));
		btnMostrar.setBackground(Color.RED);
		btnMostrar.setBounds(304, 166, 85, 21);
		contentPane2.add(btnMostrar);
		
		JLabel lblConvertir = new JLabel("Conversión:");
		lblConvertir.setForeground(new Color(128, 0, 128));
		lblConvertir.setFont(new Font("Arial", Font.BOLD, 13));
		lblConvertir.setBounds(26, 170, 95, 13);
		contentPane2.add(lblConvertir);
		
		txtResultado = new JTextField();
		txtResultado.setForeground(new Color(128, 64, 64));
		txtResultado.setFont(new Font("Arial", Font.PLAIN, 14));
		txtResultado.setColumns(10);
		txtResultado.setBounds(113, 167, 173, 19);
		contentPane2.add(txtResultado);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setForeground(Color.YELLOW);
		btnSalir.setFont(new Font("Arial", Font.BOLD, 13));
		btnSalir.setBackground(Color.RED);
		btnSalir.setBounds(315, 232, 85, 21);
		contentPane2.add(btnSalir);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setForeground(Color.YELLOW);
		btnLimpiar.setFont(new Font("Arial", Font.BOLD, 13));
		btnLimpiar.setBackground(Color.RED);
		btnLimpiar.setBounds(149, 232, 102, 21);
		contentPane2.add(btnLimpiar);
		
		cboT2 = new JComboBox();
		cboT2.addActionListener(this);
		cboT2.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Fahrenheit", "Kelvin", "Rankine"}));
		cboT2.setToolTipText("");
		cboT2.setFont(new Font("Arial", Font.PLAIN, 12));
		cboT2.setBounds(255, 105, 88, 21);
		contentPane2.add(cboT2);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboT2) {
			do_cboT2_actionPerformed(e);
		}
		if (e.getSource() == cboT1) {
			do_cboT1_actionPerformed(e);
		}
		if (e.getSource() == btnMostrar) {
			do_btnMostrar_actionPerformed(e);
		}
		if (e.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(e);
		}
		if (e.getSource() == btnLimpiar) {
			do_btnLimpiar_actionPerformed(e);
		}
	}
	protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
       txtValor.setText("");
       txtResultado.setText("");
	}
	protected void do_btnSalir_actionPerformed(ActionEvent e) {
		int r=JOptionPane.showOptionDialog(this ,
			    "Estas seguro de salir ....?", 
			    " Conversor de monedas",
			    JOptionPane.YES_NO_OPTION,
			    JOptionPane.QUESTION_MESSAGE, null, null,null);
			    if (r==0) System.exit(0);
	}
	protected void do_btnMostrar_actionPerformed(ActionEvent e) {
		 temperatura= Double.parseDouble(txtValor.getText());
	
		int c1= cboT1.getSelectedIndex();
		int c2 = cboT2.getSelectedIndex();
		
		//puente
		Control_Temperatura puente = new Control_Temperatura();
		
		puente.setC1(c1);
		puente.setC2(c2);
		puente.setTemperatura(temperatura);
		
		//ejecutar metodo
		double resultado = puente.convertir();
		
		//Resultado
		txtResultado.setText("" + resultado + " grados ") ;
	}
	protected void do_cboT1_actionPerformed(ActionEvent e) {
		t = cboT1.getSelectedItem().toString();
		
	}
	protected void do_cboT2_actionPerformed(ActionEvent e) {
		t2 = cboT2.getSelectedItem().toString();
	}
	}

