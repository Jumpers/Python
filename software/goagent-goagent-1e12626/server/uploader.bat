@echo off

set uploaddir=python

(
    echo ===============================================================
    echo  GoAgent����˲������, ��ʼ�ϴ�%uploaddir%�����
    echo ===============================================================
    echo.
    echo ����������appid, ���appid����^|�Ÿ���
) && (
    @cd /d "%~dp0"
) && (
    if exist ".appcfg_cookies" (@del /f /q .appcfg_cookies)
) && (
    "..\local\python27.exe" uploader.zip
) && (
    echo.
    echo �ϴ��ɹ����벻Ҫ���Ǳ༭proxy.ini�����appid���ȥ��лл����������˳�����
)

@pause>NUL

@echo off
