package com.jojoldu.kotlin.domain.entity.post

import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository: JpaRepository<Post, Long>