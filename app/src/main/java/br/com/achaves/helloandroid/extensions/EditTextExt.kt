package br.com.achaves.helloandroid.extensions

import android.widget.EditText

fun EditText.value() = this.text.toString()