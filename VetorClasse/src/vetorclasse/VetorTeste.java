package vetorclasse;

public class VetorTeste {
    public static void main(String[] args) {
        /*
        VetorClasse vetor = new VetorClasse(3);
        VetorObjetos vetor1 = new VetorObjetos(3);

        //vetor.adicionarElementos("elemento 1");
        //vetor.adicionarElementos("elemento 2");

        try {
            vetor.adicionarElementos("elemento 1");
            vetor.adicionarElementos("elemento 2");
            vetor.adicionarElementos("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println();


        //System.out.println(vetor.getTamanho());
        System.out.println();
        //System.out.println(vetor.toString());
        System.out.println();
        //System.out.println(vetor.buscarElemento(15));

        System.out.println("=====================================");
        System.out.println();
        vetor.adicionarElementos("B");
        vetor.adicionarElementos("C");
        //vetor.adicionarElementos("D");
        vetor.adicionarElementos("E");
        vetor.adicionarElementos("F");
        vetor.adicionarElementos("G");
        System.out.println(vetor.toString());
        vetor.adicionarElementos(0, "A");
        System.out.println(vetor.toString());
        vetor.adicionarElementos(3, "D");
        System.out.println(vetor.toString());

        System.out.println("=====================================");
        System.out.println(vetor.toString());



        System.out.println("=====================================");
        vetor.adicionarElementos("B");
        vetor.adicionarElementos("G");
        vetor.adicionarElementos("D");
        vetor.adicionarElementos("E");
        vetor.adicionarElementos("F");

        System.out.println(vetor.toString());

        //vetor.removerElementos(1);

        //System.out.println(vetor.toString());

        System.out.println("================================================");
        System.out.println("Removendo o elemento G depois de ter feito a busca pelo seu indice.");
        int pos = vetor.buscarElementos("H");
        if(pos >= 0) {
            vetor.removerElementos(pos);
        } else {
            System.out.println("Erro: o elemento a ser removido não existe no vetor.");
        }



        System.out.println(vetor.toString());
        System.out.println("===========================");
        //vetor1.adicionarElementos(3);
        //vetor1.adicionarElementos(4);
        //vetor1.adicionarElementos(6);

        Contatos contato1 = new Contatos("Higor", "1234-4567", "higor@email.com");
        Contatos contato2 = new Contatos("André", "98875-4566", "andre@email.com");
        Contatos contato3 = new Contatos("Paula", "9974565-8975", "paula@email.com");
        Contatos contato4 = new Contatos("Higor", "1234-4567", "higor@email.com");


        vetor1.adicionarElementos(contato1);
        vetor1.adicionarElementos(contato2);
        vetor1.adicionarElementos(contato3);
        System.out.println("Tamanho = " + vetor1.getTamanho());

        int pos = vetor1.buscarElementos(contato4);

        if(pos >= 0) {
            System.out.println("Elemento existe no vetor.");
        } else {
            System.out.println("Elemento não existe no vetor.");
        }
        System.out.println(vetor1.toString());
        System.out.println();


        System.out.println("Trabalhando com listas genericas");
        ListasGenericas<String> vetorGenerico = new ListasGenericas<String>(1);

        vetorGenerico.adicionarElementos("Elemento");

         */

        ListasGenericas<String> lista = new ListasGenericas<String>(5);

        lista.adicionarElementos("A");
        lista.adicionarElementos("B");
        lista.adicionarElementos("C");
        lista.adicionarElementos("D");
        lista.adicionarElementos("A");


        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));

        System.out.println(lista.ultimoIndice("A"));


        System.out.println(lista);
        lista.removerElementos("A");
        System.out.println(lista);

        System.out.println();
        System.out.println(lista.obtemElemento(1));
        System.out.println(lista.obtemElemento(3));

        System.out.println(lista);
        lista.limparElementos();
        System.out.println(lista);

    }
}