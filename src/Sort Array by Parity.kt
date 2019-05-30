//*=== Wednesday May 22nd 2019 - Daily Programmer ===*
//
//*[Sort Array By Parity]*
//
//Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
//
//You may return any answer array that satisfies this condition.
//
//```Input: [3,1,2,4]
//Output: [2,4,3,1]
//The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.```
//Note:
//• 1 <= A.length <= 5000
//• 0 <= A[i] <= 5000


import java.util.*

fun sortArray(inArray: IntArray) : IntArray{
    var outArray = LinkedList<Int>()
    for (value in inArray)
        if (value%2 != 0) outArray.add(value)
        else outArray.push(value)
    return outArray.toIntArray()
}

fun main(){
    val testArray = intArrayOf(1,2,3,4,5)
    print(sortArray(testArray).joinToString())
}