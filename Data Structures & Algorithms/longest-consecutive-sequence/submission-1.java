class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int length = 0;

        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int increment = 1;
                while(set.contains(nums[i] + increment)){
                    increment++;
                }
                length = Math.max(increment, length);
            }
        }

        return length;
    }
}
