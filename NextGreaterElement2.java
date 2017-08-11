public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];
        Stack<Integer> s = new Stack<>();
        
        for (int i = n-1; i >= 0; i--){
            s.push(i);
        }
        
        for (int i = n-1; i >=0; i--){
            results[i] = -1;
            while (!s.isEmpty() && nums[s.peek()] <= nums[i]){
                s.pop();
            }
            if (!s.isEmpty()){
                results[i] = nums[s.peek()];
            }
            s.push(i);
        }
        
        return results;
    }
}

