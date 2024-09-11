package queue

import (
	"fmt"
	"reflect"
)

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

func (q *Queue) IsExist(target interface{}) bool {
	result := false

	if q != nil {
		for _, elem := range *q {
			fmt.Printf("%s, %s is equals?", target, elem)
			fmt.Println(reflect.DeepEqual(target, elem))
		}
	}

	return result
}

func (q *Queue) PrintQueue() {
	fmt.Println(*q)
}
