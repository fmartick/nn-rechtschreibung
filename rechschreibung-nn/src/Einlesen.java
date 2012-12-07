import java.util.*;
import javax.swing.*;
import java.io.*;

public class Einlesen 
{

		public static void main ( String[] args )
		{
			InputStream in;
			//BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			Scanner console = new Scanner(System.in);
			  
			System.out.println("System in der Lernphase:");
			  
			String neues_wort = "";
			String abbruch_wort="";
			System.out.println("Welches Wort soll als Abbruchkriterium verwendet werden?");
		
			abbruch_wort = console.next();
	
			int wortlaenge;
			Vector vorgabe_woerter = new Vector();
			Vector tipp_woerter = new Vector();
			
			// Test
			while (!neues_wort.equals(abbruch_wort)){
			
				System.out.println("Eingeben eines neuen Wortes:");
				neues_wort = console.next();
			  
				if (!neues_wort.equals(abbruch_wort)){
				wortlaenge = neues_wort.length();
					System.out.println("Wortlaenge: " + wortlaenge);
				  
					Woerter w1 = new Woerter(neues_wort, wortlaenge);
					vorgabe_woerter.add(w1);  
				}
			}
			
			System.out.println("Welches Wort soll auf Ähnlichkeit überprüft werden?");
			String ueberpruef_wort = "";
			ueberpruef_wort = console.next();
					
			Woerter w2 = new Woerter(ueberpruef_wort, ueberpruef_wort.length());
			tipp_woerter.add(w2);
			
	        //Auslesen der eingegebenen Woerter

			int max_array_length = 50;
	    	int wort_eingabe_array[][] = new int[max_array_length][26];
	    	int wort_liste_array[][] = new int[max_array_length][26];
	    	
	    	int anz_buch_gleich = 0;
	    	int max_buch_gleich = 0;
	    	int vec_position_best = 0;
	    	

			for(int k=0; k<max_array_length; k++){
				for(int l=0; l<26; l++){  
					  wort_eingabe_array[k][l] = 0;
					  wort_liste_array[k][l] = 0;
				}
			}    	 

			for(int j =0; j < tipp_woerter.size(); j++){
				
				wort_eingabe_array = ((Woerter)tipp_woerter.elementAt(j)).wort_split();
				
				for(int i =0; i < vorgabe_woerter.size(); i++)
				{
					anz_buch_gleich = 0;
					wort_liste_array = ((Woerter)vorgabe_woerter.elementAt(i)).wort_split();
					
					 for(int k=0; k<max_array_length; k++){
			    		  for(int l=0; l<26; l++){
			    			  //System.out.println("Vergleiche: " + wort_eingabe_array[k][l] + " mit " + wort_liste_array[k][l]);
			    			  if(wort_eingabe_array[k][l] == wort_liste_array[k][l]){
			    				  anz_buch_gleich++;
			    				  //System.out.println("zaehle hoch");
			    			  }
			    			  else{
			    				  //System.out.println("zaehle nicht hoch");
			    			  }
			    		  }
			    	  }    
					 
					 if (anz_buch_gleich > max_buch_gleich){
						 max_buch_gleich = anz_buch_gleich;
						 vec_position_best = i;
					 }
					
					
				}     
			}
			
			String best_wort = ((Woerter)vorgabe_woerter.elementAt(vec_position_best)).gibDatenZurueck();

			System.out.println("Das best passenste Wort ist : " + best_wort);
			
			
	  }
}	
