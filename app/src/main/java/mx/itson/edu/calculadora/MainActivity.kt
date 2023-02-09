package mx.itson.edu.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var valorUno: String = ""
    var valorDos: String = ""

    var primerValorInt: Int = 0
    var segundoValorInt: Int = 0

    var simbolo: Boolean = false
    var simboloSeleccionado: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnCero: Button = findViewById(R.id.btn0)
        val btnUno: Button = findViewById(R.id.btn1)
        val btnDos: Button = findViewById(R.id.btn2)
        val btnTres: Button = findViewById(R.id.btn3)
        val btnCuatro: Button = findViewById(R.id.btn4)
        val btnCinco: Button = findViewById(R.id.btn5)
        val btnSeis: Button = findViewById(R.id.btn6)
        val btnSiete: Button = findViewById(R.id.btn7)
        var btnOcho: Button = findViewById(R.id.btn8)
        val btnNueve: Button = findViewById(R.id.btn9)

        val btnMas: Button = findViewById(R.id.btnSuma)
        val btnMenos: Button = findViewById(R.id.btnResta)
        val btnPor: Button = findViewById(R.id.btnMultiplicacion)
        val btnDiv: Button = findViewById(R.id.btnDivision)

        val btnBorrar: Button = findViewById(R.id.btnBorrar)
        val btnResultado: Button = findViewById(R.id.btnResult)

        val txtOperacion: TextView = findViewById(R.id.procedimiento)
        val txtPrincipal: TextView = findViewById(R.id.tvResultado)


        btnCero.setOnClickListener {
            if (!simbolo) {
                valorUno = concatenar(valorUno, btnCero.text.toString())
                txtPrincipal.text = valorUno
            } else {
                valorDos = concatenar(valorDos, btnCero.text.toString())
                txtPrincipal.text = valorDos
            }

        }

        btnUno.setOnClickListener {
            if (!simbolo) {
                valorUno = concatenar(valorUno, btnUno.text.toString())
                txtPrincipal.text = valorUno
            } else {
                valorDos = concatenar(valorDos, btnUno.text.toString())
                txtPrincipal.text = valorDos
            }
        }

        btnDos.setOnClickListener {
            if (!simbolo) {
                valorUno = concatenar(valorUno, btnDos.text.toString())
                txtPrincipal.text = valorUno
            } else {
                valorDos = concatenar(valorDos, btnDos.text.toString())
                txtPrincipal.text = valorDos
            }
        }

        btnTres.setOnClickListener {
            if (!simbolo) {
                valorUno = concatenar(valorUno, btnTres.text.toString())
                txtPrincipal.text = valorUno
            } else {
                valorDos = concatenar(valorDos, btnTres.text.toString())
                txtPrincipal.text = valorDos
            }
        }

        btnCuatro.setOnClickListener {
            if (!simbolo) {
                valorUno = concatenar(valorUno, btnCuatro.text.toString())
                txtPrincipal.text = valorUno
            } else {
                valorDos = concatenar(valorDos, btnCuatro.text.toString())
                txtPrincipal.text = valorDos
            }
        }

        btnCinco.setOnClickListener {
            if (!simbolo) {
                valorUno = concatenar(valorUno, btnCinco.text.toString())
                txtPrincipal.text = valorUno
            } else {
                valorDos = concatenar(valorDos, btnCinco.text.toString())
                txtPrincipal.text = valorDos
            }
        }

        btnSeis.setOnClickListener {
            if (!simbolo) {
                valorUno = concatenar(valorUno, btnSeis.text.toString())
                txtPrincipal.text = valorUno
            } else {
                valorDos = concatenar(valorDos, btnSeis.text.toString())
                txtPrincipal.text = valorDos
            }
        }

        btnSiete.setOnClickListener {
            if (!simbolo) {
                valorUno = concatenar(valorUno, btnSiete.text.toString())
                txtPrincipal.text = valorUno
            } else {
                valorDos = concatenar(valorDos, btnSiete.text.toString())
                txtPrincipal.text = valorDos
            }
        }

        btnOcho.setOnClickListener {
            if (!simbolo) {
                valorUno = concatenar(valorUno, btnOcho.text.toString())
                txtPrincipal.text = valorUno
            } else {
                valorDos = concatenar(valorDos, btnOcho.text.toString())
                txtPrincipal.text = valorDos
            }
        }

        btnNueve.setOnClickListener {
            if (!simbolo) {
                valorUno = concatenar(valorUno, btnNueve.text.toString())
                txtPrincipal.text = valorUno
            } else {
                valorDos = concatenar(valorDos, btnNueve.text.toString())
                txtPrincipal.text = valorDos
            }
        }

        btnMas.setOnClickListener {
            txtOperacion.text = valorUno + " + "
            txtPrincipal.text = valorDos
            simbolo = true
            simboloSeleccionado = "+"

        }

        btnMenos.setOnClickListener {
            txtOperacion.text = valorUno + " - "
            txtPrincipal.text = valorDos
            simbolo = true
            simboloSeleccionado = "-"
        }

        btnPor.setOnClickListener {
            txtOperacion.text = valorUno + " * "
            txtPrincipal.text = valorDos
            simbolo = true
            simboloSeleccionado = "*"
        }

        btnDiv.setOnClickListener {
            txtOperacion.text = valorUno + " / "
            txtPrincipal.text = valorDos
            simbolo = true
            simboloSeleccionado = "/"
        }

        btnBorrar.setOnClickListener {
            reiniciar()
            txtOperacion.text = ""
            txtPrincipal.text = ""
        }

        btnResultado.setOnClickListener {
            primerValorInt = valorUno.toInt()
            segundoValorInt = valorDos.toInt()

            val result = when (simboloSeleccionado) {
                "+" -> primerValorInt + segundoValorInt
                "-" -> primerValorInt - segundoValorInt
                "*" -> primerValorInt * segundoValorInt
                "/" -> primerValorInt / segundoValorInt
                else -> txtPrincipal.text = "Seleccione numeros"
            }
            txtOperacion.text = valorUno + " " + simboloSeleccionado + " " + valorDos
            txtPrincipal.text = result.toString()
            reiniciar()
        }

    }


    fun reiniciar() {
        simbolo = false
        valorUno = ""
        valorDos = ""
    }

    fun concatenar(currentlyString: String, newString: String): String {
        return currentlyString + newString
    }
}