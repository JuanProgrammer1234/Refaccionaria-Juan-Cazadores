package com.example.refaccionaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class Administrar_Stock : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrar_stock)
        val tableLayout: TableLayout = findViewById(R.id.tableLayout)
        val tableRow = TableRow(this)
        val cell1 = TextView(this)
        cell1.text = "Celda 1"
        val cell2 = TextView(this)
        cell2.text = "Celda 2"
        val cell3 = TextView(this)
        cell3.text = "Celda 3"
        tableRow.addView(cell1)
        tableRow.addView(cell2)
        tableRow.addView(cell3)
        tableLayout.addView(tableRow)

    }
}