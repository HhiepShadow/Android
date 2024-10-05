## CONSTRAINT LAYOUT

- Constraint Layout is a powerful layout in Android
- Allows to create complex UI easily and efficiently
- Allows to position UI components using constraints instead of relying on parent layouts like __LinearLayout__ or __RelativeLayout__

### ConstraintLayout attributes:


| Attributes                             | Description                                                              | Values                                            |
|----------------------------------------|--------------------------------------------------------------------------|--------------------------------------------------|
| `layout_constraintBottom_toBottomOf`  | Positions the bottom edge of the view relative to another view's bottom edge. | ID of another view.                              |
| `layout_constraintBottom_toTopOf`     | Positions the bottom edge of the view relative to another view's top edge. | ID of another view.                              |
| `layout_constraintEnd_toEndOf`        | Aligns the end edge of the view with the end edge of another view.     | ID of another view.                              |
| `layout_constraintEnd_toStartOf`      | Aligns the end edge of the view with the start edge of another view.   | ID of another view.                              |
| `layout_constraintHorizontal_bias`     | Adjusts the horizontal position of the view between its start and end constraints. | Float value (0.0 to 1.0).                       |
| `layout_constraintHeight_default`      | Specifies how to handle the height of the view.                        | `wrap`, `spread`, or `percent`.                  |
| `layout_constraintHeight_max`          | Sets the maximum height of the view.                                   | Specific size (e.g., `200dp`).                   |
| `layout_constraintHeight_min`          | Sets the minimum height of the view.                                   | Specific size (e.g., `50dp`).                    |
| `layout_constraintHorizontal_chainStyle` | Specifies the chain style for horizontal chains.                     | `spread`, `spread_inside`, `packed`.             |
| `layout_constraintStart_toEndOf`      | Aligns the start edge of the view with the end edge of another view.   | ID of another view.                              |
| `layout_constraintStart_toStartOf`    | Aligns the start edge of the view with the start edge of another view. | ID of another view.                              |
| `layout_constraintTop_toBottomOf`     | Positions the top edge of the view relative to another view's bottom edge. | ID of another view.                              |
| `layout_constraintTop_toTopOf`        | Positions the top edge of the view relative to another view's top edge. | ID of another view.                              |
| `layout_constraintVertical_bias`      | Adjusts the vertical position of the view between its top and bottom constraints. | Float value (0.0 to 1.0).                       |
| `layout_constraintWidth_default`       | Specifies how to handle the width of the view.                        | `wrap`, `spread`, or `percent`.                  |
| `layout_constraintWidth_max`           | Sets the maximum width of the view.                                   | Specific size (e.g., `200dp`).                   |
| `layout_constraintWidth_min`           | Sets the minimum width of the view.                                   | Specific size (e.g., `50dp`).                    |