class Tovar {
    var nazvanie="Товар"
    var prize=0.0
    var vidtovara="продукты"
    var kolvo=0.0
    var karta="скидочная карта"
    fun Input(tovar: Tovar)
    {
        try {
            do {
                println("Введите вид товара (Продукты питания, Химия, Инструменты)")
                tovar.vidtovara= readLine()!!.toString()
            }while (!(tovar.vidtovara=="Продукты питания")&&!(tovar.vidtovara=="Химия")&&!(tovar.vidtovara=="Инструменты"))
            println("Введите название товара")
            tovar.nazvanie= readLine()!!.toString()
            do {
                println("Введите цену в рублях")
                tovar.prize= readLine()!!.toDouble()
            } while (prize<=0)
            do {
                println("Введите количество товара")
                tovar.kolvo= readLine()!!.toDouble()
            }while (kolvo<=0)
        }catch (e:Exception){
            println("Что то не то")}
        }
    fun output(tovar: Tovar)
    {
        println("\nВид товара ${tovar.vidtovara} \nНазвание ${tovar.nazvanie} \nЦена ${tovar.prize}  \nКоличество ${tovar.kolvo}")
    }
    fun skidka(tovar: Tovar)
    {
            println("По скидочной карте скидка 20%. У Вас есть скидочная карта?")
            tovar.karta= readLine()!!.toString()
            if (tovar.karta=="Да"|| tovar.karta=="да"|| tovar.karta=="ДА")
            {
                tovar.prize=tovar.prize*0.8
                println("Цена товара со скидкой ${tovar.prize}")
            }
            else
            {
                println("У Вас не будет скидки")
            }
    }

}