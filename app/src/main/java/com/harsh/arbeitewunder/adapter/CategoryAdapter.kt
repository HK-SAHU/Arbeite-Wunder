package com.harsh.arbeitewunder.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import com.harsh.arbeitewunder.R
import com.harsh.arbeitewunder.databinding.ViewholderCategoryBinding

class CategoryAdapter(private val items:List<String>, val clickListener: ClickListener):
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
        private  var selectedPosition=-1
        private var lastSelectedPosition=-1
        private lateinit var context: Context


    inner class ViewHolder(val binding:ViewholderCategoryBinding):RecyclerView.ViewHolder(binding.root) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ViewHolder {
        context= parent.context
        val binding=ViewholderCategoryBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder, position: Int) {
        val item= items[position]
        holder.binding.caTxt.text=item

        holder.binding.root.setOnClickListener{
            lastSelectedPosition=selectedPosition
            selectedPosition= position
            notifyItemChanged(lastSelectedPosition)
            notifyItemChanged(selectedPosition)
            clickListener.onClick(position.toString())
        }

        if(selectedPosition==position){
            holder.binding.caTxt.setBackgroundResource(R.drawable.purple_full_corner)
            holder.binding.caTxt.setTextColor(context.resources.getColor(R.color.white))
        }
        else{
            holder.binding.caTxt.setBackgroundResource(R.drawable.grey_full_corner_bg)
            holder.binding.caTxt.setTextColor(context.resources.getColor(R.color.black))
        }
    }


    override fun getItemCount():Int= items.size

    interface ClickListener {
        fun onClick(category: String)

    }
}