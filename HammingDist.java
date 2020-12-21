
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class HammingDist {

	private ArrayList<String> allStations;
	private String s1;
	private String s2;
	private String nrmn = "NRMN";

	public HammingDist(String s1, String s2) throws IOException {
		this.s1 = s1;
		this.s2 = s2;

		allStations = new ArrayList<String>();
		FileInputStream fileByteStream = null; // File input stream
		fileByteStream = new FileInputStream("Mesonet.txt");
		Scanner inFS = new Scanner(fileByteStream);

		// skipping the headers
		for (int i = 0; i <= 4; i++) {
			inFS.nextLine();
		}

		while (inFS.hasNextLine()) {
			allStations.add(inFS.next());
			inFS.nextLine();
		}

		inFS.close();

	}

	public int hamm(String first, String second) {
		// Hamming Dist from one to another
		int counter = 0;
		for (int j = 0; j < first.length(); j++) {
			if (first.charAt(j) != second.charAt(j))
				counter++;
		}
		return counter;
	}

	public String toString() {
		// Hamming Dist from one to another
		int nrmnDist1 = hamm(nrmn, s1);
		int nrmnDist2 = hamm(nrmn, s2);

		// Num of stations at Hamming dist
		int hd1 = 0;
		int hd2 = 0;
		for (int k = 0; k < allStations.size(); k++) {
			int dist1 = hamm(s1, allStations.get(k));
			// System.out.println(s1 + ", " + allStations.get(k) + ", " +
			// Integer.toString(dist1));
			int dist2 = hamm(s2, allStations.get(k));
			// System.out.println(s2 + ", " + allStations.get(k) + ", " +
			// Integer.toString(dist2));
			if (dist1 == nrmnDist1) {
				hd1++;
			}
			if (dist2 == nrmnDist2) {
				hd2++;
			}

		}

		String msg = "The Hamming distance between Norman and " + s1 + " is " + Integer.toString(nrmnDist1)
				+ "; between Norman and " + s2 + " is " + Integer.toString(nrmnDist2) + ".\n" + "For " + s1
				+ ": Number of stations with Hamming Distance " + Integer.toString(nrmnDist1) + ": "
				+ Integer.toString(hd1) + ".\n" + "For " + s2 + ": Number of stations with Hamming Distance "
				+ Integer.toString(nrmnDist2) + ": " + Integer.toString(hd2) + ".";

		return msg;
	}
}
