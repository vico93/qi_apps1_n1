package Onze;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        
        Cachorro toto = new Cachorro();
        Papagaio kea = new Papagaio();
        Mosca jeff = new Mosca();
        
        System.out.println("CACHORRO");
        System.out.print("Digite a Espécie: ");
        toto.especie = stdin.next();
        System.out.print("Digite a cor: ");
        toto.cor = stdin.next();
        System.out.print("Digite a cor do pelo: ");
        toto.corPelo = stdin.next();
        
        System.out.println("PAPAGAIO");
        System.out.print("Digite a Espécie: ");
        kea.especie = stdin.next();
        System.out.print("Digite a cor: ");
        kea.cor = stdin.next();
        System.out.print("Digite a cor das penas: ");
        kea.corPena = stdin.next();
        
        System.out.println("Mosca");
        System.out.print("Digite a Espécie: ");
        jeff.especie = stdin.next();
        System.out.print("Digite a cor: ");
        jeff.cor = stdin.next();
        System.out.print("Digite a quantidade de patas: ");
        jeff.qtdPatas = stdin.nextInt();
        
        System.out.println("\n");
        System.out.println(toto);
        System.out.println(kea);
        System.out.println(jeff);
    }
}
