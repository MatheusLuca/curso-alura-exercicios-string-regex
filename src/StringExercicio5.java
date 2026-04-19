import java.util.Scanner;

public class StringExercicio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto!");

        String texto = sc.nextLine();
        System.out.println("Digite a palavra para ver se ela está no texto! ");
        String palavraNoTexto = sc.next();

        if(texto.contains(palavraNoTexto)){
            System.out.printf("A palavra %s está no texto!", palavraNoTexto);
        }else{
            System.out.println(
                    "A palavra " + palavraNoTexto + "não está no texto!"
            );
        }
    }
}
