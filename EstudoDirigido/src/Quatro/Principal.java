package Quatro;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        int cont = 1;
        
        double[] vsal = new double[16];
        
        while (vsal[(cont-1)] != -1)
        {
            System.out.println("Entre com o valor de salários: " +1);
            vsal[cont] = new Scanner(System.in).nextDouble();
            cont = cont+1;
        }
        
    }
}
