package com.rum.dynamicflavours

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.rum.dynamicflavours.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.toolbar.title = resources.getString(R.string.app_name)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(
                view,
                "Project name: " + resources.getString(R.string.app_name),
                Snackbar.LENGTH_LONG
            ).setAction("Action", null).show()
        }
    }
}