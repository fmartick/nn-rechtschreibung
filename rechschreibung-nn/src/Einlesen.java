import java.util.*;
import javax.swing.*;
import java.io.*;

public class Einlesen 
{

	  public static void main ( String[] args )
	  {
		  InputStream in;
		  BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		  
		  System.out.println("Systemin Lernphase:");
		  
		  String neues_wort = "";
		  int wortlaenge;
		  Vector vec = new Vector();
		  
		  for (int i = 0; i<2; i++){
			
			  System.out.println("Eingeben eines neuen Wortes:");
			  try {
					neues_wort = console.readLine();
				} catch (IOException e) {
					// Sollte eigentlich nie passieren
					e.printStackTrace();
				}
			  
			  wortlaenge = neues_wort.length();
			  System.out.println("Wortlaenge: " + wortlaenge);
			  
			  Woerter w1 = new Woerter(neues_wort, wortlaenge);
			  vec.add(w1);  
			  
			  
		  }
	        /* Hier sind alle Objekte in den Vector vec eingefügt worden */
	        for(int i =0; i < vec.size(); i++)
	        {
	            ((Woerter)vec.elementAt(i)).wort_split();
	        }
	        
	        
	  }
	  

}	
