package com.example.chatgptelmajeko.models.request

data class ImageGenerationRequest(
    val n: Int,
    val prompt: String,
    val size: String
)