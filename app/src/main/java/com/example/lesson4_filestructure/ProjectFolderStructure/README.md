### PROJECT FOLDER STRUCTURE

```
MyApplication/
├── app/
│   ├── build/
│   ├── libs/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── myapplication/
│   │   │   │               ├── MainActivity.java
│   │   │   │               └── other_classes/
│   │   │   ├── res/
│   │   │   │   ├── drawable/
│   │   │   │   ├── layout/
│   │   │   │   ├── mipmap/
│   │   │   │   ├── values/
│   │   │   │   └── ...
│   │   │   ├── AndroidManifest.xml
│   │   │   └── assets/
│   │   └── test/
│   ├── build.gradle
│   └── proguard-rules.pro
├── gradle/
├── .gitignore
├── build.gradle
├── settings.gradle
└── gradlew
```

### 1. Manifest folder:
``` 
app/
└── src/
    └── main/
        └── AndroidManifest.xml
```
- Contains `AndroidManifest.xml` for creating our android application
- `AndroidManifest.xml` defines structure and main components of the android application

AndroidManifest.xml:
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
        android:theme="@style/Theme.Lesson4_FileStructure"
        tools:targetApi="31">
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
```

### 2. Java folder:
``` 
app/
└── src/
    └── main/
        └── java/
            └── com/
                └── example/
                    └── myapplication/
                        ├── MainActivity.java
                        ├── OtherActivity.java
                        ├── adapters/
                        └── models/
```
- Contains all the Java source code files that we create during the app development, including other Test files

MainActivity.java:
```java
package com.geeksforgeeks.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
```

### 3. Resource (res) folder:
``` 
app/
└── src/
    └── main/
        └── res/
            ├── drawable/
            ├── layout/
            ├── mipmap/
            ├── values/
            ├── color/
            ├── menu/
            └── xml/
```
- The most important folder
- Contains all the non-code sources likes:
  - Images
  - XML layouts
  - UI strings

### 4. Gradle Scripts folder:
- Gradle is a popular build automation tool in Android development
- Contains a number of files that are used to define a build configuration that can be applied to modules in application