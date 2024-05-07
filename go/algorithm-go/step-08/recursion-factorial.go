package main

import "fmt"

func Factorial(n int) int {

	fmt.Println("parameter = ", n)

	if n == 1 {
		return 1
	}
	return n * Factorial(n-1)
}

func main() {
	result := Factorial(5)

	fmt.Println(result)

	result = Factorial(10)

	fmt.Println(result)
}
