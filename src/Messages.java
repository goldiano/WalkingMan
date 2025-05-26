import java.util.List;
import java.util.ArrayList;

public class Messages {

    private List<String> infogames = new ArrayList<>();

    Messages() {
        addInfo();
    }
    void addInfo() {
        infogames.add("Start Game ");
        infogames.add("Where to go ? Write UP, DOWN, LEFT, RIGHT, UP-LEFT, UP-RIGHT, DOWN-LEFT, DOWN-RIGHT ");
        infogames.add("Mniam ");
        infogames.add("Och no, the monster catch you. THE END");
        infogames.add("Try again ?");
    }
    String getInfo(int numberM) {
        return infogames.get(numberM);
    }


}
