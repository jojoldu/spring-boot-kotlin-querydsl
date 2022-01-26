package com.jojoldu.kotlin.domain.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

abstract class BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    private set

    @CreatedDate
    @Column
    var createdDate: LocalDateTime? = null
    private set

    @LastModifiedDate
    @Column
    var modifiedDate: LocalDateTime? = null
    private set
}