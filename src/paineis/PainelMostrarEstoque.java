package paineis;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import classes.Barco;
import classes.Boia;
import classes.Colete;
import classes.Faca;
import classes.Kit;
import classes.Lanterna;
import classes.Pederneira;
import classes.Produtos;

@SuppressWarnings("serial")
public class PainelMostrarEstoque extends JPanel{
	private JLabel jlImagem2;
	private ImageIcon imagem2;
	private JTextArea jtaMostrar;
	private JScrollPane jsMostrar;
	private JButton jbBoia, jbColete, jbDiversos;
	private JCheckBox jcbBarco, jcbFaca, jcbKit, jcbLanterna, jcbPederneira;
	private List<Produtos> produtos;

	public PainelMostrarEstoque(List<Produtos> produtos) {
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
		jtaMostrar = new JTextArea();
		jsMostrar = new JScrollPane(jtaMostrar);
		
		imagem2 = new ImageIcon(getClass().getResource("/img/background2.jpg"));
		jlImagem2 = new JLabel(imagem2);
		
		jbBoia = new JButton("Boia");
		jbColete = new JButton("Colete");
		jbDiversos = new JButton("Diversos");
		
		jcbBarco = new JCheckBox("Barco");
		jcbBarco.setForeground(Color.white);
		jcbFaca = new JCheckBox("Faca");
		jcbFaca.setForeground(Color.white);
		jcbKit = new JCheckBox("Kit Socorros");
		jcbKit.setForeground(Color.white);
		jcbLanterna = new JCheckBox("Lanterna");
		jcbLanterna.setForeground(Color.white);
		jcbPederneira = new JCheckBox("Pederneira");
		jcbPederneira.setForeground(Color.white);
		/*--------------------------------------ADICIONANDO COMPONENTES--------------------------------------*/
		add(jsMostrar);
		add(jbBoia);
		add(jbColete);
		add(jbDiversos);
		add(jcbBarco);
		add(jcbFaca);
		add(jcbKit);
		add(jcbLanterna);
		add(jcbPederneira);
		
		add(jlImagem2);
		
		/*--------------------------------------DEFININDO AS BOUNDS DOS COMPONENTES--------------------------------------*/
		jbColete.setBounds(37, 44, 158, 31);
		jbColete.setBackground(SystemColor.controlHighlight);
		jbColete.setFont(new Font("Calisto MT", Font.PLAIN, 16));  /*DEFINIMOS A FONTE E O TAMANHO DELA*/
		
		jbBoia.setBounds(37, 96, 158, 31);
		jbBoia.setBackground(SystemColor.controlHighlight);
		jbBoia.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		
		jbDiversos.setBounds(238, 44, 158, 31);
		jbDiversos.setBackground(SystemColor.controlHighlight);
		jbDiversos.setFont(new Font("Calisto MT", Font.PLAIN, 16));
		
		jcbBarco.setSelected(true);
		jcbBarco.setOpaque(false);
		jcbBarco.setBounds(238, 82, 62, 23);
		jcbBarco.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		
		jcbFaca.setOpaque(false);
		jcbFaca.setBounds(320, 82, 62, 23);
		jcbFaca.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		
		jcbKit.setOpaque(false);
		jcbKit.setBounds(270, 134, 100, 23);
		jcbKit.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		
		jcbLanterna.setOpaque(false);
		jcbLanterna.setBounds(320, 108, 76, 23);
		jcbLanterna.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		
		jcbPederneira.setOpaque(false);
		jcbPederneira.setBounds(238, 108, 89, 23);
		jcbPederneira.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		
		jsMostrar.setBounds(10, 158, 410, 140);
		jtaMostrar.setEditable(false); /*FAZ COM QUE NÃO SEJA POSSÍVEL ESCREVER NA TEXT AREA*/
		
		jlImagem2.setBounds(0, 0, 450, 370);
	}

	private void iniciarEventos() {
		
		/*------------------------------------------AÇÃO BOTÃO BOIA------------------------------------------*/
		
		jbBoia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("----------------------------------------CADASTROS---------------------------------------");
				jtaMostrar.setCaretPosition(0); /*FAZ COM QUE O TEXTO SEMPRE COMECE PELO TOPO NA TEXT AREA*/

				for (Produtos produto : produtos) {
					
					/*SE O PRODUTO INSTANCIAR-SE DE UMA BOIA (FOR UMA BOIA), ELE VAI SER MOSTRADO*/
					
					if (produto instanceof Boia) {
						jtaMostrar.append(produto.mostrarDados());
					}
				}
			}
		});
		
		/*------------------------------------------AÇÃO BOTÃO COLETE------------------------------------------*/
		
		jbColete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("----------------------------------------CADASTROS---------------------------------------");
				jtaMostrar.setCaretPosition(0); /*FAZ COM QUE O TEXTO SEMPRE COMECE PELO TOPO NA TEXT AREA*/

				for (Produtos produto : produtos) {
					
					/*SE O PRODUTO INSTANCIAR-SE DE UM COLETE (FOR UM COLETE), ELE VAI SER MOSTRADO*/
					
					if (produto instanceof Colete) {
						jtaMostrar.append(produto.mostrarDados());
					}
				}
			}
		});

		/*------------------------------------------AÇÃO BOTÃO DIVERSOS------------------------------------------*/
		
		jbDiversos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("----------------------------------------CADASTROS---------------------------------------");
				jtaMostrar.setCaretPosition(0); /*FAZ COM QUE O TEXTO SEMPRE COMECE PELO TOPO NA TEXT AREA*/

				for (Produtos produto : produtos) {
					
					if (jcbBarco.isSelected()) { /*SE A CHECK BOX ESTIVER MARCADA VAI CAIR NO IF*/
						
						/*SE O PRODUTO INSTANCIAR-SE DE UM BARCO (FOR UM BARCO), ELE VAI SER MOSTRADO*/
						
						if (produto instanceof Barco) {
							jtaMostrar.append(produto.mostrarDados());
						}
					}
					
					if (jcbFaca.isSelected()) { /*SE A CHECK BOX ESTIVER MARCADA VAI CAIR NO IF*/
						
						/*SE O PRODUTO INSTANCIAR-SE DE UMA FACA (FOR UMA FACA), ELE VAI SER MOSTRADO*/
						
						if (produto instanceof Faca) {
							jtaMostrar.append(produto.mostrarDados());
						}
					}
					
					if (jcbKit.isSelected()) { /*SE A CHECK BOX ESTIVER MARCADA VAI CAIR NO IF*/
						
						/*SE O PRODUTO INSTANCIAR-SE DE UM KIT (FOR UM KIT), ELE VAI SER MOSTRADO*/
						
						if (produto instanceof Kit) {
							jtaMostrar.append(produto.mostrarDados());
						}
					}
					
					if (jcbLanterna.isSelected()) { /*SE A CHECK BOX ESTIVER MARCADA VAI CAIR NO IF*/
						
						/*SE O PRODUTO INSTANCIAR-SE DE UMA LANTERNA (FOR UMA LANTERNA), ELE VAI SER MOSTRADO*/
						
						if (produto instanceof Lanterna) {
							jtaMostrar.append(produto.mostrarDados());
						}
					}
					
					if (jcbPederneira.isSelected()) { /*SE A CHECK BOX ESTIVER MARCADA VAI CAIR NO IF*/
						
						/*SE O PRODUTO INSTANCIAR-SE DE UMA PEDERNEIRA (FOR UMA PEDERNEIRA), ELE VAI SER MOSTRADO*/
						
						if (produto instanceof Pederneira) {
							jtaMostrar.append(produto.mostrarDados());
						}
					}
				}
			}
		});
	}
}
