package com.neppplus.jickbangcopy_20210320.datas

import java.text.NumberFormat
import java.util.*

class Room(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String) {


    fun getFormattedPrice() : String {

        if (this.price < 10000) {
            val priceStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            return priceStr
        }
        else {

            val uk = this.price / 10000

            val rest =  this.price % 10000

            val priceStr = "${uk}억${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"

            return priceStr
        }

    }

    fun getFormattedFloor() : String {

        if (this.floor >= 1) {
            return "${this.floor}층"
        }
        else if (this.floor == 0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }

    }

}