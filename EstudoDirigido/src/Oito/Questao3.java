package Oito;

public class Questao3
{
    public double calcular(int n, int x, double valor)
    {
        if (n == 0)
        {
            return (valor + valor * x);
        }
        else
        {
            return (valor - n * x);
        }
    }
}
