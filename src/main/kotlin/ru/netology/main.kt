package ru.netology

import ru.netology.Attachments.*


fun main() {


    val comment = Comments(1, true, 1, true, true)
    val copyright = Copyright(1," ", " ", " ")
    val likes = Likes(1,true, true, true)
    val reposts = Reposts(1,true)
    val view = View(1)
    val donut = Donut(true,1," ", true, " ")

    var post1 = Post(1, 1,1, 1,1648448270,
        "text1", 1,1, "friendsOnly1", comment, copyright, likes,
        reposts, view, donut," ",1, true, true, 1, true,true,1)

        val audio = Audio(1, 1, "Иванов", "АПП", 10, "www.song.ru/1")
    val attachmentAudio = AudioAttachment(audio)

    post1.addAttachments(attachmentAudio)

    val video = Video(
        1, 1, "Кино", " ", 90,
        10102021, 20122022, 3, "www.kino.ru"
    )
    val attachmentVideo = VideoAttachment(video)
    post1.addAttachments(attachmentVideo)

    val comment1 = Comment(
        1, 1, 1, "1", "1", 1, 1, 1, 1, 1,1)
//    val comment2 = Comment(
//        2, 2, 1, "2", "1", 2, 2, 2,2, 2,2)


    WallService.add(post1)
//    println(service.update(post1))
    WallService.createComment(comment1)
//    service.createComment(comment2)

}