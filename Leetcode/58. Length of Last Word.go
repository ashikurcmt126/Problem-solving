package main

import (
	"fmt"
)

/*
Input: s = "   fly me   to   the moon  "
Output: 4
*/

func lengthOfLastWord(s string) int {
    rns := []rune(s)
    for i,j :=0, len(rns)-1;i<j;i,j = i+1,j-1{
	rns[i], rns[j] = rns[j], rns[i]
    }
    s1, check, count := string(rns),0,0
    for i :=0; i<len(s1);i++{
	if s1[i] != ' '{
	  count++
	  check = 1
	}else if s1[i] == ' ' && check == 1 {
	    break;
	}
    }
    return count
}

func main() {
	fmt.Println(lengthOfLastWord("luffy is still joyboy"))
}
