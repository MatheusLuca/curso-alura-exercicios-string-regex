import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExercicio7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do produto: ");
        String codProduto = sc.nextLine();

        //Busque esse padrao string  e converta compile -> para um objeto Pattern padrao
        Pattern pattern = Pattern.compile("[A-Z]{3}-\\d{4}");
        // Aplicar o objeto pattern (padrao) e busque o padrao match
        Matcher matcher = pattern.matcher(codProduto);

        if(matcher.find()){
            System.out.println("Produto está no padrão!");
        }else{
            System.out.println("Produto não está no padrão de cadastro");
        }
    }
}
