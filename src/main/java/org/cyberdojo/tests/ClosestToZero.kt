package org.cyberdojo.tests

import kotlin.math.abs

class ClosestToZero {

    companion object {
        fun pick(numbers: IntArray): Int {
            var ret = Integer.MAX_VALUE
            var pos = -1

            numbers.forEachIndexed { index, it ->
                if (abs(it) < abs(ret) || it == abs(ret)) {
                    ret = it
                    pos = index
                }
            }

            return numbers[pos]
        }
    }

}
