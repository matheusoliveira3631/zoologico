import java.util.Scanner;

/*
 * Classe que trata a interface com o usuário (menu de opções)
 */
public class InterfaceUsuario {

    // Scanner para obter dados do usuário via terminal
    private Scanner entrada;
    private Zoologico zoologico;

    /* 
     * Construtor da classe
     */
    public InterfaceUsuario() {
        entrada = new Scanner(System.in);
        this.zoologico=new Zoologico();
    }

    /*
     * Método que trata o loop de exibição e tratamento do menu
     */
    public void executar() {
        int opcao;
        do {
            exibirMenu();
            
            System.out.println("\nDigite sua opção: ");
            opcao = Integer.parseInt(entrada.nextLine());

            tratarMenu(opcao);

        } while (opcao != 5);

        // fecha o objeto Scanner para liberar os seus recursos
        entrada.close();
    }

    /*
     * Método que exibe as opções de menu
     */
    public void exibirMenu() {
        System.out.println("1 - Cadastrar animal");
        System.out.println("2 - Descrever animal");
        System.out.println("3 - Listar animais");        
        System.out.println("4 - Listar animais completo");
        System.out.println("5 - Sair");
    }

    /*
     * Método que trata uma opção de menu escolhida pelo usuário
     */
    private void tratarMenu(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarAnimal();
                break;
            case 2:
                descreverAnimal();
                break;
            case 3:
                listarAnimais();
                break;
            case 4:
                listarAnimaisCompleto();
                break;
            case 5:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        // se o usuário não estiver saindo do programa, pede para ele digitar ENTER antes de exibir o menu novamente
        if (opcao != 5) {
            System.out.println("\nDigite ENTER para continuar!");
            entrada.nextLine();
        }
    }

    /*
     * Método auxiliar que obtém uma String do usuário
     */
    private String pedirString(String instrucao) {
        System.out.print(instrucao + ": ");
        String informacao = entrada.nextLine();
        return informacao;
    }



    /*
     * Trata a opção de menu: Cadastrar Animal
     */
    private void cadastrarAnimal() {
        // implemente seu código aqui.
        String nome = pedirString("Digite o nome do animal");
        String especie = pedirString("Digite a espécie do animal");
        boolean voaBem;
        switch (especie) {
            case "tucano":
            {
                String voo = pedirString("Voa bem? (S/N))");
                if (voo.equals("S")) {
                    voaBem = true;
                } else {
                    voaBem = false;
                }
                zoologico.addTucano(nome, voaBem);
                break;
            }
            case "tigre":
                String listras = pedirString("Digite o tipo de pelo do tigre");
                zoologico.addTigre(nome, listras);
                break;
            case "chimpanze":
                String pelo = pedirString("Digite o tipo de pelo do chimpanze");
                zoologico.addChimpanze(nome, pelo);
                break;
            case "avestruz":
            {
                String voo = pedirString("Voa bem? (S/N))");
                if (voo.equals("S")) {
                    voaBem = true;
                } else {
                    voaBem = false;
                }
                zoologico.addAvestruz(nome, voaBem);
                break;
            }
            default:
                System.out.println("Espécie inválida!");
                break;
        }

    }

    /*
     * Trata a opção de menu: Descrever Animal
     */
    private void descreverAnimal() {
        String nomeAnimal=pedirString("Digite o nome do animal");
        Animal animal=zoologico.buscaAnimal(nomeAnimal);
        System.out.println(animal.getDescricaoCompleta());
    }

    /*
     * Trata a opção de menu: Listar Animais
     */
    private void listarAnimais() {
        System.out.println(zoologico.getDescricoesResumidas());
    }

    /*
     * Trata a opção de menu: Listar Animais
     */
    private void listarAnimaisCompleto() {
        System.out.println(zoologico.getDescricoesCompletas());
    }
}