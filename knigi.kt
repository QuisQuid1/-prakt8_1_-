class Knigi {
    var title="Название"
    var avtor="Автор"
    var god=0
    var listi=0
            fun printInfo(kniga:Knigi)
            {
                    println("Введите название книги")
                    kniga.title = readLine()!!.toString()
                    println("Введите автора книги")
                    kniga.avtor = readLine()!!.toString()
                    do {
                        println("Введите год выпуска книги")
                        kniga.god = readLine()!!.toInt()
                    }while (god<=0&&god>=2024)
                        do {
                            println("Введите объем книги")
                            kniga.listi = readLine()!!.toInt()
                        } while (listi<=0)
            }
    fun output(kniga:Knigi)
    {
        println("\nНазвание: ${kniga.title} \nАвтор: ${kniga.avtor} \nГод выпуска: ${kniga.god} \nОбъем книги: ${kniga.listi}")
    }
}