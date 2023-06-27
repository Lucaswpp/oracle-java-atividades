import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Jogo
{
    private double temperatura_ambiente;
    private int probabilidade_gol;
    Random random;
    ArrayList<Equipe> times;
    public int consec_frio;
    
    public Jogo(Equipe[] time)
    {
        times = new ArrayList<Equipe>(Arrays.asList(time));
        probabilidade_gol = 15;
        temperatura_ambiente = 37;
        random = new Random();
    }

    public void start_partida(Equipe n1, Equipe n2)
    {
        String status = "";
        boolean decisao = false;
        int[] resultado = calcTotGol();
        

        if (resultado[0] == resultado[1]) {status = "Empate";}
        else{decisao = resultado[0] >  resultado[1] ? true : false;}
        
        System.out.println("Temperatura: "+this.temperatura_ambiente+"°");
        System.out.println(n1.get_nome_equipe()+" X "+n2.get_nome_equipe());
        System.out.println(""+resultado[0]+"  -  "+resultado[1]);

        if (status.equals("Empate")) 
        {
            System.out.println("Jogo empatado");
            n1.numero_empates += 1;
            n2.numero_empates += 1;
        }


        else if (decisao)
        {
            System.out.println("O time "+n1.get_nome_equipe()+" ganhou");
            n1.numero_vitorias += 1;
            n2.numero_derrotas += 1;
        }

        else
        {
            System.out.println("O time "+n2.get_nome_equipe()+" ganhou");   
            n1.numero_derrotas += 1;
            n2.numero_vitorias += 1;
        }
    }

    public void setRandomTemperatura()
    {
        this.temperatura_ambiente = random.nextInt(39);

        if (this.temperatura_ambiente < 17) {this.probabilidade_gol = 60; this.consec_frio += 1;}
        else {this.probabilidade_gol = 15; this.consec_frio = 0;}
    }

    public Equipe[] random_battle_times()
    {
        int id_time_1 = random.nextInt(0,6);
        int id_time_2 = random.nextInt(0,6);

        Equipe[] time_battle = {times.get(id_time_1),times.get(id_time_2)};

        return time_battle;
    }

    public int[] calcTotGol()
    {
        int time1 = 0;
        int time2 = 0;

        int[] gols = new int[2];

        for(int i=0;i < 16;i++)
        {
            if (this.probabilidade_gol > random.nextInt(100))
            {
                Boolean decisao = random.nextBoolean();

                if (decisao){time1 += 1;}

                else{time2 += 1;}
            }
        }

        gols[0] = time1;
        gols[1] = time2;

        return gols;
    }

    public void listar_classificacao()
    {
        System.out.println();
        for (Equipe equipe : times)
        {
            System.out.println(equipe.nome_equipe+" vitorias: "+equipe.numero_vitorias+" derrotas: "+equipe.numero_derrotas+" empates: "+equipe.numero_empates);
        }
    }
}