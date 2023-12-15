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
import androidx.navigation.fragment.findNavController
import com.aristidevs.aipgames.R
import com.aristidevs.aipgames.databinding.FragmentGalleryFragment3Binding
import com.aristidevs.aipgames.databinding.FragmentGalleryFragment4Binding
import com.aristidevs.aipgames.databinding.JugadorCorrectoBinding
import com.aristidevs.aipgames.databinding.JugadorIncorrectoBinding

class GalleryFragment4 : Fragment() {

    private var _binding: FragmentGalleryFragment4Binding? = null
    private val binding get() = _binding!!

    private var _binding2: JugadorCorrectoBinding? = null
    private val binding2 get() = _binding2!!

    private var _binding3: JugadorIncorrectoBinding? = null
    private val binding3 get() = _binding3!!

    private lateinit var galleryFragment4: GalleryFragment4

    companion object {
        fun newInstance() = GalleryFragment4()
    }

    private lateinit var viewModel: GalleryFragment4ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(GalleryFragment4ViewModel::class.java)

        _binding = FragmentGalleryFragment4Binding.inflate(inflater, container, false)
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


            tv1.text = getString(R.string.infogallery13)
            tv2.text = getString(R.string.infogallery14)
            tv3.text = getString(R.string.infogallery15)
            tv4.text = getString(R.string.infogallery16)

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
    }
    fun buttonBack() {
        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.galleryFragment3)
        }
    }

    fun jugador(){
        binding.ivArquero.setOnClickListener { torrico() }
        binding.ivN4.setOnClickListener { buffarini() }
        binding.ivN2.setOnClickListener { fontanini() }
        binding.ivN6.setOnClickListener { gentiletti() }
        binding.ivN3.setOnClickListener { mas() }
        binding.ivN8.setOnClickListener { villalba() }
        binding.ivN11.setOnClickListener { mercier() }
        binding.ivN5.setOnClickListener { ortigoza() }
        binding.ivN7.setOnClickListener { piatti() }
        binding.ivN10.setOnClickListener { romagnoli() }
        binding.ivN9.setOnClickListener {matos()}
    }
    fun torrico(){ val inflater = LayoutInflater.from(binding.root.context)
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



            if (viewModel.Torrico(a,b,c,d,e,f,g)) {
                vistaJugadorCorrecto()
                binding.ivArquero.isVisible = false
                binding.ivCheck1.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }}
    fun buffarini(){
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


            if (viewModel.Buffarini(a,b,c,d,e,f,g,h,i)) {
                vistaJugadorCorrecto()
                binding.ivN4.isVisible = false
                binding.ivN4v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun fontanini(){
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


            if (viewModel.Fontanini(a,b,c,d,e,f,g,h,i)) {
                vistaJugadorCorrecto()
                binding.ivN2.isVisible = false
                binding.ivN2v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun gentiletti(){
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



            if (viewModel.Gentiletti(a,b,c,d,e,f,g,h,i,j)) {
                vistaJugadorCorrecto()
                binding.ivN6.isVisible = false
                binding.ivN6v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }
    fun mas(){
        val inflater = LayoutInflater.from(binding.root.context)
        val customView = inflater.inflate(R.layout.descripcion_3letras, null)

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



            if (viewModel.Mas(a,b,c)) {
                vistaJugadorCorrecto()
                binding.ivN3.isVisible = false
                binding.ivN3v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun villalba(){
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



            if (viewModel.Villalba(a,b,c,d,e,f,g,h)) {
                vistaJugadorCorrecto()
                binding.ivN8.isVisible = false
                binding.ivN8v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun mercier(){
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



            if (viewModel.Mercier(a,b,c,d,e,f,g)) {
                vistaJugadorCorrecto()
                binding.ivN11.isVisible = false
                binding.ivN11v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun ortigoza(){
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



            if (viewModel.Ortigoza(a,b,c,d,e,f,g,h)) {
                vistaJugadorCorrecto()
                binding.ivN5.isVisible = false
                binding.ivN5v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun piatti(){
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



            if (viewModel.Piatti(a,b,c,d,e,f)) {
                vistaJugadorCorrecto()
                binding.ivN7.isVisible = false
                binding.ivN7v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun romagnoli(){
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



            if (viewModel.Romagnoli(a,b,c,d,e,f,g,h,i)) {
                vistaJugadorCorrecto()
                binding.ivN10.isVisible = false
                binding.ivN10v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun matos(){
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



            if (viewModel.Matos(a,b,c,d,e)) {
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