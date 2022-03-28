package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var postId = 1


    fun add(post: Post): Post {
        post.id = postId
        posts += post
        postId++
        return posts.last()

    }

    fun update(post: Post): Boolean {
        for ((index, postOrigin) in posts.withIndex()) {
            if (post.id == postOrigin.id) {
                this.posts[index] = post.copy(id = postOrigin.id, date = postOrigin.date)
                return true
            }
        }
        return false
    }
}
