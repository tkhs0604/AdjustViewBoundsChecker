package com.tkhs0604.adjustviewboundschecker

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_main.view.*

class MainAdapter(private val context: Context, private val adjustViewBounds: Boolean) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.getInstance(LayoutInflater.from(context), parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with (holder.itemView) {
            imageView.setImageResource(getDrawableResId(position))
            imageView.adjustViewBounds = adjustViewBounds
        }
    }

    private fun getDrawableResId(position: Int): Int {
        return when (position) {
            0    -> R.drawable.kotlin_1
            1    -> R.drawable.kotlin_2
            2    -> R.drawable.kotlin_3
            else -> throw IllegalStateException()
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
