package hu.petrik.kolcsonzooop;

public class Dvd implements Kolcsonozheto, Comparable<Dvd>{

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

    public String getCim() {
        return cim;
    }

    public int getHossz() {
        return hossz;
    }

    @Override
    public int meddigKolcsonozheto() {
        return 7;
    }

    @Override
    public int compareTo(Dvd masikDvd) {
        return this.hossz - masikDvd.hossz;
    }
}
