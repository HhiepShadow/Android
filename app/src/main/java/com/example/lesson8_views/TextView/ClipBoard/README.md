## CLIPBOARD

- Clipboard is a temporary storage area where data (such as text, images, file, etc.) can be copied from 1 location and pasted to another
- Allows users to transfer data between applications or within the same application

```xml
<?xml version="1.0" encoding="utf-8"?> 
<RelativeLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"> 
  
    <!--Text must be entered here-->
    <EditText
        android:id="@+id/txtCopy"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@id/btnCopy"
        android:layout_centerHorizontal="true"
        android:hint="Type something..." /> 
  
    <!--Text entered in the above field gets copied to  
        Clipboard on this button click-->
    <Button
        android:id="@+id/btnCopy"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="Copy to Clipboard" /> 
  
</RelativeLayout>
```

```java
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Clipboard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clipboard);

        EditText txtCopy = (EditText) findViewById(R.id.txtCopy);
        Button btnCopy = (Button) findViewById(R.id.btnCopy);

        ClipboardManager clipboardManager = getSystemService(CLIPBOARD_SERVICE);
        ClipData clipData;

        btnCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textCopy = txtCopy.getText().toString();

                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(Clipboard.this, "Copied to Clipboard", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
```