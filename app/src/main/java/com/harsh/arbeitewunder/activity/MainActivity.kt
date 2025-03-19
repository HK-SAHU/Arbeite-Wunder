package com.harsh.arbeitewunder.activity

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.harsh.arbeitewunder.R
import com.harsh.arbeitewunder.ViewModel.MainViewModel
import com.harsh.arbeitewunder.adapter.CategoryAdapter
import com.harsh.arbeitewunder.adapter.JobAdapter
import com.harsh.arbeitewunder.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        initLocation()
        initCategory()
        initSuggest()
    }

    private fun initSuggest() {
        binding.progressBarSuggest.visibility=View.VISIBLE
        binding.recyclerViewSuggest.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerViewSuggest.adapter=JobAdapter(mainViewModel.loadData())
        binding.progressBarSuggest.visibility=View.GONE

    }

    private fun initCategory() {
        binding.progressBarCategory.visibility = View.VISIBLE
        binding.progressBarCategory.visibility = View.VISIBLE
        binding.recyclerViewCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewCategory.adapter = CategoryAdapter(mainViewModel.loadCategory(), object : CategoryAdapter.ClickListener{
            override fun onClick(category: String) {

            }

        })

        binding.progressBarCategory.visibility = View.GONE
    }

    private fun initLocation() {
        val adapter=ArrayAdapter(this,R.layout.spinner_item, mainViewModel.loadLocation())
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.LocationSp.adapter=adapter
        binding.LocationSp.setSelection(0)
        binding.LocationSp.setPopupBackgroundResource(R.drawable.white_bg)
        binding.LocationSp.setPopupBackgroundDrawable(getDrawable(R.drawable.white_bg))
        binding.LocationSp.setPopupBackgroundResource(R.drawable.white_bg)
        binding.LocationSp.setPopupBackgroundResource(R.drawable.white_bg)

    }
}

//package com.harsh.arbeitewunder.activity
//
//import android.os.Bundle
//import android.view.WindowManager
//import android.widget.ArrayAdapter
//import androidx.activity.viewModels
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.harsh.arbeitewunder.R
//import com.harsh.arbeitewunder.ViewModel.MainViewModel
//import com.harsh.arbeitewunder.databinding.ActivityMainBinding
//
//
//class MainActivity: AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
//    private val mainViewModel: MainViewModel by viewModels()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        window.setFlags(
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
//        )
//
//        initLocation()
//        setupRecyclerViews()
//    }
//
//
//    private fun initLocation() {
//        try {
//            val locations = mainViewModel.loadLocation()
//            val adapter = ArrayAdapter(this, R.layout.spinner_item, locations)
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            binding.LocationSp.adapter = adapter
//            binding.LocationSp.setSelection(0)
//            binding.LocationSp.setPopupBackgroundResource(R.drawable.white_bg)
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//    }
//
//    private fun setupRecyclerViews() {
//        // Set up your RecyclerViews here
//        binding.recyclerViewSuggest.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        binding.recyclerViewCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        binding.recyclerViewRecent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//
//        // You'll need to create and set adapters for these RecyclerViews
//        // For now, hide the progress bars
//        binding.progressBarSuggest.visibility = android.view.View.GONE
//        binding.progressBarCategory.visibility = android.view.View.GONE
//    }
//}
