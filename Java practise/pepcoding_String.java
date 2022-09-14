import java.util.Scanner;

public class pepcoding_String {
    // public static boolean ispalindrome(String s) {
    //     int i = 0;
    //     int j = s.length() - 1;
    //     while (i <= j) {
    //         char ch1 = s.charAt(i);
    //         char ch2 = s.charAt(j);
    //         if (ch1 != ch2) {
    //             return false;
    //         } else {
    //             j--;
    //             i++;
    //         }

    //     }

    //     return true;

    // }
    // public static void solution(String s) {
    //     for (int i = 0; i <= s.length()-1; i++) {
    //         for (int j = i + 1; j <= s.length(); j++) {
    //             String ss = s.substring(i, j);
    //             if (ispalindrome(ss) == true) {
    //                 System.out.println(ss);
    //             }
    //         }
    //     }
    // }

    // public static String compression1(String str) {
    //     String s = str.charAt(0) + "";
    //     for (int i = 1; i < str.length(); i++) {
    //         char curr = str.charAt(i);
    //         char pre = str.charAt(i - 1);
    //         if (curr != pre) {
    //             s = s + curr;
    //         }
    //     }
    //     return s;
    // }

    // public static String compression2(String str) {
    //     String s = str.charAt(0) + "";
    //     int count = 1;
    //     for (int i = 1; i < str.length(); i++) {
    //         char curr = str.charAt(i);
    //         char pre = str.charAt(i - 1);
    //         if (curr == pre) {
    //             count++;
    //         } else {
    //             if (count > 1) {
    //                 s += count;
    //                 count = 1;

    //             }
    //             s += curr;

    //         }

    //     }
    //     if (count > 1) {
    //         s += count;
    //         count = 1;
    //     }
    //     return s;
    // }

    // public static String togglecase(String str) {
    //     StringBuilder sb = new StringBuilder(str);
    //     for (int i = 0; i < sb.length(); i++) {
    //         char ch = sb.charAt(i);
    //         if (ch >= 'a' && ch <= 'z') {
    //             char upr = (char) ('A' + ch - 'a');
    //             sb.setCharAt(i, upr);
    //         } else if (ch >= 'A' && ch <= 'Z') {
    //             char low = (char) ('a' + ch - 'A');
    //             sb.setCharAt(i, low);
    //         }

    //     }
    //     return sb.toString();
    // }
    
    
    
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // for (int i = 0; i <= s.length()-1 ; i++) {
        //     for (int j = i+ 1; j <= s.length(); j++) {
        //         System.out.println(s.substring(i, j));
        //     }
        // }

        // Add char at string
        //         String s = "hellow";
        //         s += " ";
        //         s += 'r';
        //         s += "";
        //         s += 'a';
        //         s += "";
        //         s += 'j';
        // System.out.println(s);

        // New thing
        //     // Due to left to right it print 22hello

        // System.out.println(12 + 10 + "hello");
        // Due to left to right it print hello1210

        // System.out.println("hello"+12 + 10 );

        // how to remove space between the string and print it  line by line  
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // String[] part = s.split(" ");
        // for (int i = 0; i < part.length; i++) {
        //     System.out.println(part[i]);
        // }

        // palindromic substring
        //         Scanner sc = new Scanner(System.in);
        //         String str = sc.nextLine();
        // solution(str);

        // String Bulider
        // StringBuilder sb = new StringBuilder("hello");
        // sb.setCharAt(0, 'd');
        // System.out.println(sb);
        // sb.insert(2, 'y');
        // System.out.println(sb);
        // sb.deleteCharAt(2);
        // System.out.println(sb);

        // sb.append('g');
        // System.out.println(sb);

        // String vs String bulider
        // String bulider take less time as compare to String

        // int n = 100000;
        // long start = System.currentTimeMillis();
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < n; i++) {
        //     sb.append(i);
        // }
        // long end = System.currentTimeMillis();
        // long duration = end - start;
        // System.out.println(duration);

        //  Question

        //         Scanner sc = new Scanner(System.in);
        //         String str = sc.next();
        //         System.out.println(compression1(str));
        // System.out.println(compression2(str));

        // convert uppar case to lower and wise versa
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // System.out.println(togglecase(s));

         
    }
}