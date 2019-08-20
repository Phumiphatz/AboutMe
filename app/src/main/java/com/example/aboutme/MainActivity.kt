package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val MyName:MyName = MyName("Phumiphat Wongchuea")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            done_button.setOnClickListener {
                addNickname(it)
            }
            nickname_text.setOnClickListener {
                updateNickname(it)
            }
            this.myName = this@MainActivity.myName
        }

    }



    private fun updateNickname(view: View){

        binding.apply {
            myName?.nickname = nickname_edit.text.toString()
            nickname_edit.visibility = View.GONE
            done_button.visibility = View.GONE
            nickname_text.visibility = View.VISIBLE
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken,0)
        }


    }

    private fun addNickname(view: View) {
        binding.apply {
            myName?.nickname = nickname_edit.text.toString()
            nickname_edit.visibility = View.GONE
            done_button.visibility = View.GONE
            nickname_text.visibility = View.VISIBLE
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken,0)
        }
}
