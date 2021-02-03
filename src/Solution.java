import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j,res;
        int len = nums.length;
        for(i = 0;i < len - 1;i++){
            for(j = i + 1;j < len;j++){
                res = nums[i] + nums[j];
                if(res == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No this two number");
    }
}
//本题可以用平衡二叉树，和哈希表，由于不用考虑元素顺序，所以用哈希表
class Solution2{
    public int[] twoSum(int []nums,int target){
        int len = nums.length;
        // 初始化哈希表
        // java官方文档建议我们初始化哈希表时指定容量，避免浪费
        Map<Integer,Integer> hashMap = new HashMap<>(len - 1);
        //由于第0个元素一定没有对应的项，所以直接放进哈希表中
        hashMap.put(nums[0],0);

        for(int i = 1;i < len;i++){
            int another = target - nums[i];
            if (hashMap.containsKey(another)){
                return new int[] {i,hashMap.get(another)};
            }
            //如果没有这个元素，那么就放进哈希表中，等待遍历到下一个元素时用于匹配
            hashMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No this two number");
    }
}
