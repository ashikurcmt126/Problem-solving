/*
Input: height = [4,3,2,1,4]
Output: 16
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
*/

public class ContainersWithMostWater {

    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int maxi = 0;
        while(start < end){
            int mini = Math.min(height[start],height[end]);
            maxi = Math.max(maxi, (end - start)*mini);
            if(height[start] < height[end])start++;
            else end--;
        }
        return maxi;
    }

    public static void main(String args[]){
        ContainersWithMostWater containers = new ContainersWithMostWater();
        System.out.println(containers.maxArea(new int[]{4,3,2,1,4}));
    }
}
