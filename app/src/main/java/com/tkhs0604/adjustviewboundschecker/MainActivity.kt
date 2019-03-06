package com.tkhs0604.adjustviewboundschecker

import android.graphics.Rect
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView1.adapter = MainAdapter(this, false)
        recyclerView2.adapter = MainAdapter(this, true)

        recyclerView1.addItemDecoration(MainDecoration())
        recyclerView2.addItemDecoration(MainDecoration())
    }

}

class MainDecoration : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        parent.adapter?.let {
            val position = parent.getChildLayoutPosition(view)
            outRect.left = if (position == 0) 20 else 10
            outRect.right = if (position == it.itemCount - 1) 20 else 10
        } ?: run {
            outRect.set(0,0,0,0)
        }
    }

}