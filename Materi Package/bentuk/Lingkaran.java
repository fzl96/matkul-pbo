package bentuk;

import java.util.Scanner;

public class Lingkaran {
	private double jariJari, keliling, luas;
	
	Scanner input = new Scanner(System.in);

	public Lingkaran(){
		System.out.print("Masukkan jari-jari lingkaran : ");
		jariJari = input.nextDouble();
	}
	
	public double luasLingkaran(){
		luas = 3.14 * (jariJari * jariJari);
		return luas;
	}

	public double kelilingLingkaran(){
		keliling = 2 * 3.14 * jariJari;
		return keliling;
	}
}
