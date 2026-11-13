package com.example.dimanual.data

import com.example.dimanual.network.MarsApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

/**
 * Contenedor de inyección de dependencias a nivel de aplicación.
 */
interface AppContainer {
    val marsPhotosRepository: MarsPhotosRepository
}

/**
 * Implementación del contenedor de dependencias a nivel de aplicación.
 *
 * Las variables se inicializan de forma lazy y la misma instancia se comparte
 * en toda la app.
 */
class DefaultAppContainer : AppContainer {
    private val baseUrl = "https://android-kotlin-fun-mars-server.appspot.com"

    /**
     * Usa el builder de Retrofit para construir un objeto retrofit con el
     * convertidor de kotlinx.serialization
     */
    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(baseUrl)
        .build()

    /**
     * Objeto del servicio de Retrofit para crear las llamadas a la API
     */
    private val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }

    /**
     * Implementación por inyección de dependencias del repositorio de fotos de Marte
     */
    override val marsPhotosRepository: MarsPhotosRepository by lazy {
        NetworkMarsPhotosRepository(retrofitService)
    }
}
