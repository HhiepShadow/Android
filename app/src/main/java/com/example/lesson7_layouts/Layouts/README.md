## LAYOUTS

- Layout defines how user interface (UI) elements are arranged on the screen 
- We can create layouts using XML or program in Java/Kotlin
- There are some commonly used layout classes in Android SDK:  
    
(1) __FrameLayout__:
- Used to contain a single component, but can also contain multiple components which will be overlapped
- By default, the position is the top-left corner, though the gravity attribute can be used to alter its locations
[](/src/main/java/com/example/lesson7_layouts/images/framelayout.png)

(2) __RelativeLayout__:
- Allows us to define the position of each child View relative to the other Views and the dimensions of the screen
[](/src/main/java/com/example/lesson7_layouts/images/relativelayout.png)

(3) __ConstraintLayout__:
- Provides flexible and efficient layouts with the ability to position components precisely using constraints
[](/src/main/java/com/example/lesson7_layouts/images/constraintlayout.png)

(4) __LinearLayout__:
- Arranges child components vertically or horizontally
[](/src/main/java/com/example/lesson7_layouts/images/linearlayout.png)

(5) __GridLayout__:
- Allows to arrange components in a grid, which is useful for creating complex interfaces
- Grid Layout uses a rectangular grid of infinitely thin lines to layout Views in a series of rows and columns

