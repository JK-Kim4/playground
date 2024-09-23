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

	resultQueue := bfs(graphMap, "A")

	fmt.Print(resultQueue)
}

func bfs(graph map[string][]string, startV string) []string {

	//이미 방문 한 노드 정보 저장
	visited := queue.Queue{}
	visited.Enqueue(startV)
	var targetSlice []string

	targetSlice = append(targetSlice, startV)

	
	//do someting. Enqueue
	var resultList []string;
	
	for _, elem := range graph[targetSlice[0]]{
		fmt.Println(elem)
	}



	return resultList
}
