package main

import (
	"fmt"
	binaryTree "post-order/packages/binaryTree"
)

func main() {

	biTree := &binaryTree.BinaryTree{Root: nil}

	biTree.Insert("Nice ", 10)
	biTree.Insert("is ", 7)
	biTree.Insert("meet", 20)
	biTree.Insert("name ", 4)
	biTree.Insert("DFS! ", 9)
	biTree.Insert("hello ", 1)
	biTree.Insert("my ", 3)
	biTree.Insert("to ", 18)
	biTree.Insert("you!!", 25)

	visitedNode := biTree.Root.DFS()

	fmt.Print(visitedNode)

}
