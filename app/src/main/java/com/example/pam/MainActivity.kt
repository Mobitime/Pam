package com.example.pam

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    private lateinit var rulesCheckBox: CheckBox
    private lateinit var infoTextView: TextView
    private lateinit var rulesTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        rulesCheckBox = findViewById(R.id.rulesCheckBox)
        infoTextView = findViewById(R.id.infoTextView)
        rulesTextView = findViewById(R.id.rulesTextView)

        rulesCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {

                infoTextView.text = "Правила дорожного движения"
                rulesTextView.text = """
                    1. Пропускайте пешеходов.
                    2. Используйте ремни безопасности.
                    3. Соблюдайте скоростной режим
                """.trimIndent()
            } else {
                infoTextView.text = ""
                rulesTextView.text = ""
            }
        }
    }
}