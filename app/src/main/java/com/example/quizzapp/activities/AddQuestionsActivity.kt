package com.example.quizzapp.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quizzapp.R
import com.example.quizzapp.db.UserDB
import com.example.quizzapp.model.Questions
import com.example.quizzapp.model.Quiz
import com.example.quizzapp.model.User
import kotlinx.android.synthetic.main.activity_add_questions.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync

class AddQuestionsActivity : AppCompatActivity() {

    val userDB = UserDB()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_questions)
    }

    /*fun onClickBtnAdd(view: View) {
        val intent = Intent(this, MainActivity::class.java)

        doAsync {
            val Question = Quiz(question_txt.text.toString(), propostion_1.text.toString(),proposition_2.text.toString(),proposition_3.text.toString(),correct_text.text.toString().toInt())
            userDB.saveUser(Question = Questions)
            startActivity(intent)
        }
        startActivity(intent)
    }*/
}
