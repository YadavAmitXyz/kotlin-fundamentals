/**
 * Kotlin Fundamentals
 * from Android Team
 * 
 * 
 * Nullability in Kotlin
 */

// #########################################################################################################################


/**
 * using "null" in kotlin
 * 
 */
 

// fun main() {
//     val favoriteActor = null
//     println(favoriteActor)
// }


// #########################################################################################################################

/**
 * Variable reassignments with null
 * - Non-null types are variables that can't hold "null"
 */

// fun main() {
//     var favoriteActor: String = "Sandra Oh"
//     favoriteActor = null
// }


// #########################################################################################################################


/**
 * Nullable types are variables that can hold "null"
 * 
 * declare nullable variables in Kotlin
 * using ? operator
 */

// fun main() {
//     var favoriteActor: String? = "Sandra Oh"
//     println(favoriteActor)
    
//     favoriteActor = null
//     println(favoriteActor)
// }

// fun main() {
//     var number: Int? = 10
//     println(number)
    
//     number = null
//     println(number)
// }


// #########################################################################################################################

/**
 * Handle nullable variables
 */

// // Result in ERROR
// fun main() {
//     var favoriteActor: String? = "Sandra Oh"
//     println(favoriteActor.length)
// }

// // Use the ?. safe-call operator
// fun main() {
//     var favoriteActor: String? = "Sandra Oh"
//     println(favoriteActor?.length)
    
//     favoriteActor = null
//     println(favoriteActor?.length)
// }



// #########################################################################################################################



// Use the !! not-null assertion operator
// means that you assert that the value of the variable isn't null, regardless of whether it is or isn't
// fun main() {
//     var favoriteActor: String? = "Sandra Oh"
//     println(favoriteActor!!.length)
// }


// // not recommended to use the !! not-null assertion operator unless you're sure that the variable isn't null
// fun main() {
//     var favoriteActor: String? = null
//     println(favoriteActor!!.length)
// }
// 



// #########################################################################################################################



// // use the if branch in the if/else conditionals to perform null checks
// fun main() {
//     var favoriteActor: String? = "Sandra Oh"

//     if (favoriteActor != null) {
//       println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
//     } else {
//       println("You didn't input a name.")
//     }
// }

// // null checks using if-else as expression
// fun main() {
//     var favoriteActor: String? = "Sandra Oh"

//     val lengthOfName = if (favoriteActor != null) {
//       favoriteActor.length
//     } else {
//       0
//     }

//     println("The number of characters in your favorite actor's name is $lengthOfName.")
// }



// #########################################################################################################################


/**
 *  Use the ?: Elvis operator
 * The ?: Elvis operator is an operator that you can use together 
 * with the ?. safe-call operator. With the ?: Elvis operator, 
 * you can add a default value when the ?. safe-call operator returns null. 
 * It's similar to an if/else expression, but in a more idiomatic way.
 */

// fun main() {
//     var favoriteActor: String? = "John Doe"

//     val lengthOfName = favoriteActor?.length ?: 0

//     println("The number of characters in your favorite actor's name is $lengthOfName.")
// }



// #########################################################################################################################
