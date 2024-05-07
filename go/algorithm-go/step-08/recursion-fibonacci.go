package main

import "fmt"

func Fibonacci(n int) int {

	fmt.Println("parameter = ", n)

	if n == 1 || n == 2 {
		return 1
	}

	return Fibonacci(n-1) + Fibonacci(n-2)
}

func main() {
	result := Fibonacci(5)

	fmt.Println(result)
}
