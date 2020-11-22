package bentuk;

import java.util.Scanner;

public class Segitiga {
	private double alas, tinggi, miring, luas, keliling;

	Scanner input = new Scanner(System.in);

	public Segitiga(){
		System.out.print("Masukkan Alas Segitiga : ");
		alas = input.nextDouble();
		System.out.print("Masukkan Tinggi Segitiga : ");
		tinggi = input.nextDouble();
	}

	public double luasSegitiga(){
		luas = 0.5 * alas * tinggi;
		return luas;
	}

	public double kelilingSegitiga(){
		miring = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(alas, 2));
		keliling = alas + tinggi + miring;
		return keliling;
	}
}
