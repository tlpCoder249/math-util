/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phucldh.main;

import phucldh.util.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("5!= " + MathUtility.getFactorial(5));
        // tui gọi hàm tính 5 giai thừa hy vọng nó trả về 120
        // lát hồi hàm chjay coi thực tế bằng mấy (actual)
        // tui so sáng với cái tui kì vọng trước khi tính expeccted 120
        // actual == expeccted hàm chạy đúng cho tình huống này test case này đúng
        System.out.println("0!= " + MathUtility.getFactorial(0));
        // expeccted  = 1
        // actual chạy xong ms biết hàm đúng sai
        System.out.println("-5!= " + MathUtility.getFactorial(-5));
        // expeccted  = đập vào mặt Illegal Argument Exception
        // cách test này gọi là manual vì ta phải nhìn bằng mắt để luận kết quả

        // cách xin xò ta dùng màu sắc xanh đỏ để mà luận kết quả đúng sai của hàm
        // Cách này là cách test automation
        // thứ 3 ông giảng tiếp
        
    }
}
