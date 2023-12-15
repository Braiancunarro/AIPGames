package com.aristidevs.aipgames.ui.gallery

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
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
import com.aristidevs.aipgames.databinding.FragmentGalleryBinding
import com.aristidevs.aipgames.databinding.JugadorCorrectoBinding
import com.aristidevs.aipgames.databinding.JugadorIncorrectoBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    private var _binding2: JugadorCorrectoBinding? = null
    private val binding2 get() = _binding2!!

    private var _binding3: JugadorIncorrectoBinding? = null
    private val binding3 get() = _binding3!!

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        _binding2 = JugadorCorrectoBinding.inflate(inflater, container, false)
        _binding3 = JugadorIncorrectoBinding.inflate(inflater, container, false)

        buttonInfo()
        jugador()
        buttonNext()
        val root: View = binding.root
        return root
    }

    fun buttonNext(){
        binding.buttonNext.setOnClickListener{
         findNavController().navigate(R.id.action_nav_gallery_to_galleryFragment2)
        }
    }
    fun buttonInfo() {

        binding.buttonInfo.setOnClickListener {
            val inflater = LayoutInflater.from(requireContext())
            val customView = inflater.inflate(R.layout.match_info_1, null)

            val tv1 = customView.findViewById<TextView>(R.id.tv1)
            val tv2 = customView.findViewById<TextView>(R.id.tv2)
            val tv3 = customView.findViewById<TextView>(R.id.tv3)
            val tv4 = customView.findViewById<TextView>(R.id.tv4)


            tv1.text = getString(R.string.infogallery1)
            tv2.text = getString(R.string.infogallery2)
            tv3.text = getString(R.string.infogallery3)
            tv4.text = getString(R.string.infogallery4)

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

    fun jugador() {
        binding.ivArquero.setOnClickListener {saja()}
        binding.ivN4.setOnClickListener{pillud()}
        binding.ivN2.setOnClickListener{lollo()}
        binding.ivN6.setOnClickListener {cabral()}
        binding.ivN3.setOnClickListener { grimi() }
        binding.ivN5.setOnClickListener { videla() }
        binding.ivN8.setOnClickListener { aued() }
        binding.ivN11.setOnClickListener { diaz() }
        binding.ivN10.setOnClickListener { centurion() }
        binding.ivN7.setOnClickListener { bou() }
        binding.ivN9.setOnClickListener { milito() }
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

    @SuppressLint("SuspiciousIndentation")
    fun saja() {
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
            val s = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val a1 = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val j = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val a2 = customView.findViewById<EditText>(R.id.letra4).text.toString()

            if (galleryViewModel.Saja(s, a1, j, a2)) {
                vistaJugadorCorrecto()
                binding.ivArquero.isVisible = false
                binding.ivCheck1.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }
    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    fun pillud() {
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
            val p = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val i = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val l1 = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val l2 = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val u = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra6).text.toString()

            if (galleryViewModel.Pillud(p, i, l1, l2, u, d)) {
                vistaJugadorCorrecto()
                binding.ivN4.isVisible = false
                binding.ivN4v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }

    @SuppressLint("MissingInflatedId")
    fun lollo() {
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
            val l1 = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val o1 = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val l2 = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val l3 = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val o2 = customView.findViewById<EditText>(R.id.letra5).text.toString()

            if (galleryViewModel.Lollo(l1, o1, l2, l3, o2)) {
                vistaJugadorCorrecto()
                binding.ivN2.isVisible = false
                binding.ivN2v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }

    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    fun cabral() {
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
            val c = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val a1 = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val b = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val r = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val a2 = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val l = customView.findViewById<EditText>(R.id.letra6).text.toString()

            if (galleryViewModel.Cabral(c,a1,b,r,a2,l)) {
                vistaJugadorCorrecto()
                binding.ivN6.isVisible = false
                binding.ivN6v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }

    fun grimi() {
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
            val g = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val r = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val i1 = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val m = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val i2 = customView.findViewById<EditText>(R.id.letra5).text.toString()

            if (galleryViewModel.Grimi(g,r,i1,m,i2)) {
                vistaJugadorCorrecto()
                binding.ivN3.isVisible = false
                binding.ivN3v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }

    fun videla() {
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
            val v = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val i = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val l = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val a = customView.findViewById<EditText>(R.id.letra6).text.toString()

            if (galleryViewModel.Videla(v,i,d,e,l,a)) {
                vistaJugadorCorrecto()
                binding.ivN5.isVisible = false
                binding.ivN5v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }

    @SuppressLint("SuspiciousIndentation")
    fun aued() {
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
            val u = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val d = customView.findViewById<EditText>(R.id.letra4).text.toString()

            if (galleryViewModel.Aued(a,u,e,d)) {
                vistaJugadorCorrecto()
                binding.ivN8.isVisible = false
                binding.ivN8v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }

    @SuppressLint("SuspiciousIndentation")
    fun diaz() {
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
            val d = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val i = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val a = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val z = customView.findViewById<EditText>(R.id.letra4).text.toString()

            if (galleryViewModel.Diaz(d,i,a,z)) {
                vistaJugadorCorrecto()
                binding.ivN11.isVisible = false
                binding.ivN11v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }

    fun centurion() {
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
            val c = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val e = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val n1 = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val t = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val u = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val r = customView.findViewById<EditText>(R.id.letra6).text.toString()
            val i = customView.findViewById<EditText>(R.id.letra7).text.toString()
            val o = customView.findViewById<EditText>(R.id.letra8).text.toString()
            val n2 = customView.findViewById<EditText>(R.id.letra9).text.toString()

            if (galleryViewModel.Centurion(c,e,n1,t,u,r,i,o,n2)) {
                vistaJugadorCorrecto()
                binding.ivN10.isVisible = false
                binding.ivN10v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }

    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    fun bou() {
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
            val b = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val o = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val u = customView.findViewById<EditText>(R.id.letra3).text.toString()


            if (galleryViewModel.Bou(b,o,u)) {
                vistaJugadorCorrecto()
                binding.ivN7.isVisible = false
                binding.ivN7v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }

    fun milito() {
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
            val m = customView.findViewById<EditText>(R.id.letra1).text.toString()
            val i1 = customView.findViewById<EditText>(R.id.letra2).text.toString()
            val l = customView.findViewById<EditText>(R.id.letra3).text.toString()
            val i2 = customView.findViewById<EditText>(R.id.letra4).text.toString()
            val t = customView.findViewById<EditText>(R.id.letra5).text.toString()
            val o = customView.findViewById<EditText>(R.id.letra6).text.toString()

            if (galleryViewModel.Milito(m,i1,l,i2,t,o)) {
                vistaJugadorCorrecto()
                binding.ivN9.isVisible = false
                binding.ivN9v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
