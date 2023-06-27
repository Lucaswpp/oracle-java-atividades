import java.util.Scanner;

public class ColorRange {

    static void check_cor_espectro(double n)
    {
        if (n >= 380 && n < 450)
        {
            System.out.println("Violeta");
        }

        else if (n >= 450 && n < 495)
        {
            System.out.println("Azul");
        }

        else if (n >= 495 && n < 570)
        {
            System.out.println("Verde");
        }

        else if (n >= 570 && n < 590)
        {
            System.out.println("Amarelo");
        }

        else if (n >= 590 && n < 620)
        {
            System.out.println("Laranja");
        }

        else if (n >= 620 && n < 750)
        {
            System.out.println("Vermelho");
        }

        else
        {
            System.out.println("o comprimento de onda não está dentro do espectro visivel.");
        }

    }
    public static void main(String args[])
    {
        System.out.println("Digite um  determinado comprimento de onda: ");
        double num = new Scanner(System.in).nextDouble();

        check_cor_espectro(num);
    }
}
