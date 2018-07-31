package org.cyberdojo.tests

import kotlin.math.abs

class ClosestToZero {

    companion object {
        fun pick(numbers: IntArray): Int {
            var ret = Integer.MAX_VALUE
            var pos = -1

//            for ((index, number) in numbers.withIndex()) {
//                println("the element at $index is $number")
//                if (abs(number) < abs(ret) || number == abs(ret)) {
//                    ret = number
//                    pos = index
//                }
//            }

            numbers.forEachIndexed { index, it ->
                if (abs(it) < abs(ret) || it == abs(ret)) {
                    ret = it
                    pos = index
                }
            }

            return numbers[pos];
        }
    }

}
