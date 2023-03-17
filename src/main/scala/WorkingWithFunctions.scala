package com.knoldus

object WorkingWithFunctions extends App{
  /*val plus1: Int => Int = (num: Int) => num + 1
  println(plus1(2))

  val plus1: Function1[Int, Int] = new Function1[Int, Int] {
    def apply(num: Int): Int = num + 1
  }
  println(plus1.apply(2))*/

  //Exercise
  //1-val add: (Int, Int) => Int = (num1: Int, num2: Int) => num1 + num2
  //There are 2 parameters so we created object of Function2
  val addFunction: Function2[Int,Int,Int] = new Function2[Int,Int,Int] {
    def apply(numberOne: Int, numberTwo: Int) : Int = numberOne + numberTwo
  }
  //println(addFunction.apply(10,20))

  //2-val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  //There is a single parameter of List[Int] type so we created object of Function1
  val calculateSumOfList: Function1[List[Int],Int] = new Function1[List[Int],Int] {
    def apply(userList: List[Int]) : Int = userList.sum //Using sum method with List
  }
  //println(calculateSumOfList.apply(List(1,2,3)))

  //3-val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => f(num)
  val higherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    def apply(functionInput: Int => Int, num: Int): Int = functionInput(num)

  }
}
