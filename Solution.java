import java.util.Scanner;

public class Solution {

    public String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split(" ");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + str[0];
    }

    public static void main(String[] args) {

        Solution s1 = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :- ");
        String s = sc.nextLine();
        System.out.println(s1.reverseWords(s));
        sc.close();
    }
}