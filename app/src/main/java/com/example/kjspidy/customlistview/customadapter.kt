package com.example.kjspidy.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.customlayout.view.*

/**
 * Created by kjspidy on 14/12/17.
 */

/*created custom adapter class context is the context in which the adapter will be created, resource
is the layout resource file we created customlayout again int id to retrieve a resource and items are gridview
items list that we will populate.
then we also inherit ArrayAdapter and pass context resource items to its constructor and its type should be
our data class hero.
*/
class customadapter(val cntxt: Context,val resource: Int, val items: List<hero>): ArrayAdapter<hero>(cntxt,resource,items)
{

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //inflating a layout to create kotlin object using xml layout
        val layoutinflater:LayoutInflater= LayoutInflater.from(cntxt)
        val view:View=layoutinflater.inflate(resource,null)
        //from this view we get our image view and textview from customlayout class

        val imgview : ImageView = view.imgview
        val txtview : TextView  = view.txtview

        //position gives us the current item from list

        val Hero:hero=items[position]

        imgview.setImageDrawable(cntxt.resources.getDrawable(Hero.image))
        txtview.text=Hero.text
    return view
    }
}