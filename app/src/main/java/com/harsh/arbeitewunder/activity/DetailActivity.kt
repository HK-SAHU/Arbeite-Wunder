package com.harsh.arbeitewunder.activity

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.bumptech.glide.Glide
import com.harsh.arbeitewunder.Fragment.AboutFragment
import com.harsh.arbeitewunder.Fragment.CompanyFragment
import com.harsh.arbeitewunder.Fragment.ReviewFragment
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
        setupViewPager()
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

    private fun setupViewPager() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        val tab1= AboutFragment()
        val tab2= CompanyFragment()
        val tab3= ReviewFragment()

        val bundle1= Bundle()
        bundle1.putString("description",item.description)
        bundle1.putString("about",item.about)

        tab1.arguments=bundle1
        tab2.arguments= Bundle()
        tab3.arguments= Bundle()

        adapter.addFrag(tab1,"About")
        adapter.addFrag(tab2,"Company")
        adapter.addFrag(tab3,"Reviews")

        binding.viewpager.adapter=adapter
        binding.tabLayout.setupWithViewPager(binding.viewpager)

    }


    private class ViewPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm){
        private val fragmentList= arrayListOf<Fragment>()
        private val fragmentTitlelist = arrayListOf<String>()

        override fun getCount():Int = fragmentList.size

        override fun getItem(position : Int): Fragment = fragmentList[position]

        fun addFrag(fragment: Fragment, title:String){
            fragmentList.add(fragment)
            fragmentTitlelist.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence = fragmentTitlelist[position]
    }
}