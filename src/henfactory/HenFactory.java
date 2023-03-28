package henfactory;

import hen.Hen;
import henbreeds.*;

public class HenFactory {

    public static Hen getHen(Breed breed){

        if(breed == Breed.RUSSIAN) return new RussianHen();
        if(breed == Breed.UKRAINIAN) return new UkrainianHen();
        if(breed == Breed.MOLDOVAN) return new MoldovanHen();
        if(breed == Breed.BELARUSIAN) return new BelarusianHen();

        else return null;

    }

}
