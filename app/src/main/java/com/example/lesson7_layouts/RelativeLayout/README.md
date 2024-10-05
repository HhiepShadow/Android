## RELATIVE LAYOUT

- __RelativeLayout__ is a layout in Android allows to arrange child components relative to each other or 
relative to the parent layout
- __RelativeLayout__ is a `ViewGroup` subclass

### RelativeLayout attributes:

| Attributes                         | Description | Values |
|------------------------------------|--|--|
| `android:layout_above`             | Position the view above the specified view | ID of another view |
| `android:layout_alignParentBottom` | Aligns the view with the bottom edge of the parent layout | `true` or `false` |
| `android:layout_alignParentLeft`   | Algins the view with the left edge of the parent layout | `true` or `false` |
| `android:layout_alignParentRight`  | Aligns the view with the right edge of the parent layout | `true` or `false` |
| `android:layout_alignParentTop`    | Aligns the view with the top edge of the parent layout | `true` or `false` |
| `android:layout_centerInParent`    | Centers the view both horizontally and vertically within the parent | `true` or `false` |
| `android:layout_margin` | Sets the margin around the view | Specific size (e.g: `16dp`) |
| `android:layout_marginLeft`   | Sets the left margin of the view.                                       | Specific size (e.g., `16dp`).                     |
| `android:layout_marginRight`  | Sets the right margin of the view.                                      | Specific size (e.g., `16dp`).                     |
| `android:layout_marginTop`    | Sets the top margin of the view.                                        | Specific size (e.g., `16dp`).                     |
| `android:layout_toLeftOf`     | Positions the view to the left of the specified view.                   | ID of another view.                               |
| `android:layout_toRightOf`    | Positions the view to the right of the specified view.                  | ID of another view.                               |

### Create and use RelativeLayout:
```xml
<RelativeLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingLeft="10dp"
    android:paddingRight="10dp" />
```

