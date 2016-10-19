package musician;

import hand.Hand;
import musical_Instrument.Guitar;

/**
 * Created by Ksenia on 16.10.2016.
 */
public class Guitarist extends Musician {

    public Guitarist() {
        musicalInstrument = new Guitar();
        Hand hand = new Hand();
    }

    @Override
    public void pushAKey() {
        musicalInstrument.playASound(1);
    }
}



