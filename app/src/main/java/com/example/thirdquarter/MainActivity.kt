package com.example.thirdquarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.thirdquarter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding

    private lateinit var presenter: CountersPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initPresenter()

        with(binding) {
            btnNumberOne.setOnClickListener {
                presenter.onCounterClick(BUTTON_ONE)
            }
            btnNumberTwo.setOnClickListener {
                presenter.onCounterClick(BUTTON_TWO)
            }
            btnNumberThree.setOnClickListener {
                presenter.onCounterClick(BUTTON_THREE)
            }
        }
    }

    private fun initPresenter() {
        presenter = CountersPresenter(this)
    }

    override fun setText(counter: String, position: Int) {
        with(binding){
            when(position){
                BUTTON_ONE -> tvTextOne.text = counter
                BUTTON_TWO -> tvTextTwo.text = counter
                BUTTON_THREE -> tvTextThree.text = counter
            }
        }

    }
}