package paineis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import classes.Boia;
import classes.Produtos;

@SuppressWarnings("serial")
public class PainelCadastrarBoia extends JPanel{
	
	private List<Produtos> produtos;
	private JLabel jlBoia, jlPreco, jlGarantia, jlFabricante, jlLocalOrigem, jlQuantidade, jlCodigo, jlMarca, jlCor, jlAnoModelo, 
					jlAnoFabricacao, jlCertificacao, jlTamanho, jlPeso,jlImagem2;
	private ImageIcon imagem2;
	private JTextField jtfPreco, jtfGarantia, jtfFabricante, jtfLocalOrigem, jtfQuantidade, jtfCodigo, jtfMarca, jtfCor, jtfAnoModelo,
						jtfAnoFabricacao, jtfPeso, jtfCertificacao;
	private JButton jbCadastrar, jbAlterar, jbDeletar;
	private JRadioButton jrbP, jrbM, jrbG, jrbGG;
	private ButtonGroup bgTamanho;
	private int indice;
	private Boia boia;
	
	public PainelCadastrarBoia(List<Produtos> produtos) {
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
		jlBoia = new JLabel("BOIA");
		jlBoia.setForeground(Color.white);
		
		jlPreco = new JLabel("Preço");
		jlPreco.setForeground(Color.white);
		
		jlQuantidade = new JLabel("Quantidade");
		jlQuantidade.setForeground(Color.white);
		jlGarantia = new JLabel("Garantia");
		jlGarantia.setForeground(Color.white);
		jlCodigo = new JLabel("Código Produto");
		jlCodigo.setForeground(Color.white);
		jlFabricante = new JLabel("Fabricante");
		jlFabricante.setForeground(Color.white);
		jlMarca = new JLabel("Marca");
		jlMarca.setForeground(Color.white);
		jlLocalOrigem = new JLabel("Local de Origem");
		jlLocalOrigem.setForeground(Color.white);
		jlCor = new JLabel("Cor");
		jlCor.setForeground(Color.white);
		jlAnoModelo = new JLabel("Ano Modelo");
		jlAnoModelo.setForeground(Color.white);
		jlAnoFabricacao = new JLabel("Ano Fabricação");
		jlAnoFabricacao.setForeground(Color.white);
		jlCertificacao = new JLabel("Certificação");
		jlCertificacao.setForeground(Color.white);
		jlTamanho = new JLabel("Tamanho");
		jlTamanho.setForeground(Color.white);
		jlPeso = new JLabel("Peso");
		jlPeso.setForeground(Color.white);
		imagem2 = new ImageIcon(getClass().getResource("/img/background2.jpg"));
		jlImagem2 = new JLabel(imagem2);
		
		jtfPreco = new JTextField();
		jtfQuantidade = new JTextField();
		jtfGarantia = new JTextField();
		jtfCodigo = new JTextField();
		jtfFabricante = new JTextField();
		jtfMarca = new JTextField();
		jtfLocalOrigem = new JTextField();
		jtfCor = new JTextField();
		jtfAnoModelo = new JTextField();
		jtfAnoFabricacao = new JTextField();
		jtfPeso = new JTextField();
		jtfCertificacao = new JTextField();
		
		jrbP = new JRadioButton("P");
		jrbP.setForeground(Color.white);
		jrbM = new JRadioButton("M");
		jrbM.setForeground(Color.white);
		jrbG = new JRadioButton("G");
		jrbG.setForeground(Color.white);
		jrbGG = new JRadioButton("GG");
		jrbGG.setForeground(Color.white);
		
		jbCadastrar = new JButton("Cadastrar");
		jbAlterar = new JButton("Salvar");
		jbDeletar = new JButton("Deletar");
		jbDeletar.setVisible(false);
		
		bgTamanho = new ButtonGroup();
		
		/*--------------------------------------ADICIONANDO COMPONENTES--------------------------------------*/
		add(jbCadastrar);
		add(jbAlterar);
		add(jbDeletar);
		
		bgTamanho.add(jrbP);
		bgTamanho.add(jrbM);
		bgTamanho.add(jrbG);
		bgTamanho.add(jrbGG);
		add(jrbP);
		add(jrbM);
		add(jrbG);
		add(jrbGG);
		
		add(jlAnoFabricacao);
		add(jlAnoModelo);
		add(jlBoia);
		add(jlCodigo);
		add(jlCor);
		add(jlFabricante);
		add(jlGarantia);
		add(jlTamanho);
		add(jlLocalOrigem);
		add(jlMarca);
		add(jlPreco);
		add(jlPeso);
		add(jlQuantidade);
		add(jlCertificacao);
		
		add(jtfAnoFabricacao);
		add(jtfAnoModelo);
		add(jtfCodigo);
		add(jtfCor);
		add(jtfFabricante);
		add(jtfGarantia);
		add(jtfLocalOrigem);
		add(jtfMarca);
		add(jtfPreco);
		add(jtfPeso);
		add(jtfQuantidade);
		add(jtfCertificacao);
		
		add(jlImagem2);
		
		/*--------------------------------------DEFININDO AS BOUNDS DOS COMPONENTES--------------------------------------*/
		jlBoia.setHorizontalAlignment(SwingConstants.CENTER); /*ALINHA HORIZONTALMENTE O CONTEÚDO NO CENTRO*/
		jlBoia.setFont(new Font("Calisto MT", Font.PLAIN, 16)); /*DEFINIMOS A FONTE E O TAMANHO DELA*/
		jlBoia.setBounds(0, 23, 450, 28);
		
		jlPreco.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlPreco.setBounds(40, 63, 70, 23);
		jtfPreco.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfPreco.setBounds(38, 87, 70, 20);
		
		jlQuantidade.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlQuantidade.setBounds(40, 119, 75, 23);
		jtfQuantidade.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfQuantidade.setBounds(40, 143, 70, 20);
		
		jlGarantia.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlGarantia.setBounds(122, 63, 70, 23);
		jtfGarantia.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfGarantia.setBounds(120, 87, 70, 20);
		
		jlCodigo.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlCodigo.setBounds(122, 119, 100, 23);
		jtfCodigo.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfCodigo.setBounds(120, 143, 99, 20);
		
		jlFabricante.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlFabricante.setBounds(204, 63, 70, 23);
		jtfFabricante.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfFabricante.setBounds(202, 87, 72, 20);
		
		jlMarca.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlMarca.setBounds(244, 119, 55, 23);
		jtfMarca.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfMarca.setBounds(229, 143, 70, 20);
		
		jlLocalOrigem.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlLocalOrigem.setBounds(286, 63, 105, 23);
		jtfLocalOrigem.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfLocalOrigem.setBounds(284, 87, 107, 20);
		
		jlCor.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlCor.setBounds(335, 119, 35, 23);
		jtfCor.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfCor.setBounds(309, 143, 82, 20);
		
		jlAnoModelo.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlAnoModelo.setBounds(42, 174, 82, 23);
		jtfAnoModelo.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfAnoModelo.setBounds(40, 198, 84, 20);
		
		jlAnoFabricacao.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlAnoFabricacao.setBounds(132, 174, 100, 23);
		jtfAnoFabricacao.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfAnoFabricacao.setBounds(130, 198, 99, 20);
		
		jlCertificacao.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlCertificacao.setHorizontalAlignment(SwingConstants.CENTER);
		jlCertificacao.setBounds(241, 174, 150, 23);
		jtfCertificacao.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfCertificacao.setBounds(244, 198, 147, 20);
		
		jlTamanho.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlTamanho.setHorizontalAlignment(SwingConstants.CENTER);
		jlTamanho.setBounds(42, 229, 97, 23);
		
		jrbP.setSelected(true);
		jrbP.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbP.setOpaque(false);
		jrbP.setBounds(40, 255, 47, 23);
		
		jrbM.setOpaque(false);
		jrbM.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbM.setBounds(100, 255, 47, 23);
		
		jrbG.setOpaque(false);
		jrbG.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbG.setBounds(40, 281, 47, 23);
		
		jrbGG.setOpaque(false);
		jrbGG.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbGG.setBounds(100, 281, 47, 23);
		
		jlPeso.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlPeso.setHorizontalAlignment(SwingConstants.CENTER);
		jlPeso.setBounds(159, 229, 63, 23);
		jtfPeso.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfPeso.setBounds(157, 253, 70, 20);
		
		jbCadastrar.setBounds(244, 227, 147, 28);
		jbCadastrar.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		
		jbAlterar.setBounds(244, 227, 147, 28);
		jbAlterar.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		
		jbDeletar.setBounds(244, 266, 147, 28);
		jbDeletar.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		
		jlImagem2.setBounds(0, 0, 450, 370);
	}

	private void iniciarEventos() {
		/*------------------------------------------AÇÃO BOTÃO CADASTRAR------------------------------------------*/
		jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*SE OS JTFs ESTIVEREM DIFERENTES DE VAZIO, ELE ENTRARÁ NO IF, CASO O CONTRÁRIO ELE VAI CAIR NO ELSE*/
				if (!jtfAnoFabricacao.getText().isEmpty() && !jtfAnoModelo.getText().isEmpty() && !jtfCodigo.getText().isEmpty() && !jtfCor.getText().isEmpty() && !jtfFabricante.getText().isEmpty() &&
						!jtfGarantia.getText().isEmpty() && !jtfLocalOrigem.getText().isEmpty() && !jtfMarca.getText().isEmpty() && !jtfPreco.getText().isEmpty() && !jtfPeso.getText().isEmpty() && 
						!jtfQuantidade.getText().isEmpty() && !jtfCertificacao.getText().isEmpty()) {
					
					float preco;  
					int quantidadeBoia, garantia;
					String codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto, tamanho = null, peso, certificacao;
					
					tipoProduto = jlBoia.getText();
					preco = Float.parseFloat(jtfPreco.getText());
					quantidadeBoia = Integer.parseInt(jtfQuantidade.getText());
					garantia = Integer.parseInt(jtfGarantia.getText());
					codigo = jtfCodigo.getText();
					fabricante = jtfFabricante.getText();
					marca = jtfMarca.getText();
					localOrigem = jtfLocalOrigem.getText();
					cor = jtfCor.getText();
					anoModelo = jtfAnoModelo.getText();
					anoFabricacao = jtfAnoFabricacao.getText();
					peso = jtfPeso.getText();
					certificacao = jtfCertificacao.getText();
					
					if(jrbP.isSelected()) tamanho = "P";
					if(jrbM.isSelected()) tamanho = "M";
					if(jrbG.isSelected()) tamanho = "G";
					if(jrbGG.isSelected()) tamanho = "GG";
					
					produtos.add(new Boia(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto, tamanho, peso, certificacao, quantidadeBoia));
					
					jtfAnoFabricacao.setText("");
					jtfAnoModelo.setText("");
					jtfCodigo.setText("");
					jtfCor.setText("");
					jtfFabricante.setText("");
					jtfGarantia.setText("");
					jtfLocalOrigem.setText("");
					jtfMarca.setText("");
					jtfPreco.setText("");
					jtfPeso.setText("");
					jtfQuantidade.setText("");
					jtfCertificacao.setText("");
					
				} else {
					JOptionPane.showMessageDialog(null, "Preencher os Campos Vazios", "Cadastrar", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		/*------------------------------------------AÇÃO BOTÃO ALTERAR------------------------------------------*/
		jbAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/*SE OS JTFs ESTIVEREM DIFERENTES DE VAZIO, ELE ENTRARÁ NO IF, CASO O CONTRÁRIO ELE VAI CAIR NO ELSE*/
				if (!jtfAnoFabricacao.getText().isEmpty() && !jtfAnoModelo.getText().isEmpty() && !jtfCodigo.getText().isEmpty() && !jtfCor.getText().isEmpty() && !jtfFabricante.getText().isEmpty() &&
						!jtfGarantia.getText().isEmpty() && !jtfLocalOrigem.getText().isEmpty() && !jtfMarca.getText().isEmpty() && !jtfPreco.getText().isEmpty() && !jtfPeso.getText().isEmpty() && 
						!jtfQuantidade.getText().isEmpty() && !jtfCertificacao.getText().isEmpty()) {

					/*BASICAMENTE ESTAMOS PEGANDO O QUE ESTÁ ESCRITO NO JTF OU SELECIONADO NO JRB, E ALTERANDO AS CARACTERÍSTICAS DO
					  PRODUTO SALVO, PARA ASSIM SER POSSÍVEL EDITAR*/
					boia.setPreco(Float.parseFloat(jtfPreco.getText()));
					boia.setQuantidadeBoia(Integer.parseInt(jtfQuantidade.getText()));
					boia.setGarantia(Integer.parseInt(jtfGarantia.getText()));
					boia.setCodigo(jtfCodigo.getText());
					boia.setFabricante(jtfFabricante.getText());
					boia.setMarca(jtfMarca.getText());
					boia.setLocalOrigem(jtfLocalOrigem.getText());
					boia.setCor(jtfCor.getText());
					boia.setAnoModelo(jtfAnoModelo.getText());
					boia.setAnoFabricacao(jtfAnoFabricacao.getText());
					boia.setPeso(jtfPeso.getText());
					boia.setCertificacao(jtfCertificacao.getText());

					if(jrbP.isSelected()) boia.setTamanho("P");
					if(jrbM.isSelected()) boia.setTamanho("M");
					if(jrbG.isSelected()) boia.setTamanho("G");
					if(jrbGG.isSelected()) boia.setTamanho("GG");
					
					JOptionPane.showMessageDialog(null, "Alteração Realizada com Sucesso");
					
				} else {
					
					JOptionPane.showMessageDialog(null, "Preencher os Campos Vazios Antes de Alterar");
					
				}
			}
		});	 
		
		/*------------------------------------------AÇÃO BOTÃO DELETAR------------------------------------------*/
		jbDeletar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja Realmente Deletar?", "Deletar", JOptionPane.YES_NO_OPTION);
				
				if (resposta == 0) {
					produtos.remove(indice-1);
					JOptionPane.showMessageDialog(null, "Produto Deletado com Sucesso");
				}
				
				jtfAnoFabricacao.setText("");
				jtfAnoModelo.setText("");
				jtfCodigo.setText("");
				jtfCor.setText("");
				jtfFabricante.setText("");
				jtfGarantia.setText("");
				jtfLocalOrigem.setText("");
				jtfMarca.setText("");
				jtfPreco.setText("");
				jtfPeso.setText("");
				jtfQuantidade.setText("");
				jtfCertificacao.setText("");
			}
		});
	}
	
	/*-------------------MÉTODO QUE SERÁ CHAMADO TODA VEZ QUE O CLIENTE QUISER EDITAR UM PRODUTO-------------------*/
	
	public void preencherDados() {
		
		/*DEIXA O BOTÃO CADASTRAR INViSÍVEL E O BOTÃO ALTERAR E DELETAR VISÍVEIS*/
		
		jbCadastrar.setVisible(false);
		jbAlterar.setVisible(true);
		jbDeletar.setVisible(true);

		/*PEGA O ÍNDICE DO PRODUTO QUE DESEJAMOS EDITAR*/
		
		

		try {
			indice = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Índice da Boia a Ser Alterada"));
			/*SE O ÍNDICE COLOCADO INSTANCIAR-SE DE UMA BoIA (FOR DE UMA BOIA), ELE VAI CAIR NO IF, CASO O CONTRÁRIO, CAIRÁ NO ELSE*/
			if (produtos.get(indice-1) instanceof Boia) {
				boia = (Boia) produtos.get(indice-1);

				/*SETTA OS JTFs E JRBs DE ACORDO COM O QUE FOI CADASTRADO E SALVO NA MATRIZ*/
				
				jtfAnoFabricacao.setText(boia.getAnoFabricacao());
				jtfAnoModelo.setText(boia.getAnoModelo());
				jtfCodigo.setText(boia.getCodigo());
				jtfCor.setText(boia.getCor());
				jtfFabricante.setText(boia.getFabricante());
				jtfGarantia.setText(String.valueOf(boia.getGarantia()));
				jtfLocalOrigem.setText(boia.getLocalOrigem());
				jtfMarca.setText(boia.getMarca());
				jtfPreco.setText(String.valueOf(boia.getPreco()));
				jtfQuantidade.setText(String.valueOf(boia.getQuantidadeBoia()));
				jtfCertificacao.setText(boia.getCertificacao());
				jtfPeso.setText(boia.getPeso());
				
				if(boia.getTamanho().equals("P")) jrbP.setSelected(true);
				if(boia.getTamanho().equals("M")) jrbM.setSelected(true);
				if(boia.getTamanho().equals("G")) jrbG.setSelected(true);
				if(boia.getTamanho().equals("GG")) jrbGG.setSelected(true);
				
			} else {
				JOptionPane.showMessageDialog(null, "O Índice Inserido não Pertence a uma Boia", "Alterar", JOptionPane.WARNING_MESSAGE);
			}

		} catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Índice Inexistente", "Alterar", JOptionPane.ERROR_MESSAGE);
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O indice não pode estar vazio");
		}
	}
}
