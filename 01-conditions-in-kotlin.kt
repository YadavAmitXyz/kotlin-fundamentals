/**
 * Kotlin Fundamentals
 * from Android Team
 */

// #########################################################################################################################


/**
 * Example of if-else if-else 
 */
 

// fun main() {
//     val trafficLightColor = "Black"

//     if (trafficLightColor == "Red") {
//         println("Stop")
//     } else if (trafficLightColor == "Yellow") {
//         println("Slow")
//     } else if (trafficLightColor == "Green") {
//         println("Go")
//     } else {
//         println("Invalid traffic-light color")
//     }

// }


// #########################################################################################################################


/**
 * Example of "when" statement for multiple branches
 */

// fun main() {
//     val trafficLightColor = "Black"
    
//     when (trafficLightColor) {
//         "Red" 		-> println("Stop")
//         "Yellow"	-> println("Slow")
//         "Green" 	-> println("Go")
//         else 		-> println("Invalid traffic-light color")
//     }
// }

/**
 * Example of "when" statement for
 * multiple conditions that correspond to the same body
 */
 
//  fun main() {
//      val x = 5
     
//      when (x) {
//         2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//         else -> println("x isn't a prime number between 1 and 10.")
//     }
//  }

 
 /**
 * Example of "when" statement for
 * range of conditions using "in" keyword
 */

//  fun main() {
//     val x = 11

//     when (x) {
//         2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//         in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//         else -> println("x isn't a prime number between 1 and 10.")
//     }
// }

 /**
 * Example of "when" statement for
 * checking data type using "is" keyword
 */

// fun main() {
//     val x: Any = 11

//     when (x) {
//         2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//         in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//         is Int -> println("x is an integer number, but not between 1 and 10.")
//         else -> println("x isn't an integer number.")
//     }
// }


/**
 * Write if-else as expression
 */

// fun main() {
//     val trafficLightColor = "Black"
	
//     val message =
//         if (trafficLightColor == "Red") "Stop"
//         else if (trafficLightColor == "Yellow") "Slow"
//         else if (trafficLightColor == "Green") "Go"
//         else "Invalid traffic-light color"
    
//     println(message)
// }


/**
 * Example of "when" statement as an Expression
 */

// fun main() {
//     val trafficLightColor = "Amber"

//     val message = when(trafficLightColor) {
//         "Red" -> "Stop"
//         "Yellow", "Amber" -> "Slow"
//         "Green" -> "Go"
//         else -> "Invalid traffic-light color"
//     }
//     println(message)
// }
// 


// #########################################################################################################################
