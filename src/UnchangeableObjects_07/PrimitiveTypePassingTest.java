package UnchangeableObjects_07;


public class PrimitiveTypePassingTest {
    public static void main(String []args){
        int a = 5;
        System.out.println(a);
        changeValue(a);
        System.out.println(a);

        a = 5;
        int b = 6;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);


    }
    private static void changeValue(int a){
        a = 10;
    }
    private static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        int [] res = {a,b};
    }

}
