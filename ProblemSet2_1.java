public class ProblemSet2_1 {
    public static void main(String[] args) {
        //Use 8 print statements to print a smiley face.
        //Your art will rely on only a single character, besides space, such as X or #.
        String[][] matriz = 
        {
            {" "," ","#","#","#","#"," "," "},
            {" ","#"," "," "," "," ","#"," "},
            {"#"," ","#"," "," ","#"," ","#"},
            {"#"," "," "," "," "," "," ","#"},
            {"#"," ","#"," "," ","#"," ","#"},
            {"#"," "," ","#","#"," "," ","#"},
            {" ","#"," "," "," "," ","#"," "},
            {" "," ","#","#","#","#","#"," "},

        };

        for (int i1=0;i1 <= 7;i1++)
        {
            for (int i2=0;i2 <= 7;i2++)
            {
                System.out.print(matriz[i1][i2]);
            }

            System.out.println();
        }
    }   
}
