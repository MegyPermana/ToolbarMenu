package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.tbAddcontact -> Toast.makeText(this, "Kamu menekan AddContact", Toast.LENGTH_LONG).show()
            R.id.tbFavorit -> Toast.makeText(this, "Kamu menekan Favorite", Toast.LENGTH_LONG).show()
            R.id.tbSetting -> Toast.makeText(this, "Kamu menekan Setting", Toast.LENGTH_LONG).show()
            R.id.tbFeedback -> Toast.makeText(this, "Kamu menekan AddFeedback", Toast.LENGTH_LONG).show()
            R.id.tbClose -> finish()
        }
        return true
    }
}