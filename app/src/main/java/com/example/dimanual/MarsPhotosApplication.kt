package com.example.dimanual

import android.app.Application
import com.example.dimanual.data.AppContainer
import com.example.dimanual.data.DefaultAppContainer

/**
 * Clase Application que mantiene el contenedor de dependencias de la app.
 */
class MarsPhotosApplication : Application() {
    /** Instancia de AppContainer usada por el resto de clases para obtener dependencias */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
