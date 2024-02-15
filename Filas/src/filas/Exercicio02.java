package filas;


public class Exercicio02 {
    public static void main(String[] args) {
        Filas<String> filaRegular = new Filas<String>();
        Filas<String> filaPrioridade = new Filas<String>();

        final int MAX_PRIORIDADE = 3;


        filaRegular.enfileirarElementos("Pessoa 1");
        filaPrioridade.enfileirarElementos("Pessoa 15P");
        filaRegular.enfileirarElementos("Pessoa 2");
        filaRegular.enfileirarElementos("Pessoa 3");
        filaPrioridade.enfileirarElementos("Pessoa 11P");
        filaRegular.enfileirarElementos("Pessoa 4");
        filaRegular.enfileirarElementos("Pessoa 5");
        filaPrioridade.enfileirarElementos("Pessoa 14P");
        filaRegular.enfileirarElementos("Pessoa 6");
        filaRegular.enfileirarElementos("Pessoa 7");
        filaPrioridade.enfileirarElementos("Pessoa 12P");
        filaRegular.enfileirarElementos("Pessoa 8");
        filaRegular.enfileirarElementos("Pessoa 9");
        filaPrioridade.enfileirarElementos("Pessoa 13P");
        filaRegular.enfileirarElementos("Pessoa 10");


        while(!filaRegular.estaVazia() || !filaPrioridade.estaVazia()) {
            int cont = 0;

            while(!filaPrioridade.estaVazia() && cont < MAX_PRIORIDADE) {
                atenderPessoa(filaPrioridade);
                cont++;
            }

            if(!filaRegular.estaVazia()) {
                atenderPessoa(filaRegular);
            }

            if(filaPrioridade.estaVazia()) {
                while(!filaRegular.estaVazia()) {
                    atenderPessoa(filaRegular);
                }
            }
        }
    }


    public static void atenderPessoa(Fila<String> fila) {
        String pessoaAtendida = fila.desenfileirarElementoFila();
        System.out.println(pessoaAtendida + " foi atendida");
    }
}
