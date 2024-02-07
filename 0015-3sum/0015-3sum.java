class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> p=new ArrayList<>();
        Set<List<Integer>> s=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                //int a=nums[i]+nums[l]+nums[r];
                if(nums[l]+nums[r]==-nums[i]){
            s.add(Arrays.asList(nums[i],nums[l],nums[r]));
            l++;
            r--;
                }
                else if(nums[l]+nums[r]<-nums[i]){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
      p.addAll(s);
      return p;
    }
}