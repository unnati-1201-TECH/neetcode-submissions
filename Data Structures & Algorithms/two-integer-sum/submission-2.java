class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(target - nums[i])){
                int[] answer = new int[2];
                answer[0] = hm.get(target - nums[i]);
                answer[1] = i;

                return answer;
            }

            hm.put(nums[i], i);
        }

        return null;
    }
}
