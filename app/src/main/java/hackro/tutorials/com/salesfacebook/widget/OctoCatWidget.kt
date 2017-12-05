package hackro.tutorials.com.salesfacebook.widget

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.ContextMenu
import hackro.tutorials.com.salesfacebook.R

/**
 * Created by macbookpro on 02/12/17.
 */
/*
class OctocatView(val mContext: Context, attrs: AttributeSet):
        android.support.v7.widget.AppCompatImageView(mContext, attrs) {

    var x = -1
    var y = -1
    var xVelocity = 60
    var yVelocity = 40


    val h: Handler
    val FRAME_RATE = 30

    val r = Runnable { invalidate() }

    init {
        h = Handler()
    }


    override fun onDraw(c: Canvas) {

        val octocat = mContext.resources.getDrawable(R.mipmap.github1) as BitmapDrawable

        if (x < 0 && y < 0) {
            x = this.width / 2
            y = this.height / 2
        } else {

            x += xVelocity
            y += yVelocity

            if (x > this.width - octocat.bitmap.width || x < 0) xVelocity = xVelocity * -1
            if (y > this.height - octocat.bitmap.height || y < 0) yVelocity = yVelocity * -1

        }

        c.drawBitmap(octocat.bitmap, x.toFloat(), y.toFloat(), null)

        h.postDelayed(r, FRAME_RATE.toLong())

    }

}
*/