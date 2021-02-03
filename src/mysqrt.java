public class mysqrt {
    public static int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }
        int lo = 1;
        int hi = x / 2;
        while(lo < hi){
            int mid = lo + (hi - lo + 1) / 2;
            if(mid > x / mid){
                hi = mid - 1;
            }else {
                lo = mid;
            }
        }
        return lo;
    }
    public static  void main(String[] args){
        int x = 8;
        System.out.println(mySqrt(x));
    }
}