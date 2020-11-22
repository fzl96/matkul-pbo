public class Travel {
	private String destination, travellerName, travellerAdr, rapidTestStatus;
	private double price;
	private static int totalTraveller = 0;
	private static double totalPay = 0;

	public Travel() {
		totalTraveller++;
	}

	public Travel(String name, String destination) {
		this.travellerName = name;
		this.destination = destination;
		totalTraveller++;
	}
	
	public void setTravellerName(String name){
		travellerName = name;
	}

	public void setDestination(String destination){
		this.destination = destination;
	}

	public void setTravellerAdr(String address){
		travellerAdr = address;
	}

	public void setPrice(double price){
		this.price = price;
		totalPay += price;
	}

	public void setRapidTestStatus(String status){
		rapidTestStatus = status;
	}
	
	public String getTravellerName(){
		return travellerName;
	}

	public String getDestination(){
		return destination;
	}

	public String getTravellerAdr(){
		return travellerAdr;
	}

	public double getPrice(){
		return price;
	}

	public String getRapidTestStatus(){
		return rapidTestStatus;
	}

	public static int getTotalTraveller(){
		return totalTraveller;
	}

	public static double getTotalPay(){
		return totalPay;
	}

	public void display(){
		System.out.println();
		System.out.println("Nama: " + travellerName);
		System.out.println("Tujuan: " + destination);
		System.out.println("Alamat: " + travellerAdr);
		System.out.printf("Harga: Rp. %,.0f\n", price);
		System.out.println("Status Rapid Test: " + rapidTestStatus);
	}
}
