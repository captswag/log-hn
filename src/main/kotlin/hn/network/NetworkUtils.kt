package hn.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://hacker-news.firebaseio.com/"

class NetworkUtils {
    private fun getRetrofitInstance(): Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun getInstance(): ApiInterface = getRetrofitInstance().create(ApiInterface::class.java)
}