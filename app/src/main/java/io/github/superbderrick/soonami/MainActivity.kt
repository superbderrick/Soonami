package io.github.superbderrick.soonami

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    /** Tag for the log messages  */
    val LOG_TAG = this.javaClass.simpleName

    /** URL to query the USGS dataset for earthquake information  */
    private val USGS_REQUEST_URL = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2012-01-01&endtime=2012-12-01&minmagnitude=6"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var task = TsunamiAsyncTask()
        task.execute()
    }


     class TsunamiAsyncTask : AsyncTask<Unit, Unit, String>() {
         override fun doInBackground(vararg p0: Unit?): String {
             TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
         }

     }
}
