package pilhas;

public class Aula01 {
    public static void main(String[] args) {
        Pilhas<Integer> pilha = new Pilhas<Integer>(1);


        System.out.println(pilha.topoPilha());
        System.out.println(pilha);

        pilha.empilharElemento(5);
        pilha.empilharElemento(10);
        pilha.empilharElemento(35);

        System.out.println(pilha.getTamanho());
        System.out.println(pilha.topoPilha());
        System.out.println(pilha.toString());


        pilha.desmpilharElemento();
        System.out.println(pilha.getTamanho());
        System.out.println(pilha.toString());



    }
}