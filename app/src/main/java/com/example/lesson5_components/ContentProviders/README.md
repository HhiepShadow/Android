## CONTENT PROVIDERS

- Content Provider is a component in Android allows data sharing between applications
- A very important component that serves the purpose of a relational database to store the data of applications
- Provides a standard interface for accessing and managing data
- Allows applications to interact with each other securely and efficiently
- Android system allows Content Provider to store data in several ways:
  - Images
  - Audio
  - Videos
  - Personal contact information ...
by storing them in `SQLite`

### Content URI:
- A unique identifier used to access data within a Content Provider
- Allows applications to interact with each other securely and efficiently through operations such as:
  - query
  - insert
  - update
  - delete
- Structure of Content URI:
``` 
content://<authority>/<path>/<id>
```
in there:
  - `content://`: Mandatory part of the URI as it represents that the given URI is Content URI
  - `authority`: Content Provider name, defined in `AndroidManifest.xml`
  - `path`: Path to specific data in the Content Provider
  - `id`: ID of the specific record we want to access
Ex: `content://com.example.provider/notes/1`

### Operations in Content Provider:
- Create
- Read
- Update
- Delete

### Working of the Content Provider:

### Creating a Content Provider:
- Step 1: Create a class extends `ContentProvider` base class
- Step 2: To access the content, define a content provider URI address
- Step 3: Create a database to store data
- Step 4: Implement 6 abstract methods of ContentProvider class
- Step 5: Register content provider in AndroidManifest.xml file using `<provider>` tag

### 6 abstract methods:
1. query(): 
  - Accept 



