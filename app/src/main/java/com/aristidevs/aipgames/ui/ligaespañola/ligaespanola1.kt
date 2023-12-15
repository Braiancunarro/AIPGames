package com.aristidevs.aipgames.ui.ligaespañola

import android.app.Dialog
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.aristidevs.aipgames.R
import com.aristidevs.aipgames.databinding.FragmentLigaespanola1Binding
import com.aristidevs.aipgames.databinding.FragmentSlideshowBinding
import com.aristidevs.aipgames.databinding.JugadorCorrectoBinding
import com.aristidevs.aipgames.databinding.JugadorIncorrectoBinding
import com.aristidevs.aipgames.ui.slideshow.SlideshowViewModel

class ligaespanola1 : Fragment() {

    companion object {
        fun newInstance() = ligaespanola1()
    }

    private var _binding: FragmentLigaespanola1Binding? = null

    private val binding get() = _binding!!

    private var _binding2: JugadorCorrectoBinding? = null
    private val binding2 get() = _binding2!!

    private var _binding3: JugadorIncorrectoBinding? = null
    private val binding3 get() = _binding3!!

    private lateinit var ligaespanola1ViewModel: Ligaespanola1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ligaespanola1ViewModel =
            ViewModelProvider(this).get(Ligaespanola1ViewModel::class.java)

        _binding = FragmentLigaespanola1Binding.inflate(inflater, container, false)
        _binding2 = JugadorCorrectoBinding.inflate(inflater, container, false)
        _binding3 = JugadorIncorrectoBinding.inflate(inflater, container, false)
        val root: View = binding.root
        buttonInfo()
        jugador()
        return root
    }
    fun buttonInfo() {

        binding.buttonInfo.setOnClickListener {
            val inflater = LayoutInflater.from(requireContext())
            val customView = inflater.inflate(R.layout.match_info_1, null)

            val tv1 = customView.findViewById<TextView>(R.id.tv1)
            val tv2 = customView.findViewById<TextView>(R.id.tv2)
            val tv3 = customView.findViewById<TextView>(R.id.tv3)
            val tv4 = customView.findViewById<TextView>(R.id.tv4)


            tv1.text = getString(R.string.infoslideshow1)
            tv2.text = getString(R.string.infoslideshow2)
            tv3.text = getString(R.string.infoslideshow3)
            tv4.text = getString(R.string.infoslideshow4)

            val dialog = Dialog(requireContext())
            dialog.setContentView(customView)

            val window = dialog.window
            window?.setLayout(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            window?.setGravity(Gravity.CENTER)

            val btnVolver = customView.findViewById<Button>(R.id.btnVolver)

            btnVolver.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}