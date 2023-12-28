package com.aristidevs.aipgames.ui.gallery

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.aristidevs.aipgames.R
import com.aristidevs.aipgames.databinding.FragmentGalleryFragment5Binding
import com.aristidevs.aipgames.databinding.JugadorCorrectoBinding
import com.aristidevs.aipgames.databinding.JugadorIncorrectoBinding

class GalleryFragment5 : Fragment() {
    private var _binding: FragmentGalleryFragment5Binding? = null
    private val binding get() = _binding!!

    private var _binding2: JugadorCorrectoBinding? = null
    private val binding2 get() = _binding2!!

    private var _binding3: JugadorIncorrectoBinding? = null
    private val binding3 get() = _binding3!!

    private lateinit var galleryfragment5: GalleryFragment5

    companion object {
        fun newInstance() = GalleryFragment5()
    }

    private lateinit var viewModel: GalleryFragment5ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(GalleryFragment5ViewModel::class.java)

        _binding = FragmentGalleryFragment5Binding.inflate(inflater, container, false)
        _binding2 = JugadorCorrectoBinding.inflate(inflater, container, false)
        _binding3 = JugadorIncorrectoBinding.inflate(inflater, container, false)

        buttonInfo()
        buttonback()
        jugador()
        dialogFirst()

        val root: View = binding.root
        return root
    }

    private fun dialogFirst() {
        val inflater = LayoutInflater.from(requireContext())
        val customView = inflater.inflate(R.layout.match_info_1, null)

        val tv1 = customView.findViewById<TextView>(R.id.tv1)
        val tv2 = customView.findViewById<TextView>(R.id.tv2)
        val tv3 = customView.findViewById<TextView>(R.id.tv3)
        val tv4 = customView.findViewById<TextView>(R.id.tv4)


        tv1.text = getString(R.string.infogallery17)
        tv2.text = getString(R.string.infogallery18)
        tv3.text = getString(R.string.infogallery19)
        tv4.text = getString(R.string.infogallery20)

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

    fun buttonInfo() {

        binding.buttonInfo.setOnClickListener {
            val inflater = LayoutInflater.from(requireContext())
            val customView = inflater.inflate(R.layout.match_info_1, null)

            val tv1 = customView.findViewById<TextView>(R.id.tv1)
            val tv2 = customView.findViewById<TextView>(R.id.tv2)
            val tv3 = customView.findViewById<TextView>(R.id.tv3)
            val tv4 = customView.findViewById<TextView>(R.id.tv4)


            tv1.text = getString(R.string.infogallery17)
            tv2.text = getString(R.string.infogallery18)
            tv3.text = getString(R.string.infogallery19)
            tv4.text = getString(R.string.infogallery20)

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

    fun vistaJugadorIncorrecto() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.jugador_incorrecto, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()
    }

    fun vistaJugadorCorrecto() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.jugador_correcto, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

    }

    private fun buttonback() {
        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.action_galleryFragment5_to_galleryFragment4)
        }
    }

    fun jugador() {
        binding.ivArquero.setOnClickListener { campana() }
        binding.ivN4.setOnClickListener { bustos() }
        binding.ivN2.setOnClickListener { franco() }
        binding.ivN6.setOnClickListener { silva() }
        binding.ivN3.setOnClickListener { tagliafico() }
        binding.ivN8.setOnClickListener { rodriguez() }
        binding.ivN11.setOnClickListener { meza() }
        binding.ivN5.setOnClickListener { sanchezmino() }
        binding.ivN7.setOnClickListener { benitez() }
        binding.ivN10.setOnClickListener { barco() }
        binding.ivN9.setOnClickListener { gigliotti() }
    }

    fun campana() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_7letras, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

        val btnVerificar = customView.findViewById<Button>(R.id.verificar)

        btnVerificar.setOnClickListener {
            val a = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val c = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val f = customView.findViewById<EditText>(R.id.letra6).text.toString()
            val g = customView.findViewById<EditText>(R.id.letra7).text.toString()

            if (viewModel.Campana(a, b, c, d, e, f, g)) {
                vistaJugadorCorrecto()
                binding.ivArquero.isVisible = false
                binding.ivCheck1.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }

    fun bustos() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_6letras, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

        val btnVerificar = customView.findViewById<Button>(R.id.verificar)

        btnVerificar.setOnClickListener {
            val a = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val c = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val f = customView.findViewById<EditText>(R.id.letra6).text.toString()

            if (viewModel.Bustos(a, b, c, d, e, f)) {
                vistaJugadorCorrecto()
                binding.ivN4.isVisible = false
                binding.ivN4v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }

    fun franco() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_6letras, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

        val btnVerificar = customView.findViewById<Button>(R.id.verificar)

        btnVerificar.setOnClickListener {
            val a = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val c = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val f = customView.findViewById<EditText>(R.id.letra6).text.toString()

            if (viewModel.Franco(a, b, c, d, e, f)) {
                vistaJugadorCorrecto()
                binding.ivN2.isVisible = false
                binding.ivN2v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }

    fun silva() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_5letras, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

        val btnVerificar = customView.findViewById<Button>(R.id.verificar)

        btnVerificar.setOnClickListener {
            val a = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val c = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra5).text.toString()

            if (viewModel.Silva(a, b, c, d, e)) {
                vistaJugadorCorrecto()
                binding.ivN6.isVisible = false
                binding.ivN6v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }

    fun tagliafico() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_10letras, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

        val btnVerificar = customView.findViewById<Button>(R.id.verificar)

        btnVerificar.setOnClickListener {
            val a = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val c = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val f = customView.findViewById<EditText>(R.id.letra6).text.toString()
            val g = customView.findViewById<EditText>(R.id.letra7).text.toString()
            val h = customView.findViewById<EditText>(R.id.letra8).text.toString()
            val i = customView.findViewById<EditText>(R.id.letra9).text.toString()
            val j = customView.findViewById<EditText>(R.id.letra10).text.toString()



            if (viewModel.Tagliafico(a, b, c, d, e, f, g, h, i, j)) {
                vistaJugadorCorrecto()
                binding.ivN3.isVisible = false
                binding.ivN3v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }

    fun rodriguez() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_9letras, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

        val btnVerificar = customView.findViewById<Button>(R.id.verificar)

        btnVerificar.setOnClickListener {
            val a = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val c = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val f = customView.findViewById<EditText>(R.id.letra6).text.toString()
            val g = customView.findViewById<EditText>(R.id.letra7).text.toString()
            val h = customView.findViewById<EditText>(R.id.letra8).text.toString()
            val i = customView.findViewById<EditText>(R.id.letra9).text.toString()



            if (viewModel.Rodriguez(a, b, c, d, e, f, g, h, i)) {
                vistaJugadorCorrecto()
                binding.ivN8.isVisible = false
                binding.ivN8v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }

    fun sanchezmino() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.sanchez_mino, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

        val btnVerificar = customView.findViewById<Button>(R.id.verificar)

        btnVerificar.setOnClickListener {
            val a = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val c = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val f = customView.findViewById<EditText>(R.id.letra6).text.toString()
            val g = customView.findViewById<EditText>(R.id.letra7).text.toString()
            val h = customView.findViewById<EditText>(R.id.letra8).text.toString()
            val i = customView.findViewById<EditText>(R.id.letra9).text.toString()
            val j = customView.findViewById<EditText>(R.id.letra10).text.toString()
            val k = customView.findViewById<EditText>(R.id.letra11).text.toString()




            if (viewModel.SanchezMino(a, b, c, d, e, f, g, h, i, j, k)) {
                vistaJugadorCorrecto()
                binding.ivN5.isVisible = false
                binding.ivN5v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }

    fun meza() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_4letras, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

        val btnVerificar = customView.findViewById<Button>(R.id.verificar)
        btnVerificar.setOnClickListener {
            val a = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val c = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()

            if (viewModel.Meza(a,b,c,d)) {
                vistaJugadorCorrecto()
                binding.ivN11.isVisible = false
                binding.ivN11v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }

    fun barco() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_5letras, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

        val btnVerificar = customView.findViewById<Button>(R.id.verificar)

        btnVerificar.setOnClickListener {
            val a = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val c = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra5).text.toString()



            if (viewModel.Barco(a, b, c, d, e)) {
                vistaJugadorCorrecto()
                binding.ivN10.isVisible = false
                binding.ivN10v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }

    fun benitez() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_7letras, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

        val btnVerificar = customView.findViewById<Button>(R.id.verificar)

        btnVerificar.setOnClickListener {
            val a = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val c = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val f = customView.findViewById<EditText>(R.id.letra6).text.toString()
            val g = customView.findViewById<EditText>(R.id.letra7).text.toString()



            if (viewModel.Benitez(a, b, c, d, e, f, g)) {
                vistaJugadorCorrecto()
                binding.ivN7.isVisible = false
                binding.ivN7v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }

    fun gigliotti() {
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_9letras, null)

        val parent = customView.parent as? ViewGroup
        parent?.removeView(customView)

        val dialog = Dialog(requireContext())
        dialog.setContentView(customView)

        val window = dialog.window
        window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        window?.setGravity(Gravity.CENTER)
        dialog.show()

        val btnVerificar = customView.findViewById<Button>(R.id.verificar)

        btnVerificar.setOnClickListener {
            val a = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val c = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val f = customView.findViewById<EditText>(R.id.letra6).text.toString()
            val g = customView.findViewById<EditText>(R.id.letra7).text.toString()
            val h = customView.findViewById<EditText>(R.id.letra8).text.toString()
            val i = customView.findViewById<EditText>(R.id.letra9).text.toString()



            if (viewModel.Gigliotti(a, b, c, d, e, f, g, h, i)) {
                vistaJugadorCorrecto()
                binding.ivN9.isVisible = false
                binding.ivN9v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }

}