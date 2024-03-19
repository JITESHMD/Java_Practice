import java.util.*;
import java.util.regex.Pattern;
public class ReverseWords {
    static String reverse(String A) {
        A=A.trim(); // to remove the trailing spaces 
        Pattern p = Pattern.compile("\\s+");//s+ is for to handle in btw spaces 
        String[] temp = p.split(A);
        StringBuilder re = new StringBuilder(); // Use StringBuilder for efficiency
        for (int i = temp.length - 1; i >= 0; i--) { // Iterate backwards through the array
            re.append(temp[i]); // Append the word
            if (i > 0) { // Add a space if it's not the last word
                re.append(" ");
            }
        }
        return re.toString();
    }

    public static void main(String [] args) {
            Scanner sc =new Scanner(System.in);
            String s =sc.nextLine();
            String res = reverse(s);
            System.out.println(res);
        }
}
