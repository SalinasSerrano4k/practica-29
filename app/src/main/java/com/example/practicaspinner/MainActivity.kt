package com.example.practicaspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.CleartextNetworkViolation
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import com.example.practicaspinner.databinding.ActivityMainBinding
import java.util.*
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.Int as KotlinInt

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    private lateinit var mBinding: ActivityMainBinding
    var Boton : Button ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val aaDepartamentos=ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_dropdown_item)

        aaDepartamentos.addAll(Arrays.asList("San Salvador","Chalatenango","La Union","Sonsonate",
            "Ahuachapan","Santa Ana","Usulutan","La Libertad","La Paz",
            "Cabañas","San Vicente","Cuscatlan","San Miguel","Morazan"))
        mBinding.spnDepartamento.onItemSelectedListener=this
        mBinding.spnDepartamento.adapter=aaDepartamentos

        Boton=findViewById(R.id.btn_Guardar)
        Boton!!.setOnClickListener{}


    }



    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: KotlinInt, id: Long) {
        val aaMunicipios=ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_dropdown_item)
        when (position) {
            0 -> {
                aaMunicipios.addAll(Arrays.asList("Aguilares", "Apopa",
                    "Ayutuxtepeque", "San Salvador"))
                mBinding.spnMunicipio.adapter=aaMunicipios
                val municiSelected=aaMunicipios.getItem(position)
                mBinding.txtMostrar.text=municiSelected
            }
            1 -> {
                aaMunicipios.addAll(Arrays.asList("Agua caliente", "Arcatao",
                    "Chalatenango", "Tejutla"))
                mBinding.spnMunicipio.adapter=aaMunicipios
                val municiSelected=aaMunicipios.getItem(position)
                mBinding.txtMostrar.text=municiSelected
            }
            2 -> {
                aaMunicipios.addAll(Arrays.asList("La Unión","Anamorós",
                    "Bolívar", "Concepción de Oriente"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
            3 -> {
                aaMunicipios.addAll(Arrays.asList("Santa Isabel Ishuatán","Santo Domingo de Guzmán",
                    "Sonsonate","Sonzacate"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
            4 -> {
                aaMunicipios.addAll(Arrays.asList("Ahuachapán", "Apaneca",
                    "Atiquizaya", "Concepción de Ataco"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
            5 -> {
                aaMunicipios.addAll(Arrays.asList("Metapán", "San Antonio Pajonal",
                    "San Sebastián Salitrillo", "Santa Ana"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
            6 -> {
                aaMunicipios.addAll(Arrays.asList("Santa María", "Santiago de María",
                    "Tecapán", "Usulután"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
            7 -> {
                aaMunicipios.addAll(Arrays.asList("Jayaque","Jicalapa","Nuevo Cuscatlán",
                    "Puerto de la Libertad"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
            8 -> {
                aaMunicipios.addAll(Arrays.asList("Cuyultitán","El Rosario",
                    "Jerusalén","La paz"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
            9 -> {
                aaMunicipios.addAll(Arrays.asList("Sensuntepeque","Cinquera",
                    "Dolores","Jutiapa"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
            10 -> {
                aaMunicipios.addAll(Arrays.asList("Apastepeque","San Vicente","Guadalupe",
                    "San Cayetano Istepeque"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
            11 -> {
                aaMunicipios.addAll(Arrays.asList("Cojutepeque", "Candelaria",
                    "El Carmen", "Suchitoto"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
            12 -> {
                aaMunicipios.addAll(Arrays.asList("San Gerardo", "San Jorge",
                    "San Luis de la Reina", "San Miguel"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
            13 -> {
                aaMunicipios.addAll(Arrays.asList("San Francisco Gotera",
                    "Lolotiquillo", "Yamabal", "Yoloaiquín"))
                mBinding.spnMunicipio.adapter=aaMunicipios
            }
        }
    }


    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}