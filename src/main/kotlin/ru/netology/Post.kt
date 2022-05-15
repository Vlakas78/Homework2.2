package ru.netology

import ru.netology.Attachments.Attachment

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
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes?,
    val reposts: Reposts?,
    val view: View?,
    val donut: Donut?,
    val postType: String,
    val singerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val isPinned: Int,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int

) {
    private var attachments = emptyArray<Attachment>()

    fun addAttachments(attachment: Attachment): Boolean {
        attachments += attachment
        return true
    }
}




