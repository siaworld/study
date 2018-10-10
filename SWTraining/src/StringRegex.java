import java.util.*;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringRegex {

    public static void main(String[] args){

        String test = "This's is This for String for testing 123 and ab3";

        char[] testChar = test.toCharArray();
        boolean[] visited = {false};

        Queue<String> nameQ = new LinkedList<>();

        Stack<String> nameSt = new Stack<>();


        List<String> listNames = Arrays.asList("Zero", "Alice", "Bob", "Cole", "Dale", "Eric", "Frank");
        String[] nameArray = new String[]{"Zero", "Alice", "Bob", "Cole", "Dale", "Eric", "Frank"};
        Arrays.sort(nameArray);
        Arrays.asList(nameArray);


        listNames.sort(Comparator.naturalOrder());
        //Queue<String> queueNames = new LinkedList<>(listNames);
        System.out.println(listNames.toString());


                //StringTokenizer st = new StringTokenizer(test);
        String regex = "[\\p{Punct}\\s]+";
        String[] token = test.split(regex);
        String test1 = "this is for testing exercise";


        Pattern p = Pattern.compile("[\\w]+");

        Matcher m = p.matcher(test);
        HashMap<String, Integer> wordMap = new HashMap<>();

        Map<String, Integer> myMap = new HashMap<String, Integer>();

        while(m.find()){
            int cnt;
            String word;

            word = m.group();
            if(wordMap.get(word) == null){
                wordMap.put(word, 1);
            }else{
                cnt = wordMap.get(word);
                wordMap.put(word, cnt+1);

            }
            Hashtable<String, Integer> ht = new Hashtable<>();
            HashMap<String, Integer> hm = new HashMap<>();
            String str=new String("anb");





        }

        HashMap<String, Integer> topTen = wordMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));


            wordMap.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .forEach(e -> {System.out.println(e.getKey() + " " + e.getValue());});

//
//                        .collect(Collectors.toMap(
//                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));


        System.out.println(topTen.toString());
        ArrayList<Integer> numList = new ArrayList<>();
        for(String s : token)
            System.out.println(s + " ");





    }

}
