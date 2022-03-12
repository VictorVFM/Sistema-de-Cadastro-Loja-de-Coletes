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

import classes.Faca;
import classes.Produtos;

@SuppressWarnings("serial")
public class PainelCadastrarFaca extends JPanel{
	
	private List<Produtos> produtos;
	private JLabel jlFaca, jlPreco, jlGarantia, jlFabricante, jlLocalOrigem, jlQuantidade, jlCodigo, jlMarca, jlCor, jlAnoModelo, 
					jlAnoFabricacao, jlTipoLamina, jlTamanho, jlTipoFio,jlImagem2;
					private ImageIcon imagem2;
	private JTextField jtfPreco, jtfGarantia, jtfFabricante, jtfLocalOrigem, jtfQuantidade, jtfCodigo, jtfMarca, jtfCor, jtfAnoModelo,
						jtfAnoFabricacao, jtfTipoFio, jtfTipoLamina;
	private JButton jbCadastrar, jbAlterar, jbDeletar;
	private JRadioButton jrbP, jrbM, jrbG;
	private ButtonGroup bgTamanho;
	private int indice;
	private Faca faca;
	
	public PainelCadastrarFaca(List<Produtos> produtos) {
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
		jlFaca = new JLabel("FACA");
		jlFaca.setForeground(Color.white);		
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
		jlTipoLamina = new JLabel("Tipo de Lâmina");
		jlTipoLamina.setForeground(Color.white);
		jlTamanho = new JLabel("Tamanho");
		jlTamanho.setForeground(Color.white);
		jlTipoFio = new JLabel("Tipo de Fio");
		jlTipoFio.setForeground(Color.white);
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
		jtfTipoFio = new JTextField();
		jtfTipoLamina = new JTextField();
		
		jrbP = new JRadioButton("P");
		jrbP.setForeground(Color.white);
		jrbM = new JRadioButton("M");
		jrbM.setForeground(Color.white);
		jrbG = new JRadioButton("G");
		jrbG.setForeground(Color.white);
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
		add(jrbP);
		add(jrbM);
		add(jrbG);
		
		add(jlAnoFabricacao);
		add(jlAnoModelo);
		add(jlFaca);
		add(jlCodigo);
		add(jlCor);
		add(jlFabricante);
		add(jlGarantia);
		add(jlTamanho);
		add(jlLocalOrigem);
		add(jlMarca);
		add(jlPreco);
		add(jlTipoFio);
		add(jlQuantidade);
		add(jlTipoLamina);
		
		add(jtfAnoFabricacao);
		add(jtfAnoModelo);
		add(jtfCodigo);
		add(jtfCor);
		add(jtfFabricante);
		add(jtfGarantia);
		add(jtfLocalOrigem);
		add(jtfMarca);
		add(jtfPreco);
		add(jtfTipoFio);
		add(jtfQuantidade);
		add(jtfTipoLamina);
		
		add(jlImagem2);
		
		/*--------------------------------------DEFININDO AS BOUNDS DOS COMPONENTES--------------------------------------*/
		jlFaca.setHorizontalAlignment(SwingConstants.CENTER); /*ALINHA HORIZONTALMENTE O CONTEÚDO NO CENTRO*/
		jlFaca.setFont(new Font("Calisto MT", Font.PLAIN, 16)); /*DEFINIMOS A FONTE E O TAMANHO DELA*/
		jlFaca.setBounds(0, 23, 450, 28);
		
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
		
		jlTipoLamina.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlTipoLamina.setHorizontalAlignment(SwingConstants.CENTER);
		jlTipoLamina.setBounds(241, 174, 150, 23);
		jtfTipoLamina.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfTipoLamina.setBounds(244, 198, 147, 20);
		
		jlTamanho.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlTamanho.setHorizontalAlignment(SwingConstants.CENTER);
		jlTamanho.setBounds(42, 229, 97, 23);
		
		jrbP.setSelected(true);
		jrbP.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbP.setOpaque(false);
		jrbP.setBounds(40, 255, 47, 23);
		
		jrbM.setOpaque(false);
		jrbM.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbM.setBounds(71, 255, 40, 23);
		
		jrbG.setOpaque(false);
		jrbG.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		jrbG.setBounds(103, 255, 47, 23);
		
		jlTipoFio.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jlTipoFio.setHorizontalAlignment(SwingConstants.CENTER);
		jlTipoFio.setBounds(144, 229, 90, 23);
		jtfTipoFio.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		jtfTipoFio.setBounds(145, 253, 85, 20);
		
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
						&& !jtfTipoFio.getText().isEmpty() && !jtfTipoLamina.getText().isEmpty()) {
					
					float preco;  
					int quantidadeFaca, garantia;
					String codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto, tamanho = null, tipoFio, tipoLamina;
					
					tipoProduto = jlFaca.getText();
					preco = Float.parseFloat(jtfPreco.getText());
					quantidadeFaca = Integer.parseInt(jtfQuantidade.getText());
					garantia = Integer.parseInt(jtfGarantia.getText());
					codigo = jtfCodigo.getText();
					fabricante = jtfFabricante.getText();
					marca = jtfMarca.getText();
					localOrigem = jtfLocalOrigem.getText();
					cor = jtfCor.getText();
					anoModelo = jtfAnoModelo.getText();
					anoFabricacao = jtfAnoFabricacao.getText();
					tipoFio = jtfTipoFio.getText();
					tipoLamina = jtfTipoLamina.getText();
					
					if(jrbP.isSelected()) tamanho = "P";
					if(jrbM.isSelected()) tamanho = "M";
					if(jrbG.isSelected()) tamanho = "G";
					
					produtos.add(new Faca(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto, tamanho, tipoFio, tipoLamina, quantidadeFaca));
					
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
					jtfTipoFio.setText("");
					jtfTipoLamina.setText("");
					
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
						!jtfQuantidade.getText().isEmpty() && !jtfTipoFio.getText().isEmpty() && !jtfTipoLamina.getText().isEmpty()) {

					/*BASICAMENTE ESTAMOS PEGANDO O QUE ESTÁ ESCRITO NO JTF OU SELECIONADO NO JRB, E ALTERANDO AS CARACTERÍSTICAS DO
					  PRODUTO SALVO, PARA ASSIM SER POSSÍVEL EDITAR*/
					faca.setPreco(Float.parseFloat(jtfPreco.getText()));
					faca.setQuantidadeFaca(Integer.parseInt(jtfQuantidade.getText()));
					faca.setGarantia(Integer.parseInt(jtfGarantia.getText()));
					faca.setCodigo(jtfCodigo.getText());
					faca.setFabricante(jtfFabricante.getText());
					faca.setMarca(jtfMarca.getText());
					faca.setLocalOrigem(jtfLocalOrigem.getText());
					faca.setCor(jtfCor.getText());
					faca.setAnoModelo(jtfAnoModelo.getText());
					faca.setAnoFabricacao(jtfAnoFabricacao.getText());
					faca.setTipoFio(jtfTipoFio.getText());
					faca.setTipoLamina(jtfTipoLamina.getText());

					if(jrbP.isSelected()) faca.setTamanho("P");
					if(jrbM.isSelected()) faca.setTamanho("M");
					if(jrbG.isSelected()) faca.setTamanho("G");
					
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
				jtfTipoFio.setText("");
				jtfTipoLamina.setText("");
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
			indice = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Índice da Faca a Ser Alterada"));
			/*SE O ÍNDICE COLOCADO INSTANCIAR-SE DE UMA FACA (FOR DE UMA FACA), ELE VAI CAIR NO IF, CASO O CONTRÁRIO, CAIRÁ NO ELSE*/
			if (produtos.get(indice-1) instanceof Faca) {
				faca = (Faca) produtos.get(indice-1);

				/*SETTA OS JTFs E JRBs DE ACORDO COM O QUE FOI CADASTRADO E SALVO NA MATRIZ*/
				
				jtfAnoFabricacao.setText(faca.getAnoFabricacao());
				jtfAnoModelo.setText(faca.getAnoModelo());
				jtfCodigo.setText(faca.getCodigo());
				jtfCor.setText(faca.getCor());
				jtfFabricante.setText(faca.getFabricante());
				jtfGarantia.setText(String.valueOf(faca.getGarantia()));
				jtfLocalOrigem.setText(faca.getLocalOrigem());
				jtfMarca.setText(faca.getMarca());
				jtfPreco.setText(String.valueOf(faca.getPreco()));
				jtfQuantidade.setText(String.valueOf(faca.getQuantidadeFaca()));
				jtfTipoLamina.setText(faca.getTipoLamina());
				jtfTipoFio.setText(faca.getTipoFio());
				
				if(faca.getTamanho().equals("P")) jrbP.setSelected(true);
				if(faca.getTamanho().equals("M")) jrbM.setSelected(true);
				if(faca.getTamanho().equals("G")) jrbG.setSelected(true);

			} else {
				JOptionPane.showMessageDialog(null, "O Índice Inserido não Pertence a uma Faca", "Alterar", JOptionPane.WARNING_MESSAGE);
			}

		} catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Índice Inexistente", "Alterar", JOptionPane.ERROR_MESSAGE);
		}
		catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "O indice não pode estar vazio");
		}

	}
}
