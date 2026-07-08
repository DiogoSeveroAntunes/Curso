import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Media media = new Media();
    Scanner s = new Scanner(System.in);

    System.out.println("digite os 4 números das suas notas para o cálculo da média, separando-os por (,) ");
    String resposta = s.nextLine();
    String[] valorString = resposta.split(",");
    Double[] numeros = new Double[valorString.length];
    for( int i=0; i < valorString.length; i++){
        numeros[i] = Double.parseDouble(valorString[i]);

    }

    media.setNotas(numeros);
    Double soma = 0.0;
    for(int i=0; i < numeros.length; i++){
        soma = soma + numeros[i];
    }
    media.setMedia(soma/numeros.length);
    System.out.println(media.getMedia());
    if(media.getMedia() >= 7){
        System.out.println("Parabéns, você passou!");
    }else if (media.getMedia() < 5 ){
        System.out.println("Você está reprovado");
    }else{
        System.out.println("Você está em recuperação");
    }

    }
}
