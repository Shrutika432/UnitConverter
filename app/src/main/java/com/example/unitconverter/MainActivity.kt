package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var option : Spinner
    lateinit var result : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var v1=findViewById<TextView>(R.id.v1)
        var v2=findViewById<TextView>(R.id.v2)
        var v3=findViewById<TextView>(R.id.v3)
        var et1=findViewById<EditText>(R.id.et1)

        option = findViewById(R.id.SpinnerAreaOption)
        result = findViewById<TextView>(R.id.SpinnerArearesult)

        val options = arrayOf("Please select One","Meter","Celcius","kilogram")
        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Log.d("INDEX", options[position]);
                if(options[position]=="Meter"){
//                    //centimeter
                    var res:Double= if(et1.text.isNotEmpty())
                    {
                        et1.text.toString().toDouble()
                    }else{
                        0.0
                    }
                    res *= 100
                    //foot
                    var res1:Double= if(et1.text.isNotEmpty())
                    {
                        et1.text.toString().toDouble()
                    }else{
                        0.0
                    }
                    res1 *= 3.281
                    //inch
                    var res2:Double= if(et1.text.isNotEmpty())
                    {
                        et1.text.toString().toDouble()
                    }else{
                        0.0
                    }
                    res2 *= 39.37
                    v1.text = res.toString()
                    v2.text = res1.toString()
                    v3.text = res2.toString()

                    d1.text = "Centimeter"
                    d2.text = "Foot"
                    d3.text = "Inch"


                }
                else if(options[position]=="Celcius"){
                    //fahrenheit
                    var res3:Double= if(et1.text.isNotEmpty())
                    {
                        et1.text.toString().toDouble()
                    }else{
                        0.0
                    }
                    res3*=(1*9/5)+32
                    //kelvin
                    var res4:Double= if(et1.text.isNotEmpty())
                    {
                        et1.text.toString().toDouble()
                    }else{
                        0.0
                    }
                    res4*=1+274.15
                    v1.text=res3.toString()
                    v2.text=res4.toString()
                    d1.text="Fahrenheit"
                    d2.text="Kelvin"

                }
                else if(options[position]=="kilogram"){
                    //gram
                    var res5:Double= if(et1.text.isNotEmpty())
                    {
                        et1.text.toString().toDouble()
                    }else{
                        0.0
                    }
                    res5*=1000
                    //ounce
                    var res6:Double= if(et1.text.isNotEmpty())
                    {
                        et1.text.toString().toDouble()
                    }else{
                        0.0
                    }
                    res6*=35.274
                    //pound //
                    var res7:Double= if(et1.text.isNotEmpty())
                    {
                        et1.text.toString().toDouble()
                    }else{
                        0.0
                    }
                    res7*=2.205

                    v1.text=res5.toString()
                    v2.text=res6.toString()
                    v3.text=res7.toString()

                    d1.text="Gram"
                    d2.text="Ounce"
                    d3.text="Pound"

                }
            }

        }


    }
}
