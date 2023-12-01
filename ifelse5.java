package AtividadeIFELSE;
import java.util.*;
public class ifelse5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a altura do pacote: ");
        int a = input.nextInt();
    
        int altMax = 100;

        if(a >= altMax ){
            System.out.println("Altura máxima válida!");
        }else{
            System.out.println("Altura máxima maior que o permitido!");
        }
        input.close();
    }
}
