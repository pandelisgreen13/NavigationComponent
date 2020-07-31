package com.pchasapis.navigationcomponet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class CredentialsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_credentials, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val string = arguments?.getString("username")
        if (string.isNullOrBlank()) {
            findNavController().navigate(CredentialsFragmentDirections.actionCredentialsFragmentToRegisterFragment())
        } else {
            findNavController().navigate(CredentialsFragmentDirections.actionCredentialsFragmentToLoginFragment())
        }
    }
}