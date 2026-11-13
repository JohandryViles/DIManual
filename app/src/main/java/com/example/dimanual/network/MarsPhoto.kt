package com.example.dimanual.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Esta clase de datos define una foto de Marte que incluye un ID y la URL de la imagen.
 */
@Serializable
data class MarsPhoto(
    val id: String,
    @SerialName(value = "img_src")
    val imgSrc: String
)
