public class Student
{
    // Attribute name und vorname eines Studenten
    String name,vorname;
    // Attribut matrikelnummer eindeutige Nummer
    int matrikelnummer;
    // Konstruktor f�r einen Studenten
    public Student(String name,String vorname,int matrikelnummer)
    {
        this.name = name;
        this.vorname = vorname;
        this.matrikelnummer = matrikelnummer;
    }
    // getter-Methode f�r die Matrikelnummer
    public int getMatrikelnummer()
    {
        return this.matrikelnummer;
    }

    public void gibDatenAus()
    {
        System.out.println(name+ ", "+vorname );
        System.out.println(matrikelnummer);
    }
}