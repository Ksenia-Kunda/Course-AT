package musical_Instrument;

import java.util.Scanner;

/**
 * Created by Ksenia on 16.10.2016.
 */
public class Guitar extends MusicalInstrument {

    private String[][] aKay = {{"МИ", "ФА", "ФА#"}, {"ЛЯ", "ЛЯ#", "СИ"}, {"PЕ", "PE#", "МИ"}, {"СОЛЬ", "СОЛЬ#", "ЛЯ"}, {"СИ", "ДО", "ДО#"}, {"МИ", "ФА", "ФА#"}};
    private int fret;
    private int str;

    public void setFret(int fret){
        this.fret=fret;
    }

    public void setStr(int str){
        this.str=str;
    }

    @Override
    public void playASound(int hand) {
        Scanner scanner;
        switch (hand){
            case 1:
                System.out.println("Выберите лад (0-2)");
                setFret(new Scanner(System.in).nextInt());
            case 2:
                System.out.println("Выберите струну (1-6)");
                setStr(new Scanner(System.in).nextInt());
                break;
        }

        System.out.println(aKay[(str-1)][fret]);
    }
}
