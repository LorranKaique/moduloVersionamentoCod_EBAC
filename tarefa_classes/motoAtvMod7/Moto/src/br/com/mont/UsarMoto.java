package br.com.mont;

public class UsarMoto {

		public static void main(String [] args) {
			moto c1 = new moto(); //cria nova instancia de moto
			
			c1.ligar();//liga a moto
			c1.acelerar(50);
			System.out.println("Sua velocidade é: " + c1.vel);
			c1.trocarMarcha();
			System.out.println("Você está na " + c1.marcha + "° marcha.");
			c1.freiar(20);
			System.out.println("Sua velocidade após freiar é: " + c1.vel);
			c1.trocarMarcha();
			System.out.println("E agora você está na " + c1.marcha + "° marcha.");
			
			
			
			//moto c1 = new moto();//criando um objeto
			//chamando os atributos
			//c1.piloto = "Lorran";
			//c1.ignicion = false;
			//c1.vel = 0;
			//c1.marcha = 0;
			//chamando os métodos
			//c1.ligar(boolean ignicion);
			//c1.acelerar(0);
			//System.out.println(c1.vel);
			
			
			
		}
}
