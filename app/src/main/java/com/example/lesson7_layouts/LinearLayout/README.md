## LINEAR LAYOUT

- __LinearLayout__ is one of the most common layout in Android
- Allows to arrange child components vertically or horizontally

### How to arrange components orientation in LinearLayout:
- We will use `android:orientation` attribute in __LinearLayout__ 
- Syntax:
```xml
<LinearLayout 
    ...
    android:orientation="vertical"
/>  
```
- Values:
  - vertical: Arrange vertically
  - horizontal: Arrange horizontally 

### LinearLayout attributes:

| Attributes                         | Description                                                                | Value                                              |
|------------------------------------|----------------------------------------------------------------------------|----------------------------------------------------|
| `android:background`              | Sets the background color or drawable for the LinearLayout.              | Color (e.g., `#FFFFFF`) or drawable resource.      |
| `android:baselineAligned`         | Determines whether child elements are aligned to the baseline.            | `true`, `false`.                                    |
| `android:divider`                 | Sets a divider between child elements.                                    | Drawable resource.                                  |
| `android:id` | Defines a unique id to the layout | |
| `android:gravity`                 | Aligns all child elements within the LinearLayout.                        | `top`, `bottom`, `left`, `right`, `center`, etc.  |
| `android:layout_height`           | The height of the LinearLayout.                                           | Similar to `layout_width`.                         |
| `android:layout_width`            | The width of the LinearLayout.                                            | `match_parent`, `wrap_content`, or specific size.  |
| `android:orientation`             | Determines the direction in which child elements are arranged.            | `vertical`, `horizontal`.                           |
| `android:padding`                 | The space between the content and the edges of the LinearLayout.          | Specific size (e.g., `16dp`).                       |
| `android:paddingBottom`           | The space on the bottom side.                                            | Specific size (e.g., `16dp`).                       |
| `android:paddingLeft`             | The space on the left side.                                              | Specific size (e.g., `16dp`).                       |
| `android:paddingRight`            | The space on the right side.                                             | Specific size (e.g., `16dp`).                       |
| `android:paddingTop`              | The space on the top side.                                               | Specific size (e.g., `16dp`).                       |
| `android:showDividers`            | Determines how dividers are displayed.                                    | `none`, `beginning`, `middle`, `end`, `always`.   |
| `android:weightSum`               | Specifies the total weight of child elements.                             | A float value (e.g., `3`).                         |

### Create and use LinearLayout:
1. Step 1: Create new LinearLayout:
- Right-click to the folder `LinearLayout` and choose `Activity`
- Choose `Empty View Activity` on pop-up menu

2. Step 2: Configure XML file:
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".LinearLayout.LinearLayout">

    <TextView
        android:id="@+id/textViewLL"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TextView LinearLayout"
        android:textSize="24dp" />

    <Button
        android:id="@+id/btnLL"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button LinearLayout" />

</LinearLayout>
```

3. Step 3: Configure `LinearLayout.java` or `LinearLayout.kt`:
```java
package com.example.lesson7_layouts.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lesson7_layouts.R;

public class LinearLayout extends AppCompatActivity {
    private TextView textViewLL;
    private Button btnLL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        initWidgets();

        btnLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewLL.setText("Button clicked");
            }
        });
    }

    public void initWidgets() {
        textViewLL = (TextView) findViewById(R.id.textViewLL);
        btnLL = (Button) findViewById(R.id.btnLL);
    }
}
```