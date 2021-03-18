package Dois;

public class Produto
{
    private String nome;
    private double valor;
    
    public double calcularDesconto()
    {
        return (this.valor * 0.025);
    }    
}
