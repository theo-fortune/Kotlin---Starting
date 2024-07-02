package com.typhon.firstcreateproject

import android.os.Bundle
import android.widget.TextView
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

		val myTextView: TextView = findViewById(R.id.myText)
		val lecturerName : String = "Fortune"
		val foundedYearOfTechFusionCamp = 2020 //  Assignment Operator
		val pi: Float = 3.147f // Assignment Operator
		var currentYear : Number = 2024 // Assignment Operator
		var isRaining : Boolean = true // Assignment Operator
		val kotlinIsBest : Boolean = true // Assignment Operator
		val isJavaBetter : Boolean = false // Assignment Operator


		// Var variables can be reassigned
		currentYear = 2025
		isRaining = true
		println(currentYear)
		println(isRaining)

		var ourProgrammingLanguage = "Kotlin";

		val techFusionCampAge = currentYear - foundedYearOfTechFusionCamp
		myTextView.text = "TechFusion Camp is" + " " + techFusionCampAge.toString() + " years old"

		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
	}
}