package paineis;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelSobreAPP extends JPanel {
	private JLabel jlImagem2,jlicone,jlnome,jlidade,jlinstuicao,jlnacionalidade,jltexto,jltexto2,jltexto3,jltexto4,jltexto5;;
	private ImageIcon imagem2,icone;

	public PainelSobreAPP() {
		super();
		setSize(450, 370); /*DEFININDO O TAMANHO*/
		setLayout(null); /*FAZENDO COM QUE O LAYOUT NÃO SEJA DIMENSIONADO AUTOMÁTICAMENTE*/
		setBackground(Color.decode("#00bfff")); /*DEFININDO A COR DE FUNDO*/
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		imagem2 = new ImageIcon(getClass().getResource("/img/background2.jpg"));
		jlImagem2 = new JLabel(imagem2);
		
		icone = new ImageIcon(getClass().getResource("/img/icone-colete.png"));
		jlicone = new JLabel(icone);
		
		jltexto = new JLabel("Olá Meu nome é Victor Hugo,eu e meu grupo de amigos ");
		jltexto.setForeground(Color.white);
		
		jltexto2 = new JLabel("desenvovelvemos este software com o intuito");
		jltexto2.setForeground(Color.white);
		
		jltexto3 = new JLabel("de fazer um sistema funcional que consiga ");
		jltexto3.setForeground(Color.white);
		
		jltexto4 = new JLabel("cadastrar usuários,produtos,altera-los");
		jltexto4.setForeground(Color.white);
		
		jltexto5 = new JLabel("e exibir todos os dados cadastrados no sistema");
		jltexto5.setForeground(Color.white);
		
		
		add(jltexto);
		add(jltexto2);
		add(jltexto3);
		add(jltexto4);
		add(jltexto5);
		add(jlicone);
		add(jlImagem2);
		
		
		jlImagem2.setBounds(0, 0, 450, 370);
		jlicone.setBounds(175,20 , 80, 67);
		
		jltexto.setBounds(70, 120, 400, 20);
		jltexto2.setBounds(70, 140, 400, 20);
		jltexto3.setBounds(70, 160, 400, 20);
		jltexto4.setBounds(70, 180, 400, 20);
		jltexto5.setBounds(70, 200, 400, 20);
		
	}
	
	
		
	
}
