package dev.pegasus.materialdynamiccolor

import android.app.Application
import android.util.Log
import com.google.android.material.color.DynamicColors
import com.google.android.material.color.DynamicColorsOptions
import com.google.android.material.color.utilities.DynamicColor

/**
 * @Author: SOHAIB AHMED
 * @Date: 9/26/2023
 * @Accounts
 *      -> https://github.com/epegasus
 *      -> https://stackoverflow.com/users/20440272/sohaib-ahmed
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        val builder = DynamicColorsOptions.Builder().setOnAppliedCallback {
            Log.d("MyTag", "onClick: applied")
        }
        //DynamicColors.applyToActivitiesIfAvailable(this, builder.build())

    }
}