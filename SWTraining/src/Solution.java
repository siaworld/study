

public class Solution {

    public static void main(String... args){
        Countable[] thingArr = new Countable[10];
        thingArr[0] = new Countable(10);
        thingArr[1] = new Countable(1);
        thingArr[2] = new Countable(5);
        thingArr[3] = new Countable(11);

        AnySort<Countable> sorting = new AnySort<>(thingArr);

        sorting.sort(0,3);
        for(int i=0;i<4;i++){
            System.out.println(i +" : "+ thingArr[i].getValue());
        }



    }
}
