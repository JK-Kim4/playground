package main

import (
	"fmt"
	queue "graph/packages/queue"
)

func main() {

	queue := &queue.Queue{};
	fmt.Print(queue.IsEmpty())
	

}