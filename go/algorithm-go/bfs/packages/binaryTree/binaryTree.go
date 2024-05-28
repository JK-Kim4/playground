package binaryTree

import (
	"fmt"
)

// 이진 트리 구조체
type BinaryTree struct {
	root *Node //루트 노드의 주소
}

// 노드 구조체
type Node struct {
	Data  interface{} //값
	Left  *Node       //좌측 노드 주소
	Right *Node       //우측 노드 주소
}

// BinaryTree data 삽입
func (bTree *BinaryTree) Insert(data interface{}) {

	if bTree.root == nil {
		bTree.root = &Node{Data: data, Left: nil, Right: nil}
		return
	}

	bTree.root.Insert(data)

}

func (node *Node) Insert(data interface{}) {
	

}

// BinaryTree root node 초기화
func (bTree *BinaryTree) SetRoot(node *Node) {
	bTree.root = node
}

func (bTree *BinaryTree) Print() {
	fmt.Println(*bTree)
	fmt.Println(*&bTree.root.Data)
	fmt.Println(*&bTree.root.Left.Data)
	fmt.Println(*&bTree.root.Right.Data)
	fmt.Println(*&bTree.root.Left.Left.Data)
	fmt.Println(*&bTree.root.Left.Right.Data)
	fmt.Println(*&bTree.root.Right.Left.Data)
	fmt.Println(*&bTree.root.Right.Right.Data)
}
