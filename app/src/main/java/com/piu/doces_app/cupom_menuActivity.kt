package com.piu.doces_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.*
import kotlinx.android.synthetic.main.activity_cupom_menu.*
import kotlinx.android.synthetic.main.activity_main.*

class cupom_menuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cupom_menu)


        bt_es1.setOnClickListener {
            img_es1.visibility = VISIBLE
        }

        bt_es2.setOnClickListener {
            img_es2.visibility = VISIBLE
        }

        bt_es3.setOnClickListener {
            img_es3.visibility = VISIBLE
        }

        bt_es4.setOnClickListener {
            img_es4.visibility = VISIBLE
        }

        bt_es5.setOnClickListener {
            img_es5.visibility = VISIBLE
        }

        bt_di1.setOnClickListener {
            img_di1.visibility = VISIBLE //alt + enter pra importar
        }

        bt_di2.setOnClickListener {
            img_di2.visibility = VISIBLE
        }

        bt_di3.setOnClickListener {
            img_di3.visibility = VISIBLE
        }

        bt_di4.setOnClickListener {
            img_di4.visibility = VISIBLE
        }

        bt_di5.setOnClickListener {
            img_es1.visibility = INVISIBLE
            img_es2.visibility = INVISIBLE
            img_es3.visibility = INVISIBLE
            img_es4.visibility = INVISIBLE
            img_es5.visibility = INVISIBLE
            img_di1.visibility = INVISIBLE
            img_di2.visibility = INVISIBLE
            img_di3.visibility = INVISIBLE
            img_di4.visibility = INVISIBLE
            img_di5.visibility = INVISIBLE
        }



    }
}