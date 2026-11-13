package com.example.dimanual.network

import retrofit2.http.GET

/**
 * Interfaz pública que expone el método [getPhotos]
 */
interface MarsApiService {
    /**
     * Retorna una [List] de [MarsPhoto]. Este método se puede llamar desde una
     * corrutina. La anotación @GET indica que se solicitará el endpoint "photos"
     * con el método HTTP GET.
     */
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}
