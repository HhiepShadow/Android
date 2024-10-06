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
| `android:drawableBottom`            | Sets the drawable below the text.                                    | Drawable resource.                                    |
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
| `android:maxLength`                 | Limits the length of the text.                                      | Integer.                                              |
| `android:maxLines`                  | The maximum number of lines the TextView can display.               | Integer (e.g., `2`).                                  |
| `android:minEms`                    | The minimum number of ems for the TextView.                         | Integer.                                              |
| `android:minLines`                  | The minimum number of lines for the TextView.                       | Integer.                                              |
| `android:padding`                   | The padding between the text and the edges of the TextView.         | Size (e.g., `8dp`).                                   |
| `android:paddingEnd`                | End padding (API 17 and above).                                     | Size (e.g., `8dp`).                                   |
| `android:paddingStart`              | Start padding (API 17 and above).                                   | Size (e.g., `8dp`).                                   |
| `android:scrollHorizontally`        | Allows horizontal scrolling when the text is longer than the width. | `true` or `false`.                                    |
| `android:scrollVertically`          | Allows vertical scrolling when the text is longer than the height.  | `true` or `false`.                                    |
| `android:selectAllOnFocus`          | Automatically selects all text when the TextView is focused.        | `true` or `false`.                                    |
| `android:soundEffectsEnabled`       | Enables or disables sound effects when interacting.                  | `true` or `false`.                                    |
| `android:shadowColor`               | The color of the shadow for the text.                                | Color code (e.g., `#000000`).                         |
| `android:shadowDx`                  | The horizontal offset of the shadow.                                 | Float (e.g., `1.0`).                                  |
| `android:shadowDy`                  | The vertical offset of the shadow.                                   | Float (e.g., `1.0`).                                  |
| `android:shadowRadius`              | The radius of the shadow.                                            | Float (e.g., `2.0`).                                  |
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