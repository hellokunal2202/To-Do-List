package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var item:EditText
    lateinit var add :Button
    lateinit var listView: ListView

    var fileHelper=FileHelper()
    var itemList= ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        item=findViewById(R.id.editText)
        add=findViewById(R.id.button)
        listView=findViewById(R.id.list)

        itemList= fileHelper.readData(this) //read the existing Data if any
        var arrayAdapter=ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,android.R.id.text1,itemList)
        listView.adapter=arrayAdapter

        add.setOnClickListener {

        }

    }
}