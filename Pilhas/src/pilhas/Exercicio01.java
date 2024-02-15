package pilhas;


import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Pilhas<Integer> pilha = new Pilhas<Integer>(10);
        Scanner teclado = new Scanner(System.in);

        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            int num = teclado.nextInt();


            if(num % 2 == 0) {
                System.out.println("Empilhando o número: " + num);
                pilha.empilharElemento(num);
            } else {
                Integer desempilhando = pilha.desmpilharElemento();

                if(desempilhando == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número ímpar, o elemento " + desempilhando +
                            " foi desempilhado da pilha.");
                }
            }
        }

        System.out.println("Mostrando todos os números que foram empilhados.");

        while(!pilha.estaVazia()) {
            System.out.println("Desempilhando os números da pilha: " + pilha.desmpilharElemento());
        }

    }
}
