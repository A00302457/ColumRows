package com.example.columrows.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.columrows.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //GreetingView(Greeting().greet())
                    Column {

                    Row {
                        Button(onClick = { /*TODO*/ }) {
                            Text("Info")
                        }
                        Text("        Employee Name           ")
                        Button(onClick = { /*TODO*/ }) {
                            Text("Bell")

                        }

                    }
                    Row {
                        Text("Image")
                        Column {
                            Text("     Jessica Jones")
                            Text("     Pursesing Manager-Finance")
                            Text("     View personal profile")
                        }
                    }
                        Row {
                            Text("MyDashboard")
                            Text("             MyApplication")
                            Text("              Others")
                        }
                        Row{
                            Column {
                                Row {


                                    Button(onClick = { /*TODO*/ }) {
                                        Text("Project Booking")

                                    }
                                    Button(onClick = { /*TODO*/ }) {
                                        Text("Time Off")

                                    }
                                }
                                Row {

                                    Button(onClick = { /*TODO*/ }) {
                                        Text("Travell")
                                        Button(onClick = { /*TODO*/ }) {
                                            Text("Travell")

                                    }
                                }

                            }
                                Row {
                                    Button(onClick = { /*TODO*/ }) {
                                        Text("TimeOff")
                                        
                                    }
                                    Button(onClick = { /*TODO*/ }) {
                                        Text("ProjectBooking")
                                        
                                    }
                                }

                                }


                        }
                }
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("")
    }
}
