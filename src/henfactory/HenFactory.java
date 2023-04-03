package henfactory;

import hen.Hen;
import henbreeds.*;

public class HenFactory {

    public static Hen getHen(Breed breed){

        switch (breed){

            case RUSSIAN: return new RussianHen();

            case UKRAINIAN: return new UkrainianHen();

            case MOLDOVAN: return new MoldovanHen();

            case BELARUSIAN: return new BelarusianHen();

            default: return null;
        }

    }

}
