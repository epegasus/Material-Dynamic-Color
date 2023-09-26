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
        onClick(false)
        setContentView(binding.root)


        binding.mbEnable.setOnClickListener { onClick(true) }
        binding.mbDisable.setOnClickListener { onClick(false) }
    }

    private fun onClick(isEnable: Boolean) {
        val builder = DynamicColorsOptions.Builder().setOnAppliedCallback {
            Log.d("MyTag", "onClick: applied")
        }
        DynamicColors.applyToActivityIfAvailable(this, builder.build())
    }
}