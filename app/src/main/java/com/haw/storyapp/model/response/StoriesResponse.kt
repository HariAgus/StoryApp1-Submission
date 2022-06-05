package com.haw.storyapp.model.response

data class StoriesResponse(
    val error: Boolean,
    val listStory: List<Story>,
    val message: String
)