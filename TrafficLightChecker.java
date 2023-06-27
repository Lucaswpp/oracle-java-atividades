import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrafficLightChecker {

    static void loop_semaforo()
        {
            Scanner input = new Scanner(System.in);
            Map<Integer,String> cor_list = new HashMap<>();
            cor_list.put(1, "Vermelho");
            cor_list.put(2, "Verde");
            cor_list.put(3,"Amarelo" );

            while (true)
            {
                int cor = input.nextInt();

                if (cor == 1)
                {
                    cor = 2;
                }

                else if (cor == 3)
                {
                    cor = 1;
                }

                else if (cor == 2)
                {
                    cor = 3;
                }

                else
                {
                    System.out.println("Cor invalida!!!");
                    continue;
                }
                

                System.out.println("A cor do sémaforo é "+cor_list.get(cor));
            }
        }

    public static void main(String args[])
    {
        loop_semaforo();
    }

}
