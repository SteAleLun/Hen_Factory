import henbreeds.Breed;
import henfactory.HenFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println(HenFactory.getHen(Breed.RUSSIAN).getDescription());
        System.out.println(HenFactory.getHen(Breed.UKRAINIAN).getDescription());
        System.out.println(HenFactory.getHen(Breed.MOLDOVAN).getDescription());
        System.out.println(HenFactory.getHen(Breed.BELARUSIAN).getDescription());

    }
}
