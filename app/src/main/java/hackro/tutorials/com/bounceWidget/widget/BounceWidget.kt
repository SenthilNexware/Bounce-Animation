package hackro.tutorials.com.bounceWidget.widget

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.os.Handler
import android.util.AttributeSet
import hackro.tutorials.com.bounceWidget.R


/**
 * Created by macbookpro on 02/12/17.
 */

class BounceWidget(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : android.support.v7.widget.AppCompatImageView(context,attrs,defStyleAttr) {

    var contextActivity : Context = getContext()
    var positionX : Int = 0
    var positionY : Int = 0
    var velocityX : Int = 20
    var velocityY : Int = 15
    val delay: Long  = 30

    var h : Handler = Handler()
    var resource : BitmapDrawable =  resources.getDrawable(R.mipmap.ic_launcher) as BitmapDrawable


    constructor(context: Context,attrs: AttributeSet) : this(context,attrs,0){
        contextActivity = context
        init()
    }

    constructor(context: Context) : this(context, null,0){
        contextActivity = context
        init()
    }

    fun init(id_resource : Int = R.mipmap.ic_launcher,positionX : Int = 0,positionY : Int = 0,velocityX : Int = 30,velocityY : Int = 20){
        this.positionX = positionX
        this.positionY = positionY
        this.velocityX = velocityX
        this.velocityY = velocityY
        resource = contextActivity.getResources().getDrawable(id_resource) as BitmapDrawable
    }

    fun id_resource(id_resource : Int ){
        resource = contextActivity.getResources().getDrawable(id_resource) as BitmapDrawable
    }

    fun runable(f: () -> Unit): Runnable = object : Runnable {override fun run() {f()}}

    val r = runable {invalidate()}

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        positionX += velocityX
        positionY += velocityY

        if (positionX > this.width - resource?.getBitmap()?.getWidth()!!  || positionX < 0) velocityX *= -1
        if (positionY > this.height - resource?.getBitmap()?.getWidth()!! || positionY < 0) velocityY *= -1

        canvas?.drawBitmap(resource.getBitmap(), positionX.toFloat(), positionY.toFloat(), null)

        h.postDelayed(r, delay)

    }


}
