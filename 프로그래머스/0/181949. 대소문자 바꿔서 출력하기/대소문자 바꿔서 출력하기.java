import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for(Character arr : a.toCharArray()){
            if(Character.isUpperCase(arr)){
                result+=Character.toLowerCase(arr);   
            }else if(Character.isLowerCase(arr)){
                result+=Character.toUpperCase(arr);   
            }
        }
            System.out.print(result);
    }
}