package com.haw.storyapp.customui

import android.content.Context
import android.graphics.Canvas
import android.text.InputType
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import com.haw.storyapp.R
import okhttp3.ResponseBody
import retrofit2.http.GET


class MyEmailEditText : AppCompatEditText {

    constructor(context: Context) : super(context)

    constructor(
        context: Context,
        attributeSet: AttributeSet
    ) : super(context, attributeSet) {

    }

    constructor(
        context: Context,
        attributeSet: AttributeSet,
        defStyleAttr: Int
    ) : super(
        context, attributeSet, defStyleAttr
    )

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
        hint = context.getString(R.string.enter_your_e_mail)
        background = ContextCompat.getDrawable(context, R.drawable.bg_edit_text_white)
        textAlignment = View.TEXT_ALIGNMENT_TEXT_START
    }

}