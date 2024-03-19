import java.util.*;

public class ReverseString{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String r = "";
    for(int i=0;i<s.length();i++){
        r=s.charAt(i)+r;

    }
    System.out.println(r);
    }
    
    

}