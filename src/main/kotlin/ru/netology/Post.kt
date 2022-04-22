package ru.netology

data class Post(
    val id: Int,
    val ownedId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: String,
    val postType: String,
    val singerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val isPinned: Int,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int
//    val comments: String,
//    val copyright: String,
//    val likes: Int,
//    val reposts: Int,
//    val view: Int,
//    val donut: Int,
)





