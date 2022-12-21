package com.example.todolist

import android.content.Context
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInput
import java.io.ObjectInputStream
import java.io.ObjectOutput
import java.io.ObjectOutputStream

class FileHelper {
    val FILENAME="Listinfo.dat"

    fun writeData(item:ArrayList<String>,context: Context)
    {
        //make file and open it
        var fos:FileOutputStream=context.openFileOutput(FILENAME,Context.MODE_PRIVATE)
        //Writing Data
        var oas = ObjectOutputStream(fos)
        oas.writeObject(item)
        oas.close()
    }

    fun readData(context: Context):ArrayList<String>
    {
        var itemList:ArrayList<String>
        var fis : FileInputStream=context.openFileInput(FILENAME)
        var ois = ObjectInputStream(fis)
        itemList= ois.readObject() as ArrayList<String>

        return itemList
    }



}