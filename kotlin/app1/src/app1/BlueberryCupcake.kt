/**

<<<<<<< HEAD
  Author: herrj1

*/

=======
  author: herrj1

*/


>>>>>>> fcf620b5cbf026b1352ceabacd6802b4fe8134c7
package app1

class BlueberryCupcake {
	var flavour = "Blueberry"
}

//fun main(args: Array<String>){
//	val myCupcake = BlueberryCupcake()
//	println("My cupcake has ${myCupcake.flavour}")
//}
/**fun main(args: Array<String>){
	val myCupcake = BlueberryCupcake()
	myCupcake.flavour = "Almond"
	println("My cupcake has ${myCupcake.flavour}")
}*/
//the above throws an errors

class AlmondCupcake{
	val flavour = "Almond"
}

/**class Cupcake(val flavour: String){
	fun eat(): String{
		return "nom, nom, nom... delicious $flavour cupcake"
	}
}
*/
fun main(args: Array<String>){
<<<<<<< HEAD
	val myBlueberryCupcake = Cupcake("Blueberry Tennesse")
=======
	val myBlueberryCupcake = Cupcake("Apple")
>>>>>>> fcf620b5cbf026b1352ceabacd6802b4fe8134c7
	println(myBlueberryCupcake.eat())
}
