package tr.com.nuritiras.ogrenmebirimi5sirasizde2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText1 = findViewById<EditText>(R.id.editTextNumber1)
        val editText2 = findViewById<EditText>(R.id.editTextNumber2)
        val buttonArti = findViewById<Button>(R.id.buttonArti)
        val buttonEksi = findViewById<Button>(R.id.buttonEksi)
        val buttonCarpi = findViewById<Button>(R.id.buttonCarpi)
        val buttonBolu = findViewById<Button>(R.id.buttonBolu)

        buttonArti.setOnClickListener {
            val sayi1 = editText1.text.toString().toInt()
            val sayi2 = editText2.text.toString().toInt()
            val sonuc = topla(sayi1, sayi2)
            Toast.makeText(this, sonuc.toString(), Toast.LENGTH_SHORT).show()
        }
        buttonEksi.setOnClickListener {
            val sayi1 = editText1.text.toString().toInt()
            val sayi2 = editText2.text.toString().toInt()
            val sonuc = cikar(sayi1, sayi2)
            Toast.makeText(this, sonuc.toString(), Toast.LENGTH_SHORT).show()
        }
        buttonCarpi.setOnClickListener {
            val sayi1 = editText1.text.toString().toInt()
            val sayi2 = editText2.text.toString().toInt()
            val sonuc = carp(sayi1, sayi2)
            Toast.makeText(this, sonuc.toString(), Toast.LENGTH_SHORT).show()
        }
        buttonBolu.setOnClickListener {
            val sayi1 = editText1.text.toString().toInt()
            val sayi2 = editText2.text.toString().toInt()
            val sonuc = bol(sayi1, sayi2)
            Toast.makeText(this, sonuc.toString(), Toast.LENGTH_SHORT).show()
        }

    }

    private fun topla(sayi1: Int, sayi2: Int): Int {
        return sayi1 + sayi2
    }

    private fun cikar(sayi1: Int, sayi2: Int): Int {
        return sayi1 - sayi2
    }

    private fun carp(sayi1: Int, sayi2: Int): Int {
        return sayi1 * sayi2
    }

    private fun bol(sayi1: Int, sayi2: Int): Int {
        return sayi1 / sayi2
    }

}