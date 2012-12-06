import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class GUI extends JFrame
{
	   private JButton button1;
	    private JButton button2;
	    private JButton button3;
	    private JButton button4;
	    private JPanel panelButton;
	    private JLabel oben;
	    private JLabel anzeige;

	    public GUI()
	    {
	        super("Fenster");
	        setLocation(300,300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //Das BorderLayout ist mal das erste - sp�ter f�gen wir noch ein GridLayout im Westen hinzu
	        getContentPane().setLayout(new BorderLayout(5,5));  

	        //Buttons erzeugen
	        button1 = new JButton("Button 1");
	        button2 = new JButton("Button 2");
	        button3 = new JButton("Button 3");
	        button4 = new JButton("Button 4");

	        //Panels erzeugen auf einem GridLayout
	        panelButton = new JPanel(new GridLayout(3,1));

	        //Auf Panel Buttons packen
	        panelButton.add(button1);
	        panelButton.add(button2);
	        panelButton.add(button3);
	        panelButton.add(button4);

	        //Listener f�r Buttons
	        addButtonListener(button1);
	        addButtonListener(button2);
	        addButtonListener(button3);
	        addButtonListener(button4);

	        //Labels erzeugen
	        oben = new JLabel("Layout Test");
	        //Label zentrieren
	        oben.setHorizontalAlignment(JLabel.CENTER); 
	        anzeige = new JLabel("Button klicken");

	        //Labels auf Frame packen (direkt auf das BorderLayout)
	        getContentPane().add(BorderLayout.NORTH, oben);
	        getContentPane().add(anzeige);

	        //Panels auf Frame packen (das panelButton hat ein GridLayout, dass jetzt in den WestBereich des BorderLayouts kommt)
	        getContentPane().add(BorderLayout.EAST, panelButton);

	        pack();
	        setVisible(true);

	    }

	    public static void main(String[] args)
	    {
	       GUI g = new GUI();
	    }

	    private void addButtonListener(JButton b)
	    {
	        b.addActionListener(new ActionListener() 
	        { 
	            public void actionPerformed(ActionEvent ae) 
	            { 
	                eingabe(ae.getActionCommand());
	            }
	        });
	    }

	    private void eingabe(String a)
	    {
	        anzeige.setText(a);
	    }
}