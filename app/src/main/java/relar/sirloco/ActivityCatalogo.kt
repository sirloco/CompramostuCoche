package relar.sirloco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_catalogo.*
import kotlinx.android.synthetic.main.activity_main.*

class ActivityCatalogo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)

        bcomprar.setOnClickListener { comprueba() }
    }

    private fun comprueba() {

        var catalogito = Intent()

        //catalogito.putExtra()

    }
}
