package UnchangeableObjects_07;

public class StringPassingTest {
    public static void main(String[] args){
        String a = "abc";
        changeValue(a);
        System.out.println(a);
    }

    public static void changeValue(String b){
        b = "def";
    }
}
