package kr.hs.emirim.s2019s13.myandlab

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class FourbuttonActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mButton1 : Button
    private lateinit var mButton2 : Button
    private lateinit var mButton3 : Button
    private lateinit var mButton4 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourbutton)

        mButton1 = findViewById(R.id.button1)
        mButton2 = findViewById(R.id.button2)
        mButton3 = findViewById(R.id.button3)
        mButton4 = findViewById(R.id.button4)

        mButton1.setOnClickListener(this)
        mButton2.setOnClickListener(this)
        mButton3.setOnClickListener(this)
        mButton4.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.button1 -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(""))
                startActivity{this}
            }
            R.id.button1 -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(""))
                startActivity{this}
            }
            R.id.button1 -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(""))
                startActivity{this}
            }
            


            )
            R.id.button2 -> {}
            R.id.button3 -> {}
            R.id.button4 -> finish()


        }

    }
}