## SERVICES IN ANDROID

- Service is a component in Android application that allows to perform long-running tasks in the background, without a user interface
- The prime aim of a service is to ensure that the application remains active in the background so that the user can operate multiple applications at the same time
- Service can run independently of Activity 
- And service is typically used to handle tasks such as downloading data from the internet, playing music, or performing other background tasks

### Types of Android Services:
There are 3 different types of services in Android applications:

#### 1. Foreground service:
- Runs in the background but has a higher priority and displays a notification to thẻ user that it is active
- Users can interact with the service by the notifications provided about the ongoing task
- Helps user realize that the application is doing important work
Ex: Downloading a file, the user can keep track of the progress in downloading and can also pause or resume the process
    Playing music
```java
import android.app.Notification;

import androidx.core.app.NotificationCompat;

import com.example.lesson5_components.R;

import java.security.Provider;

public class MyForegroundService extends Provider.Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle("Service Running")
                .setContentText("My foreground service is running")
                .setSmallIcon(R.drawable.ic_notification)
                .build();

        startForeground(1, notification);

        return START_NOT_STICKY;
    }
}
```  

2. Background Service
- Runs on background without having a user interface
- Used to perform tasks that do not require direct user interaction
- How it works:
  - Background service can be canceled by the Android system if resources are insufficient, especially on Android 8.0 (API 26) and above, where there are many restrictions on Service running in the background
  - Should use Foreground Service if the task is important and needs to be maintained

3. Bound Service:
- Allows 1 or many Activities or Components associated with it to interact and exchange data
- Will automatically stop when all clients disconnect
- How it works:
  - Uses `bindService()` to associate with Bound Service
  - Provides `IBinder` object so the client can call methods in the Service

### The life cycle of Android Services:
![](\Lesson5_Components\app\src\main\java\com\example\lesson5_components\images\Lifecycleofandroidservices-660x407.png)
1. startService(Intent intent)
2. onCreate():
3. onStartCommand()
4. onBind()
5. onUnbind()
6. onDestroy()
7. stopService(Intent intent)

### Example:
1. Step 1: Create new project
2. Modifies `strings.xml` file:
```xml
<resources>
    <string name="app_name">Services_In_Android</string>
    <string name="heading">Services In Android</string>
    <string name="startButtonText">Start the Service</string>
    <string name="stopButtonText">Stop the Service</string>
</resources>
```

3. Step 3: Working with `activity_main.xml` file:
- Add 2 Buttons which will start and stop the service
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/startServiceBtn"
        android:layout_width="239dp"
        android:layout_height="91dp"
        android:layout_marginTop="320dp"
        android:text="@string/startServiceBtn"
        android:textSize="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/stopServiceBtn"
        android:layout_width="244dp"
        android:layout_height="87dp"
        android:layout_marginStart="84dp"
        android:layout_marginTop="464dp"
        android:text="@string/stopServiceBtn"
        android:textSize="20dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
```

4. Step 4: Create the custom service class:
```java
package com.example.lesson5_components.Services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

import java.util.List;
import java.util.Map;

public class MyService extends Service {
    private MediaPlayer player;

    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
       player.start();
       return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
```
5. Working with the `MainActivity`:
```java
package com.example.lesson5_components;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lesson5_components.Services.MyService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button start, stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void initWidgets() {
        start = (Button) findViewById(R.id.startServiceBtn);
        stop = (Button) findViewById(R.id.stopServiceBtn);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == start){
            startService(new Intent(this, MyService.class));
        } else if (view == stop) {
            stopService(new Intent(
                    this, MyService.class
            ));
        }
    }
}
```

6. Step 6: Register service in `AndroidManifest.xml`:
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Lesson5_Components"
        tools:targetApi="31">
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <service android:name=".Services.MyService"/>
    </application>

</manifest>
```