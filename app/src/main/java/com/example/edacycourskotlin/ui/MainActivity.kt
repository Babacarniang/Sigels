package com.example.edacycourskotlin.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.edacycourskotlin.R
import com.example.edacycourskotlin.EdacyCoursApplication
import com.example.edacycourskotlin.data.model.Article
import com.example.edacycourskotlin.database
//import com.example.edacycourskotlin.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigation()
        //Main IO Default
       // database.articleDao().inserAll(
           // listOf())
        GlobalScope.launch(Dispatchers.IO) {
        EdacyCoursApplication.database.articleDao().inserAll(
            listOf(
                Article(1,"vdb 5",
                    " vdn 7\n" +
                            "\n" +
                            " 23 (logements)\n" +
                            "\n" +
                            " 13000000 (FCFA)\n" +
                            "\n" +
                            " 240 (m2)\n" +
                            "\n" +
                            " F2 : F2\n" +
                            "\n" +
                            " test",
                    "http://sigels.100000logements.sn/",
                    "http://sigels.100000logements.sn/uploads/offre/2.jpeg",
                    "http://sigels.100000logements.sn/"),


                Article(2,"Villa 6727",
                    "  Diamniadio\n" +
                            "\n" +
                            " 300 (logements)\n" +
                            "\n" +
                            " 17500000 (FCFA)\n" +
                            "\n" +
                            " 200 (m2)",
                    "http://sigels.100000logements.sn/",
                    "http://sigels.100000logements.sn/uploads/offre/3.jpeg",
                    "http://sigels.100000logements.sn/"),


                Article(3,"dsdsdsd",
                    " dsdsdsd\n" +
                            " DFDFDFDF\n" +
                            "\n" +
                            " 1 (logements)\n" +
                            "\n" +
                            " 1212131 (FCFA)\n" +
                            "\n" +
                            " 1212 (m2)",
                    "http://sigels.100000logements.sn/",
                    "http://sigels.100000logements.sn/uploads/offre/2.jpeg",
                    "http://sigels.100000logements.sn/"),


                Article(4,"Villa 6727",
                    "Diamniadio\n" +
                            "\n" +
                            " 300 (logements)\n" +
                            "\n" +
                            " 17500000 (FCFA)\n" +
                            "\n" +
                            " 200 (m2)",
                    "http://sigels.100000logements.sn/",
                    "http://sigels.100000logements.sn/uploads/offre/3.jpeg",
                    "http://sigels.100000logements.sn/")

            )
        )
    }
    }

    private fun setupNavigation() {
        val navController = Navigation.findNavController(this, R.id.main_navigation_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController, null)
        NavigationUI.setupWithNavController(navigation as BottomNavigationView, navController)
    }
    override fun onSupportNavigateUp() = Navigation.findNavController(this, R.id.main_navigation_fragment).navigateUp()
}
