package binaryTree

import "fmt"

//이진 트리 구조체
type BinaryTree struct {
	root *Node //루트 노드의 주소
}

//노드 구조체
type Node struct {
	Data  interface{} //값
	Left  *Node       //좌측 노드 주소
	Right *Node       //우측 노드 주소
}

func (bTree *BinaryTree) SetRoot(node *Node) {
	bTree.root = node
}

func (bTree *BinaryTree) Print() {
	fmt.Print(*bTree)
}
