public class MedianTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Vector<Integer> list=new Vector<Integer>();
        int i=0,j=0;
        while(i<nums1.length || j<nums2.length){
            if(i<nums1.length && j<nums2.length){
                if(nums1[i]<nums2[j]){
                    list.add(nums1[i]);i++;
                }else{list.add(nums2[j]);j++;}
            }
            else if(i>=nums1.length){
                list.add(nums2[j]);j++;
            }else{
                list.add(nums1[i]);i++;
            }
        }
        if(list.size()%2 == 0){
            return (double)((list.get(list.size()/2) + list.get(list.size()/2-1)))/2;
        }else{
            return (double)(list.get(list.size()/2));
        }
    }
    public static void main(String args[]){
        MedianTwoSortedArray medianTwoSortedArray = new MedianTwoSortedArray();
        System.out.println(medianTwoSortedArray.findMedianSortedArrays(new int[]{2},new int[]{}));
    }
}
