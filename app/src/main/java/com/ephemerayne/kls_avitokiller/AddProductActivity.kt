package com.ephemerayne.kls_avitokiller

import android.location.Address
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class AddProductActivity : AppCompatActivity() {
    lateinit var categoriesSpinner: Spinner
    lateinit var productName: EditText
    lateinit var productPrice: EditText
    lateinit var productAddress: EditText
    lateinit var description: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)
        categoriesSpinner = findViewById(R.id.categories)
        setCategoriesAdapter()
        productName = findViewById(R.id.name)
        productPrice = findViewById(R.id.price)
        productAddress = findViewById(R.id.address)
        description = findViewById(R.id.description)
        button = findViewById(R.id.publish)

    }

    private fun setCategoriesAdapter() {
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