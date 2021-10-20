package com.example.mystudy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mystudy.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class HomePageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bottomConfig()
    }

    private fun bottomConfig() {
        NavigationBarView.OnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.page_1 -> true
                R.id.page_2 -> true
                R.id.page_3 -> true
                R.id.page_4 -> true
                else -> false
            }
        }
    }

}