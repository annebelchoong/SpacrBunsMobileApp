package com.example.spacebunsmobileapp.data

import com.google.firebase.firestore.Blob
import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.util.*

data class Order(
    var id: String=""
)

data class Product(
    @DocumentId
    var productId: String = "",
    var cat: String = "",
    var date: Date = Date(),
    var desc: String = "",
    var name: String = "",
    var price: Double = 0.00,
    var photo: Blob = Blob.fromBytes(ByteArray(0)),
)

val PRODUCTS = Firebase.firestore.collection("products")