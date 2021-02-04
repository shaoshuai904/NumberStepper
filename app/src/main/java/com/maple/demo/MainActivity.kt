package com.maple.demo

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.maple.numberstepper.NumberStepper

class MainActivity : AppCompatActivity(), NumberStepper.NumberStepperValueChangeListener {
    private lateinit var tvValue: TextView
    private lateinit var stepper: NumberStepper
    private lateinit var tvValueCustom: TextView
    private lateinit var stepperCustom: NumberStepper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvValue = findViewById(R.id.tvValue)
        stepper = findViewById(R.id.stepper)
        tvValueCustom = findViewById(R.id.tvValueCustom)
        stepperCustom = findViewById(R.id.stepperCustom)

        tvValue.text = stepper.currentValue.toString()
        stepper.setOnValueChangeListener(this)

        tvValueCustom.text = stepperCustom.currentValue.toString()
        stepperCustom.setOnValueChangeListener(this)

        with(stepperCustom) {
            setBackgroundColor(ContextCompat.getColor(context, R.color.stepper_button_def))
            tvText.setBackgroundResource(R.color.stepper_content_bg)
            tvText.setTextColor(ContextCompat.getColor(context, R.color.stepper_text))
            tvText.textSize = 18f
            ivLeft.setBackgroundResource(R.drawable.sel_custom_button_bg)
            ivLeft.setImageResource(R.drawable.svg_left)
            ivRight.setBackgroundResource(R.drawable.sel_custom_button_bg)
            ivRight.setImageResource(R.drawable.svg_right)
        }
    }

    override fun onValueChange(view: View, value: Int) {
        when (view.id) {
            R.id.stepper -> tvValue.text = value.toString()
            R.id.stepperCustom -> tvValueCustom.text = value.toString()
        }
    }
}