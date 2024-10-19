package dev.sebasbolivar.examparcialmov.ui.gastos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import dev.sebasbolivar.examparcialmov.R


class GastosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_gastos, container, false)
        val etIngresofijo: EditText = rootView.findViewById(R.id.etIngresofijo)
        val etGastofijo: EditText = rootView.findViewById(R.id.etGastofijo)
        val etGastovariable: EditText = rootView.findViewById(R.id.etGastovariable)
        val btCalcular: Button = rootView.findViewById(R.id.btCalcular)
        val tvResult: TextView = rootView.findViewById(R.id.tvResult)

        btCalcular.setOnClickListener {
            val kmStr = etIngresofijo.text.toString()
            val minStr = etGastofijo.text.toString()

            if (kmStr.isNotEmpty() && minStr.isNotEmpty()) {
                val km = kmStr.toFloat()
                val min = minStr.toFloat()

                if (min>0){
                    val rendimiento = km/min
                    tvResult.text = String.format("%.2f", rendimiento)
                }else{
                    tvResult.text = "El tiempo no puede ser 0"
                }

            } else {
                tvResult.text = "Por favor, ingrese valores válidos"
            }
        }
        return rootView
    }


}