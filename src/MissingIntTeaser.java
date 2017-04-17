import java.util.Scanner;

/**
 * Created by Brett on 4/10/2017.
 */
public class MissingIntTeaser extends Teaser {
    MissingIntTeaser(int n) {
        super(n);
    }

    @Override
    public void run() {
        System.out.println("Enter a number that includes in order 1 to n but is missing one value:");
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        int n = Integer.parseInt(num);
        System.out.println(findMissingValwithStr(num));
    }

    private int findMissingValwithStr(String n) {
        int num = Integer.parseInt(n);
        int sum = (num % 10) * ((num % 10) + 1) / 2;
        for (char c : n.toCharArray()) {
            sum -= Integer.parseInt(Character.toString(c));
        }
        return sum;
    }

    private int findMissingValwithMod(int n) {
        int sum = (n % 10) * ((n % 10) + 1) / 2;
        int digit = 10;
        int value = n % digit;
        int rightSide = n % (digit/10);
        while (digit < n) {
            sum -= (value - rightSide) / (digit/10);
            digit *= 10;
            value = n % digit;
            rightSide = n % (digit/10) / (digit/100);
        }
        return sum;
    }
}
