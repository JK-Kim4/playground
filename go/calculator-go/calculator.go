package main

import "fmt"

// 1.isDigit 숫자, 연산자 검증
func isDigit(b byte) bool {
	fmt.Print(b)
	return false;
}

// 2.getPriority 연산자 우선순위 확인

// 3.convertToPostfix 후위연산자 변환


func main(){

	isDigit(1);
	isDigit(2);
	isDigit(3);
	isDigit('b');
	isDigit('a');
}