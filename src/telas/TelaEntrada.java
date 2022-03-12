package telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TelaEntrada extends JFrame{
	
	private JLabel jlImagem;
	private JButton jbContinuar;
	private ImageIcon imagem;
	
	public TelaEntrada(String title) {
		super(title);

		setSize(450, 370); /*DEFININDO O TAMANHO*/
		getContentPane().setBackground(SystemColor.textHighlight); /*DEFININDO A COR DE FUNDO*/
		setLocationRelativeTo(null); /*CENTRALIZA A TELA*/
		setResizable(false); /*NÃO PERMITE QUE O ******* (PALAVRA PROIBIDA) POSSA MEXER NO TAMANHO*/

		iniciarComponentes();
		iniciarEventos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void iniciarComponentes() {
		
		/*--------------------------------------CRIANDO OBJETOS--------------------------------------*/
		jbContinuar = new JButton("Pressione para Continuar");
		
		imagem = new ImageIcon(getClass().getResource("/img/bemvindo-welcome.png"));
		jlImagem = new JLabel(imagem);
		
		/*--------------------------------------ADICIONANDO COMPONENTES--------------------------------------*/
		add(jbContinuar);
		add(jlImagem);
		
		/*--------------------------------------DEFININDO AS BOUNDS DOS COMPONENTES--------------------------------------*/
		jlImagem.setBounds(72, 11, 292, 247);
		
		jbContinuar.setBounds(98, 269, 229, 34);
		jbContinuar.setFont(new Font("Calisto MT", Font.BOLD, 16)); /*DEFINIMOS A FONTE E O TAMANHO DELA*/
		jbContinuar.setBackground(Color.LIGHT_GRAY);
	}

	private void iniciarEventos() {
		
		/*------------------------------------------AÇÃO BOTÃO CONTINUAR------------------------------------------*/
		
		jbContinuar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaLogin login = new TelaLogin("");
				
				dispose(); /**/
				login.setVisible(true);
			}
		});
	}
}
