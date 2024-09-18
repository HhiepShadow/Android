## ANDROID MANIFEST:

- Every Android project includes a Manifest XML file, which is AndroidManifest.xml
- Located in the root directory of its project hierarchy
- Defines the structure and metadata of the application, its components and its requirements

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

A manifest file includes nodes that define the application components, security settings, test classes, and requirements that make up the application

### 1. Manifest tag:
- This is root tag of the manifest file, including package properties that defines the name of the application
- The packaging field describes the activity class's package name
```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
```

### 2. Application tag:
- This tag contains the application's information, including:
  - android:icon: The icon of application
  - android:label: Display name of application
  - android:theme: Interface theme of application

```xml
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
```

### 3. Activity tag:
- This tag defines activities in the application
- Each Activity need to be declared, including these attributes:
  - android:name: Class name of Activity
  - intent-filter: Identify activities that the Activity can handle
```xml
<activity
    android:name=".MainActivity"
    android:exported="true">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />

        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```

### 4. Uses-sdk tag:
- Defines requirements about the SDK version the application needs to run 
- Allows to specify the minimum version (minSdkVersion) and maximum version (maxSdkVersion) that the application supports
```xml
<uses-sdk
    android:minSdkVersion="21"
    android:targetSdkVersion="31"
    android:maxSdkVersion="33" />
```
in there:
  - android:minSdkVersion: minimum SDK version that the application can run
  Ex: 21 corresponds to Android 5.0 (Lollipop)
  - android:targetSdkVersion: SDK version which the application was developed and tested
  Ex: 31 corresponds to Android 12
  - android:maxSdkVersion (not recommended): maximum SDK version

### 5. Uses-permission tag:
- Defines permissions that the application needs to operate
- These permissions allow the application to access device resources and features
- Syntax:
```xml
<uses-permission android:name="android.permission.<PERMISSION_NAME> "/>
```
- Requires permissions at run time:
```java
if (ContextCompat.checkSelfPermission(this, Manifest.permission.PERMISSION_NAMEN)
        != PackageManager.PERMISSION_GRANTED) {
    ActivityCompat.requestPermissions(this,
            new String[]{Manifest.permission.PERMISSION_NAME},
            REQUEST_LOCATION_PERMISSION);
}
```

### 6. Uses-feature tag:
- Defines the hardware features the application requires or uses, such as a camera or GPS
- Syntax:
```xml
<uses-feature android:name="android.hardware.feature_name" android:required="true" />
```

