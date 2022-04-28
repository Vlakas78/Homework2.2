package ru.netology

data class Comments (
    val count: Int,
    val canPort: Boolean,
    val groupsCanPort: Int,
    val canClose: Boolean,
    val canOpen: Boolean
)