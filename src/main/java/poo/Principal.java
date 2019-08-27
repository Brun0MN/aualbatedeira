package poo;

import javax.xml.transform.stream.StreamSource;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Olá mundo");

        Contador c = new Contador();
        Contador d = new Contador();

        System.out.println("Valor atual: " + c.getValorAtual());
        c.incrementa();
        System.out.println("Valor atual: " + c.getValorAtual());

        System.out.println("Valor atual: " + d.getValorAtual());



    }
}
