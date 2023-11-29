package fun.topc.seckill.utils;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

/**
 * 包名称：fun.topc.seckill.utils
 * 类名称：MD5Util
 * 类描述：MD5 的工具类
 * 创建人：@author Eric
 * 创建时间：2023年11月29日 21:42
 */
@Component
public class MD5Util {

    private static final String SALT = "1a2b3c4d";

    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }


    public static String inputPassToFromPass(String inputPass) {
        String str = SALT.charAt(0) + SALT.charAt(2) + inputPass + SALT.charAt(5) + SALT.charAt(4);
        return md5(str);
    }

    public static String fromPassToDBPass(String fromPass, String salt) {
        String str = salt.charAt(0) + salt.charAt(2) + fromPass + salt.charAt(5) + salt.charAt(4);
        return md5(salt);
    }

    public static String inputPassToDBPass(String inputPass, String salt) {
        String fromPass = inputPassToFromPass(inputPass);
        String dbPass = fromPassToDBPass(fromPass, salt);
        return dbPass;
    }

    public static void main(String[] args) {
        // ce21b747de5af71ab5c2e20ff0a60eea
        System.out.println(inputPassToFromPass("123456"));
        // 1897a69ef451f0991bb85c6e7c35aa31
        System.out.println(fromPassToDBPass("ce21b747de5af71ab5c2e20ff0a60eea", "1a2b3c4d"));
    }
}
