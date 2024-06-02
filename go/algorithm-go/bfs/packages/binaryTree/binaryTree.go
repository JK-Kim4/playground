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
	Value string //값
	Key   int16  //키
	Left  *Node  //좌측 노드 주소
	Right *Node  //우측 노드 주소
}

// BinaryTree data 삽입
func (bTree *BinaryTree) Insert(value string, key int16) {
	if bTree.root == nil {
		bTree.root = &Node{Value: value, Key: key, Left: nil, Right: nil}
	} else {
		bTree.root.Insert(value, key)
	}

}

func (currentNode *Node) Insert(value string, key int16) {
	if currentNode == nil {
		currentNode = &Node{Value: value, Key: key, Left: nil, Right: nil}
		return
	}

	if key == currentNode.Key {
		fmt.Print("return")
		return
	}

	if key < currentNode.Key {
		//왼쪽 노드에 삽입
		if currentNode.Left == nil {
			fmt.Println("insert value left")
			currentNode.Left = &Node{Value: value, Key: key, Left: nil, Right: nil}
		} else {
			currentNode.Left.Insert(value, key)
		}
	} else {
		//오른쪽 노드에 삽입
		if currentNode.Right == nil {
			fmt.Println("insert value right")
			currentNode.Right = &Node{Value: value, Key: key, Left: nil, Right: nil}
		} else {
			currentNode.Right.Insert(value, key)
		}
	}

}

func (bTree *BinaryTree) Print() {

}
