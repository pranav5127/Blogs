package com.app.blogs.repository

import com.app.blogs.model.BlogPost
import com.app.blogs.model.RetrofitInstance

class BlogRepository {
    suspend fun fetchPosts(page: Int, perPage: Int): List<BlogPost> {
        return RetrofitInstance.api.getPosts()
    }

}