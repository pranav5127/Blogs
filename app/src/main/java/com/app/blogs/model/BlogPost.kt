package com.app.blogs.model

data class BlogPost(
    val id: Int,
    val date: String,
    val guid: Guid,
    val slug: String,
    val link: String,
    val title: Rendered,
    val content: Rendered
)