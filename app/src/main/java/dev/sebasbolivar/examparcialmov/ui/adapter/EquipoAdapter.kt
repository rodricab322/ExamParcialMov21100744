package dev.sebasbolivar.examparcialmov.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.sebasbolivar.examparcialmov.R
import dev.sebasbolivar.examparcialmov.ui.model.EquipoModel

class EquipoAdapter (private var lstEquipo: List<EquipoModel>):
    RecyclerView.Adapter<EquipoAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvMarca: TextView = itemView.findViewById(R.id.tvMarca)
        val tvModelo: TextView = itemView.findViewById(R.id.tvModelo)
        val tvPrecio: TextView = itemView.findViewById(R.id.tvPrecio)
        val ivPlayer: ImageView = itemView.findViewById(R.id.ivEquipo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_equipo, parent, false))
    }

    override fun getItemCount(): Int {
        return lstEquipo.size

    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemEquipo = lstEquipo[position]
        holder.ivPlayer.setImageResource(itemEquipo.image)
        holder.tvMarca.text = itemEquipo.brand.toString()
        holder.tvModelo.text = itemEquipo.model.toString()
        holder.tvPrecio.text = itemEquipo.price.toString()
    }



}