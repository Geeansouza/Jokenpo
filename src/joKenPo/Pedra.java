package joKenPo;

import java.util.Random;
import java.util.Scanner;

public class Pedra {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random
		sorteio = new Random();
		int b = sorteio.nextInt(3)+1;
		int a ; 
		
		
		System.out.println("Vamos jogar JoKenPo? Escolha um numero");
		System.out.println("1=Pedra");
		System.out.println("2=Papel");
		System.out.println("3=Tesoura");
		
		System.out.println("Qual vai ser?");
		a = leitor.nextInt();
		
		
		if(a >= 1 && a <= 3) {
			
			if(a ==  b){
				System.out.println("Maquina escolheu: "+b);
				System.out.println("empate");
			}else if((a == 1 && b == 4)||(a == 2 && b == 1)||(a==3 && b==2)){
				System.out.println("Você ganhou");
			}else {
				System.out.println("você perdeu");
				}
		}
		else {
			System.out.println("Não foi possivel");
		}
		
		System.out.println();
		
		
		
		}
}


