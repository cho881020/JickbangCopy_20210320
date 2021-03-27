package com.neppplus.jickbangcopy_20210320

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210320.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)


        val roomData = intent.getSerializableExtra("roomInfo") as Room

        priceTxt.text = roomData.getFormattedPrice()

        floorTxt.text = roomData.getFormattedFloor()

        addressTxt.text = roomData.address

        descTxt.text = roomData.description

    }
}