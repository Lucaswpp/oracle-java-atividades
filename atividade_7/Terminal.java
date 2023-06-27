import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Terminal
{
    static ArrayList<Cartao> cartoes_registrados = new ArrayList<>();
    static ArrayList<Jogos> jogos_registrados = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    static void limpar_tela()
    {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void Transferir_credito()
    {
        System.out.println("Digite a quantidade de creditos que deseja enviar: ");
        int credito = input.nextInt();

        System.out.println("\nid do cartão remetente: ");
        int first_id = input.nextInt();

        System.out.println("\nid do cartão de destino: ");
        int last_id = input.nextInt();

        if (cartoes_registrados.get(first_id).credito - credito < 0) {System.out.println("Creditos insuficiente"); return;}

        cartoes_registrados.get(first_id).credito -= credito;

        cartoes_registrados.get(last_id).credito += credito;

        System.out.println("\nResultado da transferençia: ");
        System.out.println();
        System.out.println("creditos do cartão de "+cartoes_registrados.get(first_id).nome+": "+cartoes_registrados.get(first_id).credito);
        System.out.println("creditos do cartão de "+cartoes_registrados.get(last_id).nome+": "+cartoes_registrados.get(last_id).credito);
    }

    static void exibir_status_cartao()
    {
        System.out.print("Digite o id do seu cartão: ");
        int id_cartao = input.nextInt();

        Cartao cartao = Terminal.cartoes_registrados.get(id_cartao);

        System.out.println();
        System.out.println("Descrição do cartão: ");
        System.out.println("Nome do dono do cartão: "+cartao.nome);
        System.out.println("Id do cartão: "+cartao.id);
        System.out.println("Quantidade de creditos: "+cartao.credito);
        System.out.println("Quantidade de ticktes: "+cartao.ticktes);
    }

    static void Carregar_credito()
    {
        System.out.println("Digite o valor que você que converte em creditos: ");
        int dinheiro = input.nextInt();

        System.out.println("\nDigite o id do cartão: ");
        int id = input.nextInt();

        Cartao cartao = cartoes_registrados.get(id);

        cartao.credito += dinheiro*2;

        System.out.println(dinheiro*2+" adicionado na cartão de "+cartao.nome);
        
    }

    static void jogar()
    {
        int valor = 0;
        System.out.println("Digite o id do seu cartão: ");
        int id_cartao = input.nextInt();
        System.out.println();

        System.out.println("Tabelas de jogos: ");
        System.out.println();

        System.out.println("[0] Space invaders 50 creditos");
        System.out.println("[1] Snake game 90 creditos");
        System.out.println("[2] Tetris 25 creditos");

        System.out.print("Digite qual jogo você que jogar ?");
        int decisao = input.nextInt();

        switch(decisao)
        {
            case 0:
                valor = 50;
                break;

            case 1:
                valor = 90;
                break;
            
            case 2:
                valor = 25;
                break;
        }

        if (cartoes_registrados.get(id_cartao).credito - valor < 0) {System.out.println("Creditos insuficientes!!!"); return;}
        
        int random_ticktes = new Random().nextInt(300);
        System.out.println("Parabéns você ganhou "+random_ticktes+" ticktes!!!");

        cartoes_registrados.get(id_cartao).credito -= valor;
        cartoes_registrados.get(id_cartao).ticktes += random_ticktes;

    }

    static void exibir_premios()
    {
        int valor = 0;
        System.out.println("Digite o id do seu cartão: ");
        int id_cartao = input.nextInt();
        System.out.println();

        System.out.println("Escolha um prêmio: ");
        System.out.println("[0] ursinho de pélucia: 300 ticktes");
        System.out.println("[1] Anel de brinquedo: 400 ticktes");
        System.out.println("[2] Pastel: 600 ticktes");

        System.out.println();

        System.out.println("Digite seu prêmio: ");
        int decisao = input.nextInt();

        switch(decisao)
        {
            case 0:
                valor = 300;
                break;
            
            case 1:
                valor = 400;
                break;
            
            case 2:
                valor = 600;
                break;
        }

         if (cartoes_registrados.get(id_cartao).ticktes - valor < 0) {System.out.println("ticktes insuficientes!!!"); return;}

         cartoes_registrados.get(id_cartao).ticktes -= valor;

         System.out.println("Comprar efetuada com sucesso!!!");

    }


    static void Terminal_loop()
    {
    
        while (true)
        {
            System.out.println("Fliperama bomd+\n");

            System.out.println("Digite qual tipo de serviço deseja: \n");

            System.out.println(" [0] Carregar creditos\n [1] Transferir creditos\n [2] Comprar prêmios\n [3] Verificar status do cartão\n [4] jogar video-games");

            System.out.print("\nDigite o n° do serviço: ");
            int server = input.nextInt();
            System.out.println();

            switch(server)
            {
                case 0:
                    Carregar_credito();
                    break;
                
                
                case 1:
                    Transferir_credito();
                    break;
                
                case 2:
                    exibir_premios();
                    break;
                
                case 3:
                    exibir_status_cartao();
                    break;
                
                case 4:
                    jogar();
                    break;
                
                default:
                    System.out.println("Coloque uma opção valida!!!");
                    break;
                
            }

            new Scanner(System.in).nextLine();

            limpar_tela();
        }
    }
}