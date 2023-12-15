package com.aristidevs.aipgames.ui.gallery

import android.app.Dialog
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.lifecycle.get
import androidx.navigation.fragment.findNavController
import com.aristidevs.aipgames.R
import com.aristidevs.aipgames.databinding.FragmentGalleryFragment2Binding
import com.aristidevs.aipgames.databinding.FragmentGalleryFragment3Binding
import com.aristidevs.aipgames.databinding.JugadorCorrectoBinding
import com.aristidevs.aipgames.databinding.JugadorIncorrectoBinding

class GalleryFragment3 : Fragment() {

    private var _binding: FragmentGalleryFragment3Binding? = null
    private val binding get() = _binding!!

    private var _binding2: JugadorCorrectoBinding? = null
    private val binding2 get() = _binding2!!

    private var _binding3: JugadorIncorrectoBinding? = null
    private val binding3 get() = _binding3!!

    private lateinit var galleryFragment3: GalleryFragment3

    companion object {
        fun newInstance() = GalleryFragment3()
    }

    private lateinit var viewModel: GalleryFragment3ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(GalleryFragment3ViewModel::class.java)

        _binding = FragmentGalleryFragment3Binding.inflate(inflater, container, false)
        _binding2 = JugadorCorrectoBinding.inflate(inflater, container, false)
        _binding3 = JugadorIncorrectoBinding.inflate(inflater, container, false)

        buttonInfo()
        jugador()
        buttonNext()
        buttonBack()
        val root: View = binding.root
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


            tv1.text = getString(R.string.infogallery9)
            tv2.text = getString(R.string.infogallery10)
            tv3.text = getString(R.string.infogallery11)
            tv4.text = getString(R.string.infogallery12)

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
    fun buttonNext(){
        findNavController().navigate(R.id.action_galleryFragment3_to_galleryFragment4)
    }
    fun buttonBack() {
        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.galleryFragment2)
        }
    }

    fun jugador(){
        binding.ivArquero.setOnClickListener { caranta() }
        binding.ivN4.setOnClickListener { ibarra() }
        binding.ivN2.setOnClickListener { diaz() }
        binding.ivN6.setOnClickListener { mrodriguez() }
        binding.ivN3.setOnClickListener { crodriguez() }
        binding.ivN11.setOnClickListener { banega() }
        binding.ivN8.setOnClickListener { ledesma() }
        binding.ivN5.setOnClickListener { cardozo() }
        binding.ivN10.setOnClickListener { riquelme() }
        binding.ivN7.setOnClickListener { palacio() }
        binding.ivN9.setOnClickListener { palermo() }
    }

    fun caranta(){
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


            if (viewModel.Caranta(a,b,c,d,e,f,g)) {
                vistaJugadorCorrecto()
                binding.ivArquero.isVisible = false
                binding.ivCheck1.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun ibarra(){
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


            if (viewModel.Ibarra(a,b,c,d,e,f)) {
                vistaJugadorCorrecto()
                binding.ivN4.isVisible = false
                binding.ivN4v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }}
    fun diaz(){
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


            if (viewModel.Diaz(a,b,c,d)) {
                vistaJugadorCorrecto()
                binding.ivN2.isVisible = false
                binding.ivN2v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun mrodriguez(){
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


            if (viewModel.RodriguezM(a,b,c,d,e,f,g,h,i)) {
                vistaJugadorCorrecto()
                binding.ivN6.isVisible = false
                binding.ivN6v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun crodriguez(){
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


            if (viewModel.RodriguezC(a,b,c,d,e,f,g,h,i)) {
                vistaJugadorCorrecto()
                binding.ivN3.isVisible = false
                binding.ivN3v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun ledesma(){
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



            if (viewModel.Ledesma(a,b,c,d,e,f,g)) {
                vistaJugadorCorrecto()
                binding.ivN8.isVisible = false
                binding.ivN8v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun banega(){
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


            if (viewModel.Banega(a,b,c,d,e,f)) {
                vistaJugadorCorrecto()
                binding.ivN11.isVisible = false
                binding.ivN11v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun cardozo(){
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


            if (viewModel.Cardozo(a,b,c,d,e,f,g)) {
                vistaJugadorCorrecto()
                binding.ivN5.isVisible = false
                binding.ivN5v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun riquelme(){
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_8letras, null)

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

            if (viewModel.Riquelme(a,b,c,d,e,f,g,h)) {
                vistaJugadorCorrecto()
                binding.ivN10.isVisible = false
                binding.ivN10v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun palacio(){
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


            if (viewModel.Palacio(a,b,c,d,e,f,g)) {
                vistaJugadorCorrecto()
                binding.ivN7.isVisible = false
                binding.ivN7v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun palermo(){
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


            if (viewModel.Palermo(a,b,c,d,e,f,g)) {
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