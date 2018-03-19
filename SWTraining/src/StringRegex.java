import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {

    public static void main(String[] args){

        String test = "This's is for String testing 123 and ab3";

        char[] testChar = test.toCharArray();

        //StringTokenizer st = new StringTokenizer(test);
        String regex = "[\\p{Punct}\\s]+";
        String[] token = test.split(regex);

        for(String s : token)
            System.out.println(s + " ");




    }

}
