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

import classes.Kit;
import classes.Produtos;

@SuppressWarnings("serial")
public class PainelCadastrarKit extends JPanel{
	
	private List<Produtos> produtos;
	private JLabel jlKit, jlPreco, jlGarantia, jlFabricante, jlLocalOrigem, jlQuantidade, jlCodigo, jlMarca, jlCor, jlAnoModelo, 
					jlAnoFabricacao, jlFacilidadeManuseio, jlTamanho, jlComidaEmergencia,jlImagem2;
					private ImageIcon imagem2;
	private JTextField jtfPreco, jtfGarantia, jtfFabricante, jtfLocalOrigem, jtfQuantidade, jtfCodigo, jtfMarca, jtfCor, jtfAnoModelo,
						jtfAnoFabricacao;
	private JButton jbCadastrar, jbAlterar, jbDeletar;
	private JRadioButton jrbP, jrbM, jrbG, jrbFacil, jrbMedio, jrbDificil, jrbSim, jrbNao;
	private ButtonGroup bgTamanho, bgFacilidadeManuseio, bgComidaEmergencia;
	private int indice;
	private Kit kit;
	
	public PainelCadastrarKit(List<Produtos> produtos) {
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
		jlKit = new JLabel("KIT SOCORROS");
		jlKit.setForeground(Color.white);
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
		jlFacilidadeManuseio = new JLabel("Facilidade de Manuseio");
		jlFacilidadeManuseio.setForeground(Color.white);
		jlTamanho = new JLabel("Tamanho");
		jlTamanho.setForeground(Color.white);
		jlComidaEmergencia = new JLabel("Com Comida");
		jlComidaEmergencia.setForeground(Color.white);
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
		
		jrbP = new JRadioButton("P");
		jrbP.setForeground(Color.white);
		jrbM = new JRadioButton("M");
		jrbM.setForeground(Color.white);
		jrbG = new JRadioButton("G");
		jrbG.setForeground(Color.white);
		jrbFacil = new JRadioButton("Fácil");
		jrbFacil.setForeground(Color.white);
		jrbMedio = new JRadioButton("Médio");
		jrbMedio.setForeground(Color.white);
		jrbDificil = new JRadioButton("Difícil");
		jrbDificil.setForeground(Color.white);
		jrbSim = new JRadioButton("Sim");
		jrbSim.setForeground(Color.white);
		jrbNao = new JRadioButton("Não"); 
		jrbNao.setForeground(Color.white);
		
		jbCadastrar = new JButton("Cadastrar");
		jbAlterar = new JButton("Salvar");
		jbDeletar = new JButton("Deletar");
		jbDeletar.setVisible(false);
		
		bgTamanho = new ButtonGroup();
		bgComidaEmergencia = new ButtonGroup();
		bgFacilidadeManuseio = new ButtonGroup();
		
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
		
		bgFacilidadeManuseio.add(jrbFacil);
		bgFacilidadeManuseio.add(jrbMedio);
		bgFacilidadeManuseio.add(jrbDificil);
		add(jrbFacil);
		add(jrbMedio);
		add(jrbDificil);
		
		bgComidaEmergencia.add(jrbSim);
		bgComidaEmergencia.add(jrbNao);
		add(jrbSim);
		add(jrbNao);
		
		add(jlAnoFabricacao);
		add(jlAnoModelo);
		add(jlKit);
		add(jlCodigo);
		add(jlCor);
		add(jlFabricante);
		add(jlGarantia);
		add(jlTamanho);
		add(jlLocalOrigem);
		add(jlMarca);
		add(jlPreco);
		add(jlComidaEmergencia);
		add(jlQuantidade);
		add(jlFacilidadeManuseio);
		
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
		
		add(jlImagem2);
		
		/*--------------------------------------DEFININDO AS BOUNDS DOS COMPONENTES--------------------------------------*/
		jlKit.setHorizontalAlignment(SwingConstants.CENTER); /*ALINHA HORIZONTALMENTE O CONTEÚDO NO CENTRO*/
		jlKit.setFont(new Font("Calisto MT", Font.PLAIN, 16)); /*DEFINIMOS A FONTE E O TAMANHO DELA*/
		jlKit.setBounds(0, 23, 450, 28);
		
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
		
		jlFacilidadeManuseio.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlFacilidadeManuseio.setHorizontalAlignment(SwingConstants.CENTER);
		jlFacilidadeManuseio.setBounds(241, 174, 150, 23);
		
		jrbFacil.setOpaque(false);
		jrbFacil.setSelected(true);
		jrbFacil.setFont(new Font("Calisto MT", Font.PLAIN, 11));
		jrbFacil.setBounds(244, 197, 47, 23);
		
		jrbMedio.setFont(new Font("Calisto MT", Font.PLAIN, 11));
		jrbMedio.setOpaque(false);
		jrbMedio.setBounds(286, 197, 56, 23);
		
		jrbDificil.setFont(new Font("Calisto MT", Font.PLAIN, 11));
		jrbDificil.setOpaque(false);
		jrbDificil.setBounds(335, 197, 56, 23);
		
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
		
		jlComidaEmergencia.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlComidaEmergencia.setHorizontalAlignment(SwingConstants.CENTER);
		jlComidaEmergencia.setBounds(144, 229, 90, 23);
		
		jrbSim.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbSim.setSelected(true);
		jrbSim.setOpaque(false);
		jrbSim.setBounds(145, 256, 47, 23);
		
		jrbNao.setOpaque(false);
		jrbNao.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbNao.setBounds(187, 256, 50, 23);
		
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
						!jtfGarantia.getText().isEmpty() && !jtfLocalOrigem.getText().isEmpty() && !jtfMarca.getText().isEmpty() && !jtfPreco.getText().isEmpty() && !jtfQuantidade.getText().isEmpty()) {
					
					float preco;  
					int quantidadeKit, garantia;
					String codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto, tamanho = null, facilidadeManuseio = null, comidaEmergencia = null;
					
					tipoProduto = jlKit.getText();
					preco = Float.parseFloat(jtfPreco.getText());
					quantidadeKit = Integer.parseInt(jtfQuantidade.getText());
					garantia = Integer.parseInt(jtfGarantia.getText());
					codigo = jtfCodigo.getText();
					fabricante = jtfFabricante.getText();
					marca = jtfMarca.getText();
					localOrigem = jtfLocalOrigem.getText();
					cor = jtfCor.getText();
					anoModelo = jtfAnoModelo.getText();
					anoFabricacao = jtfAnoFabricacao.getText();
					
					
					if(jrbP.isSelected()) tamanho = "P";
					if(jrbM.isSelected()) tamanho = "M";
					if(jrbG.isSelected()) tamanho = "G";
					
					if(jrbFacil.isSelected()) facilidadeManuseio = "Fácil";
					if(jrbMedio.isSelected()) facilidadeManuseio = "Médio";
					if(jrbDificil.isSelected()) facilidadeManuseio = "Difícil";
					
					if(jrbSim.isSelected()) comidaEmergencia = "Sim";
					if(jrbNao.isSelected()) comidaEmergencia = "Não";
					
					produtos.add(new Kit(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto, facilidadeManuseio, tamanho, comidaEmergencia, quantidadeKit));
					
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
						!jtfGarantia.getText().isEmpty() && !jtfLocalOrigem.getText().isEmpty() && !jtfMarca.getText().isEmpty() && !jtfPreco.getText().isEmpty() && !jtfQuantidade.getText().isEmpty()) {

					/*BASICAMENTE ESTAMOS PEGANDO O QUE ESTÁ ESCRITO NO JTF OU SELECIONADO NO JRB, E ALTERANDO AS CARACTERÍSTICAS DO
					  PRODUTO SALVO, PARA ASSIM SER POSSÍVEL EDITAR*/
					kit.setPreco(Float.parseFloat(jtfPreco.getText()));
					kit.setQuantidadeKit(Integer.parseInt(jtfQuantidade.getText()));
					kit.setGarantia(Integer.parseInt(jtfGarantia.getText()));
					kit.setCodigo(jtfCodigo.getText());
					kit.setFabricante(jtfFabricante.getText());
					kit.setMarca(jtfMarca.getText());
					kit.setLocalOrigem(jtfLocalOrigem.getText());
					kit.setCor(jtfCor.getText());
					kit.setAnoModelo(jtfAnoModelo.getText());
					kit.setAnoFabricacao(jtfAnoFabricacao.getText());

					if(jrbP.isSelected()) kit.setTamanho("P");
					if(jrbM.isSelected()) kit.setTamanho("M");
					if(jrbG.isSelected()) kit.setTamanho("G");
					
					if(jrbFacil.isSelected()) kit.setFacilidadeManuseio("Fácil");
					if(jrbMedio.isSelected()) kit.setFacilidadeManuseio("Médio");
					if(jrbDificil.isSelected()) kit.setFacilidadeManuseio("Difícil");
					
					if(jrbSim.isSelected()) kit.setComidaEmergencia("Sim");
					if(jrbNao.isSelected()) kit.setComidaEmergencia("Não");
					
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
			indice = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Índice do Kit Socorros a Ser Alterado"));
			/*SE O ÍNDICE COLOCADO INSTANCIAR-SE DE UM KIT (FOR DE UM KIT), ELE VAI CAIR NO IF, CASO O CONTRÁRIO, CAIRÁ NO ELSE*/
			if (produtos.get(indice-1) instanceof Kit) {
				kit = (Kit) produtos.get(indice-1);
				
				/*SETTA OS JTFs E JRBs DE ACORDO COM O QUE FOI CADASTRADO E SALVO NA MATRIZ*/
				
				jtfAnoFabricacao.setText(kit.getAnoFabricacao());
				jtfAnoModelo.setText(kit.getAnoModelo());
				jtfCodigo.setText(kit.getCodigo());
				jtfCor.setText(kit.getCor());
				jtfFabricante.setText(kit.getFabricante());
				jtfGarantia.setText(String.valueOf(kit.getGarantia()));
				jtfLocalOrigem.setText(kit.getLocalOrigem());
				jtfMarca.setText(kit.getMarca());
				jtfPreco.setText(String.valueOf(kit.getPreco()));
				jtfQuantidade.setText(String.valueOf(kit.getQuantidadeKit()));
				
				if(kit.getTamanho().equals("P")) jrbP.setSelected(true);
				if(kit.getTamanho().equals("M")) jrbM.setSelected(true);
				if(kit.getTamanho().equals("G")) jrbG.setSelected(true);
				
				if(kit.getFacilidadeManuseio().equals("Fácil")) jrbFacil.setSelected(true);
				if(kit.getFacilidadeManuseio().equals("Médio")) jrbMedio.setSelected(true);
				if(kit.getFacilidadeManuseio().equals("Difícil")) jrbDificil.setSelected(true);
				
				if(kit.getComidaEmergencia().equals("Sim")) jrbSim.setSelected(true);
				if(kit.getComidaEmergencia().equals("Não")) jrbNao.setSelected(true);

			} else {
				JOptionPane.showMessageDialog(null, "O Índice Inserido não Pertence a um Kit Socorros", 
						"Alterar", JOptionPane.WARNING_MESSAGE);
			}

		} catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Índice Inexistente", "Alterar", JOptionPane.ERROR_MESSAGE);
		}
		catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "O indice não pode estar vazio");
		}

	}
}
