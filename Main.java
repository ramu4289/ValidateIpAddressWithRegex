import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ///MyRegex.java class to validate ip address with regular expression
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }
            in.close();
    }
}