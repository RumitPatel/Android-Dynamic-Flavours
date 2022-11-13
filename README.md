# android-dynamic-flavours
You can create and maintain multiple android flavours dynamically with just one json file. You can test it by installing this sample app and applying below gradle commands:

Step 1: Create `keystores` and `projects_info` folders inside `app` folder.

Step 2: Put projects_info.json file inside `projects_info` folder which contains all the information regarding all the flavours.

Step 3: Put keystore file(s) in `keystores` folder. And sync the gradle.

Step 4: Create folders respected to each flavours inside `src` folder.

**Thats it.** Lets test it out:

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

Examples:
```
$ ./gradlew assembleproject1debug
$ ./gradlew assembleproject1release

$ ./gradlew assembleproject2debug
$ ./gradlew assembleproject2release
```


**Bundle flavors:** It'll prepare .aab file in `app/build/outputs/bundle/YOUR_FLAVOR_NAME/release/app-YOUR_FLAVOR_NAME-release.aab`

Examples:
```
$ ./gradlew assembleproject1debug
$ ./gradlew assembleproject1release

$ ./gradlew assembleproject2debug
$ ./gradlew assembleproject2release
```
- - - 

# Credits

Third party libraries: [JsonSlurper](https://groovy-lang.org/processing-json.html#json_jsonslurper).
