import java.util.Stack;

public class Desafio02 {
    public static void main(String[] args) {
        System.out.println("Desafio 03: Expressões Matemáticas");
        imprimirResutado("A + b");
        imprimirResutado("5 . ( 64 - 12 : 4 ) ");
        imprimirResutado("480 : { 20 . [ 86 - 12 . (5 + 2 ) ] 2 }");
        imprimirResutado("- [ - 12 - ( - 2 ) ] }");
        imprimirResutado("{[()]} [] () {} }");
        imprimirResutado("{[()]} [] () {}");

    }


    public static void imprimirResutado(String expressao) {
        System.out.println(expressao + " está balaceada? " +
                verificarSimbolos(expressao));
    }


    final static String ABRE = "([{";
    final static String FECHA = ")]}";


    public static boolean verificarSimbolos(String expressao) {
        boolean balanceado = true;

        Stack<Character> pilha = new Stack<Character>();
        int index = 0;
        char simbolo, topo;

        while(index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if(ABRE.indexOf(simbolo) > -1) {
                pilha.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > - 1){
                if(pilha.isEmpty()) {
                    return false;
                } else {
                    topo = pilha.pop();

                    if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

            index++;
        }
        return true;
    }
}
