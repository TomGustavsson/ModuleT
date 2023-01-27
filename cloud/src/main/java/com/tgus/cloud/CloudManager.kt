package com.tgus.cloud

import android.util.Log
import com.tgus.config.ConfigManager
import com.tgus.core.CoreManager

class CloudManager {

    fun initCloudManager(tag: String) {
        Log.d(tag, "cloud manager initialized heeeepi")
        val test = CoreManager()
        test.initCommon(tag)
        val te = ConfigManager()
        te.initConfigManager(tag)
    }
}