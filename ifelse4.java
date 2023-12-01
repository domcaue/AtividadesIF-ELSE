package AtividadeIFELSE;
import java.util.*;
public class ifelse4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso autorizado");
        }else{
            System.out.println("Você tem menos de 18 anos.");
        }
        input.close();
    }
}
