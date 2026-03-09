package br.edu.fatecpg.swing.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

public class CadastroForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField field_nome;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroForm frame = new CadastroForm();
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
	public CadastroForm() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_nome = new JLabel("Nome");
		lbl_nome.setBounds(50, 26, 60, 17);
		contentPane.add(lbl_nome);
		
		JLabel lbl_idade = new JLabel("Idade");
		lbl_idade.setBounds(51, 62, 60, 17);
		contentPane.add(lbl_idade);
		
		JLabel lbl_sexo = new JLabel("Sexo");
		lbl_sexo.setBounds(50, 96, 60, 17);
		contentPane.add(lbl_sexo);
		
		field_nome = new JTextField();
		field_nome.setBounds(102, 24, 114, 21);
		contentPane.add(field_nome);
		field_nome.setColumns(10);
		
		JSpinner field_idade = new JSpinner();
		field_idade.setBounds(102, 62, 114, 22);
		contentPane.add(field_idade);
		
		JRadioButton rdbtn_feminino = new JRadioButton("Feminino");
		buttonGroup.add(rdbtn_feminino);
		rdbtn_feminino.setBounds(192, 92, 86, 25);
		contentPane.add(rdbtn_feminino);
		
		JRadioButton rdbtn_masculino = new JRadioButton("Masculino");
		buttonGroup.add(rdbtn_masculino);
		rdbtn_masculino.setBounds(102, 92, 86, 25);
		contentPane.add(rdbtn_masculino);
		
		JLabel lbl_nome_res = new JLabel("Nome:");
		lbl_nome_res.setBounds(50, 164, 228, 17);
		contentPane.add(lbl_nome_res);
		
		JLabel lbl_sexo_res = new JLabel("Sexo: ");
		lbl_sexo_res.setBounds(50, 206, 228, 17);
		contentPane.add(lbl_sexo_res);
		
		JLabel lbl_idade_res = new JLabel("Idade: ");
		lbl_idade_res.setBounds(50, 185, 228, 17);
		contentPane.add(lbl_idade_res);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = field_nome.getText();
				String idade = field_idade.getValue().toString();
				String sexo = "";
				
				if(rdbtn_masculino.isEnabled()) {
					sexo = "Masculino";
				} else if(rdbtn_feminino.isEnabled()) {
					sexo = "Feminino";
				}
				
				lbl_nome_res.setText("Nome: "+nome);
				lbl_idade_res.setText("Idade: "+idade);
				lbl_sexo_res.setText("Sexo: "+sexo);
			}
		});
		
		
		
		btnEnviar.setBounds(95, 125, 105, 27);
		contentPane.add(btnEnviar);
		
		JButton btn_preferencias = new JButton("Preferências");
		btn_preferencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PreferenciasUsuario config = new PreferenciasUsuario();
				
				config.setVisible(true);
			}
		});
		btn_preferencias.setBounds(303, 21, 114, 27);
		contentPane.add(btn_preferencias);
		

	}
}
