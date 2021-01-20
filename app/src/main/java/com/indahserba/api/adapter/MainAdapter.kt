package com.indahserba.api.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indahserba.api.R
import com.indahserba.api.data.User
import kotlinx.android.synthetic.main.item_main.view.*

class MainAdapter(val list: ArrayList<User>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(user: User) {
            with(itemView) {
                Glide.with(this).load(user.avatarUrl).into(itemAvatar)
                itemLogin.text = user.login
                itemDescription.text = user.htmlUrl
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list.get(position))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}