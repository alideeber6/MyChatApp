package com.example.chatty.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.example.chatty.R
import com.example.chatty.ui.fragment.SignInFragment
import com.example.chatty.ui.fragment.SignUpFragment

class SplashActivity : AppCompatActivity() {

    lateinit var userList: ArrayList<User>
    lateinit var myViewPagerAdp : ViewPagerAdapter
    lateinit var framentList: ArrayList<Fragment>
    lateinit var fragmentListTitle: ArrayList<String>
    lateinit var myAdapter: Customadapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        myAdapter= Customadapter(this,userList)
        myAdapter.notifyDataSetChanged()


        fragmentListTitle= arrayListOf("SignIn","SignUp")
        framentList= arrayListOf(SignInFragment(),SignUpFragment())
        setViewPagerAdapter()

    }
}
