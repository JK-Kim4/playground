package main

import (
	queue "bfs/packages"
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

}
