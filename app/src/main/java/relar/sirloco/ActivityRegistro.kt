package relar.sirloco

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registro.*

class ActivityRegistro : AppCompatActivity() {

    companion object{
        val nom = "nombre"
        val ape = "apellidos"
        val ed = "edad"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        bregistrar.setOnClickListener{envio()}
    }

    private fun envio() {

        var registrado = Intent()

        registrado.putExtra(nom,etNombre.text.toString())
        registrado.putExtra(ape,etApellidos.text.toString())
        registrado.putExtra(ed,etEdad.text.toString())

        setResult(Activity.RESULT_OK,registrado)

        finish()
    }
}
