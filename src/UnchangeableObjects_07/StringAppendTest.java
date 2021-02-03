package UnchangeableObjects_07;
import java.util.Calendar;
public class StringAppendTest {
    public static void main(String []args){
        int n = 50000;
        Calendar t2 = Calendar.getInstance();
        String a = new String();
        for(int i = 0;i < n;i++){
            a = a + i + ",";
        }
        System.out.println(Calendar.getInstance().getTimeInMillis() - t2.getTimeInMillis());

        Calendar t3 = Calendar.getInstance();
        StringBuffer b = new StringBuffer("");

        for(int i = 0;i < n ;i++){
            b.append(i);
            b.append(",");
        }
        System.out.println(Calendar.getInstance().getTimeInMillis() - t3.getTimeInMillis());
    }
}
