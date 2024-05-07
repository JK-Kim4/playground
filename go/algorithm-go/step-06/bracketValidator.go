package main

import "fmt"

/*
	'[(){}]' 와 같은 문자열이 주어졌을 때, 괄호가 유효한지 판단

	1. 단순화
	-> input으로 입력되는 문자열은 소괄호만을 포함하고있음
		-> bracketValidator Stack(array) 초기화
		-> 문자열 탐색 log(n)
			-> 열린 괄화일 경우: stack app 괄호 닫기
			-> 닫힌 괄호일 경우: stack pop()
		-> 문자열 탐색 종료 후 stack 이 비어있을 경우 true / 비어있지 않을 경우 false

	2. 괄호 종류 추가
	-> 소괄호 외 중괄호, 대괄호 모두 포함된 문자열을 input으로 받음
		-> 문자열 탐색 log(n)
			-> 열린 괄호일 경우: 해당 종류의 닫힌 괄호를 add stack
			-> 닫힌 괄호일 경우: stack head 부분 값과 일치할 경우 pop, continue / stack head와 일치하지 않을 경우 false
		-> 탐색 종료 시 stack 이 비어있을 경우 true / 비어있지 않을 경우 false
*/

func bracketValidator(input string) bool {
	var stack []byte
	byteArray := []byte(input)

	for i := 0; i < len(byteArray); i++ {
		if byteArray[i] == byte('(') {
			stack = append(stack, byte(')'))
		} else if byteArray[i] == byte('{') {
			stack = append(stack, byte('}'))
		} else if byteArray[i] == byte('[') {
			stack = append(stack, byte(']'))
		} else if byteArray[i] == byte(')') {
			if stack[len(stack)-1] == byte(')') {
				stack = stack[:len(stack)-1]
				continue
			} else {
				return false
			}
		} else if byteArray[i] == byte('}') {
			if stack[len(stack)-1] == byte('}') {
				stack = stack[:len(stack)-1]
				continue
			} else {
				return false
			}
		} else if byteArray[i] == byte(']') {
			if stack[len(stack)-1] == byte(']') {
				stack = stack[:len(stack)-1]
				continue
			} else {
				return false
			}
		} else {
			fmt.Println("Wrong input")
			return false
		}

	}
	return true
}

func main() {

	param1 := "(())"
	param2 := "(({{[]}}))"
	param3 := "[(({)})]"

	fmt.Println(bracketValidator(param1))
	fmt.Println(bracketValidator(param2))
	fmt.Println(bracketValidator(param3))

}
