package HeadFirstJava.Chapter8.Task4;

public class Honey {
    public static void main(String[] args) {
        Honey honeyPot = new Honey();
        Honey[] ha = {honeyPot, honeyPot, honeyPot, honeyPot};

        Bees b1 = new Bees();
        b1.beeHA = ha;

        Bear[] ba = new Bear[5];
        for (int x = 0; x < ba.length; x++) {
            ba[x] = new Bear();
            ba[x].hunny = honeyPot;
        }

        Kit k = new Kit();
        k.kh = honeyPot;

        Raccoon r = new Raccoon();
        r.rh = honeyPot;
        r.k = k;
        k = null;
    }
}
