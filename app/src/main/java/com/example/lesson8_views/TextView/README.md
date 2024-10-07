## TEXTVIEW

- TextView is a basic UI component
- Used to display text in Android application
- Can display any type of text, from titles to descriptions
- Support many properties to customize the text

### Class Syntax:
```java
public class TextView 
        extends View 
        implements ViewTreeObserver.OnPreDrawListener 
```

- __Class Hierarchy__:
``` 
java.lang.Object 
    | android.view.View
        | android.widget.TextView
```

- __Syntax__:
```xml
<Layout>
    .
    .
    <TextView
        android:attribute1="Value1"
        android:attribute2="Value2"
        .
        .
        android:attributeN="valueN">
    </TextView>
</Layout>
```

### TextView Attributes:

| Attribute                           | Description                                                           | Possible Values                                         |
|-------------------------------------|-----------------------------------------------------------------------|--------------------------------------------------------|
| `android:autoLink`                  | Automatically links text such as URLs, email addresses, phone numbers. | `web`, `email`, `phone`, `map`, or `all`.            |
| `android:background`                | The background color or drawable for the TextView.                   | Color code or drawable resource.                       |
| `android:breakStrategy`             | The line break strategy for the text.                                | `simple`, `high_quality`, or `balanced`.              |
| `android:cursorVisible`             | Specifies whether the cursor is visible in a text input view.       | `true` or `false`.                                    |
| `android:drawableBottom`            | Sets the drawable below the text.                                    | Drawable resource.                                    |
| `android:drawableEnd`               | Drawable to be displayed on the end side of the view (for RTL layouts). | Drawable resource.                                    |
| `android:drawableLeft`              | Sets the drawable to the left of the text.                          | Drawable resource.                                    |
| `android:drawablePadding`           | Padding between the text and drawable.                               | Size (e.g., `4dp`).                                   |
| `android:drawableRight`             | Sets the drawable to the right of the text.                         | Drawable resource.                                    |
| `android:drawableTop`               | Sets the drawable above the text.                                    | Drawable resource.                                    |
| `android:ellipsize`                 | How to handle text when it exceeds the maximum number of lines.     | `end`, `start`, `middle`, `marquee`.                  |
| `android:fontFamily`                | Specifies the font family for the text.                              | Font family name or resource.                          |
| `android:gravity`                   | How to align the text within the TextView.                           | `center`, `left`, `right`, `top`, `bottom`.          |
| `android:hint`                      | Hint text displayed when there is no text.                           | String (e.g., `"Enter your name"`).                   |
| `android:hintTextColor`             | The color for the hint text of the TextView.                        | Color code (e.g., `#FF0000`) or color resource.      |
| `android:inputType`                 | Defines the type of data the TextView will accept (applies to EditText). | `text`, `number`, `phone`, etc.                       |
| `android:layout_height`             | The height of the TextView.                                          | `match_parent`, `wrap_content`, or specific size.     |
| `android:layout_width`              | The width of the TextView.                                           | `match_parent`, `wrap_content`, or specific size.     |
| `android:letterSpacing`             | The spacing between letters.                                         | Float (e.g., `0.1`).                                  |
| `android:lineSpacingExtra`          | Extra spacing between lines.                                         | Size (e.g., `4dp`).                                   |
| `android:lineSpacingMultiplier`     | Multiplier for the line spacing.                                     | Float (e.g., `1.5`).                                  |
| `android:layout_marginBottom`       | Bottom margin for the view.                                          | Size (e.g., `8dp`).                                   |
| `android:layout_marginLeft`         | Left margin for the view.                                            | Size (e.g., `8dp`).                                   |
| `android:layout_marginRight`        | Right margin for the view.                                           | Size (e.g., `8dp`).                                   |
| `android:layout_marginTop`          | Top margin for the view.                                             | Size (e.g., `8dp`).                                   |
| `android:layout_width`              | The width of the view.                                               | `match_parent`, `wrap_content`, or specific size.     |
| `android:longClickable`              | Specifies whether the view is long-clickable.                      | `true` or `false`.                                    |
| `android:maxHeight`                 | The maximum height of the view.                                      | Size (e.g., `100dp`).                                 |
| `android:maxLength`                 | The maximum number of characters allowed in a text input view.      | Integer value.                                        |
| `android:maxLines`                  | The maximum number of lines for a text view.                         | Integer value.                                        |
| `android:maxWidth`                  | The maximum width of the view.                                       | Size (e.g., `100dp`).                                 |
| `android:minHeight`                 | The minimum height of the view.                                      | Size (e.g., `50dp`).                                  |
| `android:minLines`                  | The minimum number of lines for a text view.                         | Integer value.                                        |
| `android:minWidth`                  | The minimum width of the view.                                       | Size (e.g., `50dp`).                                  |
| `android:padding`                   | The padding between the view's content and its boundaries.           | Size (e.g., `8dp`).                                   |
| `android:paddingBottom`             | Bottom padding for the view.                                         | Size (e.g., `8dp`).                                   |
| `android:paddingLeft`               | Left padding for the view.                                           | Size (e.g., `8dp`).                                   |
| `android:paddingRight`              | Right padding for the view.                                          | Size (e.g., `8dp`).                                   |
| `android:paddingTop`                | Top padding for the view.                                            | Size (e.g., `8dp`).                                   |
| `android:rotation`                  | The rotation of the view in degrees.                                 | Float (e.g., `45`).                                   |
| `android:scaleX`                    | The scaling factor in the X direction.                               | Float (e.g., `1.5`).                                  |
| `android:scaleY`                    | The scaling factor in the Y direction.                               | Float (e.g., `1.5`).                                  |
| `android:scrollbarStyle`            | Specifies the style of the scrollbar.                               | `normal`, `insideOverlay`, `outsideOverlay`.           |
| `android:scrollbars`                | Specifies whether scrollbars are shown.                             | `horizontal`, `vertical`, or `none`.                  |
| `android:scrollHorizontally`        | Allows horizontal scrolling when the text is longer than the width. | `true` or `false`.                                    |
| `android:scrollVertically`          | Allows vertical scrolling when the text is longer than the height.  | `true` or `false`.                                    |
| `android:selectAllOnFocus`          | Automatically selects all text when the TextView is focused.        | `true` or `false`.                                    |
| `android:soundEffectsEnabled`       | Enables or disables sound effects when interacting.                  | `true` or `false`.                                    |
| `android:shadowColor`               | The color of the shadow for the text.                                | Color code (e.g., `#000000`).                         |
| `android:shadowDx`                  | The horizontal offset of the shadow.                                 | Float (e.g., `1.0`).                                  |
| `android:shadowDy`                  | The vertical offset of the shadow.                                   | Float (e.g., `1.0`).                                  |
| `android:shadowRadius`              | The radius of the shadow.                                            | Float (e.g., `2.0`).                                  |
| `android:tag`                       | An arbitrary object associated with the view.                       | Any object.                                           |
| `android:translationX`              | The translation in the X direction.                                  | Float (e.g., `10`).                                   |
| `android:translationY`              | The translation in the Y direction.                                  | Float (e.g., `10`).                                   |
| `android:text`                      | The text to be displayed.                                            | String (e.g., `"Hello World!"`).                       |
| `android:textAlignment`             | Alignment of the text.                                              | `viewStart`, `viewEnd`, `center`, `textStart`, `textEnd`. |
| `android:textColor`                 | The color of the text.                                               | Color code (e.g., `#FF0000`) or color resource.      |
| `android:textColorLink`             | The color of linked text.                                            | Color code or color resource.                          |
| `android:textSize`                  | The size of the text.                                               | Size (e.g., `16sp`).                                  |
| `android:textStyle`                 | The style of the text (bold, italic, etc.).                         | `normal`, `bold`, `italic`, or `bold|italic`.        |
| `android:transformationMethod`      | Transformation method for the text (e.g., password transformation). | Class name (e.g., `android.text.method.PasswordTransformationMethod`). |
| `android:visibility`                | Specifies whether the TextView is visible.                           | `visible`, `invisible`, `gone`.                       |
| `android:marqueeRepeatLimit`        | The number of times to repeat the marquee effect.                    | Integer (e.g., `marquee_forever`, `1`, `2`, ...).    |

### Methods:
| Method                              | Description                                                           | Example                                                   |
|-------------------------------------|-----------------------------------------------------------------------|-----------------------------------------------------------|
| `append(CharSequence text)`         | Appends the specified text to the end of the current text.            | `textView.append(" additional text");`                   |
| `getText()`                         | Retrieves the current text of the TextView.                         | `String currentText = textView.getText().toString();`    |
| `setAutoLinkMask(int mask)`        | Sets the auto-linking options for the text (URLs, email, etc.).     | `textView.setAutoLinkMask(Linkify.WEB_URLS);`           |
| `setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom)` | Sets drawables for the text view.                     | `textView.setCompoundDrawablesWithIntrinsicBounds(leftDrawable, null, null, null);` |
| `setEllipsize(TextUtils.TruncateAt where)` | Sets the ellipsis style when the text exceeds the maximum lines.   | `textView.setEllipsize(TextUtils.TruncateAt.END);`      |
| `setFocusable(boolean focusable)`   | Sets whether the TextView can gain focus.                           | `textView.setFocusable(true);`                           |
| `setGravity(int gravity)`           | Sets the gravity for the TextView (alignment of text).              | `textView.setGravity(Gravity.CENTER);`                   |
| `setHint(CharSequence hint)`        | Sets the hint text to be displayed when the TextView is empty.      | `textView.setHint("Enter your name");`                   |
| `setHintTextColor(int color)`       | Sets the color of the hint text.                                     | `textView.setHintTextColor(Color.GRAY);`                 |
| `setInputType(int type)`            | Sets the type of input (text, number, etc.) accepted by the TextView.| `textView.setInputType(InputType.TYPE_CLASS_TEXT);`      |
| `setLineSpacing(float add, float mult)` | Sets the line spacing for the text.                               | `textView.setLineSpacing(1.5f, 1.2f);`                   |
| `setMarqueeRepeatLimit(int limit)` | Sets the number of times the marquee effect should repeat.          | `textView.setMarqueeRepeatLimit(3);`                     |
| `setPadding(int left, int top, int right, int bottom)` | Sets the padding for the TextView.                        | `textView.setPadding(16, 16, 16, 16);`                   |
| `setShadowLayer(float radius, float dx, float dy, int color)` | Sets a shadow layer for the text.                             | `textView.setShadowLayer(1.5f, 0, 0, Color.BLACK);`     |
| `setText(CharSequence text)`        | Sets the text for the TextView.                                      | `textView.setText("Hello World!");`                      |
| `setTextAppearance(Context context, int resId)` | Sets the text appearance using a style resource.            | `textView.setTextAppearance(context, R.style.MyTextStyle);` |
| `setTextColor(int color)`           | Sets the color of the text.                                          | `textView.setTextColor(Color.RED);`                      |
| `setTextSize(float size)`           | Sets the text size in scaled pixels.                                 | `textView.setTextSize(20);`                               |
| `setTextIsSelectable(boolean selectable)` | Sets whether the text is selectable.                             | `textView.setTextIsSelectable(true);`                    |
| `setTransformationMethod(TransformationMethod method)` | Sets the transformation method (like password visibility). | `textView.setTransformationMethod(PasswordTransformationMethod.getInstance());` |
| `setTypeface(Typeface tf)`          | Sets the typeface and style for the text.                            | `textView.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);` |
| `setMaxLines(int maxLines)`         | Sets the maximum number of lines to be displayed.                    | `textView.setMaxLines(3);`                               |
| `setVisibility(int visibility)`      | Sets the visibility of the TextView.                                 | `textView.setVisibility(View.VISIBLE);`                  |
| `setTextAlignment(int textAlignment)` | Sets the text alignment.                                           | `textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);`  |
| `setLinksClickable(boolean clickable)` | Sets whether links in the TextView should be clickable.           | `textView.setLinksClickable(true);`                       |
| `setLineHeight(int lineHeight)`     | Sets the height of each line of text.                               | `textView.setLineHeight(24);`                             |
| `setMarquee(boolean marquee)`        | Enables or disables marquee scrolling for the text.                 | `textView.setMarquee(true);`                              |
| `setTextColorLink(int color)`       | Sets the color for link text.                                       | `textView.setTextColorLink(Color.BLUE);`                 |
| `setTextKeepState(boolean keepState)` | Sets whether to keep the text state when the view is recycled.    | `textView.setTextKeepState(true);`                        |

### Working with TextView:
1. Formatting TextView:
- Use `android:typeface` to format __TextView:
  - `android:typeface="normal"`: Normal font style
  - `android:typeface="sans"`: Sans-serif font style (No underline)
  - `android:typeface="serif"`: Serif font style (Underline)
  - `android:typeface="monospace"`: Monospace font style
  
2. Size of the TextView:
  
| Type of text | Font size | Font Weight | Need to be all uppercase |
|--------------| -- | -- |--------------------------|
| H1 Headline  | 96sp | Roboto Light | No                       |
| H2 Headline  | 60sp | Roboto Light | No                       |
| H3 Headline  | 48sp | Roboto Regular | No                       |
| H4 Headline  | 34sp | Roboto Regular | No                       |
| H5 Headline  | 24sp | Roboto Regular | No                       |
| H6 Headline | 20sp | Roboto Medium | No                       |
| Subtitle 1 | 16sp | Roboto Light | No                       |
| Subtitle 2 | 14sp | Roboto Medium | No                       |
| Body 1 | 16sp | Roboto Regular | No                       |
| Body 2 | 14sp | Roboto Regular | No                       |
| Button | 14sp | Roboto Medium | Yes                      |
| Caption | 12sp | Roboto Regular | No |
| Overline | 10sp | Roboto Regular | Yes |

3. HTML Formatting:

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_margin="10dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="GFG"
        android:id="@+id/tv_gfg"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

```kt
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val textView: TextView = findViewById(R.id.tv_gfg)

        val htmlText = """
            <h2>Welcome to GFG TextView Tutorial</h2>
            <p>This is an GFG Tutorial about TextView <b>bold</b>, <i>italic</i>, and <u>underlined</u> text in a TextView using HTML formatting.</p>
            <p>You can also include <a href="https://www.geeksforgeeks.org/">links</a> and other HTML elements.</p>
        """

        textView.text = Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT)

    }
}
```

### Autosizing TextView:  
Example: We will autosize the dial pad  

1. Working with the `activity_main.xml`:
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context=".MainActivity">
  <TextView
          android:id="@+id/primaryTextView"
          android:layout_width="match_parent"
          android:layout_height="100dp"
          android:hint="0"
          android:maxLines="2"
          app:autoSizeMaxTextSize="80sp"
          app:autoSizeMinTextSize="10sp"
          app:autoSizeStepGranularity="2sp"
          app:autoSizeTextType="uniform" />

  <LinearLayout
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          android:gravity="center"
          android:orientation="horizontal"
          android:weightSum="3">

    <Button
            android:layout_width="68dp"
            android:layout_height="68dp"
            android:layout_margin="8dp"
            android:onClick="clickedOne"
            android:text="1"
            android:textSize="24sp" />

    <Button
            android:layout_width="68dp"
            android:layout_height="68dp"
            android:layout_margin="8dp"
            android:onClick="clickedTwo"
            android:text="2"
            android:textSize="24sp" />

    <Button
            android:layout_width="68dp"
            android:layout_height="68dp"
            android:layout_margin="8dp"
            android:onClick="clickedThree"
            android:text="3"
            android:textSize="24sp" />
  </LinearLayout>

  <LinearLayout
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          android:gravity="center"
          android:orientation="horizontal"
          android:weightSum="3">

    <Button
            android:layout_width="68dp"
            android:layout_height="68dp"
            android:layout_margin="8dp"
            android:onClick="clickedFour"
            android:text="4"
            android:textSize="24sp" />

    <Button
            android:layout_width="68dp"
            android:layout_height="68dp"
            android:layout_margin="8dp"
            android:onClick="clickedFive"
            android:text="5"
            android:textSize="24sp" />

    <Button
            android:layout_width="68dp"
            android:layout_height="68dp"
            android:layout_margin="8dp"
            android:onClick="clickedSix"
            android:text="6"
            android:textSize="24sp" />
  </LinearLayout>

  <LinearLayout
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          android:gravity="center"
          android:orientation="horizontal"
          android:weightSum="3">

    <Button
            android:layout_width="68dp"
            android:layout_height="68dp"
            android:layout_margin="8dp"
            android:onClick="clickedSeven"
            android:text="7"
            android:textSize="24sp" />

    <Button
            android:layout_width="68dp"
            android:layout_height="68dp"
            android:layout_margin="8dp"
            android:onClick="clickedEight"
            android:text="8"
            android:textSize="24sp" />

    <Button
            android:layout_width="68dp"
            android:layout_height="68dp"
            android:layout_margin="8dp"
            android:onClick="clickedNine"
            android:text="9"
            android:textSize="24sp" />
  </LinearLayout>

  <Button
          android:layout_width="68dp"
          android:layout_height="68dp"
          android:layout_gravity="center"
          android:layout_marginTop="8dp"
          android:onClick="clickedZero"
          android:text="0"
          android:textSize="24sp" />
</LinearLayout>
```

&rarr; We will use:  
  - `app:autoSizeMaxTextSize="80sp"`: 
    - Sets the maximum text size that the TextView can scale to when auto-resizing
  - `app:autoSizeMinTextSize="10sp"`:
    - Sets the minimum text size that the TextView can scale to when auto-resizing
  - `app:autoSizeStepGranularity="2sp"`:
    - Specifies the jumps between the TextView dynamically resizes
    - Here, the text size will be increased or decreased in __2sp__ steps until a suitable size is reached between the
    __autoSizeMinTextSize__ and __autoSizeMaxTextSize__
    

### Different between `px`, `dip`(`dp`) and `sp`:
