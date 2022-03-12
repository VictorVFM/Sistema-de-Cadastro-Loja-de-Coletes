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

import classes.Lanterna;
import classes.Produtos;

@SuppressWarnings("serial")
public class PainelCadastrarLanterna extends JPanel{
	
	private List<Produtos> produtos;
	private JLabel jlLanterna, jlPreco, jlGarantia, jlFabricante, jlLocalOrigem, jlQuantidade, jlCodigo, jlMarca, jlCor, jlAnoModelo, 
					jlAnoFabricacao, jlIntensidadeBrilho, jlTamanho, jlTipoEnergia,jlImagem2;
					private ImageIcon imagem2;
	private JTextField jtfPreco, jtfGarantia, jtfFabricante, jtfLocalOrigem, jtfQuantidade, jtfCodigo, jtfMarca, jtfCor, jtfAnoModelo,
						jtfAnoFabricacao, jtfTipoEnergia;
	private JButton jbCadastrar, jbAlterar, jbDeletar;
	private JRadioButton jrbP, jrbM, jrbG, jrbAlta, jrbMedia, jrbBaixa;
	private ButtonGroup bgTamanho, bgIntensidadeBrilho;
	private int indice;
	private Lanterna lanterna;
	
	public PainelCadastrarLanterna(List<Produtos> produtos) {
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
		jlLanterna = new JLabel("LANTERNA");
		jlLanterna.setForeground(Color.white);
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
		jlIntensidadeBrilho = new JLabel("Intensidade do Brilho");
		jlIntensidadeBrilho.setForeground(Color.white);
		jlTamanho = new JLabel("Tamanho");
		jlTamanho.setForeground(Color.white);		
		jlTipoEnergia = new JLabel("Tipo Energia");
		jlTipoEnergia.setForeground(Color.white);
		
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
		jtfTipoEnergia = new JTextField();
		
		jrbP = new JRadioButton("P");
		jrbP.setForeground(Color.white);
		jrbM = new JRadioButton("M");
		jrbM.setForeground(Color.white);
		jrbG = new JRadioButton("G");
		jrbG.setForeground(Color.white);
		jrbAlta = new JRadioButton("Alta");
		jrbAlta.setForeground(Color.white);
		jrbMedia = new JRadioButton("Média");
		jrbMedia.setForeground(Color.white);
		jrbBaixa = new JRadioButton("Baixa");
		jrbBaixa.setForeground(Color.white);
		jbCadastrar = new JButton("Cadastrar");
		jbAlterar = new JButton("Salvar");
		jbDeletar = new JButton("Deletar");
		jbDeletar.setVisible(false);
		
		bgTamanho = new ButtonGroup();
		bgIntensidadeBrilho = new ButtonGroup();
		
		/*--------------------------------------ADICIONANDO COMPONENTES--------------------------------------*/
		add(jbCadastrar);
		add(jbAlterar);
		add(jbDeletar);
		
		bgTamanho.add(jrbP);
		bgTamanho.add(jrbM);
		bgTamanho.add(jrbG);
		add(jrbP);
		add(jrbM);
		add(jrbG);
		
		bgIntensidadeBrilho.add(jrbAlta);
		bgIntensidadeBrilho.add(jrbMedia);
		bgIntensidadeBrilho.add(jrbBaixa);
		add(jrbAlta);
		add(jrbMedia);
		add(jrbBaixa);
		
		add(jlAnoFabricacao);
		add(jlAnoModelo);
		add(jlLanterna);
		add(jlCodigo);
		add(jlCor);
		add(jlFabricante);
		add(jlGarantia);
		add(jlTamanho);
		add(jlLocalOrigem);
		add(jlMarca);
		add(jlPreco);
		add(jlTipoEnergia);
		add(jlQuantidade);
		add(jlIntensidadeBrilho);
		
		add(jtfAnoFabricacao);
		add(jtfAnoModelo);
		add(jtfCodigo);
		add(jtfCor);
		add(jtfFabricante);
		add(jtfGarantia);
		add(jtfLocalOrigem);
		add(jtfMarca);
		add(jtfPreco);
		add(jtfQuantidade);
		add(jtfTipoEnergia);
		
		add(jlImagem2);
		
		/*--------------------------------------DEFININDO AS BOUNDS DOS COMPONENTES--------------------------------------*/
		jlLanterna.setHorizontalAlignment(SwingConstants.CENTER); /*ALINHA HORIZONTALMENTE O CONTEÚDO NO CENTRO*/
		jlLanterna.setFont(new Font("Calisto MT", Font.PLAIN, 16)); /*DEFINIMOS A FONTE E O TAMANHO DELA*/
		jlLanterna.setBounds(0, 23, 450, 28);
		
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
		
		jlIntensidadeBrilho.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlIntensidadeBrilho.setHorizontalAlignment(SwingConstants.CENTER);
		jlIntensidadeBrilho.setBounds(241, 174, 150, 23);
		
		jrbAlta.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbAlta.setSelected(true);
		jrbAlta.setOpaque(false);
		jrbAlta.setBounds(244, 196, 47, 23);
		
		jrbMedia.setOpaque(false);
		jrbMedia.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbMedia.setBounds(290, 196, 70, 23);
		
		jrbBaixa.setOpaque(false);
		jrbBaixa.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbBaixa.setBounds(346, 196, 56, 23);
		
		jlTamanho.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlTamanho.setHorizontalAlignment(SwingConstants.CENTER);
		jlTamanho.setBounds(42, 229, 97, 23);
		
		jrbP.setSelected(true);
		jrbP.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbP.setOpaque(false);
		jrbP.setBounds(40, 255, 47, 23);
		
		jrbM.setOpaque(false);
		jrbM.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbM.setBounds(71, 255, 35, 23);
		
		jrbG.setOpaque(false);
		jrbG.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbG.setBounds(100, 255, 47, 23);
		
		jlTipoEnergia.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlTipoEnergia.setHorizontalAlignment(SwingConstants.CENTER);
		jlTipoEnergia.setBounds(142, 229, 82, 23);
		jtfTipoEnergia.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfTipoEnergia.setBounds(142, 253, 82, 20);
		
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
						!jtfGarantia.getText().isEmpty() && !jtfLocalOrigem.getText().isEmpty() && !jtfMarca.getText().isEmpty() && !jtfPreco.getText().isEmpty() && !jtfQuantidade.getText().isEmpty() 
						&& !jtfTipoEnergia.getText().isEmpty()) {
					
					float preco;  
					int quantidadeLanterna, garantia;
					String codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto, tamanho = null, tipoEnergia, intensidadeBrilho = null;
					
					tipoProduto = jlLanterna.getText();
					preco = Float.parseFloat(jtfPreco.getText());
					quantidadeLanterna = Integer.parseInt(jtfQuantidade.getText());
					garantia = Integer.parseInt(jtfGarantia.getText());
					codigo = jtfCodigo.getText();
					fabricante = jtfFabricante.getText();
					marca = jtfMarca.getText();
					localOrigem = jtfLocalOrigem.getText();
					cor = jtfCor.getText();
					anoModelo = jtfAnoModelo.getText();
					anoFabricacao = jtfAnoFabricacao.getText();
					tipoEnergia = jtfTipoEnergia.getText();
					
					if(jrbP.isSelected()) tamanho = "P";
					if(jrbM.isSelected()) tamanho = "M";
					if(jrbG.isSelected()) tamanho = "G";
					
					if(jrbBaixa.isSelected()) intensidadeBrilho = "Baixa";
					if(jrbMedia.isSelected()) intensidadeBrilho = "Média";
					if(jrbAlta.isSelected()) intensidadeBrilho = "Alta";
					
					produtos.add(new Lanterna(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto, tamanho, tipoEnergia, intensidadeBrilho, quantidadeLanterna));
					
					jtfAnoFabricacao.setText("");
					jtfAnoModelo.setText("");
					jtfCodigo.setText("");
					jtfCor.setText("");
					jtfFabricante.setText("");
					jtfGarantia.setText("");
					jtfLocalOrigem.setText("");
					jtfMarca.setText("");
					jtfPreco.setText("");
					jtfQuantidade.setText("");
					jtfTipoEnergia.setText("");
					
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
						!jtfGarantia.getText().isEmpty() && !jtfLocalOrigem.getText().isEmpty() && !jtfMarca.getText().isEmpty() && !jtfPreco.getText().isEmpty() && 
						!jtfQuantidade.getText().isEmpty() && !jtfTipoEnergia.getText().isEmpty()) {

					/*BASICAMENTE ESTAMOS PEGANDO O QUE ESTÁ ESCRITO NO JTF OU SELECIONADO NO JRB, E ALTERANDO AS CARACTERÍSTICAS DO
					  PRODUTO SALVO, PARA ASSIM SER POSSÍVEL EDITAR*/
					lanterna.setPreco(Float.parseFloat(jtfPreco.getText()));
					lanterna.setQuantidadeLanterna(Integer.parseInt(jtfQuantidade.getText()));
					lanterna.setGarantia(Integer.parseInt(jtfGarantia.getText()));
					lanterna.setCodigo(jtfCodigo.getText());
					lanterna.setFabricante(jtfFabricante.getText());
					lanterna.setMarca(jtfMarca.getText());
					lanterna.setLocalOrigem(jtfLocalOrigem.getText());
					lanterna.setCor(jtfCor.getText());
					lanterna.setAnoModelo(jtfAnoModelo.getText());
					lanterna.setAnoFabricacao(jtfAnoFabricacao.getText());
					lanterna.setTipoEnergia(jtfTipoEnergia.getText());

					if(jrbP.isSelected()) lanterna.setTamanho("P");
					if(jrbM.isSelected()) lanterna.setTamanho("M");
					if(jrbG.isSelected()) lanterna.setTamanho("G");
					
					if(jrbBaixa.isSelected()) lanterna.setIntensidadeLuz("Baixa");
					if(jrbMedia.isSelected()) lanterna.setIntensidadeLuz("Média");
					if(jrbAlta.isSelected()) lanterna.setIntensidadeLuz("Alta");
					
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
				jtfQuantidade.setText("");
				jtfTipoEnergia.setText("");
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
			indice = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Índice da Lanterna a Ser Alterada"));
			/*SE O ÍNDICE COLOCADO INSTANCIAR-SE DE UMA FACA (FOR DE UMA FACA), ELE VAI CAIR NO IF, CASO O CONTRÁRIO, CAIRÁ NO ELSE*/
			if (produtos.get(indice-1) instanceof Lanterna) {
				lanterna = (Lanterna) produtos.get(indice-1);

				/*SETTA OS JTFs E JRBs DE ACORDO COM O QUE FOI CADASTRADO E SALVO NA MATRIZ*/
				
				jtfAnoFabricacao.setText(lanterna.getAnoFabricacao());
				jtfAnoModelo.setText(lanterna.getAnoModelo());
				jtfCodigo.setText(lanterna.getCodigo());
				jtfCor.setText(lanterna.getCor());
				jtfFabricante.setText(lanterna.getFabricante());
				jtfGarantia.setText(String.valueOf(lanterna.getGarantia()));
				jtfLocalOrigem.setText(lanterna.getLocalOrigem());
				jtfMarca.setText(lanterna.getMarca());
				jtfPreco.setText(String.valueOf(lanterna.getPreco()));
				jtfQuantidade.setText(String.valueOf(lanterna.getQuantidadeLanterna()));
				jtfTipoEnergia.setText(lanterna.getTipoEnergia());
				
				if(lanterna.getTamanho().equals("P")) jrbP.setSelected(true);
				if(lanterna.getTamanho().equals("M")) jrbM.setSelected(true);
				if(lanterna.getTamanho().equals("G")) jrbG.setSelected(true);
				
				if(lanterna.getIntensidadeLuz().equals("Baixa")) jrbBaixa.setSelected(true);
				if(lanterna.getIntensidadeLuz().equals("Média")) jrbMedia.setSelected(true);
				if(lanterna.getIntensidadeLuz().equals("Alta")) jrbAlta.setSelected(true);

			} else {
				JOptionPane.showMessageDialog(null, "O Índice Inserido não Pertence a uma Lanterna", "Alterar", JOptionPane.WARNING_MESSAGE);
			}

		} catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Índice Inexistente", "Alterar", JOptionPane.ERROR_MESSAGE);
		}
		catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "O indice não pode estar vazio");
		}

	}
}
