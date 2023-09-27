package dev.pegasus.materialdynamiccolor

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.color.DynamicColors
import com.google.android.material.color.DynamicColorsOptions
import dev.pegasus.materialdynamiccolor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onClick()
        setContentView(binding.root)
    }

    private fun onClick() {
        val builder = DynamicColorsOptions.Builder().setOnAppliedCallback {
            Log.d("MyTag", "onClick: applied")
        }
        Log.d("MyTag", "onClick: about to apply")
        DynamicColors.applyToActivityIfAvailable(this, builder.build())
    }
}