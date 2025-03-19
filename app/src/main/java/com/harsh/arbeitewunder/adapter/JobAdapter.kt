package com.harsh.arbeitewunder.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.harsh.arbeitewunder.Model.JobModel
import com.harsh.arbeitewunder.activity.DetailActivity
import com.harsh.arbeitewunder.databinding.ViewholderJobBinding

class JobAdapter(private val items: List<JobModel>):RecyclerView.Adapter<JobAdapter.ViewHolder>() {
    private lateinit var  context : Context

    inner class ViewHolder(val binding: ViewholderJobBinding) : RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobAdapter.ViewHolder {
        context= parent.context
        val binding= ViewholderJobBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=items[position]
        holder.binding.titleTxt.text=item.title
        holder.binding.companyTxt.text=item.company
        holder.binding.locationTxt.text=item.location
        holder.binding.timeTxt.text=item.time
        holder.binding.modelTxt.text=item.model
        holder.binding.levelTxt.text=item.level
        holder.binding.salaryTxt.text=item.salary
//        holder.binding.pic.setImageResource(context.resources.getIdentifier(items.logo,"drawable",context.packageName))\

        val drawableResourceId = holder.itemView.resources.getIdentifier(item.picUrl, "drawable", holder.itemView.context.packageName)
        Glide.with(holder.itemView.context)
            .load(drawableResourceId)
            .into(holder.binding.pic)

        holder.itemView.setOnClickListener{
            val intent= Intent(context, DetailActivity::class.java)
            intent.putExtra("object",item)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = items.size

}