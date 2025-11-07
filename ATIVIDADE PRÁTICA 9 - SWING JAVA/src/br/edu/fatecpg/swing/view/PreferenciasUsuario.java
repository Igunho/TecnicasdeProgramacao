package br.edu.fatecpg.swing.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.color.*;
import br.edu.fatecpg.swing.model.Preferencias;
import java.awt.SystemColor;

public class PreferenciasUsuario extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	Preferencias cores = new Preferencias(new Color(220,220,220), new Color(22,22,22));
	
	/**
	 * Create the frame.
	 */
	public PreferenciasUsuario() {
		setTitle("Preferências");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.textText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_tema = new JLabel("Tema: ");
		lbl_tema.setBounds(94, 60, 103, 17);
		contentPane.add(lbl_tema);
		
		JLabel lbl_notificacoes = new JLabel("Notificações: ");
		lbl_notificacoes.setBounds(94, 91, 103, 17);
		contentPane.add(lbl_notificacoes);
		
		JLabel lbl_volume = new JLabel("Volume:  ");
		lbl_volume.setBounds(94, 122, 103, 17);
		contentPane.add(lbl_volume);
		
		JComboBox box_tema = new JComboBox();
		box_tema.setModel(new DefaultComboBoxModel(new String[] {"Claro", "Escuro"}));
		box_tema.setBounds(192, 55, 103, 26);
		contentPane.add(box_tema);
		
		JCheckBox chckbx_notificacao = new JCheckBox("Notificações");
		chckbx_notificacao.setBounds(192, 85, 114, 25);
		contentPane.add(chckbx_notificacao);
		
		JSlider slider_volume = new JSlider();
		slider_volume.setBounds(192, 119, 200, 16);
		contentPane.add(slider_volume);
		
		JButton btn_confirmar = new JButton("Salvar");
		contentPane.setBackground(SystemColor.window);	
		btn_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(box_tema.getSelectedItem().toString().equals("Escuro")) {
					cores.setColorBg(new Color(33,33,33));
					cores.setColorFg(new Color(220,220,220));
					
					contentPane.setBackground(cores.getColorBg());
					lbl_tema.setForeground(cores.getColorFg());
					lbl_notificacoes.setForeground(cores.getColorFg());
					lbl_volume.setForeground(cores.getColorFg());
					
					box_tema.setForeground(cores.getColorFg());
					chckbx_notificacao.setForeground(cores.getColorFg());
					slider_volume.setForeground(cores.getColorFg());
					btn_confirmar.setForeground(cores.getColorFg());
					
					box_tema.setBackground(cores.getColorBg());
					chckbx_notificacao.setBackground(cores.getColorBg());
					slider_volume.setBackground(cores.getColorBg());
					btn_confirmar.setBackground(cores.getColorBg());
					
				} else if(box_tema.getSelectedItem().toString().equals("Claro")) {
					cores.setColorBg(new Color(220,220,220));
					cores.setColorFg(new Color(33,33,33));
					
					contentPane.setBackground(cores.getColorBg());
					lbl_tema.setForeground(cores.getColorFg());
					lbl_notificacoes.setForeground(cores.getColorFg());
					lbl_volume.setForeground(cores.getColorFg());
					
					box_tema.setForeground(cores.getColorFg());
					chckbx_notificacao.setForeground(cores.getColorFg());
					slider_volume.setForeground(cores.getColorFg());
					btn_confirmar.setForeground(cores.getColorFg());
					
					box_tema.setBackground(cores.getColorBg());
					chckbx_notificacao.setBackground(cores.getColorBg());
					slider_volume.setBackground(cores.getColorBg());
					btn_confirmar.setBackground(cores.getColorBg());
				}
			}
		});
		
		btn_confirmar.setBounds(147, 147, 105, 27);
		contentPane.add(btn_confirmar);

	}
}
