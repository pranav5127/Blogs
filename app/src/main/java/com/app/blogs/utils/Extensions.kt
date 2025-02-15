package com.app.blogs.utils

fun String.toSlug() = this.replace(" ", "-").lowercase()