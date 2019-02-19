package com.example.quizzapp.db

// Notre table "Score" celle qu'on va utiliser
object ScoreTable {
    val NAME = "ScoreQuiz"
    const val ID = "_id"
    const val SCORE = "score"
    const val DATE = "date"
}

object UserTable {
    val NAME = "User"
    const val ID = "_id"
    const val USERNAME = "username"
    const val PASSWORD = "password"
}

object QuestionsTable {
    val NAME = "Questions"
    const val ID = "_id"
    const val QUESTION = "question"
    const val ANSWER1 = "answer1"
    const val ANSWER2 = "answer2"
    const val ANSWER3 = "answer3"
    const val CORRET = "correct"
}