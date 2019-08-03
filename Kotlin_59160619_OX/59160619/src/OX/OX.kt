package OX
var arr = arrayOf(
    arrayOf(' ', '1', '2', '3'),
    arrayOf('1', '-', '-', '-'),
    arrayOf('2', '-', '-', '-'),
    arrayOf('3', '-', '-', '-')
)
fun main() {
    var rowInd = 0
    var colInd = 0

    println("WELCOME TO OX GAME")


    while (true) {
        turnPlayer()
        try {
            arrayOx()

            print("Please input rol col : ")
            val input = readLine()
//            println(input)
            val rcList = input?.split(" ")
            if(rcList?.size != 2){
                println("Error: Must input 2 numbers R C (Ex : 1 2)")
                continue
            }
//            println("Row ${rcList?.get(0)} Col ${rcList?.get(1)}")
            rowInd = rcList[0].toInt()
            colInd = rcList[1].toInt()


        } catch (t:Throwable){
            println("Error: ${t.message} ,Must be numbers R C (Ex : 1 2)")
        }
    }
}

fun arrayOx(){


    val rowInput = 0
    val colInput = 0
    arr[rowInput][colInput] = 'X'
    for (row in arr) {
        for (col in row){
            print("$col ")
        }
        println()
    }
}

fun turnPlayer(){
    val x = 'X'
    val o = 'O'
    var round = 1

    if (round % 2 == 0){
        println("Turn $o")
        round += 1
    }else {
        println("Turn $x")
        round += 1
    }
}
