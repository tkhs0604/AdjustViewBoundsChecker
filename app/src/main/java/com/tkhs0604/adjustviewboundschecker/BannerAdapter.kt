package com.tkhs0604.adjustviewboundschecker

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class BannerAdapter : RecyclerView.Adapter<BannerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(View.inflate(parent.context, R.layout.row_banner, null))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     }

    override fun getItemCount() = 10

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}
