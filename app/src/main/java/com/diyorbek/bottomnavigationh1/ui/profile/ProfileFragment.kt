package com.diyorbek.bottomnavigationh1.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.diyorbek.bottomnavigationh1.R
import com.diyorbek.bottomnavigationh1.adapter.RvAdapter
import com.diyorbek.bottomnavigationh1.databinding.FragmentHomeBinding
import com.diyorbek.bottomnavigationh1.databinding.FragmentProfileBinding
import com.diyorbek.bottomnavigationh1.util.Constantas

class ProfileFragment : Fragment() {
    private val rvAdapter by lazy { RvAdapter() }
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvAdapter.exList = Constantas.secondExercises()
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