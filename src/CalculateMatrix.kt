//*=== Thursday May 23rd 2019 - Daily Programmer ===*
//
//*[Matrix Region Sum]*
//
//Given a matrix of integers and the top left and bottom right coordinates of a rectangular region within the matrix, find the sum of numbers falling inside the rectangle.
//
//Example:
//# matrix
//1 2 3 4
//5 6 7 8
//9 0 1 2
//
//sum_matrix(matrix, [1, 1], [3, 2]) # => 24


fun calculateMatrix(matrix: Array<Array<Int>>, topLeft: Array<Int>, bottomRight: Array<Int>): Int
{
    var total = 0
    for (col in topLeft[0]-1 until bottomRight[0]) {
        for(row in topLeft[1]-1 until bottomRight[1]) {
            total += matrix[col][row]
        }}
    return total
}

fun generateMatrix(columns: Int, rows: Int): Array<Array<Int>> {
    var matrix = arrayOf<Array<Int>>()
    for(column in 0 until columns) {
        var array = arrayOf<Int>()
        for (row in 0 until rows) {
            array += (Math.random()*10).toInt()
        }
        matrix += array
    }
    return matrix
}
fun main() {
    print("How many columns: ")
    val columns = readLine()!!.toInt()
    print("How many rows: ")
    val rows = readLine()!!.toInt()
    val matrix = generateMatrix(columns, rows)
    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[i].size) {
            print(matrix[i][j].toString() + " ")
        }
        println()
    }
    print("Begin range column: ")
    val firstCol = readLine()!!.toInt()
    print("Begin range row: ")
    val firstRow = readLine()!!.toInt()
    print("End range column: ")
    val endCol = readLine()!!.toInt()
    print("End range row: ")
    val endRow = readLine()!!.toInt()
    println(calculateMatrix(matrix, arrayOf(firstCol,firstRow), arrayOf(endCol,endRow)))
}