package com.jialidun.hello;

public class HelloWorld {
    private static final int CODE_LENGTH = 6;
    private static final String CODE_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    
    public static void main(String[] args) {
        System.out.println("Hello World!");

        
        // 调用验证码生成方法并打印
        String verificationCode = generateVerificationCode();
        System.out.println("生成的验证码是：" + verificationCode);
    }

    /**
     * 生成随机验证码
     * @return 6 位随机验证码（包含数字和大小写字母）
     */
    public static String generateVerificationCode() {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < CODE_LENGTH; i++) {
            int index = (int) (Math.random() * CODE_CHARS.length());
            code.append(CODE_CHARS.charAt(index));
        }
        return code.toString();
    }
}
//


