ZubcovToast
=====
This is an Android Toast plugin for Godot Engine (https://github.com/okamstudio/godot) 3.2 or higher.

How to use
----------
- Configure, install  and enable the "Android Custom Template" for your project, just follow the [official documentation](https://docs.godotengine.org/en/latest/getting_started/workflow/export/android_custom_build.html);
- download or clone this repository;
- drop the ```ZubcovToast-plugin``` directory (from this repository) inside the ```res://android/``` directory on your Godot project.
- on the Project Settings -> Android -> Modules, add the string:

```
org/godotengine/godot/ZubcovToast
```

API Reference
-------------
The following methods are available:
```python

# Show Toast
#@param String message
#@param bool max (if true = LONG, else SHORT)
showBanner(message, max)


```


--------------

```
adb logcat -s godot
```

References
-------------
Based on the works of:
* https://developer.android.com/guide/topics/ui/notifiers/toasts#java

License
-------------
MIT license