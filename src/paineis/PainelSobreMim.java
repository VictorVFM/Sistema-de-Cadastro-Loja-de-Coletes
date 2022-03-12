package paineis;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelSobreMim extends JPanel {
	private JLabel jlImagem2,jlfoto,jlnome,jlidade,jlinstuicao,jlnacionalidade,jltexto,jltexto2,jltexto3,jltexto4,jltexto5;
	private ImageIcon imagem2,foto;

	public PainelSobreMim() {
		super();
		setSize(450, 370); /*DEFININDO O TAMANHO*/
		setLayout(null); /*FAZENDO COM QUE O LAYOUT NÃO SEJA DIMENSIONADO AUTOMÁTICAMENTE*/
		setBackground(Color.decode("#00bfff")); /*DEFININDO A COR DE FUNDO*/
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		imagem2 = new ImageIcon(getClass().getResource("/img/background2.jpg"));
		jlImagem2 = new JLabel(imagem2);
		
		foto = new ImageIcon(getClass().getResource("/img/foto.jpg"));
		jlfoto = new JLabel(foto);
		
		jlnome = new JLabel("Nome:Victor Hugo Ferreira");
		jlnome.setForeground(Color.white);
		
		jlidade = new JLabel("Idade:17");
		jlidade.setForeground(Color.white);
		
		jlinstuicao = new JLabel("Instituição:Senai Zerbini");
		jlinstuicao.setForeground(Color.white);
		
		jlnacionalidade = new JLabel("Nacionalidade:Brasileira");
		jlnacionalidade.setForeground(Color.white);
		
		jltexto = new JLabel("Olá Meu nome é Victor Hugo,moro em Campinas ,estou cursando");
		jltexto.setForeground(Color.white);
		
		jltexto2 = new JLabel("Desenvolvimento de Sistemas na instituição SENAI Prof.");
		jltexto2.setForeground(Color.white);
		
		jltexto3 = new JLabel(" Dr. Euryclides de Jesus Zerbini,e desenvolvi esse sistema com a  ");
		jltexto3.setForeground(Color.white);
		
		jltexto4 = new JLabel("ajuda dos meus colegas de grupo, com o intuito de entrega-lo");
		jltexto4.setForeground(Color.white);
		
		jltexto5 = new JLabel("como trabalho final do 1ºTermo");
		jltexto5.setForeground(Color.white);
		
		
		
		add(jlnome);
		add(jlidade);
		add(jlinstuicao);
		add(jlnacionalidade);
		add(jltexto);
		add(jltexto2);
		add(jltexto3);
		add(jltexto4);
		add(jltexto5);
		add(jlfoto);
		add(jlImagem2);
		
		
		jlfoto.setBounds(20, 10, 80	,86);
		
		jlImagem2.setBounds(0, 0, 450, 370);
		
		jlnome.setBounds(110, 5, 200, 20);
		
		jlidade.setBounds(110, 25, 200, 20);
		
		jlinstuicao.setBounds(110, 45, 200, 20);
		
		jlnacionalidade.setBounds(110,70, 200, 20);
		
		jltexto.setBounds(20, 120, 400, 20);
		
		jltexto2.setBounds(20, 135, 400, 20);
		
		jltexto3.setBounds(20, 150, 400, 20);
		
		jltexto4.setBounds(20, 165, 400, 20);
		
		jltexto5.setBounds(20, 180, 400, 20);
		
	}
	
	
		
	
}
