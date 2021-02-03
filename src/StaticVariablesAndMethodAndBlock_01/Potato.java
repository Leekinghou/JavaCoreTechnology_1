package StaticVariablesAndMethodAndBlock_01;

public class Potato {
    static int price = 5;
    String content = "";
    public Potato(int price,String content)
    {
        this.price = price;
        this.content = content;
    }
    public static void main(String []a)
    {
        System.out.println(Potato.price);  //5
        System.out.println("-------------------");
        Potato obj1 = new Potato(10,"青椒土豆丝");
        System.out.println(Potato.price);  //10
        System.out.println(obj1.price);    //10

        System.out.println("-------------------");
        Potato obj2 = new Potato(20,"酸辣土豆丝");
        System.out.println(Potato.price);  //20
        System.out.println(obj2.price);   //20
    }
    //说明static变量不管有多少个对象，内存中只有一份
}
