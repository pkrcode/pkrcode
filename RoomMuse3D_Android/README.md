# RoomMuse 3D Android prototype
A mobile-first Three.js character and bedroom editor wrapped in an Android WebView.

Features: procedural stylized adult character, body proportion sliders, hair presets and colors, skin and eye colors, outfit presets, idle/dance/walk/wave animations, room objects and camera orbit/zoom.

Limitations: prototype quality, not a photorealistic reconstruction. Body editing currently uses mesh scaling, not production blend shapes or sculpting. Detailed facial morphs, imported meshes, advanced anatomy, IK, cloth/hair simulation and physics remain future work. Three.js loads from jsDelivr, so internet is required on first launch and for the 3D scene.

## Build
Open this folder in Android Studio with Android SDK 35 installed. Build > Build APK(s). Output: app/build/outputs/apk/debug/app-debug.apk.
