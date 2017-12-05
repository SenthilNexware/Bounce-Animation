package hackro.tutorials.com.salesfacebook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.facebook.*
import com.facebook.appevents.AppEventsLogger
import com.facebook.login.LoginManager
import java.util.*
import com.facebook.FacebookException
import com.facebook.login.LoginResult
import com.facebook.FacebookCallback
import com.facebook.CallbackManager
import android.content.Intent
import com.google.gson.Gson
import hackro.tutorials.com.salesfacebook.entities.ResponseFacebook
import org.json.JSONArray
import org.json.JSONObject


class MainActivity : AppCompatActivity() {

    var mCallbackManager : CallbackManager = CallbackManager.Factory.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FacebookSdk.sdkInitialize(this)
        AppEventsLogger.activateApp(this)

        if (BuildConfig.DEBUG) {
            FacebookSdk.setIsDebugEnabled(true);
            FacebookSdk.addLoggingBehavior(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
        }


        setContentView(R.layout.activity_main)
        getDataGroup()
    }


    fun getDataGroup(){


        LoginManager.getInstance().registerCallback(mCallbackManager,
                object : FacebookCallback<LoginResult> {

                    override fun onSuccess(loginResult: LoginResult) {

                        GraphRequest(
                                AccessToken.getCurrentAccessToken(),
                                "888720924531060/feed",
                                null,
                                HttpMethod.GET,
                                GraphRequest.Callback { /* handle the result */
                                    it.rawResponse.toString()
                                    val gson = Gson()
                                    val json = gson.toJson(it.jsonObject.getJSONArray("data").toString())
                                    val topic: ResponseFacebook? = gson.fromJson(json, ResponseFacebook::class.java)


                                }
                        ).executeAsync()


                    }

                    override fun onCancel() {
                        Log.e("","");

                    }

                    override fun onError(error: FacebookException) {
                        Log.e("","");

                    }
                })



    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, resultCode, data)
        mCallbackManager.onActivityResult(requestCode,
                resultCode, data)
    }
}
