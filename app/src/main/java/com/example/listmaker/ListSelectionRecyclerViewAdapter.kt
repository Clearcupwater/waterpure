package com.example.listmaker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListSelectionRecyclerViewAdapter: RecyclerView.Adapter<ListSelectionViewHolder>(){
    val listTiles = arrayOf("Shopping List", "Chores", "Andriod Tutorials")


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        //setting up the layout...
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_selection_view_holder,parent,false)
        return ListSelectionViewHolder(view)
    }

    override fun getItemCount(): Int {
        //setting up the amount of items on the list view
       return listTiles.size
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.listPosition.text = (position +1).toString()
        holder.listTitle.text = listTiles[position]
    }


}