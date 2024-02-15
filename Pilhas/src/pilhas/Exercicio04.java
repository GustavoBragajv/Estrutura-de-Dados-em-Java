import java.util.ArrayList;
import java.util.Stack;

public class Exercicio04 {
    public static void main(String[] args) {
        Stack<Livros> pilhaLivros = new Stack<Livros>();
        Livros livro1 = new Livros("8580575397", "Rick Riordan",
                "Ladrão de Raios - Percy Jackson e os Olimpianos", 2005);

        Livros livro2 = new Livros("8532530796", "J.K. Rowling",
                "Harry Potter e a Câmara Secreta", 1998);

        Livros livro3 = new Livros("8543004799", "P.J. Deitel",
                "Java como Programar", 1996);

        Livros livro4 = new Livros("8576088010", "Barry A. Burd",
                "Java para Leigos", 2006);

        Livros livro5 = new Livros("8572839364", "Mary Fulbrook",
                "História Concisa da Alemanha", 1990);


        System.out.println("Empilhando livros: ");
        pilhaLivros.push(livro2);
        pilhaLivros.push(livro3);
        pilhaLivros.push(livro1);
        pilhaLivros.push(livro4);
        pilhaLivros.push(livro5);

        System.out.println("Ao todo foram empilhados " + pilhaLivros.size() + " livros.");

        System.out.println("Espiando o livro que está no topo da pilha: " + pilhaLivros.peek());

        System.out.println();
        System.out.println(pilhaLivros.toString());
        System.out.println("================================================================================");

        System.out.println("Mostrando todos os livros que estão na pilha: ");
        while(!pilhaLivros.isEmpty()) {
            System.out.println(pilhaLivros.pop());
        }

        System.out.println("A Pilha está vazia? " + pilhaLivros.isEmpty());

    }
}
