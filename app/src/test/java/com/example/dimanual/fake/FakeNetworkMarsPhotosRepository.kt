package com.example.dimanual.fake

import com.example.dimanual.data.MarsPhotosRepository
import com.example.dimanual.network.MarsPhoto

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
