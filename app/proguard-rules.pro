-adaptclassstrings
-allowaccessmodification

-obfuscationdictionary proguard-dict.txt
-classobfuscationdictionary proguard-dict.txt
-packageobfuscationdictionary proguard-dict.txt

-repackageclasses com.example.leo.myapplication

-keepclasseswithmembers class com.example.leo.myapplication.Hook

-keepclassmembernames class com.example.leo.myapplication.HookConfig {
    <fields>;
}