package br.com.lfernandes;

public class total {
	public static void main(String args[]) {
		int n1 = 1000000;
		casting(n1);
		wrappers(n1);
	}

	public static void casting(int n1) {
		int valorPrimitivo = n1;//declarei a variável primitiva
		System.out.println("Esse é o valor int n1 Primitivo: "+ n1 +"\n");
		double valor1 = valorPrimitivo;//realizei um casting Implicito
		System.out.println("Esse é o valor Primitivo n1 convertido para double: "+ valor1+"\n");
		byte valor2 = (byte)valor1;//realizei um casting explicito
		System.out.println("Esse é o valor Primitivo n1 convertido de double para byte: "+ valor2+"\n");//sáida deu resultado diferente pois byte < int
		long valor3 = valorPrimitivo;
		System.out.println("Esse é o valor Primitivo n1 convertido de int para long: "+ valor3 + "\n");//novamente realizei um casting implicito
	}
	
	public static void wrappers(int n1) {
		Integer a = Integer.valueOf(n1);//converti n1 do tipo primitivo para o complexo e aloquei no a
		System.out.println("Agora, estou convertendo o n1 int(primitivo) para Integer(Wrappen/complexo: "+a+"\n");
	}
}
