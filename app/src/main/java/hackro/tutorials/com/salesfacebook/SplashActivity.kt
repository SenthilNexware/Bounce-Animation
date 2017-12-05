package hackro.tutorials.com.salesfacebook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Xml
import hackro.tutorials.com.salesfacebook.widget.OctocatView
import android.annotation.SuppressLint
import android.content.Context
import android.widget.LinearLayout
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.content.res.XmlResourceParser
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException
import java.io.IOException


class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        hideToolbar()


        val xpp = resources.getXml(R.xml.bouncerwidget)

        val attr = Xml.asAttributeSet(xpp)

        val layout : LinearLayout = findViewById(R.id.layout)


        val octocat1 :  OctocatView = OctocatView(this,attr)
        octocat1.setX(-1)
        octocat1.setY(-1)

        octocat1.setId_resource(R.mipmap.github1)

        octocat1.setId_resource(R.mipmap.ic_launcher_round)
        octocat1.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

        layout.addView(octocat1)


    }

    fun hideToolbar() {
        supportActionBar!!.hide()
    }


}
