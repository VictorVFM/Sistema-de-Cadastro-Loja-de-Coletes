package telas;

import java.awt.Container;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import arquivos.LerEscreverArquivos;
import classes.Produtos;
import classes.Usuarios;
import paineis.PainelCadastrarBarco;
import paineis.PainelCadastrarBoia;
import paineis.PainelCadastrarColete;
import paineis.PainelCadastrarFaca;
import paineis.PainelCadastrarKit;
import paineis.PainelCadastrarLanterna;
import paineis.PainelCadastrarPederneira;
import paineis.PainelMostrarEstoque;
import paineis.PainelMostrarUsuarios;
import paineis.PainelPesquisarCodigo;
import paineis.PainelPesquisarMarca;
import paineis.PainelSobreAPP;
import paineis.PainelSobreMim;

@SuppressWarnings("serial")
public class TelaAtivaNautilus extends JFrame{
	
	private Container contentPane;
	private JLabel jlImagem;
	private ImageIcon imagem;
	private JMenuBar jmbMenu;
	private JMenu jmEstoque, jmArquivo, jmAddProduto, jmEditarProduto, jmDiversos, jmEditarDiversos, jmPesquisarProduto, jmUsuarios, jmExibir,jmSobre;
	private JMenuItem  jmiMostrarEstoque, jmiSair, jmiBarco, jmiBoia, jmiColete, jmiFaca, jmiKit, jmiLanterna,  
					  jmiVerUsuarios,jmiPederneira, jmiEditarBarco, jmiEditarBoia, jmiEditarColete, jmiEditarFaca, jmiEditarKit,
					  jmiEditarLanterna, jmiEditarPederneira, jmiPesquisarMarca, jmiPesquisarCodigo, jmiSobreMim,jmiSobreApp;
	
	public List<Produtos> produtos = new ArrayList<>(); /* LISTA DINÂMICA DA CLASSE PRODUTOS */
	
	LerEscreverArquivos produto = new LerEscreverArquivos("Produtos.bin"); 
	
	public TelaAtivaNautilus(String title) {
		super(title);

		setSize(450, 370); /*DEFININDO O TAMANHO*/
		 /*DEFININDO A COR DE FUNDO*/
		setLocationRelativeTo(null); /*CENTRALIZA A TELA*/
		setResizable(false); /*NÃO PERMITE QUE O ******* (PALAVRA PROIBIDA) POSSA MEXER NO TAMANHO*/
		
		dispose();
		abrirArquivo();
		iniciarComponentes();
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); /*FAZ COM QUE O BOTÃO DO X NÃO SEJA USADO PARA SAIR DO APP*/
	}

	/*MÉTODO QUE VAI LER A NOSSA MATRIZ SALVA*/
	private void abrirArquivo() {
		if (produto.lerArquivos() != null) {
			produtos = produto.lerArquivosProdutos();
		}
	}

	private void iniciarComponentes() {
		
		/*--------------------------------------CRIANDO OBJETOS--------------------------------------*/
		contentPane = getContentPane();
		jmbMenu = new JMenuBar();
		setJMenuBar(jmbMenu);
		
		jmEstoque = new JMenu("Estoque");
		jmArquivo = new JMenu("Arquivo");
		jmAddProduto = new JMenu("Adicionar Produto");
		jmEditarProduto = new JMenu("Editar Produto");
		jmDiversos = new JMenu("Diversos");
		jmEditarDiversos = new JMenu("Diversos");
		jmUsuarios = new JMenu("Usuários");
		jmPesquisarProduto = new JMenu("Pesquisar Produto");
		jmExibir = new JMenu("Exibir");
		jmSobre = new JMenu("Sobre");

		jmiSair = new JMenuItem("Sair");
		
		jmiVerUsuarios = new JMenuItem("Ver Usuários");

		jmiPesquisarMarca = new JMenuItem("Marca");
		jmiPesquisarCodigo = new JMenuItem("Código");
		
		jmiMostrarEstoque = new JMenuItem("Mostrar Estoque");
		
		jmiSobreMim = new JMenuItem("Sobre mim");
		jmiSobreApp = new JMenuItem("Sobre o APP");
		
		jmiBarco = new JMenuItem("Barco");
		jmiBoia = new JMenuItem("Boia");
		jmiColete = new JMenuItem("Colete");
		jmiFaca = new JMenuItem("Faca");
		jmiKit = new JMenuItem("Kit Socorros");
		jmiLanterna = new JMenuItem("Lanterna");
		jmiPederneira = new JMenuItem("Pederneira");
		
		jmiEditarBarco = new JMenuItem("Barco");
		jmiEditarBoia = new JMenuItem("Boia");
		jmiEditarColete = new JMenuItem("Colete");
		jmiEditarFaca = new JMenuItem("Faca");
		jmiEditarKit = new JMenuItem("Kit Socorros");
		jmiEditarLanterna = new JMenuItem("Lanterna");
		jmiEditarPederneira = new JMenuItem("Pederneira");
		
		imagem = new ImageIcon(getClass().getResource("/img/background3.jpg"));
		jlImagem = new JLabel(imagem);
		
		/*--------------------------------------ADICIONANDO COMPONENTES--------------------------------------*/
		add(jlImagem);
		jmbMenu.add(jmArquivo);
		jmbMenu.add(jmEstoque);
		jmbMenu.add(jmExibir);
		jmbMenu.add(jmUsuarios);
		jmbMenu.add(jmSobre);
		
		jmSobre.add(jmiSobreMim);
		jmSobre.add(jmiSobreApp);
		
		jmArquivo.add(jmiSair);
		
		jmUsuarios.add(jmiVerUsuarios);
		
		jmEstoque.add(jmAddProduto);
		jmEstoque.add(jmEditarProduto);
		
		jmExibir.add(jmPesquisarProduto);
		jmExibir.add(jmiMostrarEstoque);
		
		jmPesquisarProduto.add(jmiPesquisarMarca);
		jmPesquisarProduto.add(jmiPesquisarCodigo);
		
		jmAddProduto.add(jmDiversos);
		jmAddProduto.add(jmiBoia);
		jmAddProduto.add(jmiColete);
		
		jmDiversos.add(jmiBarco);
		jmDiversos.add(jmiFaca);
		jmDiversos.add(jmiKit);
		jmDiversos.add(jmiLanterna);
		jmDiversos.add(jmiPederneira);
		
		jmEditarProduto.add(jmEditarDiversos);
		jmEditarProduto.add(jmiEditarBoia);
		jmEditarProduto.add(jmiEditarColete);
		
		jmEditarDiversos.add(jmiEditarBarco);
		jmEditarDiversos.add(jmiEditarFaca);
		jmEditarDiversos.add(jmiEditarKit);
		jmEditarDiversos.add(jmiEditarLanterna);
		jmEditarDiversos.add(jmiEditarPederneira);
		
		jlImagem.setBounds(0, 0, 450,370);
	}

	/*PASSANDO UMA LISTA DE USUÁRIOS PELO MÉTODO INICIAR EVENTOS, PARA QUE OS DADOS DESSA LISTA POSSAM SER UTILIZADOS NO PAINEL USUÁRIOS*/
	public void iniciarEventos(List<Usuarios> usuarios) {
		
		/*-------------------------AÇÕES DO "BOTÃO" SAIR--------------------------------*/
		
		jmiSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Gostaria de Salvar e Sair os Dados Feitos?");
				
				if(resposta == 0) { /* 0 = "SIM" */
					produto.escreverArquivosProdutos(produtos);
				}
				
				System.exit(0);
			}
		});
		
		/*-------------------------AÇÕES DO "BOTÃO" PESQUISAR PRODUTO--------------------------------*/
		
		jmiPesquisarMarca.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelPesquisarMarca marca = new PainelPesquisarMarca(produtos);
				
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(marca); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiSobreMim.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               PainelSobreMim sobre = new PainelSobreMim();
            		   

       		contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
       		contentPane.add(sobre); /*ADICIONA O PAINEL QUE QUEREMOS*/
       		contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
            }
        });
		
		jmiSobreApp.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               PainelSobreAPP sobreapp = new PainelSobreAPP();
            		   

       		contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
       		contentPane.add(sobreapp); /*ADICIONA O PAINEL QUE QUEREMOS*/
       		contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
            }
        });
		
		jmiPesquisarCodigo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelPesquisarCodigo codigo = new PainelPesquisarCodigo(produtos);
				
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(codigo); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		/*-------------------------AÇÕES DO "BOTÃO" MOSTRAR ESTOQUE--------------------------------*/
		
		jmiMostrarEstoque.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelMostrarEstoque estoque = new PainelMostrarEstoque(produtos);
				
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(estoque); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		/*-------------------------AÇÕES DO "BOTÃO" VER USUÁRIO--------------------------------*/
		
		jmiVerUsuarios.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelMostrarUsuarios usuario = new PainelMostrarUsuarios(usuarios);
				
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(usuario); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		/*-------------------------AÇÕES DO "BOTÃO" CADASTRAR--------------------------------*/
		
		jmiBarco.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarBarco barco = new PainelCadastrarBarco(produtos);
				
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(barco); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiBoia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarBoia boia = new PainelCadastrarBoia(produtos);
				
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(boia); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiColete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarColete colete = new PainelCadastrarColete(produtos);
				
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(colete); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiFaca.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarFaca faca = new PainelCadastrarFaca(produtos);
				
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(faca); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiKit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarKit kit = new PainelCadastrarKit(produtos);
				
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(kit); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiLanterna.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarLanterna lanterna = new PainelCadastrarLanterna(produtos);
				
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(lanterna); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiPederneira.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarPederneira pederneira = new PainelCadastrarPederneira(produtos);
				
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(pederneira); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		/*-------------------------AÇÕES DO "BOTÃO" EDITAR--------------------------------*/
		
		jmiEditarBarco.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarBarco barco = new PainelCadastrarBarco(produtos);
				
				barco.preencherDados();
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(barco); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiEditarBoia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarBoia boia = new PainelCadastrarBoia(produtos);
				
				boia.preencherDados();
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(boia); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiEditarColete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarColete colete = new PainelCadastrarColete(produtos);
				
				colete.preencherDados();
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(colete); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiEditarFaca.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarFaca faca = new PainelCadastrarFaca(produtos);
				
				faca.preencherDados();
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(faca); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiEditarKit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarKit kit = new PainelCadastrarKit(produtos);
				
				kit.preencherDados();
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(kit); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiEditarLanterna.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarLanterna lanterna = new PainelCadastrarLanterna(produtos);
				
				lanterna.preencherDados();
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(lanterna); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
		
		jmiEditarPederneira.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastrarPederneira pederneira = new PainelCadastrarPederneira(produtos);
				
				pederneira.preencherDados();
				contentPane.removeAll(); /*REMOVE TODOS OS COMPONENTES DA TELA*/
				contentPane.add(pederneira); /*ADICIONA O PAINEL QUE QUEREMOS*/
				contentPane.validate(); /*VALIDA TODOS OS COMPONENTES*/
			}
		});
	}
	
	/*---------------------------MAIN DA TELA-------------------------------*/
	public static void main(String[] args) {
		TelaAtivaNautilus tela = new TelaAtivaNautilus("");
		
		tela.setVisible(false); /*SÓ É POSSÍVEL ACESSÁ-LA ATRAVÉS DA TELA DE LOGIN*/
	}
}


