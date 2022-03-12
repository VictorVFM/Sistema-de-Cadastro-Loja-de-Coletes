package telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import arquivos.LerEscreverArquivos;
import classes.Usuarios;

@SuppressWarnings("serial")
public class TelaCadastrarLogin extends JFrame {
	
	private ImageIcon imagem;
	private JLabel jlImagem, jlNome, jlUsuario, jlSenha, jlSobrenome,jlconta;
	private JTextField jtfNome, jtfUsuario, jtfSenha, jtfSobrenome;
	private JPanel jpFundo;
	private JButton jbCadastrar, jbEntrar;
	
	LerEscreverArquivos usuario = new LerEscreverArquivos("Usuários.bin");

	
	public TelaCadastrarLogin(String title) {
		super(title);

		setSize(450, 370); /*DEFININDO O TAMANHO*/
		getContentPane().setBackground(SystemColor.textHighlight); /*DEFININDO A COR DE FUNDO*/
		setLocationRelativeTo(null); /*CENTRALIZA A TELA*/
		setResizable(false); /*NÃO PERMITE QUE O ******* (PALAVRA PROIBIDA) POSSA MEXER NO TAMANHO*/
		setLayout(null); /*FAZENDO COM QUE O LAYOUT NÃO SEJA DIMENSIONADO AUTOMÁTICAMENTE*/

		iniciarComponentes();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void iniciarComponentes() {
		
		/*--------------------------------------CRIANDO OBJETOS--------------------------------------*/
		jpFundo = new JPanel();
		jpFundo.setOpaque(false);
		
		jlNome = new JLabel("Nome");
		jlNome.setForeground(Color.WHITE);
		jlSenha = new JLabel("Senha");
		jlSenha.setForeground(Color.WHITE);
		jlSobrenome = new JLabel("Sobrenome");
		jlSobrenome.setForeground(Color.WHITE);
		jlUsuario = new JLabel("Usuário");
		jlUsuario.setForeground(Color.WHITE);
		
		jtfNome = new JTextField();
		jtfSenha = new JTextField();
		jtfSobrenome = new JTextField();
		jtfUsuario = new JTextField();
		
		jbCadastrar = new JButton("Cadastrar");
		jbEntrar = new JButton("Entrar");
				
		imagem = new ImageIcon(getClass().getResource("/img/background.jpg"));
		jlImagem = new JLabel(imagem);
				
		/*--------------------------------------ADICIONANDO COMPONENTES--------------------------------------*/
		
		add(jlNome);
		
		add(jlSenha);
		add(jlSobrenome);
		add(jlUsuario);
		add(jtfNome);
		add(jtfSenha);
		add(jtfSobrenome);
		add(jtfUsuario);
		add(jbCadastrar);
		add(jbEntrar);
		add(jlImagem);
		add(jpFundo);
		
				
		/*--------------------------------------DEFININDO AS BOUNDS DOS COMPONENTES--------------------------------------*/
		jlImagem.setBounds(0, 0, 450, 370);
			
		jpFundo.setBackground(SystemColor.activeCaption);
		jpFundo.setBorder(new LineBorder(new Color(0, 0, 0)));
		jpFundo.setBounds(47, 96, 343, 212); 
		
		jlNome.setFont(new Font("Calisto MT", Font.PLAIN, 16)); /*DEFINIMOS A FONTE E O TAMANHO DELA*/
		jlNome.setBounds(116, 108, 68, 19);
		
		jtfNome.setBounds(116, 134, 86, 20);
		
		jlSobrenome.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		jlSobrenome.setBounds(222, 108, 96, 19);
		
		
		
		jtfSobrenome.setBounds(222, 134, 96, 20);
		
		jlUsuario.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		jlUsuario.setBounds(116, 163, 68, 19);
		
		jtfUsuario.setBounds(116, 181, 86, 20);
		
		jlSenha.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		jlSenha.setBounds(221, 163, 68, 19);
		
		jtfSenha.setBounds(222, 181, 96, 20);
		
		jbCadastrar.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		jbCadastrar.setBackground(Color.LIGHT_GRAY);
		jbCadastrar.setBounds(116, 212, 202, 41);
		
		jbEntrar.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		jbEntrar.setBackground(Color.LIGHT_GRAY);
		jbEntrar.setBounds(116, 257, 202, 41);
	}

	public void iniciarEventos(List<Usuarios> usuarios) {
		
		/*-------------------------AÇÃO BOTÃO ENTRAR--------------------------------*/
		
		jbEntrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*SE OS JTFs ESTIVEREM VAZIOS, SIGNIFICA QUE O USUÁRIO PODE SAIR DA TELA SEM PROBLEMA, MAS CASO TENHA CONTEÚDO IRÁ APARECER
				  UMA MENSAGEM PERGUNTADO SE ELE DESEJA SAIR*/
				if (jtfNome.getText().isEmpty() && jtfSobrenome.getText().isEmpty() && jtfUsuario.getText().isEmpty() && jtfSenha.getText().isEmpty()) {
					
					setVisible(false);
					
				} else {
					int confirmar = JOptionPane.showConfirmDialog(null, "Tem Certeza que Deseja Voltar?", "Voltar", JOptionPane.YES_NO_OPTION);
					if (confirmar == JOptionPane.YES_OPTION) {
						
						setVisible(false);
						
					}
				}
			}
		});
		
		/*-------------------------AÇÃO BOTÃO CADASTRAR--------------------------------*/
		
		jbCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*SE OS JTFs ESTIVEREM DIFERENTES DE VAZIO, ELE ENTRARÁ NO IF, CASO O CONTRÁRIO ELE VAI CAIR NO ELSE*/
				if (!jtfNome.getText().isEmpty() && !jtfSobrenome.getText().isEmpty() && !jtfUsuario.getText().isEmpty() && !jtfSenha.getText().isEmpty()) {
					
					usuarios.add(new Usuarios(jtfNome.getText(), jtfSobrenome.getText(), jtfUsuario.getText(), jtfSenha.getText()));
					
					usuario.escreverArquivos(usuarios);
					
					
					
					setVisible(false);
					
				} else {
					JOptionPane.showMessageDialog(null, "Favor Preencher os Campos Vazios");
				}
			}
		});
	}
}
