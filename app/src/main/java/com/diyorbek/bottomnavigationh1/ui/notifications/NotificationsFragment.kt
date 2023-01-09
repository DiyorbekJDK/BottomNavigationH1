package com.diyorbek.bottomnavigationh1.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.diyorbek.bottomnavigationh1.adapter.RvAdapter
import com.diyorbek.bottomnavigationh1.databinding.FragmentHomeBinding
import com.diyorbek.bottomnavigationh1.databinding.FragmentNotificationsBinding
import com.diyorbek.bottomnavigationh1.util.Constantas

class NotificationsFragment : Fragment() {
    private val rvAdapter by lazy { RvAdapter() }
    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvAdapter.exList = Constantas.allExercises()
        binding.rv.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = rvAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}