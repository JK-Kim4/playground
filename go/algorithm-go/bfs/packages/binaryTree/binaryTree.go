package binaryTree

import (
	queue "bfs/packages/queue"
	"fmt"
)

// 이진 트리 구조체
type BinaryTree struct {
	Root *Node //루트 노드의 주소
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
	if bTree.Root == nil {
		bTree.Root = &Node{Value: value, Key: key, Left: nil, Right: nil}
	} else {
		bTree.Root.Insert(value, key)
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
			currentNode.Left = &Node{Value: value, Key: key, Left: nil, Right: nil}
		} else {
			currentNode.Left.Insert(value, key)
		}
	} else {
		//오른쪽 노드에 삽입
		if currentNode.Right == nil {
			currentNode.Right = &Node{Value: value, Key: key, Left: nil, Right: nil}
		} else {
			currentNode.Right.Insert(value, key)
		}
	}

}

func (rootNode *Node) Bfs() []*Node {
	if rootNode == nil {
		return nil
	}

	visitedNode := []*Node{}
	que := queue.Queue{}

	que.Enqueue(rootNode)

	for !que.IsEmpty() {
		currentNode := que.Dequeue().(*Node)
		visitedNode = append(visitedNode, currentNode)

		if currentNode.Left != nil {
			que = append(que, currentNode.Left)
		}

		if currentNode.Right != nil {
			que = append(que, currentNode.Right)
		}

	}

	return visitedNode
}
