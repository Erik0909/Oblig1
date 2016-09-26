import javax.swing.JOptionPane;

public class GUI {

					
		private final String[] ALTERNATIVER = {"Lett Dikt","Avansert Dikt","Avslutt"};
		private final int LDIKT = 0;
		private final int ADIKT = 1;
		private final int AVSLUTT = 2;
		
		private final int LETTREG = 0;
		private final int LETTSKRIV = 1;
		private final int LETTRETURN = 2;
		
		private final int AVANSERTREG = 0;
		private final int AVANSERTSKRIV = 1;
		private final int AVANSERTRETURN = 2;
		
		private final int ADJEKTIVAREG = 0;
		private final int VERBAREG = 1;
		private final int ARTIKKELAREG = 2;
		private final int SUBSTANTIVAREG = 3;
		
		private String lettord;
		private String adjektivOrd;
		private String artikkelOrd;
		private String substantivOrd;
		private String verbOrd;
		
		private Kontroll kontroll = new Kontroll();

		boolean fortsett = true;
		public void meny() {
			
			while(fortsett) {
				int valg = CreateOptionPane(ALTERNATIVER);

				switch(valg) {
					case LDIKT : LettDikt();
						break;					
					case ADIKT: AvansertDikt();
						break;
					case AVSLUTT: kontroll.slutt();;
					default: fortsett = false;
				} 		
			} 
		} 
		
		
		public void LettDikt() {
			final String[] LALTERNATIVER = {"Registrer Ord", "Skriv Dikt", "Tilbake"};
			int lDiktOptions = CreateOptionPane(LALTERNATIVER);
			
			switch(lDiktOptions) {
				case LETTREG: lettDiktReg();
					break;
				case LETTSKRIV: skrivLettOrd();
					break;
				case LETTRETURN: meny();
					break;
				default: fortsett = false;
			}
					
		
		}
		

		
		public void AvansertDikt() {
			final String[] AALTERNATIVER = {"Registrer Ord", "Skriv Dikt", "Avslutt"};
			int aDiktOptions = CreateOptionPane(AALTERNATIVER);
				
			switch(aDiktOptions) {
				case AVANSERTREG: avansertDiktReg();
					break;
				case AVANSERTSKRIV: avansertDiktSkriv();
					break;
				case AVANSERTRETURN: meny();
					break;
				default: fortsett = false;
			
			}			
		}
		
		public void avansertDiktReg() {
			final String[] ORDALTERNATIVER = {"Adjektiv", "Verb", "Artikkel", "Substantiv"};
			int ordAlternativer = CreateOptionPane(ORDALTERNATIVER);
			
			switch(ordAlternativer) {
				case ADJEKTIVAREG: adjektivReg();					
					break;
				case VERBAREG: verbReg();
					break;
				case ARTIKKELAREG: artikkelReg();
					break;
				case SUBSTANTIVAREG: substantivReg();
					break;
				
				default: fortsett = false;
			}
			
		}
		
		public void avansertDiktSkriv() {			
			JOptionPane.showMessageDialog(null, kontroll.avansertListe());
		}
		
		public void adjektivReg() {
			adjektivOrd = JOptionPane.showInputDialog(null, "Skriv inn ord: ");
			kontroll.addToAdjektiv(adjektivOrd);
			avansertDiktReg();
		}
		
		public void verbReg() {
			verbOrd = JOptionPane.showInputDialog(null, "Skriv inn ord: ");
			kontroll.addToVerb(verbOrd);
			avansertDiktReg();
		}
		
		public void artikkelReg() {
			artikkelOrd = JOptionPane.showInputDialog(null, "Skriv inn ord: ");
			kontroll.addToArtikkel(artikkelOrd);
			avansertDiktReg();
		}
		
		public void substantivReg() {
			substantivOrd = JOptionPane.showInputDialog(null, "Skriv inn ord: ");
			kontroll.addToSubstantiv(substantivOrd);
			avansertDiktReg();
		}
		
		
		
		public void lettDiktReg() {
			lettord = JOptionPane.showInputDialog(null, "Skriv inn ord: ");	
			kontroll.addToOrdList(lettord);
			
			LettDikt();
		}
		
	
		public void skrivLettOrd() {

			JOptionPane.showMessageDialog(null, kontroll.nyListe());
			
		}

		
		
		private int CreateOptionPane(String[] nyeAlternativer) {
			return JOptionPane.showOptionDialog(null, 
					"Gjør et valg", 
					"Diktgenerator", 
					JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null, 
					nyeAlternativer, 
					nyeAlternativer[0]);
		}
		
		
	}



