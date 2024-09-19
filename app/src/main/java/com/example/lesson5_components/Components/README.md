# COMPONENTS OF AN ANDROID APPLICATION
- Components are the basic parts that make up an application
- Each component performs a specific function, and they interact with each other to create a user experience
- Here are the main types of components in Android applications:

## 1. Activities:
- Activity is 1 of the most basic components of an Android application
- Represents a screen in the application that the user can interact with
- Each Activity has its own lifecycle and can manage UI and user events
```java
public class MainActivity extends Activity {
}
```

### 2. Services:
- Service is like invisible worker of an Android application
- Allows to perform long-running tasks in the background without the need for an UI
- Can run in the background, allowing the application to continue doing work even the user is not interacting with it
- Also performs some tasks when application is not active
```java
public class ServiceName extends Service {
}
```

### 3. Content Providers:
- Allows to manage and share data between applications
- Provide a standard UI to access and operate with data, likes database, files, or networking data, ...

```java
import android.content.ContentProvider;

public class contentProviderName extends ContentProvider {
}
```


### 4. Broadcast Receivers:
- Allows the application receives and handles broadcasts from system or another applications

### 5. Intents:
- Intent is an Android object used to communicate between components of an application or between applications
- Allows to send data, start an Activity or Service, or send a broadcast

### 6. Widgets:
- Widget is a small UI component that user can add into main screen of Android device
- Allows user to interact with the application without opening it
- Displays information independently and includes components likes button, text, images, ...

