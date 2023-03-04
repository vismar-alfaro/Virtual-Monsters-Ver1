package ph.kodego.alfaro.vismarjay.virtualmonstersver1.gameproper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ph.kodego.alfaro.vismarjay.virtualmonstersver1.R
import ph.kodego.alfaro.vismarjay.virtualmonstersver1.databinding.FragmentGameHomeBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class GameHomeFragment : Fragment() {

    private var _binding: FragmentGameHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGameHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}