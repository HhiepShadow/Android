## CONVERTING KOTLIN CODE TO JAVA CODE

### 1. Step 1: Open Kotlin Class/File:
- Open the Kotlin Class/File which is to be converted into Java. Consider the code of the MainActivity file mentioned below for the conversion.

```kotlin
import android.os.Bundle 
import android.view.View 
import android.widget.TextView 
import androidx.appcompat.app.AppCompatActivity 
  
class MainActivity : AppCompatActivity() { 
    // declaring variable for TextView component 
    private var textView: TextView? = null
  
    // declaring variable to store 
    // the number of button click 
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main) 
  
        // assigning ID of textView2 to the variable 
        textView = findViewById(R.id.textView2) 
  
        // initializing the value of count with 0 
        count = 0
    } 
  
    // function to perform operations 
    // when button is clicked 
    fun buttonOnClick(view: View?) { 
        // increasing count by one on 
        // each tap on the button 
        count++ 
  
        // changing the value of the 
        // textView with the current 
        // value of count variable 
        textView!!.text = Integer.toString(count) 
    } 
}
```

### 2. Step 2: Navigate to Tools Menu
- From the topmost toolbar of the Android Studio:  
Select Tools and then navigate to Kotlin 
-> Show Kotlin Bytecode.   
-> It will open a window at the right-hand side that will contain the line by line bytecode for the Kotlin file.

### 3. Step 3: Decompile bytecode
In the bytecode window, checkbox the option “JVM 8 target” and click on Decompile.   
-> The Android Studio will generate the Java equivalent code for the Kotlin file.   
-> The produced java code will contain some additional information like metadata. Below is the generated Java code for the above mentioned Kotlin file.

```java
import android.os.Bundle; 
import android.view.View; 
import android.widget.TextView; 
import androidx.appcompat.app.AppCompatActivity; 
import kotlin.Metadata; 
import kotlin.jvm.internal.Intrinsics; 
import org.jetbrains.annotations.Nullable; 
  
@Metadata( 
   mv = {1, 4, 1}, 
   bv = {1, 0, 3}, 
   k = 1, 
   d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, 
   d2 = {"Lcom/example/javatokotlin/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "count", "", "textView", "Landroid/widget/TextView;", "buttonOnClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app"} 
) 
public final class MainActivity extends AppCompatActivity { 
   private TextView textView; 
   private int count; 
  
   protected void onCreate(@Nullable Bundle savedInstanceState) { 
      super.onCreate(savedInstanceState); 
      this.setContentView(1300009); 
      this.textView = (TextView)this.findViewById(1000069); 
      this.count = 0; 
   } 
  
   public final void buttonOnClick(@Nullable View view) { 
      int var10001 = this.count++; 
      TextView var10000 = this.textView; 
      Intrinsics.checkNotNull(var10000); 
      var10000.setText((CharSequence)Integer.toString(this.count)); 
   } 
}
```