package com.example.taskfour_k

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
     var TAG = DetailActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_main)
        initViews()
    }
    fun initViews(){
        val b_exit = findViewById<Button>(R.id.b_exit)
        val tv_detail = findViewById<TextView>(R.id.tv_detail)
        b_exit.setOnClickListener(){
            backtoFinish()
        }

        var user = intent.getSerializableExtra("user")
        Log.d(TAG,user.toString())
        tv_detail.text = user.toString()
    }

    fun backtoFinish(){
        val intent = Intent()
        intent.putExtra("member", "In Gold Member")
        setResult(RESULT_OK, intent)
//        Finish ni ozi yopib beradi tepadigilar esa malumotni qaytarb yuboradi
        //        Finish ni ozi yopib beradi tepadigilar esa malumotni qaytarb yuboradi
        finish()
    }
}