package com.example.dimanual.data

import com.example.dimanual.network.MarsApiService
import com.example.dimanual.network.MarsPhoto

/**
 * Repositorio que obtiene la lista de fotos de Marte desde la fuente de datos.
 */
interface MarsPhotosRepository {
    /** Obtiene la lista de fotos de Marte */
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

/**
 * Implementación de red del repositorio que obtiene las fotos de Marte
 * desde [MarsApiService].
 */
class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {
    /** Obtiene la lista de fotos de Marte desde [MarsApiService] */
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}
