package jonathan.orellana.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val objCalculadora = Calculadora()
        objCalculadora.sumar(2, 4)
        println(objCalculadora.sumar(2,4))

        val DiegoJ = Usuario()
        DiegoJ.darLike()
        DiegoJ.follow()
        //ok
    }
}