public class Main
{
    
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            } 
        }  
        return new int[]{};
    }
	
    /*
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target - nums[i])){
                return new int[]{mp.get(target - nums[i]), i};
            }else{
                mp.put(nums[i], i);
            }
        }
        return new int[]{};
    }
    }
   */
    
	public static void main(String[] args) {
	    int a[] = new int[] {2,7,11,15};
	    for(int x: twoSum(a, 9)){
	        System.out.print(x+" ");
	    }
	    System.out.println();
	}
}
