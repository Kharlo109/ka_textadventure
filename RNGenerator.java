import java.util.Random;

public class RNGenerator {

    public static void main(String args[]) {

        Random rand = new Random(); 

        int int_random = rand.nextInt();

        System.out.println(int_random);
    }
}