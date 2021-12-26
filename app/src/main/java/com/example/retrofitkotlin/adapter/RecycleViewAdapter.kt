package com.example.retrofitkotlin.adapter

import android.graphics.Color
import android.location.LocationListener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitkotlin.R
import com.example.retrofitkotlin.model.CryptoModel
import kotlinx.android.synthetic.main.row_layout.view.*

class RecycleViewAdapter (private val cryptoList:ArrayList<CryptoModel>,private val listener: Listener) : RecyclerView.Adapter<RecycleViewAdapter.RowHolder>(){
    interface Listener{
        fun onItemClick(cryptoModel: CryptoModel)
    }
    private val colors: Array<String> = arrayOf("#50f100","#4f61a1","#635380","#f83206","#9a6581","#4f5e6c","#fdc424","#fa104b")

    class RowHolder(view: View):RecyclerView.ViewHolder(view){
        fun bind(cryptoModel: CryptoModel,colors:Array<String>,position: Int,listener: Listener){

            itemView.setOnClickListener {
                listener.onItemClick(cryptoModel)
            }
            itemView.setBackgroundColor(Color.parseColor(colors[position%8]))
            itemView.text_name.text=cryptoModel.currency
            itemView.text_price.text=cryptoModel.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return RowHolder(view)
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.bind(cryptoList[position],colors,position,listener)

    }

    override fun getItemCount(): Int {
    return cryptoList.count()
    }

}