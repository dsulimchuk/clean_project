package com.dsulimchuk.utilities

import com.dsulimchuk.list.LinkedList

class JoinUtils {
    companion object {
        fun join(source: LinkedList): String {
            val result = StringBuilder()
            for (i in 0 until source.size()) {
                if (result.isNotEmpty()) {
                    result.append(" ")
                }
                result.append(source.get(i))
            }

            return result.toString()
        }
    }
}
