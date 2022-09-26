package com.example.calculadorainss2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.calculadorainss2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var view : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityMainBinding.inflate(layoutInflater)
            setContentView(view.root)
        calcularInss()

        fun calcularInss(){
            view.btn.setOnClickListener(){
                var pegaInput : EditText = view.input
                var salario = pegaInput.text.toString().toFloat()
                var total: EditText = view.resul
                when(salario){
                   in 1212.0..1212.0->{
                       var calculo = salario-salario/100*7.5
                       total.setText(calculo.toString())
                   }
                    in 1212.01..2427.35->{
                        var calculo = salario-salario/100*9
                        total.setText(calculo.toString())
                    }
                    in 2427.36..3641.03->{
                        var calculo = salario-salario/100*12
                        total.setText(calculo.toString())
                    }
                    in 3641.04..7087.22->{
                        var calculo = salario-salario/100*14
                        total.setText(calculo.toString())
                    }
                    else->{
                        total.setText("salario fora do teto da empresa")
                    }

                }                }

            }
        }

}