package com.example.movescreenandrelaydata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        if(intent.hasExtra("msg"))
        {
            tv_getMsg.text = intent.getStringExtra("msg") // 서브 액티비티의 존재하는 텍스트뷰에다가 HelloWorld가 넘거져 옴.
        }
    }
}