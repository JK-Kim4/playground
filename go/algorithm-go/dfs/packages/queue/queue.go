package queue

type Queue []interface{}

func (queue *Queue) IsEmpty() bool {
	return len(*queue) == 0
}

func (queue *Queue) Enqueue(data interface{}) {
	*queue = append(*queue, data)
}

func (queue *Queue) Dequeue() interface{} {
	if queue.IsEmpty() {
		return nil
	}

	data := (*queue)[0]
	*queue = (*queue)[1:]

	return data
}
