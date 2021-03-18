package Onze;

public class Papagaio extends Animal
{
    public String corPena;

    @Override
    public String toString()
    {
        return "PAPAGAIO "
                + "\nEspécie:" + especie
                + "\nCor: " + cor
                + "\nCor das Penas: " + corPena;
    }    
}
