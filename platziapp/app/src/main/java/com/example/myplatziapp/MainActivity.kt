const val Pi = 3.1416

fun main() {
  println("Hello World!")
  var money: Int = 10
  println(money)
  money = 5
  println("use var--" + money)
  val name = "Jorge"

  println("use val--" + name)
  println("use const val--" + Pi + "\n")
  println("Type of Variables")
  val bool = true
  val numLong = 3L
  val doub = 2.7182
  val float = 1.1f

  println("Boolean---" + bool)
  println("number Long---" + numLong)
  println("Double---" + doub)
  println("Float---" + float)
  println("\n")
  println("Operations")

  val firstValue = 20
  val secValue = 10
  val terValue = firstValue - secValue
  println(firstValue.toString() + " - " + secValue.toString() + " = " + terValue)
  val lastName = "Tisca"
  val nam = "Jorge"
  val fullname = "My name is $nam $lastName"
  print(fullname)
}

// package com.example.myplatziapp

// import android.os.Bundle
// import androidx.activity.ComponentActivity
// import androidx.activity.compose.setContent
// import androidx.compose.foundation.layout.fillMaxSize
// import androidx.compose.material3.MaterialTheme
// import androidx.compose.material3.Surface
// import androidx.compose.material3.Text
// import androidx.compose.runtime.Composable
// import androidx.compose.ui.Modifier
// import androidx.compose.ui.tooling.preview.Preview
// import com.example.myplatziapp.ui.theme.MyPlatziAppTheme

// class MainActivity : ComponentActivity() {
//     override fun onCreate(savedInstanceState: Bundle?) {
//         super.onCreate(savedInstanceState)
//         setContent {
//             MyPlatziAppTheme {
//                 // A surface container using the 'background' color from the theme
//                 Surface(
//                     modifier = Modifier.fillMaxSize(),
//                     color = MaterialTheme.colorScheme.background
//                 ) {
//                     Greeting("Android")
//                 }
//             }
//         }
//     }
// }

// @Composable
// fun Greeting(name: String, modifier: Modifier = Modifier) {
//     Text(
//         text = "Hello $name!",
//         modifier = modifier
//     )
// }

// @Preview(showBackground = true)
// @Composable
// fun GreetingPreview() {
//     MyPlatziAppTheme {
//         Greeting("Android")
//     }
// }
