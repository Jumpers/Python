adb push event_record /sdcard/record
adb push event_replay /sdcard/replay
adb shell su -c 'cp /sdcard/record  /data/local/record'
adb shell su -c 'cp /sdcard/replay  /data/local/replay'
adb shell su -c 'chmod 777 /data/local/record'
adb shell su -c 'chmod 777 /data/local/replay'
pause