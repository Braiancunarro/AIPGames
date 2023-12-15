package com.aristidevs.aipgames.ui.ligaespañola

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
import com.aristidevs.aipgames.R
import com.aristidevs.aipgames.databinding.FragmentLigaespanola1Binding
import com.aristidevs.aipgames.databinding.JugadorCorrectoBinding
import com.aristidevs.aipgames.databinding.JugadorIncorrectoBinding

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
    ): View {
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


            tv1.text = getString(R.string.InfoLigaEspanola1)
            tv2.text = getString(R.string.InfoLigaEspanola2)
            tv3.text = getString(R.string.InfoLigaEspanola3)
            tv4.text = getString(R.string.InfoLigaEspanola4)

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

    private fun jugador() {
        binding.ivArquero.setOnClickListener { valdes() }
        binding.ivN4.setOnClickListener { alves() }
        binding.ivN2.setOnClickListener { pique() }
        binding.ivN6.setOnClickListener { mascherano() }
        binding.ivN3.setOnClickListener { alba() }
        binding.ivN10.setOnClickListener { xavi() }
        binding.ivN5.setOnClickListener { busquets() }
        binding.ivN8.setOnClickListener { fabregas() }
        binding.ivN11.setOnClickListener { iniesta() }
        binding.ivN7.setOnClickListener { neymar() }
        binding.ivN9.setOnClickListener { messi() }
    }

    fun valdes() {
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

            if (ligaespanola1ViewModel.Valdes(a, b, c, d, e, f)) {
                vistaJugadorCorrecto()
                binding.ivArquero.isVisible = false
                binding.ivCheck1.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun alves() {
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

            if (ligaespanola1ViewModel.Alves(a, b, c, d, e)) {
                vistaJugadorCorrecto()
                binding.ivN4.isVisible = false
                binding.ivN4v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun pique() {
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

            if (ligaespanola1ViewModel.Pique(a, b, c, d, e)) {
                vistaJugadorCorrecto()
                binding.ivN2.isVisible = false
                binding.ivN2v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun mascherano() {
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


            if (ligaespanola1ViewModel.Mascherano(a, b, c, d, e,f,g,h,i,j)) {
                vistaJugadorCorrecto()
                binding.ivN6.isVisible = false
                binding.ivN6v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun alba() {
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

            if (ligaespanola1ViewModel.Alba(a, b, c, d)) {
                vistaJugadorCorrecto()
                binding.ivN3.isVisible = false
                binding.ivN3v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun xavi() {
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

            if (ligaespanola1ViewModel.Xavi(a, b, c, d)) {
                vistaJugadorCorrecto()
                binding.ivN10.isVisible = false
                binding.ivN10v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun busquets() {
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



            if (ligaespanola1ViewModel.Busquets(a, b, c, d, e,f,g,h)) {
                vistaJugadorCorrecto()
                binding.ivN5.isVisible = false
                binding.ivN5v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun fabregas() {
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



            if (ligaespanola1ViewModel.Fabregas(a, b, c, d, e,f,g,h)) {
                vistaJugadorCorrecto()
                binding.ivN8.isVisible = false
                binding.ivN8v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun iniesta() {
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


            if (ligaespanola1ViewModel.Iniesta(a, b, c, d, e,f,g)) {
                vistaJugadorCorrecto()
                binding.ivN11.isVisible = false
                binding.ivN11v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun neymar() {
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

            if (ligaespanola1ViewModel.Neymar(a, b, c, d, e, f)) {
                vistaJugadorCorrecto()
                binding.ivN7.isVisible = false
                binding.ivN7v.isVisible = true
                dialog.dismiss()
            } else {
                vistaJugadorIncorrecto()
            }
        }
    }
    fun messi() {
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

            if (ligaespanola1ViewModel.Messi(a, b, c, d, e)) {
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