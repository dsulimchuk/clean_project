package com.dsulimchuk.app

import com.dsulimchuk.model.MyModel
import com.dsulimchuk.utilities.StringUtils
import org.apache.commons.text.WordUtils

fun main() {
    val tokens = StringUtils.split(MessageUtils.getMessage())
    val result = StringUtils.join(tokens)
    println(MyModel("1", "name", "description"))
    println(WordUtils.capitalize(result))
}
