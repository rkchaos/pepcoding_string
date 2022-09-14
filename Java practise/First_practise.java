
import java.util.Random;
import java.util.Scanner;
public class First_practise {
    public static void solution(String s) {
        for (int i = 0; i <= s.length() - 1; i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String ss = s.substring(i, j);
                if (ispalindrom(ss) == true) {
                    System.out.println(ss);
                }
            }
        }
    }

    public static boolean ispalindrom(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1 != ch2) {
                return false;
            } else {
                j--;
                i++;
            }

        }
        return true;
    }
    
    public static void main(String[] args) {
        //   logical operator
        // System.out.println(1==2 || 2>=1);
        // System.out.println(1 == 2 && 2 >= 1);

        // Bitwise operator
        // int a = 5;
        // int b = 4;
        // System.out.println(a & b);
        // System.out.println(a | b);
        // System.out.println(~a);
        // System.out.println(a^b);

        // Increment and decrement

        // int a = 56;
        // post increment
        // System.out.println(a++);
        // System.out.println(a);
        // int b = 50;

        // pre increment
        // System.out.println(++b);
        // System.out.println(b);

        // char raj = 'a';
        // System.out.println(++raj);

        // Questions
        // 1
        //     float a = (7 / 4f) * (9 / 2f);
        //  System.out.println(a);

        // 2
        // char grade = 'A';
        // grade = (char) (grade+8);
        // System.out.println(grade);
        // char grades = 'A';
        // grades = (char) (grade-8);
        // System.out.println(grades);

        // end

        //     String name = "Raj";
        // System.out.println(name);

        // String name = new String("Raj");
        // System.out.println(name);

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        //  name.length
        // String name = "Raj kumar";
        // int value = name.length();
        // System.out.println(value);

        // name.lowercase
        // String name = "Raj kumar";
        // String raj = name.toLowerCase();
        // System.out.println(raj);

        // name.uppercase
        // String name = "Raj kumar";
        // String raj = name.toUpperCase();
        // System.out.println(raj);

        // name.trim
        // String name = " Raj kumar ";
        // String raj = name.trim();
        // System.out.println(name);
        // System.out.println(raj);

        // name.substring
        // String name = "kumar";
        // int Raj = name.length();
        // String raj = name.substring(1);
        // System.out.println(raj);
        // System.out.println(Raj);

        // 
        // String name = new String("Rajkumar");
        // String raj = name.substring(1, 8);
        // System.out.println(raj);

        // name.replace
        // String name = new String("rajkumar");
        // String raj = name.replace('a', 'j');
        // System.out.println(raj);

        // name.start with
        // String name = "Rajkumar";
        //  boolean raj = name.startsWith("M");
        // System.out.println(raj);

        // name.charAt()
        // String name = new String("Rajkumar");
        // char raj = name.charAt(2);
        // System.out.println(raj);

        // name.index()
        // String name = new String("Rajkumar");
        // int raj = name.indexOf('j');
        // System.out.println(raj);
        // 
        // name.index()
        // String name = new String("Rajkumar");
        // int raj = name.indexOf('j',3);
        // System.out.println(raj);

        // 
        // String name = new String("Rajkumar");
        // int raj = name.indexOf('j',3);
        // System.out.println(raj);

        // name.lastindex()
        // String name = new String("aajkumrr");
        // int raj = name.lastIndexOf('r');
        // System.out.println(raj);

        // name.equal
        // String name = new String("aajkumrr");
        // boolean raj = name.equals("aajkumrr");
        // System.out.println(raj);

        // name.Ignorcase
        // String name = new String("RAJKUMAR");
        // boolean raj = name.equalsIgnoreCase("rajkumar");
        // System.out.println(raj);

        // Switch case
        // System.out.println("enter your age");
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // switch (age){
        //     case 18:
        //     System.out.println("your are adult");
        //     break;

        //     case 19:
        //     System.out.println("your are adult 1");
        //     break;
        // }

        // Rock ,paper,sccissor
        // System.out.println("Lets play game");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Choose 0rock , 1 paper , 2scissor");
        // int user_input = sc.nextInt();
        // Random random = new Random();
        // int computer_input = random.nextInt(3);
        // System.out.println(computer_input);
        // if (user_input == computer_input) {
        //     System.out.println("Draw");
        // }
        // else if (user_input==0 && computer_input==2||user_input==1 && computer_input==0||user_input==2 && computer_input==1) {
        //    System.out.println("You win");
        // } else {
        //     System.out.println("Computer win");
        // }
        // System.out.println("Game over");

        // Array
        // There are three way to store array

        // 1 Intilization and memory allocation and initializing
        // int[] arr;
        // arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
        // System.out.println(arr[0]);

        // 2 Intilization+memory allocation and initializaing 
        //     int [] arr=new int[5];
        // arr[0] = 1;
        //     arr[1] = 2;
        //     arr[2] = 3;
        //     arr[3] = 4;
        //     arr[4] = 5;
        //     System.out.println(arr[2]);

        // 3 Intilization+memory allocation+initization
        // int[] arr = { 1, 2, 3, 4, 5 };
        // System.out.println(arr[2]);
        // System.out.println(arr.length);

        // Displaying of an array
        // int[] arr = { 1, 2, 34, 4, 5, };
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // int[] arr = { 1, 2, 34, 4, 5, };
        // for( int element:arr){
        //      System.out.println(element);
        // }

        // print array in reverse order
        //     int[] arr = { 11, 22, 33, 44, 55 };
        //     for (int i = arr.length-1; i>= 0; i--) {
        //     System.out.println(arr[i]);
        //   }
        // Multidimmenssional array
        // int[][] flat = new int[2][3];
        // flat[0][0]=1;
        // flat[0][1]=2;
        // flat[0][2]=3;
        // flat[1][0]=4;
        // flat[1][1]=5;
        // flat[1][2] = 6;
        // for (int i = 0; i < flat.length; i++) {
        //     for (int j = 0; j < flat[i].length; j++) {
        //         System.out.print(flat[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // array questions

        // sum of one array
        //     float sum = 0;
        //     float[] arr = { 1.2f, 2.3f, 3.2f, 4.4f };
        //     for (int i = 0; i < arr.length; i++) {
        //         sum = sum + arr[i];
        //     }
        //    System.out.println(sum);

        //    palndrom string
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        solution(s);
    }

}
