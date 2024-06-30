package com.typhon.firstcreateproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_main)
		// Read Only: Cannot be changed again
		val myExampleInt : Int
		// Values that can be manipulated or mutable
		var myExampleVarInt : Int

		val lecturerName : String = "Fortune"
		val foundedYearOfTechFusionCamp = 2024
		val pi: Float = 3.147f
		var currentYear : Number = 2024
		var isRaining : Boolean = true
		val kotlinIsBest : Boolean = true
		val isJavaBetter : Boolean = false

		// Var variables can be reassigned
		currentYear = 2025
		isRaining = true
		println(currentYear)
		println(isRaining)

		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
	}
}