import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Pessoa p = new Pessoa();
    // metodo para pegar a informação digitada no teclado e salva-la para uso futuro//
    Scanner s = new Scanner(System.in);
    System.out.println("Digite o Seu nome");
    //pegando a informação digitada pelo usuário
    String nomeDigitado = s.nextLine();
    //colocando a informação e a repassando
    p.setNome(nomeDigitado);
    System.out.println(p.getNome());
    //código para fechar o scanner
    s.close();
    }
}
