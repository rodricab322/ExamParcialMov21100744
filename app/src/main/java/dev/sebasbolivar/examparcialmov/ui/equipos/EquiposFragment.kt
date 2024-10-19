package dev.sebasbolivar.examparcialmov.ui.equipos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.sebasbolivar.examparcialmov.R
import dev.sebasbolivar.examparcialmov.ui.adapter.EquipoAdapter
import dev.sebasbolivar.examparcialmov.ui.model.EquipoModel

class EquiposFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_equipos, container, false)
        val rvPlayers = view.findViewById<RecyclerView>(R.id.rvEquipos)
        rvPlayers.layoutManager = LinearLayoutManager(requireContext())
        rvPlayers.adapter = EquipoAdapter(getEquipos())
        return view
    }

    private fun getEquipos(): List<EquipoModel> {
        val lstEquipos : ArrayList<EquipoModel> = ArrayList()
        lstEquipos.add(EquipoModel(1, R.drawable.hp, "HP", "fdl0008LA", 3999))
        lstEquipos.add(EquipoModel(2, R.drawable.lenovo, "Lenovo", "IdeaPad 0x1", 2999))
        lstEquipos.add(EquipoModel(3, R.drawable.asus, "Asus", "M415", 4999))
        return lstEquipos

    }

}