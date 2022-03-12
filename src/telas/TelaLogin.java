package telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import arquivos.LerEscreverArquivos;
import classes.Usuarios;

@SuppressWarnings("serial")
public class TelaLogin extends JFrame {

	private JLabel jlImagem2,jlImagem3,jlImagem4,jlconta;
	
	private ImageIcon imagem2,imagem3,imagem4;
	private JPanel jpFundo, jpUsuario, jpSenha;
	private JButton jbEntrar, jbCadastrar;
	private JTextField jtfUsuario;
	private JPasswordField jpfSenha;
	private List<Usuarios> usuarios = new ArrayList<Usuarios>();
	
	LerEscreverArquivos usuario = new LerEscreverArquivos("Usuários.bin");

	public TelaLogin(String title) {
		super(title);

		setSize(450, 370); /*DEFININDO O TAMANHO*/
		getContentPane().setBackground(SystemColor.textHighlight); /*DEFININDO A COR DE FUNDO*/
		setLocationRelativeTo(null); /*CENTRALIZA A TELA*/
	
		setResizable(false); /*NÃO PERMITE QUE O ******* (PALAVRA PROIBIDA) POSSA MEXER NO TAMANHO*/
		setLayout(null); /*FAZENDO COM QUE O LAYOUT NÃO SEJA DIMENSIONADO AUTOMÁTICAMENTE*/

		abrirArquivo();
		iniciarComponentes();
		iniciarEventos();
	}
	
	private void abrirArquivo() {
		if (usuario.lerArquivos() != null) {
			usuarios = usuario.lerArquivos();
		}
	}

	private void iniciarComponentes() {
		
		/*--------------------------------------CRIANDO OBJETOS--------------------------------------*/
		
		imagem2 = new ImageIcon(getClass().getResource("/img/background.jpg"));
		jlImagem2 = new JLabel(imagem2);

		imagem3 = new ImageIcon(getClass().getResource("/img/cadeado.png"));
		jlImagem3 = new JLabel(imagem3);
		
		imagem4 = new ImageIcon(getClass().getResource("/img/perfil.png"));
		jlImagem4 = new JLabel(imagem4);
		
		jlconta = new JLabel("Ainda não tem uma conta?");
		jlconta.setForeground(Color.white);
		
		jpFundo = new JPanel();
		jpFundo.setOpaque(false);
		jpFundo.setLayout(null);
		
		
		jpUsuario = new JPanel();
		jpUsuario.setLayout(null);
		
		
		jpSenha = new JPanel();
		jpSenha.setLayout(null);
		
		jbEntrar = new JButton("Entrar");
		jbEntrar.setBackground(Color.decode("#0077b6"));
		jbEntrar.setForeground(Color.white);
		
		jbCadastrar = new JButton("Cadastrar");
		jbCadastrar.setBackground(Color.white);
		
		
		
		
		jtfUsuario = new JTextField();
		jtfUsuario.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
		
		
		jpfSenha = new JPasswordField();
		
		/*--------------------------------------ADICIONANDO COMPONENTES--------------------------------------*/
		
		add(jbCadastrar);
		add(jlconta);
		add(jpFundo);
		jpFundo.add(jlImagem3);
		jpFundo.add(jlImagem4);
		
		jpFundo.add(jpUsuario);
		jpFundo.add(jpSenha);
		
		jpFundo.add(jbEntrar);
		jpUsuario.add(jtfUsuario);
		jpSenha.add(jpfSenha);
		add(jlImagem2);
		/*--------------------------------------DEFININDO AS BOUNDS DOS COMPONENTES--------------------------------------*/

		
		jpFundo.setBackground(SystemColor.activeCaption);
		jpFundo.setBounds(52, 96, 300, 212);
		
		
		jpSenha.setBackground(Color.WHITE);
		jpSenha.setBounds(67, 63, 202, 41);
		
		jlconta.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		jlconta.setBounds(110, 310, 250, 20);
		
		jpUsuario.setBackground(Color.WHITE);
		jpUsuario.setBounds(67, 11, 202, 41);
		
		jbEntrar.setFont(new Font("Calisto MT", Font.PLAIN, 16)); /*DEFINIMOS A FONTE E O TAMANHO DELA*/
		
		jbEntrar.setBounds(120, 115, 100, 30);
		
		jbCadastrar.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		
		jbCadastrar.setBounds(300, 310, 120, 20);
		
		jtfUsuario.setBackground(Color.WHITE);
		jtfUsuario.setBounds(10, 0, 192, 41);
		jtfUsuario.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		jtfUsuario.setBorder(null);
		jtfUsuario.setText("Usuário");
		
		jpfSenha.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		jpfSenha.setEchoChar((char) 0);
		jpfSenha.setText("Senha");
		jpfSenha.setBorder(null);
		jpfSenha.setBounds(10, 0, 192, 41);
		
		jlImagem2.setBounds(0, 0, 450, 370);
		
		jlImagem3.setBounds(25, 65, 41, 41);
		
		jlImagem4.setBounds(25, 10, 41, 41);
	}

	private void iniciarEventos() {
		
		/*------------------------------------------AÇÃO BOTÃO CADASTRAR------------------------------------------*/
		
		jbCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastrarLogin cadastrar = new TelaCadastrarLogin("Ativa Nautilus");

				cadastrar.iniciarEventos(usuarios);
				cadastrar.setVisible(true);
			}
		});
		
		/*------------------------------------------AÇÃO BOTÃO ENTRAR------------------------------------------*/
		
		jbEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				boolean achou = false;
				for (Usuarios usuario : usuarios) {
					
					/*SE O USUÁRIO E A SENHA QUE ESTIVEREM ESCRITOS FOREM IGUAIS AOS USUÁRIOS E SENHAS CADASTRADOS, CAIRÁ*/
					if (jtfUsuario.getText().equals(usuario.getNomeUsuario())
							&& jpfSenha.getText().equals(usuario.getSenha())) {
						
						TelaAtivaNautilus entrou = new TelaAtivaNautilus("Ativa Nautilus");
						
						achou = true;

						entrou.iniciarEventos(usuarios);
						entrou.setVisible(true);
						setVisible(false);
						
						break;
					}
				}

				if (!achou) {
					JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorretos", "Entrar", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		/*------------------------------------------AÇÃO JPF SENHA------------------------------------------*/
		
		jpfSenha.addFocusListener(new FocusAdapter() {

			@SuppressWarnings("deprecation")
			@Override
			/*TODA VEZ QUE O JPF GANHAR FOCO, OU SEJA, CLICAREM NELE, ELE IRÁ EXECUTAR A AÇÃO*/
			public void focusGained(FocusEvent e) {
				/*SE TIVER O TEXTO PREDEFINIDO NO JTF, QUANDO CLICAREM NELE ELE VAI FICAR VAZIO, E VAI DEFINIR O CARACTERE COMO 
				  A BOLINHA QUE TEMOS QUANDO VAMOS BOTAR A SENHA*/
				if (jpfSenha.getText().equals("Senha")) {
					jpfSenha.setEchoChar('•');
					jpfSenha.setText("");
				} 
			}

			@SuppressWarnings("deprecation")
			@Override
			/*TODA VEZ QUE O JPF PERDER FOCO, OU SEJA, CLICAREM EM OUTRA COISA QUE NÃO SEJA ELE, IRÁ EXECUTAR A AÇÃO*/
			public void focusLost(FocusEvent e) {
				/*SE TIVER O TEXTO VAZIO NO JPF, QUANDO CLICAREM EM OUTRO LUGAR, ELE VAI FICAR COM O TEXTO PREDEFINIDO, E
				  VAI DEFINIR O "ECHO CHAR" COMO ZERO, OU SEJA, VAI DEIXAR O TEXTO VISÍVEL NORMALMENTE*/
				if (jpfSenha.getText().equals("")) {
					jpfSenha.setText("Senha");
					jpfSenha.setEchoChar((char) 0);
				}
			}
		});
		
		/*------------------------------------------AÇÃO JTF USUARIO------------------------------------------*/

		jtfUsuario.addFocusListener(new FocusAdapter() {
			@Override
			/*TODA VEZ QUE O JTF GANHAR FOCO, OU SEJA, CLICAREM NELE, ELE IRÁ EXECUTAR A AÇÃO*/
			public void focusGained(FocusEvent e) {
				/*SE TIVER O TEXTO PREDEFINIDO NO JTF, QUANDO CLICAREM NELE ELE VAI FICAR VAZIO*/
				if (jtfUsuario.getText().equals("Usuário")) {
					jtfUsuario.setText("");
				}
			}

			@Override
			/*TODA VEZ QUE O JTF PERDER FOCO, OU SEJA, CLICAREM EM OUTRA COISA QUE NÃO SEJA ELE, IRÁ EXECUTAR A AÇÃO*/
			public void focusLost(FocusEvent e) {
				/*SE TIVER O TEXTO VAZIO NO JTF, QUANDO CLICAREM EM OUTRO LUGAR, ELE VAI FICAR COM O TEXTO PREDEFINIDO*/
				if (jtfUsuario.getText().equals("")) {
					jtfUsuario.setText("Usuário");
				}
			}
		});
	}
}
