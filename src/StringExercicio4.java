import java.util.Scanner;

public class StringExercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do arquivo: ");
        String nomeArquivo = sc.nextLine();
        String [] novoArquivo = nomeArquivo.split("\\.");
        System.out.println(novoArquivo[0]);
    }
}
