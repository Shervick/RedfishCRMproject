@echo off
setlocal
for /d %%x in (C:\Users\E001291\Desktop\BH\Red Fish\RedFish Automation\Script\RedfishCRMproject\target\cucumber-html-reports\*.*) do "C:\Program Files\PeaZip\peazip.exe" a -tzip "%%x.zip" "%%x\"
endlocal
exit