package AtividadeIFELSE;
import java.util.*;
public class ifelse1 {
    
	public static void main(String[] args) {
	    
	    String login = "senac@aluno.pr.senac.br";
	    String senha = "senac@02";
	    Scanner input = new Scanner (System.in);
		System.out.println("Digite o Login");
		String email = input.nextLine();
		System.out.println("Digite a senha");
		String senhaU = input.nextLine();
		
		if(email.equals(login) && senhaU.equals(senha)){
		    System.out.println("Bem-vindo ao Sistema");
		}else{
		    System.out.println("Login e/ou senha errados");
		}
		input.close();
	}
}

