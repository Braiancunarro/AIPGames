package com.aristidevs.aipgames.ui.gallery

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aristidevs.aipgames.R

class GalleryFragment2 : Fragment() {

    companion object {
        fun newInstance() = GalleryFragment2()
    }

    private lateinit var viewModel: GalleryFragment2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery_fragment2, container, false)
    }


}