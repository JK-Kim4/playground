package binarytree

import "fmt"

type BinaryTree struct {
	Root *Node
}

type Node struct {
	Value interface{}
	Key   int
	Left  *Node
	Right *Node
}

func (bTree *BinaryTree) Insert(data interface{}, key int) {
	if bTree.Root == nil {
		bTree.Root = &Node{Value: data, Key: key, Left: nil, Right: nil}
	} else {
		bTree.Root.Insert(data, key)
	}

}

func (currentNode *Node) Insert(data interface{}, key int) {
	if currentNode == nil {
		currentNode = &Node{Value: data, Key: key, Left: nil, Right: nil}
		return
	}

	if currentNode.Key == key {
		fmt.Println("key is aleady exist")
		return
	}

	if currentNode.Key > key {
		if currentNode.Left == nil {
			currentNode.Left = &Node{Value: data, Key: key, Left: nil, Right: nil}
		} else {
			currentNode.Left.Insert(data, key)
		}
	} else {
		if currentNode.Right == nil {
			currentNode.Right = &Node{Value: data, Key: key, Left: nil, Right: nil}
		} else {
			currentNode.Right.Insert(data, key)
		}
	}
}

func (currentNode *Node) DFS() []*Node {
	visitedNode := []*Node{}
	if currentNode.Value == nil {
		fmt.Print("BinaryTree is empty")
		return nil
	}

	if currentNode.Left != nil {
		currentNode.Left.DFS()
	}
	//do someting  위치에 따라 전위 | 중위 | 후위
	visitedNode = append(visitedNode, currentNode)
	fmt.Println(currentNode.Value)

	if currentNode.Right != nil {
		currentNode.Right.DFS()
	}

	return visitedNode
}
