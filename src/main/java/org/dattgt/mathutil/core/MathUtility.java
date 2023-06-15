package org.dattgt.mathutil.core;

public class MathUtility {

    public static final double PI = 3.1415;

    // hàm tính n! = 1.2....n
    // 0! = 1! = 1
    // ko có giai thừa cho số âm
    // 21! là vượt kiểu long, vượt 18 con số 0
    // gài ràng buộc đầu vào cho hàm/method
    // mình ko chấp nhận n > 20
    public static long getFactorial(int n) {
        long product = 1; // tích ban đầu = 1
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if (n == 0 || n == 1) 
            return 1;
        
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
    // return sớm để hàm không báo lỗi
}
