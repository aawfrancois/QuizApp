package com.example.quizzapp.db

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

    fun saveUser(userQuiz: User) = dbHelper.use {
        insert(UserTable.NAME,
            UserTable.USERNAME to userQuiz.username,
            UserTable.PASSWORD to userQuiz.password)
    }
}