import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Media media = new Media();
    Scanner s = new Scanner(System.in);

    System.out.println("digite os 4 números das suas notas para o cálculo da média, separando-os por (,) ");
    String numeros = s.nextLine();
    String[] valorString = numeros.split(",");
    Double[] numeros1 = new Double[valorString.length];
    for( int i=0; i < valorString.length; i++){
        numeros1[i] = Double.parseDouble(valorString[i]);

    }

    media.setNotas(numeros1);
    Double soma = 0.0;
    for(int i=0; i < numeros1.length; i++){
        soma = soma + numeros1[i];
    }
    Double media1 = soma/4;
    System.out.println(media1);

    }
}
