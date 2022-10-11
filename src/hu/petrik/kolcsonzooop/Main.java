package hu.petrik.kolcsonzooop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Kolcsonozheto> katalogus=new ArrayList<>();
    static List<Dvd> dvdk=new ArrayList<>();

    public static void main(String[] args) {
        Konyv konyv1 = new Konyv("Gyűrűk ura", "J:R:R: Tolkien", "AABBCC-121314");
        Dvd dvd1 = new Dvd("Star Wars V. rész", 124);
        Dvd dvd2 = new Dvd("Star Wars VI. rész", 121);
        Dvd dvd3 = new Dvd("Star Wars VI. rész", 131);
        Dvd dvd4 = new Dvd("A gyűrűk ura 1",178);
        Dvd dvd5 = new Dvd("A gyűrűk ura 2",170);
        Dvd dvd6 = new Dvd("A gyűrűk ura 3",176);
        Ujsag ujsag1 = new Ujsag("Képes Sport", 2007, 23);

        //Interface tipusu objektum csak ugy hozhato letre hogy megvalositja az interface minden fuggvenyet.
        Kolcsonozheto kolcsonozheto =new Kolcsonozheto() {
            @Override
            public String megjelenitoNev() {
                return null;
            }

            @Override
            public int meddigKolcsonozheto() {
                return 0;
            }
        };
        System.out.println(konyv1.getIsbn());
        System.out.println(konyv1.megjelenitoNev());
        katalogus.add(konyv1);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        katalogus.add(ujsag1);
        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);
        dvdk.add(dvd4);
        dvdk.add(dvd5);
        dvdk.add(dvd6);

        System.out.println();
        System.out.println();

        for (Kolcsonozheto k : katalogus) {
            System.out.println(k.megjelenitoNev()+" "+ k.meddigKolcsonozheto());
        }
        Collections.sort(dvdk);
        for (Dvd d: dvdk){
            System.out.println(d.megjelenitoNev()+" "+d.getHossz());
        }
        System.out.println();
    }
}
