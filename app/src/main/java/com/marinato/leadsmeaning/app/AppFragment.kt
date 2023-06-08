package com.marinato.leadsmeaning.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.marinato.leadsmeaning.R

class AppFragment : Fragment() {

    private lateinit var viewModel: AppViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_app, container, false)
    }



}