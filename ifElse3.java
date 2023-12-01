package AtividadeIFELSE;

import java.util.*;

public class ifElse3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nickname: ");
        String digit = input.nextLine();
        if(contemNumeros(digit)){
            System.out.println("A string contém números");
        }else{
             System.out.println("A string não contem número");
        }
        input.close();
    }

        

        private static boolean contemNumeros(String texto) {
            for (char caractere : texto.toCharArray()) {
                if (Character.isDigit(caractere)) {
                    return true;
                }
            }
            return false;
        
    }
}
        
        


    
