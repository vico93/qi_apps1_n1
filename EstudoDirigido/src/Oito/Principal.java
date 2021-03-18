package Oito;

public class Principal
{
    public static void main(String[] args) {
        Questao3 q1 = new Questao3();
        Questao3 q2 = new Questao3();
        
        System.out.print(q1.calcular(2, 5, 100));
        System.out.print(" e ");
        System.out.print(q2.calcular(0, 5, 100));
    }
}
