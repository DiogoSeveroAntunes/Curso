import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Pessoa p = new Pessoa();
    Scanner s = new Scanner(System.in);
    System.out.println("Digite o Seu nome");
    String nomeDigitado = s.nextLine();
    p.setNome(nomeDigitado);
    System.out.println(p.getNome());
    s.close();
    }
}
