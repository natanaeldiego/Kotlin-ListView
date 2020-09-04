package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.linha_lyout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var jogos = ArrayList<Jogo>()
        jogos.add(Jogo("Super Mário", "Nitendo"))
        jogos.add(Jogo("Futebol", "PlayStation"))

        var adapter: ListaAdapter = ListaAdapter(applicationContext, jogos)
        lista.adapter = adapter

        lista.setOnItemClickListener{
            parent, view, position, id ->
            Toast.makeText(applicationContext, "Jogo: "+jogos.get(position).nome, Toast.LENGTH_LONG).show()
        }
    }
}