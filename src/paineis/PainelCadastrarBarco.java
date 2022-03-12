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

import classes.Barco;
import classes.Produtos;

@SuppressWarnings("serial")
public class PainelCadastrarBarco extends JPanel{
	
	private List<Produtos> produtos;
	private JLabel jlBarco, jlPreco, jlGarantia, jlFabricante, jlLocalOrigem, jlQuantidade, jlCodigo, jlMarca, jlCor, jlAnoModelo, 
					jlAnoFabricacao, jlQuantidadeLugares, jlIluminacao, jlPropulsao,jlImagem2;
	private ImageIcon imagem2;
	private JTextField jtfPreco, jtfGarantia, jtfFabricante, jtfLocalOrigem, jtfQuantidade, jtfCodigo, jtfMarca, jtfCor, jtfAnoModelo,
						jtfAnoFabricacao, jtfPropulsao;
	private JButton jbCadastrar, jbAlterar, jbDeletar;
	private JRadioButton jrb4, jrb6, jrb8, jrbSim, jrbNao;
	private ButtonGroup bgLugares, bgIluminacao;
	private int indice;
	private Barco barco;
	
	
	public PainelCadastrarBarco(List<Produtos> produtos) {
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
		jlBarco = new JLabel("BARCO");
		jlBarco.setForeground(Color.white);
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
		
		jlQuantidadeLugares = new JLabel("Quantidade de Lugares");
		jlQuantidadeLugares.setForeground(Color.white);
		
		jlIluminacao = new JLabel("Com Iluminação");
		jlIluminacao.setForeground(Color.white);
		
		jlPropulsao = new JLabel("Propulsão");
		jlPropulsao.setForeground(Color.white);
		
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
		jtfPropulsao = new JTextField();
		
		jrb4 = new JRadioButton("4");
		jrb4.setForeground(Color.white);
		jrb6 = new JRadioButton("6");
		jrb6.setForeground(Color.white);
		jrb8 = new JRadioButton("8");
		jrb8.setForeground(Color.white);
		jrbSim = new JRadioButton("Sim");
		jrbSim.setForeground(Color.white);
		jrbNao = new JRadioButton("Não");
		jrbNao.setForeground(Color.white);
		
		jbCadastrar = new JButton("Cadastrar");
		jbAlterar = new JButton("Salvar");
		jbDeletar = new JButton("Deletar");
		jbDeletar.setVisible(false);
		
		bgLugares = new ButtonGroup();
		bgIluminacao = new ButtonGroup();
		
		/*--------------------------------------ADICIONANDO COMPONENTES--------------------------------------*/
		add(jbCadastrar);
		add(jbAlterar);
		add(jbDeletar);
		
		bgLugares.add(jrb4);
		bgLugares.add(jrb6);
		bgLugares.add(jrb8);
		add(jrb4);
		add(jrb6);
		add(jrb8);
		
		bgIluminacao.add(jrbSim);
		bgIluminacao.add(jrbNao);
		add(jrbSim);
		add(jrbNao);
		
		add(jlAnoFabricacao);
		add(jlAnoModelo);
		add(jlBarco);
		add(jlCodigo);
		add(jlCor);
		add(jlFabricante);
		add(jlGarantia);
		add(jlIluminacao);
		add(jlLocalOrigem);
		add(jlMarca);
		add(jlPreco);
		add(jlPropulsao);
		add(jlQuantidade);
		add(jlQuantidadeLugares);
		
		add(jtfAnoFabricacao);
		add(jtfAnoModelo);
		add(jtfCodigo);
		add(jtfCor);
		add(jtfFabricante);
		add(jtfGarantia);
		add(jtfLocalOrigem);
		add(jtfMarca);
		add(jtfPreco);
		add(jtfPropulsao);
		add(jtfQuantidade);
		
		add(jlImagem2);
		
		/*--------------------------------------DEFININDO AS BOUNDS DOS COMPONENTES--------------------------------------*/
		jlBarco.setHorizontalAlignment(SwingConstants.CENTER); /*ALINHA HORIZONTALMENTE O CONTEÚDO NO CENTRO*/
		jlBarco.setFont(new Font("Calisto MT", Font.PLAIN, 16)); /*DEFINIMOS A FONTE E O TAMANHO DELA*/
		jlBarco.setBounds(0, 23, 450, 28);
		
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
		
		jlQuantidadeLugares.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlQuantidadeLugares.setBounds(241, 174, 150, 23);
		
		jrb4.setSelected(true);
		jrb4.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrb4.setOpaque(false);
		jrb4.setBounds(251, 197, 35, 23);
		
		jrb6.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrb6.setOpaque(false);
		jrb6.setBounds(291, 197, 35, 23);
		
		jrb8.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrb8.setOpaque(false);
		jrb8.setBounds(335, 197, 35, 23);
		
		jlIluminacao.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlIluminacao.setBounds(42, 229, 105, 23);
		
		jrbSim.setSelected(true);
		jrbSim.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbSim.setOpaque(false);
		jrbSim.setBounds(40, 255, 47, 23);
		
		jrbNao.setOpaque(false);
		jrbNao.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbNao.setBounds(100, 255, 50, 23);
		
		jlPropulsao.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlPropulsao.setBounds(159, 229, 70, 23);
		jtfPropulsao.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfPropulsao.setBounds(157, 253, 70, 20);
		
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
						!jtfGarantia.getText().isEmpty() && !jtfLocalOrigem.getText().isEmpty() && !jtfMarca.getText().isEmpty() && !jtfPreco.getText().isEmpty() && !jtfPropulsao.getText().isEmpty() && 
						!jtfQuantidade.getText().isEmpty()) {
					
					float preco;  
					int quantidadeBarco, garantia;
					String codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto, qntLugares = null, iluminacao = null, propulsao;
					
					tipoProduto = jlBarco.getText();
					preco = Float.parseFloat(jtfPreco.getText());
					quantidadeBarco = Integer.parseInt(jtfQuantidade.getText());
					garantia = Integer.parseInt(jtfGarantia.getText());
					codigo = jtfCodigo.getText();
					fabricante = jtfFabricante.getText();
					marca = jtfMarca.getText();
					localOrigem = jtfLocalOrigem.getText();
					cor = jtfCor.getText();
					anoModelo = jtfAnoModelo.getText();
					anoFabricacao = jtfAnoFabricacao.getText();
					propulsao = jtfPropulsao.getText();
					
					if(jrb4.isSelected()) qntLugares = "4";
					if(jrb6.isSelected()) qntLugares = "6";
					if(jrb8.isSelected()) qntLugares = "8";
					
					if(jrbSim.isSelected()) iluminacao = "Sim";
					if(jrbNao.isSelected()) iluminacao = "Não";
					
					produtos.add(new Barco(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto, qntLugares, iluminacao, propulsao, quantidadeBarco));
					
					jtfAnoFabricacao.setText("");
					jtfAnoModelo.setText("");
					jtfCodigo.setText("");
					jtfCor.setText("");
					jtfFabricante.setText("");
					jtfGarantia.setText("");
					jtfLocalOrigem.setText("");
					jtfMarca.setText("");
					jtfPreco.setText("");
					jtfPropulsao.setText("");
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
						!jtfGarantia.getText().isEmpty() && !jtfLocalOrigem.getText().isEmpty() && !jtfMarca.getText().isEmpty() && !jtfPreco.getText().isEmpty() && !jtfPropulsao.getText().isEmpty() && 
						!jtfQuantidade.getText().isEmpty()) {

					/*BASICAMENTE ESTAMOS PEGANDO O QUE ESTÁ ESCRITO NO JTF OU SELECIONADO NO JRB, E ALTERANDO AS CARACTERÍSTICAS DO
					  PRODUTO SALVO, PARA ASSIM SER POSSÍVEL EDITAR*/
					barco.setPreco(Float.parseFloat(jtfPreco.getText()));
					barco.setQuantidadeBarco(Integer.parseInt(jtfQuantidade.getText()));
					barco.setGarantia(Integer.parseInt(jtfGarantia.getText()));
					barco.setCodigo(jtfCodigo.getText());
					barco.setFabricante(jtfFabricante.getText());
					barco.setMarca(jtfMarca.getText());
					barco.setLocalOrigem(jtfLocalOrigem.getText());
					barco.setCor(jtfCor.getText());
					barco.setAnoModelo(jtfAnoModelo.getText());
					barco.setAnoFabricacao(jtfAnoFabricacao.getText());
					barco.setPropulsao(jtfPropulsao.getText());

					if(jrb4.isSelected()) barco.setQntLugares("4");
					if(jrb6.isSelected()) barco.setQntLugares("6");
					if(jrb8.isSelected()) barco.setQntLugares("8");
					
					if(jrbSim.isSelected()) barco.setIluminacao("Sim");
					if(jrbNao.isSelected()) barco.setIluminacao("Não");
					
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
				jtfPropulsao.setText("");
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
			indice = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Índice do Barco a Ser Alterado"));
			/*SE O ÍNDICE COLOCADO INSTANCIAR-SE DE UM BARCO (FOR DE UM BARCO), ELE VAI CAIR NO IF, CASO O CONTRÁRIO, CAIRÁ NO ELSE*/
			if (produtos.get(indice-1) instanceof Barco) {
				barco = (Barco) produtos.get(indice-1);

				/*SETTA OS JTFs E JRBs DE ACORDO COM O QUE FOI CADASTRADO E SALVO NA MATRIZ*/
				
				jtfAnoFabricacao.setText(barco.getAnoFabricacao());
				jtfAnoModelo.setText(barco.getAnoModelo());
				jtfCodigo.setText(barco.getCodigo());
				jtfCor.setText(barco.getCor());
				jtfFabricante.setText(barco.getFabricante());
				jtfGarantia.setText(String.valueOf(barco.getGarantia()));
				jtfLocalOrigem.setText(barco.getLocalOrigem());
				jtfMarca.setText(barco.getMarca());
				jtfPreco.setText(String.valueOf(barco.getPreco()));
				jtfPropulsao.setText(barco.getPropulsao());
				jtfQuantidade.setText(String.valueOf(barco.getQuantidadeBarco()));
				
				if(barco.getQntLugares().equals("4")) jrb4.setSelected(true);
				if(barco.getQntLugares().equals("6")) jrb6.setSelected(true);
				if(barco.getQntLugares().equals("8")) jrb8.setSelected(true);
				
				if(barco.getIluminacao().equals("Sim")) jrbSim.setSelected(true);
				if(barco.getIluminacao().equals("Não")) jrbNao.setSelected(true);

			} else {
				JOptionPane.showMessageDialog(null, "O Código Inserido não Pertence a um Barco", "Alterar", JOptionPane.WARNING_MESSAGE);
			}

		} catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Código Inexistente", "Alterar", JOptionPane.ERROR_MESSAGE);
		}
		catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "O indice não pode estar vazio");
		}

	}
}
