import java.util.Scanner;

public class MaximumSubStr {

    static int solve(String A, int B) {
        int max = 0;

        for (int i = 0; i < A.length(); i += B) {
            int count = 0;
            String s;
            if (i + B > A.length()) {
                s = A.substring(i);
            } else {
                s = A.substring(i, i + B);
            }

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a') {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int B = sc.nextInt();
        System.out.println(solve(A,B));
    }
    
}
