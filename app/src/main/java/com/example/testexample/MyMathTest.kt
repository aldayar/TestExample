package com.example.testexample

class MyMathTest {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun sub(a: Int, b: Int): Int {
        return a - b
    }

    fun mult(a: Int, b: Int): Int {
        return a * b
    }


    fun dev(a: Int, b: Int): Int {
        return a / b
    }

    fun getWord(word: String): String {
        val words = word.split(" ")
        val revers = words.reversed().joinToString("")
        val trimWord = revers.replace("\\s".toRegex(), "")
        return trimWord.replace("[0-9]".toRegex(), "")
    }
}