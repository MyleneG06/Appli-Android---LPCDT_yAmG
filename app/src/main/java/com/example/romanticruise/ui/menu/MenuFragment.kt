package com.example.romanticruise.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.widget.EditText
import com.example.romanticruise.R
import com.example.romanticruise.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private lateinit var menuViewModel: MenuViewModel
    private var _binding: FragmentMenuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        menuViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(MenuViewModel::class.java)

        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val root: View = binding.root

        var menu_services = getString(R.string.menu_title)
        menu_services += "\n" + "\n"
        menu_services += "\n" + getString(R.string.menu_excursion)
        menu_services += "\n" + getString(R.string.menu_sport)
        menu_services += "\n" + getString(R.string.menu_wellness)
        menu_services += "\n" + getString(R.string.menu_culture)
        menu_services += "\n" + getString(R.string.menu_event)
        menu_services += "\n" + getString(R.string.menu_shopping)
        menu_services += "\n" + getString(R.string.menu_restaurant)

        val textView: TextView = binding.textMenu
        menuViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = menu_services
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}