package com.haw.storyapp.model.response

data class LoginResponse(
    val error: Boolean,
    val user: User,
    val message: String
)