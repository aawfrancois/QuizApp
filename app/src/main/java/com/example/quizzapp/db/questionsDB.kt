package com.example.quizzapp.db

import com.example.quizzapp.model.Questions
import com.example.quizzapp.model.Quiz
import com.example.quizzapp.model.User
import org.jetbrains.anko.db.classParser
import org.jetbrains.anko.db.insert
import org.jetbrains.anko.db.select

class questionsDB(private val dbHelper: MySqlDBHelper = MySqlDBHelper.instance) {

    // Pour récupérer nos scores
    fun requestQuestions() = dbHelper.use {
        select(QuestionsTable.NAME,
            QuestionsTable.QUESTION,
            QuestionsTable.ANSWER1,
            QuestionsTable.ANSWER2,
            QuestionsTable.ANSWER3,
            QuestionsTable.CORRET).parseList(classParser<Quiz>())
    }

    /*fun saveQuestion(QuestionQuiz: Quiz) = dbHelper.use {
        insert(QuestionsTable.NAME,
            QuestionsTable.QUESTION to QuestionsTable.question,
            QuestionsTable.ANSWER1 to QuestionsTable.answer1,
            QuestionsTable.ANSWER2 to QuestionsTable.answer2,
            QuestionsTable.ANSWER3 to QuestionsTable.answer3,
            QuestionsTable.CORRET to QuestionsTable.correctAnswerNumber)
    }*/
}