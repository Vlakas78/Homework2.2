package ru.netology


fun main() {

    var post1 = Post(1, 1,1, 1,1648448270,
        "text1", 1,1, "friendsOnly1", "postType1", 1,true,
        true, 1,true,true,1)

    WallService.add(post1)
    println(WallService.update(post1))

}
