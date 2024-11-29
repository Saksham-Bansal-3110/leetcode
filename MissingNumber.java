class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int i=0; i<n; i++){
            freq[nums[i]]++;
        }
        for(int i=0; i<n+1; i++){
            if(freq[i] == 0) return i;
        }
        return n+1;
    }
}