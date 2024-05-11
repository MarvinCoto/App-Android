package marvin.coto.appmarvin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import marvin.coto.appmarvin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        //1- Mandar a llamar al boton

        val btnVerNombre = findViewById<Button>(R.id.btnVerNombre)

        //2- Crear alerta

        btnVerNombre.setOnClickListener{

            Toast.makeText(this, "Marvin Javier Gutiérrez Coto", Toast.LENGTH_LONG).show()
        }

        //1- Mandar a llamar al boton

        val btnVerCorreo = findViewById<Button>(R.id.btnVerCorreo)

        //Crear alerta

        btnVerCorreo.setOnClickListener{

            Toast.makeText(this, "20230644@ricaldone.edu.sv", Toast.LENGTH_LONG).show()
        }



    }





}