package megabytesconverter;

public class MegaBytesConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMegaBytesAndKiloBytes(2500);

	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {

		if (kiloBytes < 0) {

			System.out.println("Invalid Value");

		} else {
			
			double megaBytes = kiloBytes / 1024;

			System.out.println(kiloBytes + " KB = " +  Math.round(megaBytes)  + " MB" + " and " + ( kiloBytes%1024 ) + " KB");
		}
	}

}
