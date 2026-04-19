import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsExercicio9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite texto e use # em algumas palavras");
        String texto  = sc.nextLine();

        Pattern padrao = Pattern.compile("#\\w+");
        Matcher buscarPadrao = padrao.matcher(texto);

        while(buscarPadrao.find()){
            System.out.println(buscarPadrao.group());
        }


    }
}
