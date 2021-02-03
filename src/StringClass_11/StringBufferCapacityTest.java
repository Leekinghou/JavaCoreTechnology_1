package StringClass_11;

public class StringBufferCapacityTest {
    public static void main(String []args){
        //StringBuffer的初始大小为（16+初始字符串长度）即capacity=16+初始字符串长度
        //length 实际长度  capacity  存储空间大小
        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1 length: " + sb1.length());
        System.out.println("sb1 capacity: " + sb1.capacity());
        System.out.println("===================");

        StringBuffer sb2 = new StringBuffer("123");
        sb2.append("456");
        System.out.println("sb2 length: " + sb2.length());
        System.out.println("sb2 capacity: " + sb2.capacity());
        System.out.println("===================");

        sb2.append("7890123456789");
        System.out.println("sb2 length: " + sb2.length());
        System.out.println("sb2 capacity: " + sb2.capacity());
        System.out.println("===================");
    }
}
