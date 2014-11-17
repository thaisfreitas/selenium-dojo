package selenium.config;

public class UriGenerator {

    public static String PROTOCOL = "http";
    public static String BASE_URL = "0.0.0.0";
    public static String PORT = "3000";

    public static String generateUri(String path) {
        return String.format("%s://%s:%s%s", PROTOCOL, BASE_URL, PORT, path);
    }
}
