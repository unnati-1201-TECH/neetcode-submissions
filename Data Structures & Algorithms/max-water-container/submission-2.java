class Solution {
    public int maxArea(int[] heights) {
        int maxVolume = 0;

        int i = 0;
        int j = heights.length-1;

        while(i < j){
            int volume = Math.min(heights[i], heights[j])*(j-i);
            maxVolume = Math.max(volume, maxVolume);

            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }

        return maxVolume;
    }
}
