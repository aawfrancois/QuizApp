package com.example.quizzapp.activities

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.quizzapp.R
import com.example.quizzapp.db.UserDB
import com.example.quizzapp.model.User
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync

class MainActivity : AppCompatActivity() {

    val userDB = UserDB()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickBtnPlay(view: View) {
        val intent = Intent(this, QuizActivity::class.java)

        if (editText.text.toString() != null) {
            doAsync {
                val User = User(editText.text.toString(),editText3.text.toString() )
                userDB.saveUser(userQuiz = User)
                startActivity(intent)
            }
        }
        Toast.makeText(this, "Please enter a username", Toast.LENGTH_SHORT).show()
    }

    fun onClickBtnScores(view: View) {
        val intent = Intent(this, ListScoresActivity::class.java)
        startActivity(intent)
    }

    fun onClickBtnAdd(view: View) {
        val intent = Intent(this, ListScoresActivity::class.java)
        startActivity(intent)
    }
}