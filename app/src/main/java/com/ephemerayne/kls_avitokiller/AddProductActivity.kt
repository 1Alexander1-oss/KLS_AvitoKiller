package com.ephemerayne.kls_avitokiller

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class AddProductActivity : AppCompatActivity() {
    lateinit var categoriesSpinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)
        categoriesSpinner = findViewById(R.id.categories)
        val categories: Array<String> = arrayOf("еда", "животные", "авто")

        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        val categoriesAdapter: ArrayAdapter<String> = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item,
            categories
        );

        // Определяем разметку для использования при выборе элемента
        categoriesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Применяем адаптер к элементу spinner
        categoriesSpinner.adapter = categoriesAdapter
    }

}