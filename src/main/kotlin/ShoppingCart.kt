import java.util.*

//Create a class called ShoppingCart that represents a shopping cart for an e-commerce website. Implement methods
//for adding items to the cart, removing items, calculating the total price, and applying discounts.
//Use the let function to calculate the discounted price



data class Details(val productName:String,var price:Int,var discount:Double,var quantity:Int)

class ShoppingCart {
    private val reader = Scanner(System.`in`)

    private var productList=  mutableMapOf<Int, Details>()
    fun addProducts(){

        var again:Int
        do{
            println("Enter id")
            val id=reader.nextInt()
            reader.nextLine()

            println("Enter product name")
            val name=reader.nextLine()
            println("Enter Price")
            val price=reader.nextInt()
            println("Enter discount")
            val discount=reader.nextDouble()
            println("Enter quantity")
            val quantity=reader.nextInt()
            productList[id] = Details(name,price,discount,quantity)
            println("1--> to add 2--> exit")
            again=reader.nextInt()
        }while (again==1)
//        productList[1] = Details("soap",100,10.0,5)
//        productList[2] = Details("Brush",20,3.0,5)
        println("your Cart")
        println(productList)

    }
    fun removeProducts(id:Int){
        if(productList.contains(id)){
            println(productList[id])
            productList.remove(id)
            println("The Product above with id $id has Removed")
        }
        else{
            println("Product with id $id is not found")
        }

    }
    fun priceCalculation(){

        val sum:Int = productList.map { (it.value.price) * (it.value.quantity) }.sum()

        println("Total Price = $sum")

        val discountPrice= productList.map { (it.value.price) * (it.value.quantity) * ((it.value.discount) / 100) }.sum().toInt()

        println("After discount = ${sum - discountPrice}")

    }
    fun viewCart(){
        println(productList)
    }
}







//fun priceCalculation(){
//    var sum: Int = productList.map { (it.value.price)*(it.value.quantity) }.sum()
//    println("Total Price = $sum")
//    var discountPrice=0
//    for (entry in productList.entries.iterator()) {
//        sum=(sum.let { (it*(entry.value.discount)/100)}).toInt()
//        println("${entry.value.productName}  is $sum")
//    }
//
//
////        val discountPrice= productList.map { (it.value.price)*(it.value.quantity)*((it.value.discount)/100 )}.sum().let{sum-it}
//    println("After discount = $sum")
//}
//}