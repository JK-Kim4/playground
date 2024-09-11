package main

import (
	"fmt"
	"graph/packages/queue"
)

func main() {

	graphMap := map[string][]string{
		"A": {"B", "D", "E"},
		"B": {"A", "C", "D"},
		"C": {"B"},
		"D": {"A", "B"},
		"E": {"A"},
	}

	bfs(graphMap, "A")

}

func bfs(graph map[string][]string, startV string) {

	visited := queue.Queue{}
	visited.Enqueue(startV)
	visited.Enqueue("B")

	for _, qu := range visited {
		fmt.Println(qu)
	}
}
