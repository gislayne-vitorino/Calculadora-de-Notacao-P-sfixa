import java.util.*;
import java.util.*;
import java.io.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
	try {
		Scanner in = new Scanner(new FileInputStream("Calc1.stk"));
		Stack pilha = new Stack();
		while (in.hasNext()) { 
		String str = in.next();
		
		if(isdigit(str)) { //se for um digito/numero
			
			pilha.push(str);
		}
		else{			   //se for um operando
			int n2 = Integer.parseInt( pilha.pop().toString() );
			int n1 =  Integer.parseInt(pilha.pop().toString()) ;
			switch (str) {
				case "+":
					pilha.push(n1+n2);
					break;
				case "-":
					pilha.push(n1-n2);
					break;
				case "*":
					pilha.push(n1*n2);
					break;
				case "/":
					pilha.push(n1/n2);
					break;
			}
			
		}
		
		
		}
		System.out.println("Resultado é: " + pilha.pop());
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo não encontrado");
	}
}
	
	
	public static boolean isdigit (String str) { //Verifica se a string é um número
		char chara = str.charAt(0); 	  		 //pega o primeiro char da string
		if (Character.toString(chara).matches("[0123456789]")){ //verifica se o char é um digito
			return true;
		}
		return false;
	}
}
