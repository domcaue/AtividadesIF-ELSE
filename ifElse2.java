package AtividadeIFELSE;

import java.util.*;

public class ifElse2 {
    public static void main(String[] args) {
        int n1=72, n2=72;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        n1 = input.nextInt();
        System.out.println("Digite outro número:");
        n2 = input.nextInt();

    
        if(n1 > 0 && n2 > 0){
            System.out.println("A soma dos números é: "+(n1+n2));
        }else{
            System.out.println("Digite números maiores que zero!");
        }
        input.close();


    }
}
