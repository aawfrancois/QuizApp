package com.example.quizzapp.db

import com.example.quizzapp.model.Score
import org.jetbrains.anko.db.classParser
import org.jetbrains.anko.db.insert
import org.jetbrains.anko.db.select


class QuizDB(private val dbHelper: MySqlDBHelper = MySqlDBHelper.instance) {

    // Pour récupérer nos scores
    fun requestScores() = dbHelper.use {
        select(ScoreTable.NAME,
            ScoreTable.SCORE, ScoreTable.DATE)
            .parseList(classParser<Score>())
    }

    // Pour engistrer un score
    fun saveScore(scoreQuiz: Score) = dbHelper.use {
        insert(ScoreTable.NAME,
            ScoreTable.SCORE to scoreQuiz.score,
            ScoreTable.DATE to scoreQuiz.date)
    }
}