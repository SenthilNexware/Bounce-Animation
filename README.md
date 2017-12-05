
# Bounce Widget


 This simple project, created in the event Hack Local day of MLH

### Animation of element using canvas

![Alt Text](https://media.giphy.com/media/3ohs872KVOod3V0lpK/giphy.gif)

#### Add element in xml

```xml
    <hackro.tutorials.com.bounceWidget.widget.BounceWidget
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```
#### Add element programmatically
```kotlin    
    val xpp = resources.getXml(R.xml.bouncewidget)
    val attr = Xml.asAttributeSet(xpp)
    val layout : LinearLayout = findViewById(R.id.layout)
    val octocat1 : BounceWidget = BounceWidget(this,attr)
    
    //you can change this values and have default values
    
    //octocat1.id_resource(R.mipmap.bounceimage) // change image --> default : R.mipmap.ic_launcher
    //octocat1.positionX = 1 //position X starting --> default : 0
    //octocat1.positionY = 1 //position Y starting--> default : 0
    //octocat1.velocityX = 1 //Velocity X --> default : 20
    //octocat1.velocityY = 1 //Velocity Y --> default : 15

    octocat1.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

    layout.addView(octocat1)

```


##### It's my first repo in kotlin and it's an amazing language!



Twitter: [@David Hackro](https://twitter.com/DavidHackro)

License
----

MIT


**Free Software, Hell Yeah!**

