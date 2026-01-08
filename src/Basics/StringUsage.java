package Basics;

public class StringUsage {
    static void main(String[] args) {
        String firstName = "Niranjj";
        Character result = firstName.charAt(0);
        System.out.println("result is : " + result);
        String name_01 = "Selvan";

        String lastName = "Selvan";
        System.out.println("Fullname is : " + firstName + lastName);
        System.out.println("Fullname is : " + firstName.concat(lastName));
        String fullName = firstName + lastName;
        System.out.println("Does fullname contains njjS ?  : " + fullName.contains("njjS"));
        System.out.println("FirstName ends with jj? : " + firstName.endsWith("jj"));
        System.out.println("is first name and last name are equal? " + firstName.equalsIgnoreCase(lastName));
    }
}

