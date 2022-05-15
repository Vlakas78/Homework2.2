package ru.netology

data class Comment(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: String,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: Int,
    val parentsStack: Int,
    val thread: Int,
    val postId: Int,
){

}
