package main

import "C"

import (
	"github.com/songjiayang/go-android/go/speedtester"
)

//export Perform
func Perform(url *C.char) C.int {
	cost, err := speedtester.Perform(C.GoString(url))
	if err != nil {
		return -1
	}
	return C.int(cost)
}

func main() {}
