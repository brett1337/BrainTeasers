/**
 * Created by Brett on 4/10/2017.
 */
public class TeaserPicker {

    public static Teaser pickTeaser(int index) {
        Teaser teaser;
        switch (index) {
            case 1:
                teaser = new Teaser(index);
                break;
            case 2:
                teaser = new MissingIntTeaser(index);
                break;
            case 3:
                teaser = new Teaser(index);
                break;
            default:
                System.out.println("Invalid");
                teaser =  new Teaser(index);
                break;
        }
        return teaser;
    }
}
