package com.example.dimanual.fake

import com.example.dimanual.network.MarsApiService
import com.example.dimanual.network.MarsPhoto

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
