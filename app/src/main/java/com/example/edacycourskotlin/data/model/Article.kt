package com.example.edacycourskotlin.data.model

import android.annotation.SuppressLint
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
@SuppressLint("ParcelCreate")
@Parcelize
@Entity(tableName = "Article")
data class Article
    (
    @PrimaryKey
    var id: Int?,
                    var title: String?,
                    var description: String?,
                    var url: String?,
                    var image: String?,
    var websiteUrl: String?): Parcelable {

    constructor(): this(
        null,
        null,
        null,
        null,
        null,
        null
    )
}