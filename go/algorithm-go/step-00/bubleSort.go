package main

import "fmt"

func main() {
	intArray := []int{5, 1, 9, 7, 2, 3}

	for idx := (len(intArray) - 1); idx > 0; idx-- {
		for i, v := range intArray {
			if i == len(intArray)-1 {
				break
			}

			if intArray[i] > intArray[i+1] {
				temp := intArray[i+1]
				intArray[i+1] = v
				intArray[i] = temp
			}
		}
	}

	fmt.Println(intArray)

}
