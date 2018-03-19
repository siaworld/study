public class Countable {

    static int value;
    public Countable(int x){
        value = x;
    }
    int getValue(){
        return value;
    }
    void setValue(int val){
        this.value = val;
    }
}
