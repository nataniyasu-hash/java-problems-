public class Kunde {
    private String name ;
    private int artikelAnzahl ;
    public Kunde (String name, int artikelAnzahl){
        this.name = name ;
        this.artikelAnzahl= artikelAnzahl;

    }
    public String getName (){
        return name;
    }
    public int getartikelAnzahk (){
        return artikelAnzahl;
    }

    @Override
    public String toString (){
        return name + "("+ artikelAnzahl+")";
    }

}
