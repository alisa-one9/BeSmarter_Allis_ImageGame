package com.example.besmarter_allis_imagegame.extensions

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

fun View.visibility(isVisible: Boolean){
    if(isVisible) { this.visibility = View.VISIBLE}
    else          { this.visibility = View.GONE   }

}
fun ImageView.load(uri: String?) {
    Glide
        .with(this)
        .load(uri)
        .centerCrop()
        .into(this)
}