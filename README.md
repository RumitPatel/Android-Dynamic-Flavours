# android-dynamic-flavours
This describes how to share single code to multiple projecs.

You can test it by below gradle commands:

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
