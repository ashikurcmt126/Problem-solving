package main

import (
	"fmt"
)

/*
Input: nums = [1,3,5,6], target = 5
Output: 2
*/

func searchInsert(nums []int, target int) int {
	if nums[0] > target || nums[0]==target {
		return 0
	}
	if nums[len(nums)-1] < target {
		return len(nums)
	}
	
	for i := 0; i < len(nums)-1; i++ {
		if nums[i] == target {
			return i
		} else if nums[i] < target && nums[i+1] > target {
			return i + 1
		}
	}
	if nums[len(nums)-1] == target {return len(nums)-1}
	return 0
}

func main() {
	fmt.Println(searchInsert([]int{1,3}, 3))
}
