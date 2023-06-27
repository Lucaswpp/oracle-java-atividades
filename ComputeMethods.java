import java.util.Random;


public class ComputeMethods {
    
    static double convert_celsius(double n)
    {
        double calc =  (n - 32) / 1.8;

        return calc;
    }

    static double calc_hipotenusa(double cateto_1, double cateto_2)
    {
        double h = Math.sqrt((cateto_1*cateto_1)+(cateto_2 * cateto_2));

        return h;
    }

    static int jogar_dados()
    {
        int dado_1 = new Random().nextInt(1,7);
        int dado_2 = new Random().nextInt(1,7);

        return dado_1 + dado_2;
    }

    public static void main(String[] args)
    {
        System.out.println("Convertendo 50°F em: "+convert_celsius(50)+"°C");
        System.out.println();
        System.out.println("cateto oposto:10m \ncateto adjacente:12m\nhipotenusa: "+calc_hipotenusa(10, 12)+"m");
        System.out.println();
        System.out.println("Resultado dos dados jogados: "+jogar_dados());
        System.out.println();
    }

}

