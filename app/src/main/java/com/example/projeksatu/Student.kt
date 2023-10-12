package com.example.projeksatu

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Student(val name: String): Parcelable{

    override fun toString(): String {
        return name
    }
}