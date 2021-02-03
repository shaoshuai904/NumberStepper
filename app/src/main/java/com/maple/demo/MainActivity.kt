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

        tvValue.text = stepper.value.toString()
        tvValueCustom.text = stepperCustom.value.toString()
        stepper.setOnValueChangeListener(this)
        stepperCustom.setOnValueChangeListener(this)

        stepperCustom.setBackgroundColor(ContextCompat.getColor(this, R.color.stepper_button_def))
        stepperCustom.setButtonBackGround(R.drawable.sel_custom_button_bg)
        stepperCustom.setContentBackground(R.color.stepper_content_bg)
        stepperCustom.setContentTextColor(R.color.stepper_text)
        stepperCustom.setContentTextSize(18f)
        stepperCustom.setLeftButtonResources(R.drawable.svg_left)
        stepperCustom.setRightButtonResources(R.drawable.svg_right)
    }

    override fun onValueChange(view: View, value: Int) {
        when (view.id) {
            R.id.stepper -> tvValue.text = value.toString()
            R.id.stepperCustom -> tvValueCustom.text = value.toString()
        }
    }
}