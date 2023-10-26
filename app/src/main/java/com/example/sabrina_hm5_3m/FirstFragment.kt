package com.example.sabrina_hm5_3m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sabrina_hm5_3m.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private var num = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnOperation.setOnClickListener{
            num++
            binding.tvNumber.text=num.toString()
            if (binding.tvNumber.text.toString().equals("10")){
                binding.btnOperation.text="-"
                binding.btnOperation.setOnClickListener {
                    num--
                    binding.tvNumber.text=num.toString()
                    if (binding.tvNumber.text.toString().equals("0")){
                        val bundle=Bundle()
                        bundle.putString("key1", binding.tvNumber.text.toString())
                        val resultFragment=ResultFragment()
                        resultFragment.arguments=bundle
                        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, resultFragment).commit()

                    }
                }
            }
        }
    }
}