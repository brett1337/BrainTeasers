/**
 * Created by Brett on 4/10/2017.
 */
public class Teaser {
    public Teaser(int index) {
        switch (index) {
            case 1:
                break;
            case 2:
                new MissingIntTeaser(index);
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
    private void run() {
        System.out.println("Teaser");

    }
}
