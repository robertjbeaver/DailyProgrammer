//*=== Thursday May 30th 2019 - Daily Programmer ===*
//
//*[Self Dividing Numbers]*
//
//A self-dividing number is a number that is divisible by every digit it contains.
//For example, 128 is a self-dividing number because `128 % 1 == 0`, `128 % 2 == 0`, and `128 % 8 == 0`.
//Also, a self-dividing number is not allowed to contain the digit zero.
//
//Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
//
//```Input:
//left = 1, right = 22
//Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]```
//• The boundaries of each input argument are `1 <= left <= right <= 10000`

fun selfDividingNumber(leftBound: Int, rightBound: Int): List<Int> {
    var selfDividingNumbers = mutableListOf<Int>()
    for (number in leftBound..rightBound) {
        var isSelfDividable = true
        for (digit: Char in Integer.toString(number)) {
            if(Character.getNumericValue(digit) != 0) {
                if ((number % Character.getNumericValue(digit)) != 0) {
                    isSelfDividable = false
                }
            } else isSelfDividable = false
        }
        if (isSelfDividable)
            selfDividingNumbers.add(number)
    }
    return selfDividingNumbers
}

fun main() {
    val samples = selfDividingNumber(1, 22)
    for (sample in samples)
        println(sample)
}