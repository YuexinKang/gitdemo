package com.soft1841.Demo9;

public class LoggerFieelSystem implements Logger {
    @Override
    public void log(String message) {
        System.out.println("日至输出到本地系统"+message);
    }
}
