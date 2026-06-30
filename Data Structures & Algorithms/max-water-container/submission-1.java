class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length-1;

        int maxVolume = 0;

        while(start < end){
            maxVolume = Math.max(Math.min(heights[start], heights[end])*(end-start), maxVolume);
            if(heights[start] > heights[end]){
                end--;
            }else{
                start++;
            }
        }

        return maxVolume;
    }
}
