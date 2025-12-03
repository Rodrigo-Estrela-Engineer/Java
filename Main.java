public class Main {
    public static void main(String[] args) // A classe main deve estar publica para o JVM conseguir acessa-la
    {
        System.out.println("Hello, World!");
        metodoPrivado();
        
        outraClasse objeto = new outraClasse();
        objeto.retornaUmNumero(42);
    };
    
    private static void metodoPrivado() // pode ser acessado apenas dentro desta classe
    {
        System.out.println("Este é um método privado.");
    }
}
class outraClasse { // o nivel de acesso desta classe é padrão. Pode ser acessada dentro do mesmo pacote
    public void retornaUmNumero(Integer numero) {
        System.out.println("O número é: " + numero);
    }
}