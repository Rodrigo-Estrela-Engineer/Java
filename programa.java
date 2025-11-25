public class programa { // declaração da classe principal
    static void main(String[] args){ // declaração do ponto de entrada de execução do código
        saudacao("Rodrigo", 18);
    }
    static void saudacao(String nome, int idade){ // declaração de metodo
        MostraNome.mostraONome(nome);
        MostraIdade.mostraAIdade(idade);
    }
}
class MostraNome{ //classe que vai auxiliar a main
    public static void mostraONome(String nome) {
        System.out.println("Nome: " + nome);
    }
}
class MostraIdade{ //classe que vai auxiliar a main
    public static void mostraAIdade(int num)
    {
        System.out.println("Idade: " + num);
    }
}