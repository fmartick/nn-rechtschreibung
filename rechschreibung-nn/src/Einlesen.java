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
	        /* Hier sind alle Objekte in den Vector vec eingef�gt worden */
	        for(int i =0; i < vorgabe_woerter.size(); i++)
	        {
	            ((Woerter)vorgabe_woerter.elementAt(i)).wort_split();
	        }     
	  }
}	
