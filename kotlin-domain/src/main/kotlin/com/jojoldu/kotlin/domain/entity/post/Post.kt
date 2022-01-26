package com.jojoldu.kotlin.domain.entity.post

import com.jojoldu.kotlin.domain.entity.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity

@Entity
class Post: BaseEntity() {

    @Column
    var name: String? = ""
        private set
}