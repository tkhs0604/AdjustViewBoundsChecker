package com.tkhs0604.adjustviewboundschecker

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BannerAdapter(private val context: Context) : RecyclerView.Adapter<BannerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.getInstance(LayoutInflater.from(context), parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { }

    override fun getItemCount() = 3

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        companion object {
            fun getInstance(inflater: LayoutInflater, parent: ViewGroup): ViewHolder {
                return ViewHolder(inflater.inflate(R.layout.item_banner, parent, false))
            }
        }

    }

}
