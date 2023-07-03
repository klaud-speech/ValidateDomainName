import java.util.regex.*;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class CFG {
    public static boolean isValidDomain(String str){
        // Regex to check valid domain name.
        String regex = "^((?!-)[A-Za-z0-9-]"
                + "{1,63}(?<!-)\\.)"
                + "+[A-Za-z]{2,6}";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if ( str == null ){
            return false;
        }

        // Pattern class contains matcher()
        // method to find the matching
        // between the given string and
        // regular expression.
        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();

    }

    public static void main ( String args[] ){

        // Test Case 1:
        String str1 = "aaa.llsollu.com";
        System.out.println(isValidDomain(str1));

        try{
            InetAddress addr = java.net.InetAddress.getLocalHost();
            System.out.println(addr);
            String hostname = addr.getHostName();
            System.out.println("Hostname of system = " + hostname );
        } catch ( UnknownHostException e){
            System.out.println(e);
        }
        System.out.println("Done!");

    }

}
