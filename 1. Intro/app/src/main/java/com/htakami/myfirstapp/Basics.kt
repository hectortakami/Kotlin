package com.htakami.myfirstapp

fun main(){

    var userSelection = ""

    while (userSelection != "exit"){

        println("\nEnter your option (rock, paper, scissors) - type 'exit' to quit\nUser: ")
        userSelection = readln()

        if (arrayOf("rock", "paper", "scissors").contains(userSelection)){
            var computerSelection = ""
            val computerOption = (1..3).random()
            computerSelection = when (computerOption) {
                1 -> "rock"
                2 -> "paper"
                else -> "scissors"
            }
            println("Computer:\n$computerSelection")

            if (userSelection == computerSelection){
                println("tie".uppercase())
            } else if ( (userSelection == "rock" && computerSelection == "scissors")
                || (userSelection == "scissors" && computerSelection == "paper")
                || (userSelection == "paper" && computerSelection == "rock")){
                println("user won!".uppercase())
            } else {
                println("computer won!".uppercase())
            }
        } else if (userSelection == "exit"){
            break;
        }
        else {
            println("not valid option")
        }


   }



}