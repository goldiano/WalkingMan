import java.util.Random;

public class RandomMachine {
    Random random = new Random();

    int returnRandomPos(int number) {
        return random.nextInt(number);
    }
}
