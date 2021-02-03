package Constant_04;

public class CacheTest {
    public static void main(String []args){
        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println("Boolean Test: "+String.valueOf(b1 == b2));

        Byte b3 = 127;
        Byte b4 = 127;
        System.out.println("Byte Test: "+String.valueOf(b3 == b4));

        Character c1 = 127;
        Character c2 = 127;
        System.out.println("Character Test: "+String.valueOf(c1 == c2));

        Integer i1 = -128;
        Integer i2 = -128;
        System.out.println("Integer Test: "+String.valueOf(i1 == i2));

        Long lo2 = -128L;
        Long lo3 = -128L;
        System.out.println("Long Test: "+String.valueOf(lo2 == lo3));
        //"L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。

        Float f1 = 0.5f;
        Float f2 = 0.5f;
        System.out.println("Float Test: "+String.valueOf(f1 == f2));

        Double d1 = 0.5;
        Double d2 = 0.5;
        System.out.println("Double Test: "+String.valueOf(d1 == d2));
    }
}
