## BROADCAST RECEIVER:

- Broadcast Receiver is a component in Android application that allows the application receives broadcast (like notification) from system or other applications
- These broadcasts can nofify about events such as:
  - Network status changes
  - Battery status
  - Incoming SMS
  - ...
- There are 2 types of Broadcast Receiver:
  - __Static Broadcast Receivers__: Registered in `AndroidManifest.xml` and can receives broadcast even when the application is not running
  - __Dynamic Broadcast Receivers__: Registered in Java (or Kotlin) code and only active when the application is running

- Some of the important system-wide generated intents:

| Intent Action                                   | Description of Event                                                    |
|------------------------------------------------|--------------------------------------------------------------------------|
| `android.intent.action.BATTERY_LOW`            | Indicates low battery condition on the device.                         |
| `android.intent.action.BOOT_COMPLETED`         | This is broadcast once after the system has finished booting.          |
| `android.intent.action.CALL`                   | To perform a call to someone specified by the data.                    |
| `android.intent.action.DATE_CHANGED`           | Indicates that the date has changed.                                   |
| `android.intent.action.REBOOT`                 | Indicates that the device has been rebooted.                           |
| `android.net.conn.CONNECTIVITY_CHANGE`         | The mobile network or Wi-Fi connection has changed (or reset).        |
| `android.intent.action.AIRPLANE_MODE_CHANGED`  | This indicates that airplane mode has been switched on or off.         |

### How to create and use:
1. Create Broadcast Receiver:

```java
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBroadcastReceiver extends BroadcastReceiver {
  @Override
  public void onReceive(Context context, Intent intent) {
    String action = intent.getAction();
    
    Log.d("MyBroadcastReceiver", "Received broadcast: " + action);
    
    if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(action)) {
      boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);
      Log.d("MyBroadcastReceiver", "Airplane mode is " + (isAirplaneModeOn ? "ON" : "OFF"));
    }
  }
}
```

2. Register Broadcast Receiver:
   (1) Static register:
      - To receive broadcasts from system, we can register receiver in `AndroidManifest.xml`:
```xml
<receiver android:name=".MyBroadcastReceiver">
    <intent-filter>
        <action android:name="android.intent.action.AIRPLANE_MODE_CHANGED" />
        <!-- Thêm các action khác nếu cần -->
    </intent-filter>
</receiver>
```
   (2) Dynamic register:
      - If we want receiver to be active when the application is running, we can reigster it dynamically in Activity

```java
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  private MyBroadcastReceiver myBroadcastReceiver;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  protected void onStart() {
    super.onStart();
    myBroadcastReceiver = new MyBroadcastReceiver();

    IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
    registerReceiver(myBroadcastReceiver, filter);
  }
  
  @Override
  protected void onStop() {
    super.onStop();
    unregisterReceiver(myBroadcastReceiver);
  }
}
```

3. Send Broadcast:
```java
Intent intent = new Intent(Intent.ACTION_AIRPLANE_MODE_CHANGED);
intent.putExtra("state", true);
sendBroadcast(intent);
```

4. Handle Permission:
```xml
<uses-permission android:name="android.permission.CHANGE_NETWORK_STATE" />
```