public class LoopShape {

    static void draw_square(int base, int altura)
    {
        boolean pont_line = false;
        String msg = "";

        for (int line=1;line < altura+1;line++)
        {
            if (line == 1 || line == altura)
            {
                pont_line = true;
            };

            for (int colunm=1; colunm < base+1;colunm++ )
            {
                if (pont_line)
                {
                    msg += "#";
                }

                else
                {
                    if (colunm == 1 || colunm == base){msg += "#"; continue;}
                    msg += " ";
                }
            }
            System.out.println(msg);
            msg = "";
            pont_line = false;
        }
    }

    static void draw_triangulo(int num)
    {
        String msg = "";

        for (int line=1; line < num+1;line++)
        {
            for(int colunm=1; colunm < line+1;colunm++)
            {
                if (line == num) {msg += "#"; continue;}

                else if (line >= 3)
                {
                    if(colunm == 1 || colunm == line){msg += "#"; continue;}
                    msg += " ";
                }

                else{msg += "#";}
            }

            System.out.println(msg);
            msg = "";
        }
    }

    public static void main(String[] args)
    {
        draw_square(10, 10);
        System.out.println();
        draw_triangulo(10);
    }
}
