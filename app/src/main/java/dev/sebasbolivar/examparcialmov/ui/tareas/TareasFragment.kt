package dev.sebasbolivar.examparcialmov.ui.tareas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import dev.sebasbolivar.examparcialmov.R


class TareasFragment : Fragment() {
    var arrtareas = arrayOf(
        "Salir a pasear", "Caminar", "Hacer las compras", "Ir a la universidad", "Larvar el auto"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_tareas, container, false)
        val lstTareas: ListView = view.findViewById(R.id.lstTareas)
        val adaptor = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_list_item_1,arrtareas
        )
        lstTareas.adapter = adaptor
        return view
    }


}