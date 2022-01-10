package com.dhrunal.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollbtn)
        val textView  : TextView = findViewById(R.id.textView)
        val imageView: ImageView = findViewById(R.id.imageView)
        val imageView2: ImageView = findViewById(R.id.imageView2)

        rollButton.setOnClickListener{

            var c :Int = (1..6).random()

            when(c){
                1->imageView2.setImageResource(R.drawable.dice_1)
                2->imageView2.setImageResource(R.drawable.dice_2)
                3->imageView2.setImageResource(R.drawable.dice_3)
                4->imageView2.setImageResource(R.drawable.dice_4)
                5->imageView2.setImageResource(R.drawable.dice_5)
                6->imageView2.setImageResource(R.drawable.dice_6)
                else->imageView2.setImageResource(R.drawable.dice_6)
            }

            var d :Int = (1..6).random()

            when(d){
                1->imageView.setImageResource(R.drawable.dice_1)
                2->imageView.setImageResource(R.drawable.dice_2)
                3->imageView.setImageResource(R.drawable.dice_3)
                4->imageView.setImageResource(R.drawable.dice_4)
                5->imageView.setImageResource(R.drawable.dice_5)
                6->imageView.setImageResource(R.drawable.dice_6)
                else->imageView.setImageResource(R.drawable.dice_6)
            }

            if (c>d){
                textView.text="Winner - Player 1"
            }
            else if (c==d){
                textView.text="Game Draw"
            }
            else{
                textView.text="Winner - Player 2"
            }
        }
    }
}
