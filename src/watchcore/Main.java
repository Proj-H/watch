package watchcore;

import java.util.ArrayList;

import sun.swing.PrintingStatus;

public class Main {
	
	static ArrayList<Watch> watchDB = new ArrayList<>();

	public static void main(String[] args) {

		Watch rlx = new Watch("Rolex", 1662836, "seamaster");
		watchDB.add(rlx);
		Watch mov = new Watch("Movement", 2992982, "grudge");
		watchDB.add(mov);
		Watch seik = new Watch("Seiko", 1992636, "pulse");
		watchDB.add(seik);
		
		checkDB(watchDB);
			
		
	}
	
	public static void checkDB(ArrayList<Watch> wbd){
		for (Watch w:wbd){
			System.out.println(w.idNumber);
		}
	}
	
}
