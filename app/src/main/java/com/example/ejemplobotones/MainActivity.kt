package com.example.ejemplobotones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Switch
import android.widget.TextView
import android.widget.*
import androidx.appcompat.app.ActionBarDrawerToggle


class MainActivity : AppCompatActivity() {

    //atributos de clase

    private lateinit var btnAceptar: Button
    private lateinit var btnToggle: ToggleButton
    private lateinit var btnSwitch: Switch
    private lateinit var btnImagen: ImageButton
    private lateinit var btnImagenTxt: Button
    private lateinit var txtMensaje: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inicializar atributos en la UI

        btnAceptar = findViewById(R.id.btnAceptar)
        btnToggle = findViewById(R.id.btnToggle)
        btnSwitch = findViewById(R.id.btnSwitch)
        btnImagen = findViewById(R.id.btnImagen)
        btnImagenTxt = findViewById(R.id.btnImagenTxt)
        txtMensaje = findViewById(R.id.txtMensaje)

        //asignar eventos a los botones

        btnAceptar.setOnClickListener{
            txtMensaje.text = "Presinoaste el botón Aceptar"
        }

        btnToggle.setOnCheckedChangeListener() { compoundButton, isChecked ->
        if(isChecked){
                txtMensaje.text = "Presinoaste el botón Toggle y los encendiste"
            }else{
                txtMensaje.text = "Presinoaste el botón Toggle y lo apagaste"
            }
        }

        btnSwitch.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                txtMensaje.text = "Presinoaste el botón Switch y los encendiste"
            }else{
                txtMensaje.text = "Presinoaste el botón Switch y lo apagaste"
            }
        }

        btnImagen.setOnClickListener{
            txtMensaje.text = "Presinoaste el botón de Imagen"
        }

        btnImagenTxt.setOnClickListener{
            txtMensaje.text = "Presinoaste el botón de Imagen con texto"
        }


    }

}