package com.example.projeksatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rcData: RecyclerView
    private val listStudent = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcData = findViewById(R.id.rc_data)
        rcData.setHasFixedSize(true)
        rcData.layoutManager = LinearLayoutManager(this)

        listStudent.add(Student("Aceh"))
        listStudent.add(Student("Bali"))
        listStudent.add(Student("Bangka Belitung"))
        listStudent.add(Student("Banten"))
        listStudent.add(Student("Bengkulu"))
        listStudent.add(Student("Gorontalo"))
        listStudent.add(Student("Jakarta"))
        listStudent.add(Student("Jambi"))
        listStudent.add(Student("Jawa Barat"))
        listStudent.add(Student("Jawa Tengah"))
        listStudent.add(Student("Jawa Timur"))
        listStudent.add(Student("Kalimantan Barat"))
        listStudent.add(Student("Kalimantan Selatan"))
        listStudent.add(Student("Kalimantan Tengah"))
        listStudent.add(Student("Kalimantan Timur"))
        listStudent.add(Student("Kalimantan Utara"))
        listStudent.add(Student("Kepulauan Riau"))
        listStudent.add(Student("Lampung"))
        listStudent.add(Student("Maluku"))
        listStudent.add(Student("Maluku Utara"))
        listStudent.add(Student("Nusa Tenggara Barat"))
        listStudent.add(Student("Nusa Tenggara Timur"))
        listStudent.add(Student("Papua"))
        listStudent.add(Student("Papua Barat"))
        listStudent.add(Student("Riau"))
        listStudent.add(Student("Sulawesi Barat"))
        listStudent.add(Student("Sulawesi Selatan"))
        listStudent.add(Student("Sulawesi Tengah"))
        listStudent.add(Student("Sulawesi Tenggara"))
        listStudent.add(Student("Sulawesi Utara"))


        val mainAdabter = MainAdabter (listStudent)
        rcData.adapter = mainAdabter
    }

}