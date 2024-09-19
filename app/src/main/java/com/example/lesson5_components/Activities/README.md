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

