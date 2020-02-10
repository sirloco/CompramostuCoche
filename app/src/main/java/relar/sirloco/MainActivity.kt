package relar.sirloco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import relar.sirloco.ActivityRegistro.Companion.nom

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bregistro.setOnClickListener { registrar() }
        bCatalogo.setOnClickListener { miralocomprado() }
    }

    private fun miralocomprado() {
        var cata = Intent(this,ActivityCatalogo::class.java)
        startActivityForResult(cata,2)

    }

    private fun registrar() {
        var registro = Intent(this,ActivityRegistro::class.java)
        startActivityForResult(registro,1)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode){

            1 -> {
               var regis = try{ data?.getStringExtra(nom)} catch (e:Exception){"Error"}

                tvResultado.text = regis
            }

            2->{
                //var catal = try{data?.getSringExtra()}
            }



        }
    }

}
