package id.dicoding.zodiakkim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var rvZodiak: RecyclerView
    private var list = ArrayList<Zodiak>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvZodiak = findViewById(R.id.recycleview_zodiak)
        rvZodiak.setHasFixedSize(true)

        list.addAll(IniDataZodiak.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvZodiak.layoutManager = LinearLayoutManager(this)
        val AdapterZodiaknya = AdapterZodiaknya(list)
        rvZodiak.adapter = AdapterZodiaknya

        AdapterZodiaknya.setOnItemClickCallback(object : AdapterZodiaknya.OnItemClickCallback {
            override fun onItemClicked(data: Zodiak) {
                showSelectedZodiak(data)
            }
        })
    }

    private fun showSelectedZodiak(hero: Zodiak) {
        Toast.makeText(this, "Kamu memilih " + hero.name, Toast.LENGTH_SHORT).show()

    }
}
