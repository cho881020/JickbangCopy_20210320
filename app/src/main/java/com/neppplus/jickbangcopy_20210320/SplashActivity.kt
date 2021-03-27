package com.neppplus.jickbangcopy_20210320

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        별개의 동작을 관리해주는 핸들러 생성.
        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({

            //        메인화면으로 이동 => 종료 : 이 행동을 3초 후에 실행.
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

            finish()

        }, 3000)



    }
}