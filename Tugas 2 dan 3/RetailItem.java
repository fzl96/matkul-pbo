import java.util.Scanner;

public class RetailItem {
	private String description;
	private int unitOnHands;
	private double price;
	
	public RetailItem(String desc, int unit, double p){
		description = desc;
		unitOnHands = unit;
		price = p;
	}

	public String getDescription(){
		return description;
	}

	public int getUnitOnHands(){
		return unitOnHands;
	}

	public double getPrice(){
		return price;
	}

	//public double calcItemCost(){

	//}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		RetailItem item1 = new RetailItem("Makanan Ringan", 10, 3000);
		System.out.print(
				"Deskripsi Item : " + item1.getDescription()
				+ "\nJumlah Unit Tersedia : " + item1.getUnitOnHands()
				+ "\nHarga Ecerean : " + item1.getPrice()
				);
	}
}

