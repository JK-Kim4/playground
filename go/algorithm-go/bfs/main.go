package main

import (
	binaryTree "bfs/packages/binaryTree"
	"fmt"
)

func main() {

	bTree := binaryTree.BinaryTree{}

	bTree.Insert("hello, ", 10)
	bTree.Insert("my ", 9)
	bTree.Insert("name ", 20)
	bTree.Insert("is ", 8)
	bTree.Insert("BinaryTree.", 11)

	visitedNode := bTree.Root.Bfs()

	for _, vn := range visitedNode {
		fmt.Println(vn.Value)
	}
}
