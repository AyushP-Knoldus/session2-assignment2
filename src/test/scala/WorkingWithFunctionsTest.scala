package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
class WorkingWithFunctionsTest extends AnyFlatSpec with Matchers{
  try {
    "addFunction" should "calculate the sum of 10 and 20" in {
      assert(WorkingWithFunctions.addFunction(10,20) == 30)
    }
    "calculateSumOfList" should "calculate the sum of elements of List(1,2,3)" in {
      assert(WorkingWithFunctions.calculateSumOfList(List(1,2,3)) == 6 )
    }
    "higherOrderFunction" should "calculate sum of 30 and 30" in {
      assert(WorkingWithFunctions.higherOrderFunction((num: Int) => num + num, 30) == 60 )
    }
    "higherOrderFunction" should "calculate sum of 2 and 2" in  {
      assert(WorkingWithFunctions.higherOrderFunction((num: Int) => num + num, 2) == 4)
    }
  }
  catch {
    case error: Exception =>
      println("Error while calculating square " + error.getMessage)
  }
}
