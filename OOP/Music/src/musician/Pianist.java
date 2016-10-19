package musician;

import hand.Hand;
import musical_Instrument.Piano;

/**
 * Created by Ksenia on 15.10.2016.
 */
public class Pianist extends Musician {

    public Pianist() {
        musicalInstrument = new Piano();
        hand = new Hand();
    }

    @Override
    public void pushAKey() {
        int selectedHand = hand.handChoiсe();
        switch (selectedHand) {
            case 1:
                musicalInstrument.playASound(1);
                break;
            case 2:
                musicalInstrument.playASound(2);
                break;
            case 3:
                musicalInstrument.playASound(3);
                break;
        }

    }
}

