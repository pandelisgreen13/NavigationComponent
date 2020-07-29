package com.pchasapis.navigationcomponet.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.pchasapis.navigationcomponet.R
import kotlinx.android.synthetic.main.fragment_dashboard.*


class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        details.setOnClickListener {
            findNavController().navigate(  DashboardFragmentDirections.actionDashboard2ToDetails())
        }
        settings.setOnClickListener {
            findNavController().navigate(  DashboardFragmentDirections.actionDashboard2ToSettings())
        }
        map.setOnClickListener {
            findNavController().navigate(  DashboardFragmentDirections.actionDashboard2ToMap())
        }
    }
}