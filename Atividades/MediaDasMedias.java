package IntroducaoClassesTest.Atividades;

public class MediaDasMedias {public static void main(String[] args) {
    int a1 = 8, a2 = 9, a3 = 7;
    int b1 = 4, b2 = 5, b3 = 6;

    double media1 = (a1 + a2 + a3) / 3.0;
    double media2 = (b1 + b2 + b3) / 3.0;

    //no meu pc roda rsrs

    double somaMedias = media1 + media2;
    double mediaDasMedias = somaMedias / 2;

    System.out.println("Média dos números 8, 9 e 7: " + media1);
    System.out.println("Média dos números 4, 5 e 6: " + media2);
    System.out.println("Soma das médias: " + somaMedias);
    System.out.println("Média das médias: " + mediaDasMedias);
}
}