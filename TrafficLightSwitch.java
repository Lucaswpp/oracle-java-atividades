import java.util.Scanner;

public class TrafficLightSwitch {

    static void loop_semaforo_switch() {
            while (true)
            {
                String cor = new Scanner(System.in).nextLine();
                switch (cor)
                {
                    case "Vermelho":
                    cor = "Verde";
                    break;

                    case "Amarelo":
                    cor = "Vermelho";
                    break;

                    case "Verde":
                    cor = "Amarelo";
                    break;

                    default:
                    System.out.println("Cor invalida");
                    continue;
                }
                

        System.out.println("A cor do semáforo é " + cor);
    }
}
    public static void main(String args[])
    {
        loop_semaforo_switch();
    }

}
