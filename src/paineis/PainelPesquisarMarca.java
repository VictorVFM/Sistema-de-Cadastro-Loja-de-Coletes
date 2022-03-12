package paineis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classes.Produtos;

@SuppressWarnings("serial")
public class PainelPesquisarMarca extends JPanel{
	private JLabel jlImagem2;
	private JButton jbPesquisar;
	private JTextArea jtaMostrar;
	private JScrollPane jsMostrar;
	private JTextField jtfPesquisar;
	private ImageIcon imagemLupa,imagem2;
	private List<Produtos> produtos;

	public PainelPesquisarMarca(List<Produtos> produtos) {
		super();

		setSize(450, 370); /*DEFININDO O TAMANHO*/
		setLayout(null); /*FAZENDO COM QUE O LAYOUT NÃO SEJA DIMENSIONADO AUTOMÁTICAMENTE*/
		setBackground(Color.decode("#00bfff")); /*DEFININDO A COR DE FUNDO*/
		
		this.produtos = produtos;

		iniciarComponentes();
		iniciarEventos();
	}

	private void iniciarComponentes() {
		
		/*--------------------------------------CRIANDO OBJETOS--------------------------------------*/
		imagemLupa = new ImageIcon(getClass().getResource("/img/lupa.png"));
		jbPesquisar = new JButton(imagemLupa);
		
		imagem2 = new ImageIcon(getClass().getResource("/img/background2.jpg"));
		jlImagem2 = new JLabel(imagem2);
		
		jtfPesquisar = new JTextField();
		
		jtaMostrar = new JTextArea();
		jsMostrar = new JScrollPane(jtaMostrar);
		
		/*--------------------------------------ADICIONANDO COMPONENTES--------------------------------------*/
		add(jbPesquisar);
		add(jtfPesquisar);
		add(jsMostrar);
		
		add(jlImagem2);
		
		/*--------------------------------------DEFININDO AS BOUNDS DOS COMPONENTES--------------------------------------*/
		jbPesquisar.setBackground(Color.LIGHT_GRAY);
		jbPesquisar.setBounds(318, 57, 48, 48);
		
		jtfPesquisar.setBounds(84, 57, 234, 48);
		jtfPesquisar.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		jtfPesquisar.setText("Insira a Marca do Produto");
		
		jsMostrar.setBounds(10, 158, 410, 140);
		jsMostrar.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtaMostrar.setEditable(false); /*FAZ COM QUE NÃO SEJA POSSÍVEL ESCREVER NA TEXT AREA*/
		
		jlImagem2.setBounds(0, 0, 450, 370);
	}

	private void iniciarEventos() {
		
		/*------------------------------------------AÇÃO BOTÃO PESQUISAR------------------------------------------*/
		
		jbPesquisar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean achou = false;
				
				for (Produtos produto : produtos) {
					/*SE A MARCA CADASTRADO NA MATRIZ FOI IGUAL AO ESCRITO, VAI CAIR NO IF*/
					if (produto.getMarca().equals(jtfPesquisar.getText())) {
						jtaMostrar.append((produtos.indexOf(produto)+1) + "-" + produto.mostrarDados());
						jtaMostrar.setCaretPosition(0); /*FAZ COM QUE O TEXTO SEMPRE COMECE PELO TOPO NA TEXT AREA*/
						achou = true;
					}
				}
				
				if (!achou) {
					JOptionPane.showMessageDialog(null, "Marca não Encontrada", "Pesquisar", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		/*------------------------------------------AÇÃO JTF PESQUISAR------------------------------------------*/
		
		jtfPesquisar.addFocusListener(new FocusListener() {
			
			@Override
			/*TODA VEZ QUE O JTF GANHAR FOCO, OU SEJA, CLICAREM NELE, ELE IRÁ EXECUTAR A AÇÃO*/
			public void focusGained(FocusEvent e) {
				/*SE TIVER O TEXTO PREDEFINIDO NO JTF, QUANDO CLICAREM NELE ELE VAI FICAR VAZIO*/
				if (jtfPesquisar.getText().equals("Insira a Marca do Produto")) {
					jtfPesquisar.setText("");
				} 
			}

			@Override
			/*TODA VEZ QUE O JTF PERDER FOCO, OU SEJA, CLICAREM EM OUTRA COISA QUE NÃO SEJA ELE, IRÁ EXECUTAR A AÇÃO*/
			public void focusLost(FocusEvent e) {
				/*SE TIVER O TEXTO VAZIO NO JTF, QUANDO CLICAREM EM OUTRO LUGAR, ELE VAI FICAR COM O TEXTO PREDEFINIDO*/
				if (jtfPesquisar.getText().equals("")) {
					jtfPesquisar.setText("Insira a Marca do Produto");
				}
			}
		});
	}
}
