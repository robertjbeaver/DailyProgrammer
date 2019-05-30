//*=== Friday May 24th 2019 - Daily Programmer ===*
//_(Repost.  This is one of my fav problems and I don't think anyone solved it last time)_
//
//*[Cellular Automata]*
//
//Eight houses, represented as cells, are arranged in a straight line.  Each day, every cell competes with its adjacent cells (neighbors).  An integer value of 1 represents an active cell and a value of 0 represents an inactive cell.  If the neighbors on both sides of a cell are either active or inactive, the cell becomes inactive on the next day.  Otherwise, the cell becomes active.  The two cells on each end have a single adjacent cell, so assume that the unoccupied space on the opposite side is an inactive cell.  Even after updating the cell state, consider its previous state when updating the state of other cells.  The state information of all cells should be updated simultaneously.
//
//Write an algorithm to output the state of the cells after the given number of days.
//
//Examples:
//```runCellularAutomata([1, 0, 0, 0, 0, 1, 0, 0], 1) === [0, 1, 0, 0, 1, 0, 1, 0]
//runCellularAutomata([1, 1, 1, 0, 1, 1, 1, 1], 2) === [0, 0, 0 ,0, 0, 1, 1, 0]```


fun automateCells(cells: BooleanArray, days: Int): BooleanArray {
    return if (days != 0) {
        var newCells = BooleanArray(cells.size)
        for (index in 0 until cells.size) {
            var cellStateLeft = false
            var cellStateRight = false
            if (index != 0 && cells[index - 1])
                cellStateLeft = true
            if (index != (cells.size - 1) && cells[index + 1])
                cellStateRight = true
            newCells[index] = (cellStateLeft != cellStateRight)
        }
        automateCells(newCells, days-1)
    }
    else cells
}

fun main(){
    var cellsArray = booleanArrayOf(true, true, true, false, true, true, true, true)
    cellsArray = automateCells(cellsArray, 2)
    for (value in cellsArray)
        if (value) print(1) else print(0)
}