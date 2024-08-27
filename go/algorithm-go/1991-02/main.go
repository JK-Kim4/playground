package main

import (
	"fmt"
	"strings"
	"unsafe"
)

func postOrder(tree [][2]string, index int64) {
	fmt.Print(string(int64(index) + ByteArrayToInt([]byte("A"))))
	if index == 0 {
		postOrder(tree, 1)
	} else {
		if tree[index][0] != "." {
			postOrder(tree, ByteArrayToInt([]byte(tree[index][0]))-ByteArrayToInt([]byte("A")))
		}
		if tree[index][1] != "." {
			postOrder(tree, ByteArrayToInt([]byte(tree[index][1]))-ByteArrayToInt([]byte("A")))
		}
	}

}

func ByteArrayToInt(arr []byte) int64 {
	val := int64(0)
	size := len(arr)
	for i := 0; i < size; i++ {
		*(*uint8)(unsafe.Pointer(uintptr(unsafe.Pointer(&val)) + uintptr(i))) = arr[i]
	}
	return val
}

/*
백준 1991번

input string array [root, left, right] 순서로 입력

 0. 2차원 배열을 선언하여 각 노드의 값 초기화 [number of rows][2]string
 1. root 값을 2차원 배열의 index key 값으로 사용하기 위해 ascii code 변환
    -> 최초 root의 key 값은 'A' 임으로 첫번째 사용자 입력값에 []byte("A")를 minus 한 값으로 root 지정 가능
*/
func main() {

	fmt.Printf("생성할 노드의 수를 입력해주세요.")
	var rows int
	fmt.Scanf("%d", &rows)

	inputTree := make([][2]string, rows)

	for i := 0; i < rows; i++ {

		var root, left, right string

		fmt.Println("값을 입력해주세요.")
		fmt.Scanf("%s %s %s", &root, &left, &right)

		root = strings.ToUpper(root)
		left = strings.ToUpper(left)
		right = strings.ToUpper(right)

		idx := ByteArrayToInt([]byte(root)) - ByteArrayToInt([]byte("A"))

		inputTree[idx][0] = left
		inputTree[idx][1] = right

	}

	postOrder(inputTree, 0)

}
