import java.util.Stack;

public class Desafio03 {
    public static void main(String[] args) {
        System.out.println("Desafio 03: Conversão de Decimal para Binario");

        imprimirResultado(25);
        System.out.println();
        imprimirResultado(45);
        System.out.println();
        imprimirResultado(10035);
        System.out.println();
        imprimirResultado(10);
        imprimirResultadoQualquerBase(25, 16);
        imprimirResultadoQualquerBase(10035, 8);

    }


    public static void imprimirResultado(int numero) {
        System.out.println("O número: " + numero + " convertido para binário fica: " + decimalBinario(numero));
    }


    public static void imprimirResultadoQualquerBase(int numero, int base) {
        System.out.println("O número : " + numero + " convertido para a base: " + base +
                " fica: " + decimalQualquerBase(numero, base));
    }



    public static String decimalBinario(int num) {

        Stack<Integer> pilha = new Stack<Integer>();
        String numBinario = "";
        int resto;

        while(num > 0) {
            resto = num % 2;
            pilha.push(resto);
            num /= 2;
        }

        while(!pilha.isEmpty()) {
            numBinario += pilha.pop();
        }
        return numBinario;
    }


    public static String decimalQualquerBase(int num, int base) {
        Stack<Integer> pilha2 = new Stack<Integer>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while(num > 0) {
            resto = num % base;
            pilha2.push(resto);
            num /= base;
        }

        while(!pilha2.isEmpty()) {
            numBase += bases.charAt(pilha2.pop());
        }

        return numBase;
    }
}
