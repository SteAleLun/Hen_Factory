package henbreeds;

import hen.Hen;

public class MoldovanHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 26;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                " Моя страна - Молдова."
                + " Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
