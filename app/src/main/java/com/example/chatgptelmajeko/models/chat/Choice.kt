package com.example.chatgptelmajeko.models.chat

data class Choice(
    val logprobs:Any,
    val finish_reason: String,
    val index: Int,
    val text: String
)