package pimienta.julian.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.common.SignInButton

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val bundle = intent.extras
        if (bundle != null) {
            val nombre = bundle.getString("name")
            val correo = bundle.getString("email")

            var tv_name: TextView = this.findViewById(R.id.tv_nombre) as TextView
            var tv_email: TextView = this.findViewById(R.id.tv_email) as TextView

            tv_name.setText(nombre)
            tv_email.setText (correo)
        }
        var button: Button = this.findViewById(R.id.btn_cerrar) as Button

        button.setOnClickListener {
            finish()
        }


    }

}