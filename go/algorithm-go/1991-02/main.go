package main

import (
	"fmt"
)

func main (){
	var row int = 3;
	var column int
	inputTree := make([][]string, row)
	
	
	fmt.Printf("이진트리 노드의 수를 입력해주세요.")
	fmt.Scanf("%d", &column)

	for index, _ := range inputTree {
		inputTree[index] = make([]string, column);
		for i := 0; i < column; i++ {
			inputTree[index][i] = "hello";
		}

	}

	fmt.Println(inputTree[0])
	fmt.Println(inputTree[1])
	fmt.Println(inputTree[2])

}