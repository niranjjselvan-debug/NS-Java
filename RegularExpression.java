public class RegularExpression {
    public static void main(String[] args) {
        // Example usage of regular expressions in Java
        String regex = "^[a-zA-Z0-9]+$"; // Matches alphanumeric strings
        String testString = "#$";

        if (testString.matches(regex)) {
            System.out.println("The string matches the regular expression.");
        } else {
            System.out.println("The string does not match the regular expression.");
        }
    }
}
