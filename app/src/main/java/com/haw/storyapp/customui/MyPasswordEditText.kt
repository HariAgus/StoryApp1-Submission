package com.haw.storyapp.customui

import android.content.Context
import android.graphics.Canvas
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import com.haw.storyapp.R

class MyPasswordEditText : AppCompatEditText {

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        hint = context.getString(R.string.enter_your_password)
        background = ContextCompat.getDrawable(context, R.drawable.bg_edit_text_white)
        textAlignment = View.TEXT_ALIGNMENT_TEXT_START
    }

    private fun init() {
        addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(cSequence: CharSequence, p1: Int, p2: Int, p3: Int) {
                error = null
            }

            override fun onTextChanged(cSequence: CharSequence, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(eTable: Editable) {
                if (eTable.length < 6) {
                    error = "You must have 6 characters in your password"
                }
            }
        })
    }


}