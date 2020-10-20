import org.apache.commons.lang3.StringUtils;
public class StringPlay {
    public static void main(String[] args) {
        System.out.print(capitlizeLetter("b"));
    }

    public static String capitlizeLetter(String letter) {
        return StringUtils.upperCase(letter);
    }
}