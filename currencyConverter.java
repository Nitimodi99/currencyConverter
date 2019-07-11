//classtype=0 convert
import java.lang.*;
class currencyConverter{

	public static void main(String[] args) {
		
		float currency=Float.parseFloat(args[0]);
		int classType=Integer.parseInt(args[1]);

		if(classType==0){

			System.out.println("$"+currency+"="+(70*currency)+"INR");
		}
		else{

			System.out.println("INR"+currency+"="+(currency/70)+"$");

		}


	}
}