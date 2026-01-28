package pac.Maven_Train;

public class StringFormat {

    private StringtoUpperCase uppercase;

    public StringFormat(StringtoUpperCase uppercase) {
        this.uppercase = uppercase;
    }

    public String format(String input) {
        return uppercase.toUpperCase(input);
    }
}
