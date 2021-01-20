package com.indahserba.api.data

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class User (
    val login: String,
    val avatarUrl: String,
    val htmlUrl: String,
    val followersUrl: String,
    val followers: Int,
    val followingUrl: String,
    val following: Int,
    val reposurl: String,
    val repos: Int
    ) : Parcelable

