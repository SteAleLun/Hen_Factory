import henfactory.HenFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println(HenFactory.getHen("Russian").getDescription());
        System.out.println(HenFactory.getHen("Ukrainian").getDescription());
        System.out.println(HenFactory.getHen("Moldovan").getDescription());
        System.out.println(HenFactory.getHen("Belarusian").getDescription());

    }
}
