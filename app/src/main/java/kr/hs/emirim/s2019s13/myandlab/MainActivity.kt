package kr.hs.emirim.s2019s13.myandlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var mProfile: ImageView
    lateinit var mButton1: Button
    lateinit var mButton2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mProfile = findViewById(R.id.profile)
        mButton1 = findViewById(R.id.button1)
        mButton2 = findViewById(R.id.button2)

        mButton1.setOnClickListener {
            startActivity(Intent(this, FourbuttonActivity::class.java))
        }

        mButton1.setOnClickListener {
            startActivity(Intent(this, Fourbutton2Activity::class.java))
        }

    }
    
}