package hackro.tutorials.com.bounceWidget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Xml
import android.view.ViewGroup
import android.widget.LinearLayout
import hackro.tutorials.com.bounceWidget.widget.BounceWidget

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        hideToolbar()


        val xpp = resources.getXml(R.xml.bouncewidget)

        val attr = Xml.asAttributeSet(xpp)

        val layout : LinearLayout = findViewById(R.id.layout)

        val octocat1 : BounceWidget = BounceWidget(this,attr)

        octocat1.id_resource(R.mipmap.bounceimage) // change image --> default : R.mipmap.ic_launcher
        //octocat1.positionX = 1 //position X starting --> default : 0
        //octocat1.positionY = 1 //position Y starting--> default : 0
        //octocat1.velocityX = 1 //Velocity X --> default : 20
        //octocat1.velocityY = 1 //Velocity Y --> default : 15

        octocat1.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

        layout.addView(octocat1)


    }

    fun hideToolbar() {
        supportActionBar!!.hide()
    }


}
