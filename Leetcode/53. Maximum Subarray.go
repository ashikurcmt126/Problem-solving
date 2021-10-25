package main

import (
	"fmt"
)

/*
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
*/

func maxSubArray(nums []int) int {
	for i := 1; i < len(nums); i++ {
		if nums[i-1] + nums[i] > nums[i] {
			nums[i] = nums[i-1] + nums[i]
		}
	}
	max := nums[0]
	for i := 1; i < len(nums); i++ {
		if max < nums[i] {
			max = nums[i]
		}
	}
	return max
}

func main() {
	fmt.Println(maxSubArray([]int{5,4,-1,7,8}))
}
