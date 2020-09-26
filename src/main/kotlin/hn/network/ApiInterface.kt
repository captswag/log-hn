package hn.network

import hn.model.Story
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("v0/topstories.json")
    suspend fun getTopStories(): List<Int>

    @GET("v0/item/{id}.json")
    suspend fun getStory(@Path("id") id: Int): Story
}