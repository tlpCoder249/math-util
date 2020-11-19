/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phucldh.util.test;

import org.junit.Test;
import static org.junit.Assert.*;
import phucldh.util.MathUtility;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {

    @Test // đây là kí hiệu của Junit đưa ra nó sẽ biến hàm sau đây thành hàm main
    // public static void main() app sẽ có nhiều main() nên là muốn dùng phải Shift F6
    public void getFactorial_RunsWell_IfValidArgument() {
        // Đây là 1 trong những cách đặt tên cho hàm test, để test code chính
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(240, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
        // Xanh chỉ đạt được khi tất cả cùng xanh, hàm ý tất cả đều đúng hết
        // Đỏ chỉ cần 1 thằng đỏ thì coi như đỏ tất cả
        // --> Hàm đã đúng thì phải đúng hết, sai 1 cái hay vài cái thì là hàm k đáng tin
    }

}
// Viết code để test code chính (MathUtility)
// Viết code dùng thư viện JUnit,NUnit,xUnit,... để test xem hàm code chính chạy ổn k
// trước khi đem qua bên QC r bên khách hàng trải nghiệm và thư viện này cung cấp cái 
// cơ chế báo đúng sai qua màu sắc xanh và đỏ mắt chúng ta chỉ nhìn vào 2 màu là đủ khỏi 
// cần so sánh excepted và actual rồi kết thúc
