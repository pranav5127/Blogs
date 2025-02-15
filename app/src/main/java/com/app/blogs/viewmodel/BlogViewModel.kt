package com.app.blogs.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.blogs.model.BlogPost
import com.app.blogs.repository.BlogRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class BlogViewModel (private val repository:BlogRepository = BlogRepository() ): ViewModel() {
    private val _posts = MutableStateFlow<List<BlogPost>>(emptyList())
    val posts: StateFlow<List<BlogPost>> = _posts

    init {
        viewModelScope.launch {
            _posts.value = repository.fetchPosts( perPage = 10, page = 1)
        }
    }
}