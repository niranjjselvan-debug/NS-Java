package Basics;

import java.util.Scanner;

public class ScannerUsage {
    static void main(String[] args) {
        Scanner scan = new Scanner(" Niranjj, Nivejaa, Geetha, Selvan");
        scan.useDelimiter(",");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();

        Scanner scan_01 = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int input_int = scan_01.nextInt();
        System.out.println("Enter a string : ");
        String input_string = scan_01.next();
        scan_01.nextLine();
        System.out.println("Enter a line : ");
        String input_line = scan_01.nextLine();
        System.out.println("Integer is : " + input_int + "String is :" + input_string + "Line is :" + input_line);
        scan_01.close();
    }
}
