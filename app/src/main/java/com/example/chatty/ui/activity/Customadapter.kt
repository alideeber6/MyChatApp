package com.example.chatty.ui.activity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.chatty.R

class Customadapter (private var context: Context , var userlist:ArrayList<User>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view1 = LayoutInflater.from(context).inflate(R.layout.fragment_sign_in, parent, false)
        val view2 = LayoutInflater.from(context).inflate(R.layout.fragment_sign_up, parent, false)

        return ViewHolder(view1)

    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {

        val user = userList[position]

        holder.userName.text = user.name
        holder.userAddress.text = user.address

        holder.itemView.setOnClickListener {
            Toast.makeText(context, user.name, Toast.LENGTH_SHORT).show()

        }

    fun getItemCount(): Int {
            return userlist.size
    }

    }

        class ViewHolder(list_view: View) : RecyclerView.ViewHolder(list_view) {

            val userName: TextView = list_view.findViewById(R.id.userpassword)
            val userAddress: TextView = list_view.findViewById(R.id.password_password)

        }