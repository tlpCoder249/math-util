/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phucldh.util;

/**
 *
 * @author Admin
 */
public class MathUtility {

    // Làm cái hàng fake giống như hàng thật
    // JDK có class java.util.Math và nó có 1 loạt các hàm static vd .abs(), .sin(), .sqrt(), .pow(a,b), .PI
    public static final double PI = 3.1415;

    // hàm tính n giai thừa vì n giai thừa tăng nhanh nên mình chỉ tính 20 giai từ là tối đa
    // 21 giai thừa là tràn long 
    // âm giai thừa là k tính được, nếu tham số n âm mình sẽ chửi. ném về Exception
    // 0 giai thừa là bằng 1, quy ước 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 1 and 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        // sống sót đến câu lệnh này thì tức là n= 2... 20 rồi,thằng nào xài else là biết tay ông
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
