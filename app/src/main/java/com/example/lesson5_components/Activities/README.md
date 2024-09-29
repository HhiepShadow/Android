## ACTIVITIES

- Activity represents a single UI screen with which the user can interact
- Every Android application has at least 1 Activity class
- Every Activity contains the layout, which has a user interface to interact with the user

### Main characteristics of `Activity`:
1. User interface:
   - Every Activity contains an user interface, including components like buttons, text, images, ...
2. Life cycle:
    - Activity has a complex life cycle with many different states (running, paused, stopped, canceled) and Android will manage this lifecycle
    - Methods in lifecycle:
        * `onCreate()`
        * `onStart()`
        * `onResume()`
        * `onPause()`
        * `onStop()`
        * `onDestroy()`
3. Intent:
    - Activity can start up another Activities through Intent
    - Allows data transfer between Activities
4. Return result:
    - Activity can return result for Activity which calls it
    - Allows interaction between screens

### Activity's life cycle:
- ```
  onCreate(Bundle savedInstanceState):
  ```
  - Called when Activity is created
  - Set up user interface and initialize the necessary components
- ```
   onStart()
   ```
  - Called when Activity becomes visible to the user
- ```
   onResume()
   ```
   - Called when Activity starts to interact with user
- ```
  onPause()
  ```
  - Called when Activity is not in interactive state but has not been destroyed
- ``` 
  onStop()
   ```
  - Called when Activity is no longer visible to the user
- ``` 
  onDestroY()
   ```
  - Called when Activity is destroyed and will not be used anymore

### Example:
```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Thiết lập giao diện người dùng từ layout XML
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Thực hiện các tác vụ khi Activity bắt đầu
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Thực hiện các tác vụ khi Activity có thể tương tác
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Lưu trạng thái hoặc giải phóng tài nguyên
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Giải phóng tài nguyên không cần thiết
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Dọn dẹp trước khi Activity bị hủy
    }
}
```