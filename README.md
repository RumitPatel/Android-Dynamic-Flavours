# android-dynamic-flavours
You can create and maintain multiple android flavours dynamically with just one json file. You can test it by installing this sample app and applying below gradle commands:

**Check all possible gradle task:** It'll list all the possible gradle  tasks.
```
$ ./gradlew task
```

**Install flavors:** It'll install app on connected device.
Examples:
```
$ ./gradlew installproject1debug
$ ./gradlew installproject1release

$ ./gradlew installproject2debug
$ ./gradlew installproject2release
```

**Assemble flavors:** It'll assemble and prepare .apk file in `app/build/outputs/apk/YOUR_FLAVOR_NAME/debug/app-YOUR_FLAVOR_NAME-debug.apk`
```
$ ./gradlew assembleproject1debug
$ ./gradlew assembleproject1release

$ ./gradlew assembleproject2debug
$ ./gradlew assembleproject2release
```


**Bundle flavors:** It'll prepare .aab file in `app/build/outputs/bundle/YOUR_FLAVOR_NAME/release/app-YOUR_FLAVOR_NAME-release.aab`
```
$ ./gradlew assembleproject1debug
$ ./gradlew assembleproject1release

$ ./gradlew assembleproject2debug
$ ./gradlew assembleproject2release
```
