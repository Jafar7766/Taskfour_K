package com.example.taskfour_k.model

import java.io.Serializable


class User(private val id: Int, private val name: String) : Serializable {
    override fun toString(): String {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}'
    }
}