package main

import (
	"fmt"
	binaryTree "lca/packages/binaryTree"
)

func main() {

	biTree := binaryTree.BinaryTree{}

	biTree.Insert("Nice ", 10)
	biTree.Insert("is ", 7)
	biTree.Insert("meet", 20)
	biTree.Insert("name ", 4)
	biTree.Insert("DFS! ", 9)
	biTree.Insert("hello ", 1)
	biTree.Insert("my ", 3)
	biTree.Insert("to ", 18)
	biTree.Insert("you!!", 25)


	nice := binaryTree.LCA(biTree.Root, 20, 7);
	is := binaryTree.LCA(biTree.Root, 4, 9);

	fmt.Println(nice)
	fmt.Println(is)


}