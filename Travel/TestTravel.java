import java.util.Scanner;

public class TestTravel {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //membuat object scanner
		Travel obj1 = new Travel(); //object 1 menggunakan constructor 1

		String name, destination, adr, status;
		double price;

		//object 1
		System.out.print("Masukkan nama untuk Traveller 1 : ");
		name = input.nextLine();
		System.out.print("Masukkan tujuan travel : ");
		destination = input.nextLine();
		System.out.print("Masukkan alamat traveller : ");
		adr = input.nextLine();
		System.out.print("Staus Rapid Test (Non Reaktif / Reaktif) : ");
		status = input.nextLine();
		System.out.print("Masukkan Harga : ");
		price = input.nextDouble();
		input.nextLine();
		
		obj1.setTravellerName(name);
		obj1.setDestination(destination);
		obj1.setTravellerAdr(adr);
		obj1.setPrice(price);
		obj1.setRapidTestStatus(status);
				
		//object 2
		System.out.print("Masukkan nama untuk Traveller 2 : ");
		name = input.nextLine();
		System.out.print("Masukkan tujuan travel : ");
		destination = input.nextLine();
		System.out.print("Masukkan alamat traveller : ");
		adr = input.nextLine();
		System.out.print("Staus Rapid Test (Non Reaktif / Reaktif) : ");
		status = input.nextLine();
		System.out.print("Masukkan Harga : ");
		price = input.nextDouble();
		input.nextLine();
		
		Travel obj2 = new Travel(name, destination);
		obj2.setTravellerAdr(adr);
		obj2.setPrice(price);
		obj2.setRapidTestStatus(status);

		//object 3
		System.out.print("Masukkan nama untuk Traveller 3 : ");
		name = input.nextLine();
		System.out.print("Masukkan tujuan travel : ");
		destination = input.nextLine();
		System.out.print("Masukkan alamat traveller : ");
		adr = input.nextLine();
		System.out.print("Staus Rapid Test (Non Reaktif / Reaktif) : ");
		status = input.nextLine();
		System.out.print("Masukkan Harga : ");
		price = input.nextDouble();
		input.nextLine();
		
		Travel obj3 = new Travel(name, destination);
		obj3.setTravellerAdr(adr);
		obj3.setPrice(price);
		obj3.setRapidTestStatus(status);

		//menampilkan semua object
		obj1.display();
		obj2.display();
		obj3.display();
	}
}
