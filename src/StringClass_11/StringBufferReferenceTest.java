package StringClass_11;

public class StringBufferReferenceTest {
    public static void main(String []args){
        StringBuffer sb1 = new StringBuffer("123");
        StringBuffer sb2 = sb1;

        sb1.append("23432423432430948599029034450023990909342495878787888878");
        System.out.println(sb2);
        //sb1 和 sb2指向同一个内存
    }
}
