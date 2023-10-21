package com.example.searchrecipeapi

class UserService {
    val retrofit = RetrofitClient.getClient()
    val userApi = retrofit.create(RecipeApi::class.java)
}