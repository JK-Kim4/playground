package main

import (
	binaryTree "bfs/packages/binaryTree"
	queue "bfs/packages/queue"
)

func main() {

	//Queue Test
	queue1 := queue.Queue{}
	queue2 := queue.Queue{}
	queue2.Dequeue()
	queue1.PrintQueue()
	queue1.Enqueue("element1")
	queue1.Enqueue("element2")
	queue1.Enqueue("element3")
	queue1.PrintQueue()

	queue1.Dequeue()
	queue1.PrintQueue()

	//BinaryTree Test
	rootNode := binaryTree.Node{Data: "root", Left: nil, Right: nil}
	bTree := binaryTree.BinaryTree{}
	bTree.SetRoot(&rootNode)
	bTree.Print()

}
