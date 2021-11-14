package com.example.romanticruise.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import com.example.romanticruise.R
import com.example.romanticruise.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var profileViewModel: ProfileViewModel
    private var _binding: FragmentProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        profileViewModel =
            ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
                ProfileViewModel::class.java
            )

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        var menu_profile = getString(R.string.profile_info)
        menu_profile += "\n" + getString(R.string.profile_language)
        menu_profile += "\n" + getString(R.string.profile_logout)

        val textView: TextView = binding.textProfile
        profileViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = menu_profile
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}