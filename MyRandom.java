import java.util.Random;

public class MyRandom {

    public static void main(String[] arguments) {

	/* create instance of Random class */
	Random myRandom = new Random();

	/* generate random integer in range 0 to 999 */
	int randomInteger = myRandom.nextInt(1000);

	System.out.println(randomInteger);

    }

}
