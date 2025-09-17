package com.zhihu.matisse.internal.utils;

import android.util.Base64;

import java.util.zip.CRC32;

public class LoaderIdUtils {

    public static int stringToInt(String str) {
        // Base64 编码
        String base64 = Base64.encodeToString(str.getBytes(),Base64.DEFAULT);
        // CRC32 生成一个 32 位整数
        CRC32 crc32 = new CRC32();
        crc32.update(base64.getBytes());
        int num = (int) crc32.getValue(); // CRC32 返回 long，这里转 int
        return num;
    }
}
