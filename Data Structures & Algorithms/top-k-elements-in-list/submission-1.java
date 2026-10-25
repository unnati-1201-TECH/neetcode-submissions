class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }else{
                hm.put(nums[i], 1);
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        for(Map.Entry<Integer, Integer> pair : hm.entrySet()){
            int[] newPair = new int[2];
            newPair[0] = (int)pair.getKey();
            newPair[1] = (int)pair.getValue();

            pq.add(newPair);
        }

        for(int i=0; i<hm.size() -k; i++){
            pq.remove();
        }

        int[] answer = new int[k];
        for(int i=0; i<k; i++){
            answer[i] = (int) pq.remove()[0];
        }

        return answer;

    }
}
