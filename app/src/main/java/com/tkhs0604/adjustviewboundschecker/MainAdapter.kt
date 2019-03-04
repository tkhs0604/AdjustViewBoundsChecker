package com.tkhs0604.adjustviewboundschecker

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tkhs0604.adjustviewboundschecker.ImageType.*
import kotlinx.android.synthetic.main.item_main.view.*

class MainAdapter(private val context: Context, val imageType: ImageType) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.getInstance(LayoutInflater.from(context), parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with (holder.itemView) {
            when (imageType) {
                Small -> imageView.setImageResource(R.drawable.kotlin_small)
                Large -> imageView.setImageResource(R.drawable.kotlin_large)
            }
        }
    }

    override fun getItemCount() = 3

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        companion object {
            fun getInstance(inflater: LayoutInflater, parent: ViewGroup): ViewHolder {
                return ViewHolder(inflater.inflate(R.layout.item_main, parent, false))
            }
        }

    }

}

enum class ImageType {
    Small,
    Large,
}