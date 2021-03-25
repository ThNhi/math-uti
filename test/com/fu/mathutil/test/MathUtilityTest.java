/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.test;

import com.fu.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {

    @Test //bien ham nay thanh main(), Shift-Fn-F6 de run
    //goi ham getF() nhu thuong le, hay hon la tu dong ss gium
    //expected va actual coi co khop nhau ko? Neu co thay mau xanh
    //Neu ko khop thay mau do. Ta chi nhin mau ma ko can mat cong ss nua!!!!
    public void testFactorialRighArgumentRunsWell() {
        long expected = 120; //mun biet 5! co dung = 120 ko
        int n = 5; //dau vao = 5
        long actual = MathUtility.getFactorial(n); //tinh thiet coi
        //va ss gium di
        
        assertEquals(expected, actual);
        
        //tui sẽ test các tình huống còn lại
        assertEquals(720, MathUtility.getFactorial(6)); //6! co phai = 720 ???
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //0! là 1 tình huống cần test
        //1! là 1 tình huống khác cần test
        //6! là 1 tình huống khác cần test
        //TÌNH HUỐNG: TEST CASE. NGHỀ TESTER/QC LÀ NGHỀ NGHĨ RA CÁC TEST CASE, SAU ĐÓ THỬ NGHIỆM
        
        //assertEquals(0, MathUtility.getFactorial(0));
        //kì vọng sai, tính đúng -> 1 màu đỏ, ko khớp màu
        //kì vọng đúng, tính sai -> 1 màu đỏ
        //tao hi vọng 5! = 120, mày tính ra mấy, hàm mày tính ra mấy?
    }

    
    
    //ta test phần ngoại lệ - exception
    //exception là tình huống bất thường xẩy ra trong code khi thực thi
    //Nó ko phải là 1 value để có thể so sánh
    //VD: Lỗi SQL trùng key, sai khóa ngoại, null trên cột yêu cầu khác null
    // đều là lỗi liên quan SQL nhưng ko thể nói thằng nào = thằng nào
    //Đối với EXCEPTION chỉ có thể đo nó = câu hỏi: MÀY CÓ XUẤT HIỆN KO?
    //ko dùng assertEquals() so-sánh-coi-có-bằng-nhau-hay-ko
    //trong thiết kế của hàm getFactorial() thì nếu đưa vào n < 0 hoặc n > 2
    //thì hàm ném ra, sẽ new 1 ngoại lệ
    //cứ dưa n vi phạm, nhận về ngoại lệ
    //vậy nếu có ngoại lệ xày ra khi n đưa vào cà chớn < 0 > 21
    //CÓ NGHĨA RĂNGF HÀM CHẠY ĐÚNG, THẤY NGOẠI LỆ TA LẠI ĂN MỪNG VÌ CHẠY NHƯ THIẾT KẾ
    //-> ĐÚNG CÓ NGOẠI LỆ TA CẦN NÓ XUẤT HIỆN -> MÀU XANH
    //SẼ CÓ TEST CASE, TÌNH HUỐNG TEST: XEM NGOẠI LỆ CÓ xh KO, CÓ => XANH
                                                         //KO XH NHƯ DỰ KIẾN => ĐỎ
    
    @Test(expected = IllegalArgumentException.class )
    public void testFactorialGivenWrongArgumentThrowException(){
        MathUtility.getFactorial(-30); //phai XH Exception
//        MathUtility.getFactorial(-10); //phai XH Exception
//        MathUtility.getFactorial(21); //phai XH Exception
//        MathUtility.getFactorial(40); //phai XH Exception
        
        //neu XH Exception nhu ki vong => XANH
        //Vi mau xanh here ham y rang ham chay nhu thiet ke, nem ngoai le khi dua n ca chon!!!!
        
        //TA CẦN KĨ THUẬT ĐỂ BẮT NGOẠI LỆ, ĐÚNG NGOẠI LỆ CẦN BẮT XUẤT HIỆN
        //TA CÓ XANH
    }
    
    
}
