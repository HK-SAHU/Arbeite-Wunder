package com.harsh.arbeitewunder.activity

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.harsh.arbeitewunder.Model.JobModel
import com.harsh.arbeitewunder.R
import com.harsh.arbeitewunder.databinding.ActivityDetailBinding
import java.util.ResourceBundle.getBundle

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    lateinit var item: JobModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        getBundle()
    }

    private fun getBundle() {
        item=intent.getParcelableExtra("object")!!

        binding.titleTxt.text=item.title
        binding.companyTxt.text=item.company
        binding.locationTxt.text=item.location
        binding.jobTypeTxt.text=item.time
        binding.salaryTxt.text=item.salary
        binding.levelTxt.text=item.level
        binding.workingModelTxt.text=item.model

        val drawableResourceId = resources.getIdentifier(item.picUrl, "drawable", packageName)
        Glide.with(this)
            .load(drawableResourceId)
            .into(binding.picDetail)


        binding.backBtn.setOnClickListener{
            finish()
        }
    }
}