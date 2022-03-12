package paineis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import classes.Usuarios;

@SuppressWarnings("serial")
public class PainelMostrarUsuarios extends JPanel {
	
	private List<Usuarios> usuarios;
	private JLabel jlImagem2;
	private ImageIcon imagem2;
	private JButton jbNome, jbUsuario;
	private JTextArea jtaNome, jtaUsuario;
	private JScrollPane jsNome, jsUsuario;
	
	public PainelMostrarUsuarios(List<Usuarios> usuarios) {
		super();

		setSize(450, 370); /*DEFININDO O TAMANHO*/
		setLayout(null); /*FAZENDO COM QUE O LAYOUT NÃO SEJA DIMENSIONADO AUTOMÁTICAMENTE*/
		setBackground(Color.decode("#00bfff")); /*DEFININDO A COR DE FUNDO*/
		
		this.usuarios = usuarios;

		iniciarComponentes();
		iniciarEventos();
	}

	private void iniciarComponentes() {
		
		/*--------------------------------------CRIANDO OBJETOS--------------------------------------*/
		jbNome = new JButton("Nome + Sobrenome");
		jbUsuario = new JButton("Usuário + Senha");
		
		imagem2 = new ImageIcon(getClass().getResource("/img/background2.jpg"));
		jlImagem2 = new JLabel(imagem2);
		
		jtaNome = new JTextArea();
		jsNome = new JScrollPane(jtaNome);
		
		jtaUsuario = new JTextArea();
		jsUsuario = new JScrollPane(jtaUsuario);
		
		/*--------------------------------------ADICIONANDO COMPONENTES--------------------------------------*/
		add(jbNome);
		add(jbUsuario);
		add(jsNome);
		add(jsUsuario);
		
		add(jlImagem2);
		
		/*--------------------------------------DEFININDO AS BOUNDS DOS COMPONENTES--------------------------------------*/
		jbNome.setBackground(Color.LIGHT_GRAY);
		jbNome.setFont(new Font("Calisto", Font.PLAIN, 16)); /*DEFINIMOS A FONTE E O TAMANHO DELA*/
		jbNome.setBounds(23, 34, 175, 38);
		
		jbUsuario.setFont(new Font("Calisto", Font.PLAIN, 16));
		jbUsuario.setBackground(Color.LIGHT_GRAY);
		jbUsuario.setBounds(260, 34, 150, 38);
		
		jsNome.setBounds(10, 91, 193, 210);
		jtaNome.setEditable(false); /*FAZ COM QUE NÃO SEJA POSSÍVEL ESCREVER NA TEXT AREA*/
		jsUsuario.setBounds(231, 91, 193, 210);
		jtaUsuario.setEditable(false); /*FAZ COM QUE NÃO SEJA POSSÍVEL ESCREVER NA TEXT AREA*/
		
		jlImagem2.setBounds(0, 0, 450, 370);
	}

	private void iniciarEventos() {
		jbNome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaNome.setText("----------NOME COMPLETO-----------");
				jtaNome.setCaretPosition(0); /*FAZ COM QUE O TEXTO SEMPRE COMECE PELO TOPO NA TEXT AREA*/

				for (Usuarios usuario : usuarios) {
					if (usuario instanceof Usuarios) {
						jtaNome.append(usuario.mostrarNomes()); /*MOSTRA O NOME + SOBRENOME DE TODOS OS USUÁRIOS CADASTRADOS*/
					}
				}
			}
		});
		
		jbUsuario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaUsuario.setText("----------USUÁRIO e SENHA----------");
				jtaUsuario.setCaretPosition(0); /*FAZ COM QUE O TEXTO SEMPRE COMECE PELO TOPO NA TEXT AREA*/

				for (Usuarios usuario : usuarios) {
					if (usuario instanceof Usuarios) {
						jtaUsuario.append(usuario.mostrarUsuario()); /*MOSTRA O USUÁRIO + SENHA DE TODOS OS USUÁRIOS CADASTRADOS*/
					}
				}
			}
		});
	}
}
