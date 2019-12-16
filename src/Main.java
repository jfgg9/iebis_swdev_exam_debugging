import java.util.Random;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        String emailAddress = "john.doe.mis2016@ie.edu";
        String formattedEmailAddress = emailAddress.replaceAll("\\.", "/");

        Random random = new Random();
        StringBuffer word = null;

        switch (random.nextInt(3)) {
            case 0:
                System.out.println("first");
                word = new StringBuffer('Y');
                word.append('Y');
                break;
            case 1:
                System.out.println("second");
                word = new StringBuffer('F');
                break;
            case 2:
                System.out.println("third");
                word = new StringBuffer('T');
                break;
        }

        word.append('o');
        word.append('u');
        word.append('r');

        System.out.println(word + " " + formattedEmailAddress);
    }
}
