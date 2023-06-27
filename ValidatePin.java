import java.util.Scanner;

public class ValidatePin {

    static void pin_bancario_loop()
    {
        int pin = 0;

        while(pin != 123321)
        {
            System.out.println("Digite o pin: ");
            pin = new Scanner(System.in).nextInt();

            String msg = pin == 123321 ? "válido": "inválido!!!";

            System.out.println("O pin digitado é "+msg+"\n");

        }
    }


    public static void main(String[] args)
    {
        pin_bancario_loop();
    }
}
