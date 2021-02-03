package DateFormat_13;

import java.text.DecimalFormat;

public class Test {
    public static void main(String []args){
        double pi = 3.1415927;

        System.out.println(new DecimalFormat("0").format(pi)); //3

        System.out.println(new DecimalFormat("0.00").format(pi)); //3.14

        System.out.println(new DecimalFormat("00.000").format(pi)); //03.142

        System.out.println(new DecimalFormat("#").format(pi)); //3

        //以百分比方式记数，取两位小数
        System.out.println(new DecimalFormat("#.##%").format(pi)); //3

        long c = 299792458; //speed of light
        System.out.println(new DecimalFormat("#.#####E0").format(c)); // 2.99792E8

        System.out.println(new DecimalFormat("00.####E0").format(c)); //29.9792E7

        System.out.println(new DecimalFormat(",###").format(c)); // 299,792,458

        System.out.println(new DecimalFormat("光速大小为每秒,###").format(c)); //光速大小为每秒299,792,458
    }
}
