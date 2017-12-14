package com.example.kjspidy.customlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    var lastposition=0;
    var chosen=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //list of items

        var list= mutableListOf<hero>()

        list.add(hero(R.drawable.batman,"Batman"))
        list.add(hero(R.drawable.hulk,"Hulk"))
        list.add(hero(R.drawable.spiderman,"SpiderMan"))
        list.add(hero(R.drawable.supergirl,"SuperGirl"))
        list.add(hero(R.drawable.batman,"Batman"))
        list.add(hero(R.drawable.hulk,"Hulk"))
        list.add(hero(R.drawable.spiderman,"SpiderMan"))
        list.add(hero(R.drawable.supergirl,"SuperGirl"))
        list.add(hero(R.drawable.batman,"Batman"))
        list.add(hero(R.drawable.hulk,"Hulk"))
        list.add(hero(R.drawable.spiderman,"SpiderMan"))
        list.add(hero(R.drawable.supergirl,"SuperGirl"))
        list.add(hero(R.drawable.batman,"Batman"))
        list.add(hero(R.drawable.hulk,"Hulk"))
        list.add(hero(R.drawable.spiderman,"SpiderMan"))
        list.add(hero(R.drawable.supergirl,"SuperGirl"))

    var selectedlist= mutableListOf<hero>()

    gridview.adapter=customadapter(this,R.layout.customlayout,list)

        gridview.setOnItemClickListener(object : OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, v: View,
                                     position: Int, id: Long) {
                if (chosen<4) {
                    textView2.text = list[position].text
                    selectedlist.add(list[position])
                    gridview2.adapter = customadapter(this@MainActivity, R.layout.customlayout, selectedlist)
                 
                    chosen = chosen + 1;
                }
                else
                {
                    Toast.makeText(this@MainActivity,"You re Squad is ready , cant add anymore Delete to add !",Toast.LENGTH_LONG).show()
                }
            }
            })

        button.setOnClickListener()
        {

            if(chosen>0) {
                lastposition=selectedlist.lastIndex
                selectedlist.removeAt(lastposition)
                chosen=chosen-1;
                gridview2.adapter = customadapter(this@MainActivity, R.layout.customlayout, selectedlist)
            }
            else
            {

                textView2.setText("Squad is Empty ! Choose 4")
            }
        }



    }
}
