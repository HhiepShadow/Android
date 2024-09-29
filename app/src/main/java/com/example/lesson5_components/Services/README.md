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
![](F:\CPP\Android\Lesson5_Components\app\src\main\java\com\example\lesson5_components\images\Lifecycleofandroidservices-660x407.png)