import java.util.Scanner;

public class StringPlayground {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Input what you wish to check.");
        s = in.nextLine();
        int count = findChar(s);
        System.out.println(count);
    }



    public static int findChar(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            }
            else if (c == ')') {count--;}
        }

        return count;
    }
    in.close();
}