import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    static Equipe[] load_times()
    {
        Equipe[] equipes = new Equipe[7];

        equipes[0] = new Equipe("Barcelona");
        equipes[1] = new Equipe("Real madrid");
        equipes[2] = new Equipe("Paris saint germain");
        equipes[3] = new Equipe("Arsenal");
        equipes[4] = new Equipe("inter de milão");
        equipes[5] = new Equipe("manchester city");
        equipes[6] = new Equipe("chelsea");

        return equipes;
    }


    public static void main(String[] args)
    {
        Boolean is_ativo = true;
        Jogo jogo = new Jogo(load_times());
        while (is_ativo)
        {
            System.out.println("Bem vindo a liga dos campeões");

            System.out.println("Você quer ver o jogo dessa semana?");
            new Scanner(System.in).nextLine();
            System.out.println();
            Equipe[] batlle = jogo.random_battle_times();
            
            jogo.start_partida(batlle[0],batlle[1]);


            if (jogo.consec_frio > 3){is_ativo = false;}
            jogo.setRandomTemperatura();
        }
        
        System.out.println("\nA temporada de jogos acabou!!!\n");

        jogo.listar_classificacao();
    }
}