package Onze;

public class Mosca extends Animal
{
    public int qtdPatas;
    
    @Override
    public String toString()
    {
        return "MOSCA "
                + "\nEspécie:" + especie
                + "\nCor: " + cor
                + "\nNo de Patas: " + qtdPatas;
    }
}
