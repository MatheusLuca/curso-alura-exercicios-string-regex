import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsExercicio8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Validador de CPF!");
        System.out.println("Digite um CPF");
        String cpf = sc.nextLine();

        Pattern pattern = Pattern.compile("\\d{3}.\\d{3}.\\d{3}-\\d{2}");
        Matcher buscarPadrao = pattern.matcher(cpf);

        if(buscarPadrao.find()){
            System.out.println("CPF no formato valido!");
        }else{
            System.out.println("CPF no formato invalido!");
        }
    }
}
