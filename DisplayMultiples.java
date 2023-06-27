import java.util.Scanner;

public class DisplayMultiples {

    static void multi_numero()
    {
        System.out.println("Selecione um numero: ");
        int num_multi = new Scanner(System.in).nextInt();

        for(int i=1; i < 11;i++)
        {
            System.out.println(num_multi+" X "+i+" = "+num_multi*i);
        }
    }

    public static void main(String args[])
    {
        multi_numero(); 
    }

}
