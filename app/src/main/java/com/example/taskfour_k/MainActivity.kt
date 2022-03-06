package com.example.taskfour_k

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.taskfour_k.model.User


class MainActivity : AppCompatActivity() {
    var LAUNCH_DETAIL = 1001
    var tv_home: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == LAUNCH_DETAIL) {
            if (resultCode == RESULT_OK) {
                val member = data!!.getStringExtra("member")
                Log.d(TAG, member!!)
                tv_home!!.text = member
            }
        }
    }

    fun initViews() {
        tv_home = findViewById(R.id.tv_home)
        val b_detail = findViewById<Button>(R.id.b_detail)
        b_detail.setOnClickListener {
            val user = User(20, "Jafar")
            openDetailActivity(user)
        }
    }

    fun openDetailActivity(user: User?) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("user", user)
        //        startActivity(intent);
        startActivityForResult(intent, LAUNCH_DETAIL)
    }

    companion object {
        val TAG = MainActivity::class.java.toString()
    }
}