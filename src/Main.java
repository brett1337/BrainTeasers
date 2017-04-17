import java.util.Scanner;

/**
 * Created by Brett on 4/10/2017.
 * Find missing letter
 * Find missing integer from 1 to n
 * Find if there is a cycle in a LinkedList
 */

class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        String checkQuit = "";
        while (!checkQuit.equals("q")) {
            System.out.print("Missing letter (1)\nMissing integer from 1 to n (2)\nLinkedList Cycle (3)\n");
            Scanner s = new Scanner(System.in);
            String index = s.nextLine();
            checkQuit = index;
            Teaser teaser = TeaserPicker.pickTeaser(Integer.parseInt(index));
            teaser.run();
        }
    }
}
