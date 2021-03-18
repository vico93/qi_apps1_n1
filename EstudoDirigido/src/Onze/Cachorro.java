package Onze;

public class Cachorro extends Animal
{
    public String corPelo;

    @Override
    public String toString()
    {
        return "CACHORRO "
                + "\nEspécie:" + especie
                + "\nCor: " + cor
                + "\nCor do Pelo: " + corPelo;
    }
}
