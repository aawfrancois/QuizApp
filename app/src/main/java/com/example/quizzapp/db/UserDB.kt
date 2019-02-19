package com.example.quizzapp.db

import com.example.quizzapp.model.Score
import com.example.quizzapp.model.User
import org.jetbrains.anko.db.classParser
import org.jetbrains.anko.db.insert
import org.jetbrains.anko.db.select

class UserDB(private val dbHelper: MySqlDBHelper = MySqlDBHelper.instance) {

    // Pour récupérer nos scores
    fun requestUserUsername() = dbHelper.use {
        select(UserTable.NAME,
            UserTable.USERNAME)
            .parseList(classParser<User>())
    }

    // Pour engistrer un score
    fun saveScore(user: User) = dbHelper.use {
        insert(UserTable.NAME,
            ScoreTable.SCORE to user.username)
    }
}