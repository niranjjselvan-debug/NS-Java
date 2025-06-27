public class RegularExpression {
    public static void main(String[] args) {
        // Example usage of regular expressions in Java
      randomRegularExpression();
      extractDomainFromURL();
    }

    private static void extractDomainFromURL() {
        String url = "https://www.example.com/path/to/resource?query=123";
        String regex = "https?://([^/]+)"; // Matches the domain part of the URL
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            String domain = matcher.group(1);
            System.out.println("Extracted domain: " + domain);
        } else {
            System.out.println("No match found.");
        }
    }


    private static void randomRegularExpression() {
        String regex = "^[a-zA-Z0-9]+$"; // Matches alphanumeric strings
        String testString = "#$";

        if (testString.matches(regex)) {
            System.out.println("The string matches the regular expression.");
        } else {
            System.out.println("The string does not match the regular expression.");
        }
    }
}
