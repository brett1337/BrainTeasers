/**
 * Created by Brett on 4/17/2017 in Brain_Teasers.
 * Base class that handles unsupported teasers.
 */
class Teaser {
    Teaser(int n) {
        System.out.println("You have selected option #" + n);
    }
    public void run () {
        System.out.println("This teaser does not yet exist. Please select another.");
    }
}
