# android-dynamic-flavours
You can create and maintain multiple android flavours dynamically with just one json file.

You can test it by installing this sample app and applying below gradle commands:

**Install variants of Project1 flavor:**
```
$ ./gradlew installproject1debug
$ ./gradlew installproject1release
```

**Install variants of Project2 flavor:**
```
$ ./gradlew installproject2debug
$ ./gradlew installproject2release
```
