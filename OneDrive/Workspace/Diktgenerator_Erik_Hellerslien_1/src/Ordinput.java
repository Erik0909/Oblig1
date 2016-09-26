
import java.util.*;

public class Ordinput {
	
	private  ArrayList<String> lettDiktOrd = new ArrayList<String>();
	
	
	private ArrayList<String> ArtikkelOrd = new ArrayList<String>();
	private ArrayList<String> AdjektivOrd = new ArrayList<String>();
	private ArrayList<String> SubstantivOrd = new ArrayList<String>();
	private ArrayList<String> VerbOrd = new ArrayList<String>();
	
	public Ordinput(){
		testData();
		aTestData();
	}

	public  ArrayList<String> getLettDiktOrd() {
		return lettDiktOrd;
	}

	public ArrayList<String> getArtikkelOrd() {
		return ArtikkelOrd;
	}

	public ArrayList<String> getAdjektivOrd() {
		return AdjektivOrd;
	}

	public ArrayList<String> getSubstantivOrd() {
		return SubstantivOrd;
	}

	public ArrayList<String> getVerbOrd() {
		return VerbOrd;
	}

	public void addToLettList(String value) {
		lettDiktOrd.add(value);
	}
	
	public void addToArtikkel(String value) {
		ArtikkelOrd.add(value);
	}
	
	public void addToAdjektiv(String value) {
		AdjektivOrd.add(value);
	}
	
	public void addToSubstantiv(String value) {
		SubstantivOrd.add(value);
	}
	
	public void addToVerb(String value) {
		VerbOrd.add(value);
	}
	
	public void testData() {
		
		lettDiktOrd.add("Knut");
		lettDiktOrd.add("Kavk");
		lettDiktOrd.add("Kavkto");
		lettDiktOrd.add("Kavken");
		lettDiktOrd.add("Kavktre");
		lettDiktOrd.add("Flis");
		lettDiktOrd.add("Erik");
		lettDiktOrd.add("Alex");
		lettDiktOrd.add("Global");
		lettDiktOrd.add("Jeg");
		lettDiktOrd.add("Er");
		lettDiktOrd.add("Best");
		lettDiktOrd.add("Joakim");
		lettDiktOrd.add("Dårlig");
		lettDiktOrd.add("Example");
		lettDiktOrd.add("Java");
		lettDiktOrd.add("Program");
		lettDiktOrd.add("Dikt");
		lettDiktOrd.add("Dig");
		
	}
	
	public void aTestData() {
		
		ArtikkelOrd.add("Den");
		ArtikkelOrd.add("Den");
		ArtikkelOrd.add("Den");
		ArtikkelOrd.add("Den");
		ArtikkelOrd.add("Den");

		
		
		SubstantivOrd.add("Boken");
		SubstantivOrd.add("Gulroten");
		SubstantivOrd.add("Trekanten");
		SubstantivOrd.add("Firkanten");
		SubstantivOrd.add("Læreren");
		
		AdjektivOrd.add("Grønne");
		AdjektivOrd.add("Vimsete");
		AdjektivOrd.add("Klønete");
		AdjektivOrd.add("Gule");
		AdjektivOrd.add("Ville");
		
		VerbOrd.add("Danser");
		VerbOrd.add("Sover");
		VerbOrd.add("Gråter");
		VerbOrd.add("Vokser");
		VerbOrd.add("Snorker");
		
		
	}
}
