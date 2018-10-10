package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WordComparator mwCp = new WordComparator();
        char[] wOrder = "ABC".toCharArray(); //{'a','b','c'};
        List<Character> ac = Arrays.asList('D','b','c');
        ArrayList<Character> aal = new ArrayList<>();
        aal.addAll(ac);
        System.out.println(ac.toString());
        aal.add('A');
        System.out.println(aal.toString());

        aal.sort(Comparator.naturalOrder());
        System.out.println(aal.toString());

        PriorityQueue<Character> myq = new PriorityQueue<>();
        myq.addAll(aal);

        myq.stream().forEach(e->System.out.println(e));



        MyWord mw1 = new MyWord("ABC","ABC".toCharArray() );
        MyWord mw2 = new MyWord("CA","ABC".toCharArray() );
        ArrayList<MyWord> myStringList = new ArrayList<>();
        myStringList.sort(mwCp);
        Iterator<MyWord> it = myStringList.iterator();

        while(it.hasNext()){
            MyWord cur = it.next();
            cur.getWordLength();

        }

        if(mwCp.compare(mw1, mw2) <=0)
            System.out.println("mw1 is smaller than mw2");
        else
            System.out.println("mw1 is bigger than mw2");

        int[] arr = {1,23,4,5,2};
        int ar1[] = {1,3,12,4,3};
        String[] testStr = {"aa", "bb", "cc"};
        String test[] = {"bc", "dd", "fa"};

        String joined = String.join(",",testStr );
        String a = String.valueOf(1);


        System.out.println("Joined " + joined);
        System.out.println(Arrays.toString(testStr));

        Arrays.stream(testStr).forEach(e-> System.out.println(e));
        Arrays.stream(test).forEach(e-> System.out.println(e));

    }
}

class MyWord {

    String word;
    char[] order;

    public MyWord(String word, char[] order){
        this.order = new char[order.length];
        this.order = Arrays.copyOf(order, order.length);
        this.word = word;

    }

    public int getWordLength(){
        return word.length();
    }



}


class WordComparator implements Comparator<MyWord>{
    @Override
    public int compare(MyWord w1, MyWord w2){
        if(w1.getWordLength() < w2.getWordLength())
            return -1;
        return 0;
    }
}