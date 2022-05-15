package ru.netology


object WallService {
    private var posts = emptyArray<Post>()
    private var postId = 1
    private var comments = emptyArray<Comment>()


    fun add(post: Post): Post {
        val postToAdd = post.copy(id = postId)
        posts += postToAdd
        postId++
        return posts.last()

          }

    fun update(post: Post): Boolean {
        for ((index, postOrigin) in posts.withIndex()) {
            if (post.id == postOrigin.id) {
                posts[index] = post.copy(ownedId = posts[index].ownedId, date = posts[index].date)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        for (post in posts) {
            if (comment.id == post.id) {
                comments += comment
            } else throw PostNotFoundException()

      }
  }
    }

