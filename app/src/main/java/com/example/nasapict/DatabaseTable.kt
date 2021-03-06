package com.example.nasapict

/*
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

private const val TAG = "PictureDatabase"

const val COL_TITLE = "TITLE"
const val COL_DATE = "DATE"
const val COL_URL = "URL"
const val COL_EXPLANATION = "EXPLANATION"

private const val DATABASE_NAME = "DICTIONARY"
private const val FTS_VIRTUAL_TABLE = "FTS"
private const val DATABASE_VERSION = 1

private const val FTS_TABLE_CREATE =
    "CREATE VIRTUAL TABLE $FTS_VIRTUAL_TABLE USING fts3 ($COL_TITLE, $COL_DATE, $COL_URL, $COL_EXPLANATION)"


class DatabaseTable(context: Context) {

    private val databaseOpenHelper : DatabaseOpenHelper

    init{
        databaseOpenHelper = DatabaseOpenHelper(context)
    }

    private class DatabaseOpenHelper internal constructor(private val helperContext: Context): SQLiteOpenHelper(helperContext, DATABASE_NAME, null, DATABASE_VERSION){
           private lateinit var mDatabase: SQLiteDatabase

           override fun onCreate(db: SQLiteDatabase){
               mDatabase = db
               mDatabase.execSQL(FTS_TABLE_CREATE)
           }

        override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int){
            Log.w(
                TAG,
                "Upgrading database from version $oldVersion to $newVersion , which will " +
                        "destroy all old data"
            )
            db.execSQL("DROP TABLE IF EXISTS $FTS_VIRTUAL_TABLE")
            onCreate(db)
        }
    }

}

 */