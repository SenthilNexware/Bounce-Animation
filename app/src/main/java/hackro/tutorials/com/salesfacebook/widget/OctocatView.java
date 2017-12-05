package hackro.tutorials.com.salesfacebook.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import hackro.tutorials.com.salesfacebook.R;

public class OctocatView extends android.support.v7.widget.AppCompatImageView{

    private Context mContext;
    private int id_resource;
    private int x = -1;
    private int y = -1;
    private int xVelocity = 1;
    private int yVelocity = 1;

    private Handler h;
    private final int FRAME_RATE = 30;

    public OctocatView(Context context, AttributeSet attrs, int defStyleAttr, Context mContext) {
        super(context, attrs, defStyleAttr);
        this.mContext = mContext;
        h = new Handler();

    }

    public OctocatView(Context context, AttributeSet attrs)  {
        super(context, attrs);
        mContext = context;
        h = new Handler();
    }

    public OctocatView(Context context) {
        super(context);
        mContext = context;
        h = new Handler();

    }

    private Runnable r = new Runnable() {
        @Override
        public void run() {
            invalidate();
        }
    };




    protected void onDraw(Canvas c) {

        BitmapDrawable octocat = (BitmapDrawable) mContext.getResources().getDrawable(id_resource);


        if (x<0 && y <0) {
            x =  this.getWidth() / 2;
            y =  this.getHeight() / 2;

        } else {
            x += xVelocity;
            y += yVelocity;



            if ((x > this.getWidth() - octocat.getBitmap().getWidth()) || (x < 0)) xVelocity = xVelocity*-1;
            if ((y > this.getHeight() - octocat.getBitmap().getHeight()) || (y < 0)) yVelocity = yVelocity*-1;

        }

        c.drawBitmap(octocat.getBitmap(), x, y, null);

        h.postDelayed(r, FRAME_RATE);

    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setId_resource(int id_resource) {
        this.id_resource = id_resource;
    }
}
