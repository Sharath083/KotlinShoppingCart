import java.util.*

fun main() {

    val obj=ShoppingCart()
    val reader = Scanner(System.`in`)
    var repeat:Int
    do{
        println("1--> add  2--> Remove 3--> calculate 4-->Cart")
        when(reader.nextInt()){
            1 ->obj.addProducts()
            2 ->{
                println("Enter id to remove")
                val id=reader.nextInt()
                obj.removeProducts(id)
            }
            3 ->obj.priceCalculation()
            4 ->obj.viewCart()

        }
        println("1--> other operation  2--> Exit")
        repeat=reader.nextInt()
    }while (repeat==1)


}