## GENERATE SIGNED APK

- APK (Android Package Kit) is a file format used to distribute and install applications on Android OS
- Signed APK is an APK file that has been signed with a digital certificate, allowing it to be distributed and 
installed on Android devices
  - Signed APK generates a key and this key can be used to release versions of the application
  - The Android system needs that all installed applications be digitally signed with a certificate whose 
    private key is owned by the application's developer

### Generating Signed APK in Android Studio:
1. Step 1: 
- Go to Build  
-> Generate Bundle or APK  
-> A pop up will arise -> Choose APK -> Next

2. Step 2: Input keystore information:
- Includes:
  - Key store path: Select the path to your keystore file
  - Password
  - Key alias
  - Key password: password for alias  
-> Next
  
3. Step 3: The next pop-up  
-> Choose `release` as `Build Variants`  
-> Check all 2 `Signature Versions`  
-> Finish  

4. Step 4: Locate signed apk: app -> release -> app-release