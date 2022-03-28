package ru.netology

import org.junit.Test
import org.junit.After
import org.junit.Before
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addNewTest() {
        val newPost = Post(1, 1,1, 1,1648448270,
            "text1", 1,1, "friendsOnly1", "postType1", 1,true,
            true, 1,true,true,1)

        val expected = 3

        val result = WallService.add(newPost).id

        assertEquals(expected, result)
    }
    @Test
    fun updateTrue() {
        WallService.add(Post(1, 1,1, 1,1648448270,
            "text1", 1,1, "friendsOnly1", "postType1", 1,true,
            true, 1,true,true,1))

        WallService.add(Post(2, 2,2, 2,1648448270,
            "text2", 2,2, "friendsOnly2", "postType2", 2,true,
            true, 1,true,true,2))


        val update = Post(1, 1,1, 1,1648448270,
            "text1", 1,1, "friendsOnly1", "postType1", 1,true,
            true, 1,true,true,1)


        val result = WallService.update(update)

        assertTrue(result)

    }
    @Test
    fun updateFalse() {
        WallService.add(Post(1, 1,1, 1,1648448270,
            "text1", 1,1, "friendsOnly1", "postType1", 1,true,
            true, 1,true,true,1))

        WallService.add(Post(2, 2,2, 2,1648448270,
            "text2", 2,2, "friendsOnly2", "postType2", 2,true,
            true, 1,true,true,2))

        val update = Post(2, 1,1, 1,1648448270,
            "text1", 1,1, "friendsOnly1", "postType1", 1,true,
            true, 1,true,true,1)


        val result = WallService.update(update)

        assertTrue(result)

    }

}