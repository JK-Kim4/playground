package main

import "fmt"

/*
추가 참고- golang interface reflect OOP
	https://incredible-larva.tistory.com/entry/golang-interface%EC%99%80-reflect-%EA%B7%B8%EB%A6%AC%EA%B3%A0-OOP
*/
/*
Tree 구성 요소
	Node: 트리 자료구조 구성 단위
	Edge(간선): 노드간 연결된 선
	Root: 트리의 시작점
	Leaf
	CHild, Parent, Sibling
	degree
	ancestor
*/

type Node struct {
	Data      interface{}
	LeftNode  *Node
	RightNode *Node
}

type BinaryTree struct {
	Root *Node
}

type TreeInterface interface {
}

func main() {

	rootNode := Node{1, nil, nil}
	rootNode.LeftNode = &Node{2, nil, nil}
	rootNode.RightNode = &Node{3, nil, nil}

	bTree := new(BinaryTree)
	rootNode.Data = 1
	bTree.Root = &rootNode
	fmt.Println(rootNode)
	fmt.Println(rootNode.LeftNode)
	fmt.Println(rootNode.RightNode)
}
