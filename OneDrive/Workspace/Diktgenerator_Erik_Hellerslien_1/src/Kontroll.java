import java.util.*;

public class Kontroll {
	Random rand = new Random();
	Ordinput input = new Ordinput();

	public void slutt() {
		System.exit(1);
	}
	
	public String nyListe() {
		ArrayList<String> nyListe = input.getLettDiktOrd();
		
				
		int min = 1;
		int max = nyListe.size();
		
		
		String Kavkstreng = "";
		for (int i = 0; i<4; i++) {		
			for(int j = 0; j<4; j++) {
				Kavkstreng += j == 0 ? "" : " ";
				int randomNum = rand.nextInt((max - min)+1);
				//testListe.add(nyListe.get(randomNum));
				Kavkstreng += nyListe.get(randomNum);
				
			}
			Kavkstreng += "\n";
		}
								
		return Kavkstreng;		
	}
	
	public String avansertListe() {
		ArrayList<String> verbListe = input.getVerbOrd();
		ArrayList<String> artikkelListe = input.getArtikkelOrd();
		ArrayList<String> substantivListe = input.getSubstantivOrd();
		ArrayList<String> adjektivListe = input.getAdjektivOrd();
		
		int min = 1;
		int max = verbListe.size();
		
		String avansertStreng = "";
		
		for (int i = 0; i<3; i++) {
			for(int j = 0; j<1; j++) {
				
				int randomNum = rand.nextInt((max - min)+1);
				avansertStreng += artikkelListe.get(randomNum);
				
				avansertStreng += " " + adjektivListe.get(randomNum);
				avansertStreng += " " + substantivListe.get(randomNum);
				avansertStreng += " " + verbListe.get(randomNum);
				
			}
			avansertStreng += "\n";
			
		}
		for(int k = 0; k<1; k++) {
			int randomNum = rand.nextInt((max - min)+1);
			avansertStreng += verbListe.get(randomNum);
			avansertStreng += " " + artikkelListe.get(randomNum);
			avansertStreng += " " + adjektivListe.get(randomNum);
			avansertStreng += " " + substantivListe.get(randomNum);
		}
		
		
		
		return avansertStreng;
	}
	
	
	
	
	public void addToOrdList(String value) {
		input.addToLettList(value);	
		
	}
	
	public void addToAdjektiv(String value) {
		input.addToAdjektiv(value);
	}
		
	public void addToVerb(String value) {
		input.addToVerb(value);
	}
	
	public void addToSubstantiv(String value) {
		input.addToSubstantiv(value);
	}
	
	public void addToArtikkel(String value) {
		input.addToArtikkel(value);
	}

	


	
	



}
