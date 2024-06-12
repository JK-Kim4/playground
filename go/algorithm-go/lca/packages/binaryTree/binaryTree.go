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

func LCA(root *Node, p int, q int) *Node {
	if root == nil {
		return nil
	}

	left := LCA(root.Left, p, q)
	right := LCA(root.Right, p, q)

	if(root.Key == q || root.Key == p) {
		return root
	} else if(left != nil && right != nil) {
		return root
	}

	if(left != nil && right == nil){
		return left
	}else if(left == nil && right != nil){
		return right
	}else{
		return nil
	}
}