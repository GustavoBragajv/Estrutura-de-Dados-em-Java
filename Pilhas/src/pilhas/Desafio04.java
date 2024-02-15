import java.util.Stack;

public class Desafio04 {
    public static void main(String[] args) {
        System.out.println("Desafio 08: Torre de Hanoi");

        Stack<Integer> pilhaOriginal = new Stack<Integer>();
        Stack<Integer> pilhaDestino = new Stack<Integer>();
        Stack<Integer> pilhaAuxiliar = new Stack<Integer>();

        pilhaOriginal.push(4);
        pilhaOriginal.push(3);
        pilhaOriginal.push(2);
        pilhaOriginal.push(1);


        torreHanoi(pilhaOriginal.size(), pilhaOriginal, pilhaDestino, pilhaAuxiliar);
    }


    public static void torreHanoi(int n, Stack<Integer> pilhaOriginal, Stack<Integer> pilhaDestino,
                                  Stack<Integer> pilhaAuxiliar) {
        if(n > 0) {
            torreHanoi(n - 1, pilhaOriginal, pilhaAuxiliar, pilhaDestino);
            pilhaDestino.push(pilhaOriginal.pop());
            System.out.println("========================");
            System.out.println("Pilha Original: " + pilhaOriginal);
            System.out.println("Pilha Destino: " + pilhaDestino);
            System.out.println("Pilha Auxiliar: " + pilhaAuxiliar);
            torreHanoi(n - 1, pilhaAuxiliar, pilhaDestino, pilhaOriginal);
        }
    }

}
