package ork.liesa.assesment3_calculator

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {
    lateinit var tilInput1:TextInputLayout
    lateinit var etInput1:TextInputEditText
    lateinit var tilInput2:TextInputLayout
    lateinit var etInput2:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSubtraction:Button
    lateinit var btnModulus:Button
    lateinit var btnDivision:Button
    lateinit var tvTotal:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
         }
        fun castViews(){
    tilInput1 = findViewById(R.id.tilInput1)
    etInput1 = findViewById(R.id.etInput1)
    tilInput2 = findViewById(R.id.tilInput2)
    etInput2 = findViewById(R.id.etInput2)
    tvTotal=findViewById(R.id.tvTotal)
            btnAdd = findViewById(R.id.btnAdd)
    btnAdd.setOnClickListener {
validation()
        add()


    }
    btnDivision = findViewById(R.id.btnDivision)
    btnDivision.setOnClickListener {
    validation()
        divide()
    }
    btnModulus = findViewById(R.id.btnModulus)
    btnModulus.setOnClickListener {
     validation()
        modulus()

    }
    btnSubtraction = findViewById(R.id.btnSubtraction)
    btnSubtraction.setOnClickListener {
    validation()
      subtraction()
    }
}

    fun add(){
        var input1 = etInput1.text.toString().toInt()
        var input2 = etInput2.text.toString().toInt()
        var add = input1 + input2
        tvTotal.text = add.toString()
    }

    fun subtraction(){
        var input1 = etInput1.text.toString().toInt()
        var input2 = etInput2.text.toString().toInt()
        var subs = input1 - input2
        tvTotal.text = subs.toString()
    }

    fun modulus(){
        var input1 = etInput1.text.toString().toInt()
        var input2 = etInput2.text.toString().toInt()
        var modulus = input1 % input2
        tvTotal.text = modulus.toString()
    }
    fun divide(){
        var input1 = etInput1.text.toString().toInt()
        var input2 = etInput2.text.toString().toInt()
        var divide = input1 / input2
        tvTotal.text = divide.toString()
    }



fun validation(){
    var error = false
    tilInput1.error = null
    tilInput2.error = null
    var Input1 = etInput1.text.toString()
    var Input2= etInput2.text.toString()

    if (Input1.isBlank()){
        tilInput1.error = "Input first number"
        error = true
    }
    if (Input2.isBlank()){
        tilInput2.error = "Input second number"
        error = true
    }
}
    }







