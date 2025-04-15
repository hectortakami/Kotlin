package com.htakami.myfirstapp

import java.util.Calendar

class BookClass (var title: String = "Unknown",
                 var author: String = "Anonymous",
                 var yearPublished: Int = 0) {

    init {
        val calendar: Calendar = Calendar.getInstance()
        val currentYear: Int = calendar.get(Calendar.YEAR)
        yearPublished = currentYear
    }

}