package pilhas;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pilhas<Integer> pilhaPar = new Pilhas<Integer>(10);
        Pilhas<Integer> pilhaImpar = new Pilhas<Integer>(10);


        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite um valor: ");
            int num = teclado.nextInt();

            if(num == 0) {
                Integer desempilhado = pilhaPar.desmpilharElemento();

                // Pilha par
                if(desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Desempilhando o " + desempilhado + " da pilha Par");
                }


                desempilhado = pilhaImpar.desmpilharElemento();

                // Pilha ímpar
                if(desempilhado == null) {
                    System.out.println("Pilha ímpar está vazia");
                } else {
                    System.out.println("Desempilhando o " + desempilhado + " da pilha Ímpar");
                }

            } else {
                if(num % 2 == 0) {
                    pilhaPar.empilharElemento(num);
                } else {
                    pilhaImpar.empilharElemento(num);
                }
            }

        }

        System.out.println("Desempilhando todos os números da pilha Par");
        while(!pilhaPar.estaVazia()) {
            System.out.println(pilhaPar.desmpilharElemento());
        }

        System.out.println("======================================");
        System.out.println("Desempilhando todos os números da pilha Ímpar");
        while(!pilhaImpar.estaVazia()) {
            System.out.println(pilhaImpar.desmpilharElemento());
        }
    }
}
