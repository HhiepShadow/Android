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
