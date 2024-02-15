import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaTeste {
    public static void main(String[] args) {
        /*

        Fila<Integer> fila = new Fila<Integer>();

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho);


        fila.enfileirarElementos(0);
        fila.enfileirarElementos(3);
        fila.enfileirarElementos(1);
        fila.enfileirarElementos(2);


        System.out.println();

        System.out.println(fila.toString());
        System.out.println(fila.espiarElementoFila());

        System.out.println();

        System.out.println(fila.desenfileirarElementoFila());
        System.out.println(fila.tamanho);
        System.out.println(fila.toString());

        System.out.println();
        System.out.println("fila QUEUE");
        Queue<Integer> novaFila = new LinkedList<Integer>();

        novaFila.add(1);
        novaFila.add(2);
        novaFila.add(3);

        System.out.println(novaFila.toString());
        System.out.println(novaFila.peek());
        System.out.println(novaFila.remove());
        System.out.println(novaFila.toString());

         */

        /*
        System.out.println();
        System.out.println("Fila com prioridade");




        FilaComPrioridade<Integer> fila3 = new FilaComPrioridade<>();

        System.out.println(fila3.toString());
        System.out.println(fila3.tamanho);


        fila3.enfileirarElementos(1);
        fila3.enfileirarElementos(3);
        fila3.enfileirarElementos(2);
        fila3.enfileirarElementos(5);
        fila3.enfileirarElementos(4);
        System.out.println(fila3.espiarElementoFila());
        System.out.println(fila3.toString());

         */

        Queue<Integer> filaComPrioridade = new PriorityQueue<Integer>();

        filaComPrioridade.add(1);
        filaComPrioridade.add(3);
        filaComPrioridade.add(2);

        System.out.println(filaComPrioridade.toString());
    }
}