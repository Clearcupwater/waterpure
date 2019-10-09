package com.example.listmaker

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListSelectionRecyclerViewAdapter: RecyclerView.Adapter<ListSelectionViewHolder>(){
    val listTiles = arrayOf("Shopping List", "Chores", "Andriod Tutorials")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
       return listTiles.size
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}