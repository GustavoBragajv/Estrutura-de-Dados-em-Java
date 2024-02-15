package filas;

import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        Filas<Integer> filaCrianca = new Filas<Integer>();
        Random aleatorio = new Random();

        for(int i = 0; i < 10; i++) {
            filaCrianca.enfileirarElementos(i);
        }

        int num = 0;
        while(num == 0) {
            num = aleatorio.nextInt(10);
        }

        System.out.println("Número: " + num);

        while(filaCrianca.tamanho() > 1) {
            for(int i = 0; i < num; i++) {
                filaCrianca.enfileirarElementos(filaCrianca.desenfileirarElementoFila());
            }
            System.out.println("Eliminado " + filaCrianca.desenfileirarElementoFila());
        }

        System.out.println("Ganhador: " + filaCrianca.desenfileirarElementoFila());
    }
}
