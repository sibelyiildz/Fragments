package com.example.fragments


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 */
class FooterFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        "onCreat" logError FooterFragment::class.java.name
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        "onCreateView" logError HeaderFragment::class.java.name

        return inflater.inflate(R.layout.fragment_footer, container, false)
    }

    override fun onStart() {
        super.onStart()

        "onStart" logError FooterFragment::class.java.name
    }

    override fun onResume() {
        super.onResume()

        "onResume" logError FooterFragment::class.java.name
    }

    override fun onPause() {
        super.onPause()

        "onPause" logError FooterFragment::class.java.name
    }

    override fun onStop() {
        super.onStop()

        "onStop" logError FooterFragment::class.java.name
    }

    override fun onDestroy() {
        super.onDestroy()

        "onDestroy" logError FooterFragment::class.java.name
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        "onAttach" logError FooterFragment::class.java.name

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        "onActivityCreated" logError FooterFragment::class.java.name

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        "onViewCreated" logError FooterFragment::class.java.name
    }

    override fun onDestroyView() {
        super.onDestroyView()

        "onDestroyView" logError FooterFragment::class.java.name
    }

    override fun onDetach() {
        super.onDetach()

        "onDetach" logError FooterFragment::class.java.name
    }

}
