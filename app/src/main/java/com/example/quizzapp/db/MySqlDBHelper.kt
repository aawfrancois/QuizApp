package com.example.quizzapp.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.quizzapp.App
import org.jetbrains.anko.db.*


class MySqlDBHelper(ctx: Context = App.instance) : ManagedSQLiteOpenHelper(ctx,
    DB_NAME, null, DB_VERSION) {


    companion object {
        val DB_NAME = "quiz_app.db"
        val DB_VERSION = 2
        val instance by lazy { MySqlDBHelper() }
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Ici nous créeons notre table "Score", si elle existe tant mieux sinon elle est crée
        db.createTable(ScoreTable.NAME, true, ScoreTable.ID to INTEGER + PRIMARY_KEY,
            ScoreTable.SCORE to INTEGER,
            ScoreTable.DATE to INTEGER
        )

        db.createTable(UserTable.NAME, true, UserTable.ID to INTEGER + PRIMARY_KEY,
            UserTable.USERNAME to TEXT,
            UserTable.PASSWORD to TEXT
        )

        db.createTable(QuestionsTable.NAME, true, QuestionsTable.ID to INTEGER + PRIMARY_KEY,
            QuestionsTable.QUESTION to TEXT,
            QuestionsTable.ANSWER1 to TEXT,
            QuestionsTable.ANSWER2 to TEXT,
            QuestionsTable.ANSWER3 to TEXT,
            QuestionsTable.CORRET to INTEGER
        )
    }

    // Mettre à jour notre base de donnée à la nouvelle version
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.dropTable(ScoreTable.NAME, true)
        onCreate(db)
    }

}