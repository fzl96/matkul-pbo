import bentuk.*;

public class Contoh3 {
	public static void main(String[] args){
		Lingkaran obj1 = new Lingkaran();
		System.out.println("Luas Lingkaran = " + obj1.luasLingkaran());
		System.out.println("Keliling Lingkaran = " + obj1.kelilingLingkaran());
		System.out.println();

		SegiEmpat obj2 = new SegiEmpat();
		System.out.println("Luas Segi Empat = " + obj2.luasSegiEmpat());
		System.out.println("Keliling Segi Empat = " + obj2.kelilingSegiEmpat());
		System.out.println();

		Segitiga obj3 = new Segitiga();
		System.out.printf("Luas Segitiga = %.0f\n", obj3.luasSegitiga());
		System.out.printf("Keliling Segitiga = %.0f", obj3.kelilingSegitiga());
	}	
}
