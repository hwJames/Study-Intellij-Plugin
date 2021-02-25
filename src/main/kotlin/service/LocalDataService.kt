package service

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import model.LocalData

@State(
    name = "localData",
    storages = [Storage("localData.xml")]
)
class LocalDataService : PersistentStateComponent<LocalData> {

    private var localData: LocalData = LocalData()

    override fun getState(): LocalData? {
        return localData
    }

    override fun loadState(state: LocalData) {
        localData = state
    }

    companion object {
        @JvmStatic
        fun getInstance(): PersistentStateComponent<LocalData> {
            return ServiceManager.getService(LocalDataService::class.java)
        }
    }
}