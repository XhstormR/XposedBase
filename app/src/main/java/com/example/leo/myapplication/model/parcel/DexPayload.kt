package com.example.leo.myapplication.model.parcel

import android.os.Parcelable
import java.io.File
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DexPayload(
    val appHash: String,
    val payload: File
) : Parcelable
