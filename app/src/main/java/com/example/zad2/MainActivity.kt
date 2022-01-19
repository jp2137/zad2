package com.example.zad2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 4;
        findViewById<Button>(R.id.button).setOnClickListener{
            if(x==4)
            {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.jp3)
                x = 3
            }
            else if(x==3)
            {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.jp2)
                x = 2
            }
            else if(x==2)
            {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.jp1)
                x = 1
            }
            else
            {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.krem)
                x = 4
            }
        }
        findViewById<Button>(R.id.button2).setOnClickListener{
            if(x==4)
            {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.jp1)
                x = 1
            }
            else if(x==3)
            {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.krem)
                x = 4
            }
            else if(x==2)
            {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.jp3)
                x = 3
            }
            else if(x==1)
            {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.jp2)
                x = 2
            }
        }
        findViewById<Button>(R.id.prawyObrot).setOnClickListener {
            var a= findViewById<EditText>(R.id.editTextNumber).text
            var obrot = a.toString().toFloat()
            findViewById<ImageView>(R.id.image).setRotation(obrot);
        }
        findViewById<Button>(R.id.lewyObrot).setOnClickListener {
            var a= findViewById<EditText>(R.id.editTextNumber).text
            var b = a.toString().toFloat()
            var obrot = b * -1;
            findViewById<ImageView>(R.id.image).setRotation(obrot);
        }
    }
}
