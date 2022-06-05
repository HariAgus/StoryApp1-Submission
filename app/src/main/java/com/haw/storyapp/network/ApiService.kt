package com.haw.storyapp.network

import com.haw.storyapp.model.BaseResponse
import com.haw.storyapp.model.request.LoginRequest
import com.haw.storyapp.model.request.RegisterRequest
import com.haw.storyapp.model.response.LoginResponse
import com.haw.storyapp.model.response.StoriesResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {

    @POST(Url.REGISTER)
    fun register(
        @Body registerRequest: RegisterRequest
    ): Response<BaseResponse>

    @POST(Url.LOGIN)
    fun login(
        @Body loginRequest: LoginRequest
    ): Response<LoginResponse>

    @POST(Url.ADD_NEW_STORIES)
    fun addNewStory(

    ): Response<BaseResponse>

    @GET(Url.GET_ALL_STORIES)
    fun getAllStory(
        @Header("Authorization") token: String
    ): Response<StoriesResponse>

}