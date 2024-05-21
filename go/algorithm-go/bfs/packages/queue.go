package queue

import "fmt"

type Queue []interface{}

func (q *Queue) IsEmpty() bool {
	return len(*q) == 0
}

func (q *Queue) Enqueue(data interface{}) {
	*q = append(*q, data)
}

func (q *Queue) Dequeue() interface{} {
	if q.IsEmpty() {
		fmt.Print("this queue is empty")
		return nil
	}

	data := (*q)[0]
	*q = (*q)[1:]
	return data
}

func (q *Queue) PrintQueue() {
	fmt.Println(*q)
}

func Test() {
	fmt.Println("Test1")
}
