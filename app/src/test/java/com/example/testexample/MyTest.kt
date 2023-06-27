package com.example.testexample

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MyTest() {
    private var math: MyMathTest? = null

    @Before
    fun setUp() {
        math = MyMathTest()
        println("Before")
    }

    @Test
    fun simpleAddCase() {
        assertEquals(4, math?.add(2, 2))
        println("simpleAddCase")
    }


    @Test
    fun simpleSubCase() {
        assertEquals(0, math?.sub(2, 2))
        println("simpleAddCase")
    }


    @Test
    fun simpleEvlCase() {
        assertEquals(4, math?.mult(2, 2))
        println("simpleAddCase")
    }


    @Test
    fun simpleMatCase() {
        assertEquals(1, math?.dev(2, 2))
        println("simpleAddCase")
    }

    @After
    fun tearDown4() {
        println("After")
        math = null
    }

    @Test
    fun trimWordCase() {
        assertEquals("Aldbecmam", math?.getWord("becmam232323232 Ald"))
    }

    @After
    fun tearDown() {
        println("After")
        math = null
    }

}
