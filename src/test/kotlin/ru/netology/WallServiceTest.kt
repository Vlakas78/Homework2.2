package ru.netology

import org.junit.Test
import org.junit.Assert.*
import ru.netology.Attachments.*
import ru.netology.PostNotFoundException

class WallServiceTest {

    @Test
    fun addNewTest() {
        val comment = Comments(1, true, 1, true, true)
        val copyright = Copyright(1," ", " ", " ")
        val likes = Likes(1,true, true, true)
        val reposts = Reposts(1,true)
        val view = View(1)
        val donut = Donut(true,1," ", true, " ")

        val post1 = Post(1, 1,1, 1,1648448270,
            "text1", 1,1, "friendsOnly1", comment, copyright, likes,
            reposts, view, donut," ",1, true, true, 1, true,true,1)

        val expected = 1

        WallService.add(post1)
        val result = post1.id

        assertEquals(expected, result)



    }
    @Test
    fun updateTrue() {

        val comment = Comments(1, true, 1, true, true)
        val copyright = Copyright(1," ", " ", " ")
        val likes = Likes(1,true, true, true)
        val reposts = Reposts(1,true)
        val view = View(1)
        val donut = Donut(true,1," ", true, " ")
        Post(1, 1,1, 1,1648448270,
            "text1", 1,1, "friendsOnly1", comment, copyright, likes,
            reposts, view, donut," ",1, true, true, 1, true,true,1)


        WallService.add(
            Post(2, 2,2, 2,1648448270,
                "text2", 2,2, "friendsOnly2", comment, copyright, likes,
                reposts, view, donut," ",1, true, true, 1, true,true,1)
        )


        val update = Post(1, 1,1, 1,1648448270,
            "text1", 1,1, "friendsOnly1", comment, copyright, likes,
            reposts, view, donut," ",1, true, true, 1, true,true,1)


        val result = WallService.update(update)

        assertTrue(result)

    }
    @Test
    fun updateFalse() {
        val comment = Comments(1, true, 1, true, true)
        val copyright = Copyright(1," ", " ", " ")
        val likes = Likes(1,true, true, true)
        val reposts = Reposts(1,true)
        val view = View(1)
        val donut = Donut(true,1," ", true, " ")

        val post1 = Post(1, 1,1, 1,1648448270,
            "text1", 1,1, "friendsOnly1", comment, copyright, likes,
            reposts, view,donut," ",1, true, true, 1, true,true,1)

        WallService.add(post1)

        val post2 = Post(2, 2,2, 2,1648448270,
            "text2", 2,2, "friendsOnly2", comment, copyright, likes,
            reposts, view,donut," ",2, true, true, 1, true,true, 2)

        val result = WallService.update(post2)

        assertFalse(result)


    }
    @Test
    fun addAttachmentsAudio() {
        val comment = Comments(1, true, 1, true, true)
        val copyright = Copyright(1," ", " ", " ")
        val likes = Likes(1,true, true, true)
        val reposts = Reposts(1,true)
        val view = View(1)
        val donut = Donut(true,1," ", true, " ")
        val post1 = Post(1, 1,1, 1,1648448270,
            "text1", 1,1, "friendsOnly1", comment, copyright, likes,
            reposts, view,donut," ",1, true, true, 1, true,true,1)

        val audio = Audio(1, 1, "Иванов", "АПП", 10, "www.song.ru/1")
        val attachment = AudioAttachment(audio)
        WallService.add(post1)
        assertTrue(post1.addAttachments(attachment))
    }

    @Test
    fun addAttachmentsVideo() {
        val comment = Comments(1, true, 1, true, true)
        val copyright = Copyright(1," ", " ", " ")
        val likes = Likes(1,true, true, true)
        val reposts = Reposts(1,true)
        val view = View(1)
        val donut = Donut(true,1," ", true, " ")

        val post1 = Post(1, 1,1, 1,1648448270,
            "text1", 1,1, "friendsOnly1", comment, copyright, likes,
            reposts, view,donut," ",1, true, true, 1, true,true,1)

        val video = Video(
            1, 1, "Кино", " ", 90,
            10102021, 20122022, 3, "www.kino.ru"
        )
        val attachment = VideoAttachment(video)
        WallService.add(post1)
        assertTrue(post1.addAttachments(attachment))
    }

//    @Test(expected = PostNotFoundException::class)
//    fun shouldThrow() {
//        val comment = Comments(1, true, 1, true, true)
//        val copyright = Copyright(1," ", " ", " ")
//        val likes = Likes(1,true, true, true)
//        val reposts = Reposts(1,true)
//        val view = View(1)
//        val donut = Donut(true,1," ", true, " ")
//
//
//        WallService.add(
//            Post(2, 1,1, 1,1648448270,
//        "text1", 1,1, "friendsOnly1", comment, copyright, likes,
//        reposts, view,donut," ",1, true, true, 1, true,true,1)
//        )
//
//        WallService.createComment(Comment(1, 1, 1, "1", "1", 1, 1, 1, 1, 1,1))
//
//
//
//    }
    }



