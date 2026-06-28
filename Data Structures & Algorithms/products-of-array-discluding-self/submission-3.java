class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        int productLeft = 1;

        for(int i=0; i<nums.length; i++){
            leftProduct[i] = productLeft;
            productLeft *= nums[i];
        }

        int productRight = 1;

        for(int i=nums.length-1; i>=0; i--){
            rightProduct[i] = productRight;
            productRight *= nums[i];
        }

        int[] productWithoutSelf = new int[nums.length];

        for(int i=0; i<productWithoutSelf.length; i++){
            productWithoutSelf[i] = leftProduct[i]*rightProduct[i];
        }

        return productWithoutSelf;
    }
}  
