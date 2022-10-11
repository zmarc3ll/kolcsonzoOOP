package hu.petrik.kolcsonzooop;

public class Dvd implements Kolcsonozheto{

    private String cim;
    private int hossz;

    public Dvd(String cim, int hossz) {
        this.cim = cim;
        this.hossz = hossz;
    }

    @Override
    public String megjelenitoNev() {
        return String.format("%s (%d perc)",this.cim,this.hossz);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 7;
    }
}
