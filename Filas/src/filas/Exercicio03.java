package filas;


public class Exercicio03 {

    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {

        FilaComPrioridade<PessoaExercicio03> filaPosto = new FilaComPrioridade<PessoaExercicio03>();

        filaPosto.enfileirarElementos(new PessoaExercicio03("Ana", VERDE));
        filaPosto.enfileirarElementos(new PessoaExercicio03("Higor", AMARELO));
        filaPosto.enfileirarElementos(new PessoaExercicio03("Margarete", VERMELHO));
        filaPosto.enfileirarElementos(new PessoaExercicio03("Gabriel", VERMELHO));
        filaPosto.enfileirarElementos(new PessoaExercicio03("Marcela", VERDE));
        filaPosto.enfileirarElementos(new PessoaExercicio03("Pedro", AMARELO));
        filaPosto.enfileirarElementos(new PessoaExercicio03("Carlo", AMARELO));
        filaPosto.enfileirarElementos(new PessoaExercicio03("Henrique", VERDE));
        filaPosto.enfileirarElementos(new PessoaExercicio03("Mathias", VERMELHO));


        PSAtendimentoExercicio03 atendimento = new PSAtendimentoExercicio03(filaPosto);
        PSNovosPacientesExercicio03 novosPacientes = new PSNovosPacientesExercicio03(filaPosto);

        Thread td1 = new Thread(atendimento);
        Thread td2 = new Thread(novosPacientes);

        td1.start();
        td2.start();
    }
}
