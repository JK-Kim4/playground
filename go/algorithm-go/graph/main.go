package main

import (
	"fmt"
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

	fmt.Println(graph)
	fmt.Println(startV)

	fmt.Println(graph[startV])

}
