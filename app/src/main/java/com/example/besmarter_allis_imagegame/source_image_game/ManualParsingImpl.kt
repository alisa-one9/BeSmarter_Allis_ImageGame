package com.example.besmarter_allis_imagegame.source_image_game

//import com.example.besmarter_allis_imagegame.data.ImageGameApi

//import com.example.besmarter_allis_imagegame.models.Movie
//import com.example.besmarter_allis_imagegame.models.Movies
import com.google.gson.Gson
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedInputStream
import java.io.BufferedReader
import java.net.URL
import java.net.URLConnection

//class ManualParsingImpl
//    : ImageGameApi {

//    override suspend fun getImages(): Movies {
//
//        val url = URL("https://jsonparsingdemo-cec5b.firebaseapp.com/json/moviesDemoItem.json")
//        val connection: URLConnection = url.openConnection()
//        connection.connect()
//
//        val bufferedInputStream = BufferedInputStream(connection.getInputStream())
//        val bufferedReader: BufferedReader = bufferedInputStream.bufferedReader()
//        val stringBuffer = StringBuffer()
//
//        for (line: String in bufferedReader.readLines()) {
//            stringBuffer.append(line)
//        }
//        bufferedReader.close()
//
//        val fullJson: String = stringBuffer.toString()
//
//        return Gson().fromJson(fullJson, Movies::class.java)
//
//
//    }
//}