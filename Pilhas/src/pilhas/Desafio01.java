import java.util.Stack;

public class Desafio01 {
    public static void main(String[] args) {
        System.out.println("Desafio do Palímdromo");

        imprimirResultado("ADA");
        imprimirResultado("Socorram me subino ônibus em Marrocos");
        imprimirResultado("Socorram me subino onibus em Marrocos");
        imprimirResultado("lava esse aval");
        imprimirResultado("Aça");
        imprimirResultado("Aranha aranha ra");


    }


    public static void imprimirResultado(String palavra) {
        System.out.println("A palavra " + palavra + " é Palímdromo? " + testarPalimdromo(palavra));
    }


    public static boolean testarPalimdromo(String palavra) {
        Stack<Character> pilha = new Stack<Character>();

        for(int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }


        String palavraInversa = "";

        while(!pilha.isEmpty()) {
            palavraInversa += pilha.pop();
        }


        if(palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;
    }

}
