/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.dattgt.mathutil.core.test;

import org.dattgt.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author DatTGT
 */
public class MathUtilityDDTTest {
    
    public static Object[][] initTestData() {       
        Integer testData[][] = {{0, 1}, 
                                {1, 1}, 
                                {2, 2}, 
                                {3, 6}, 
                                {5, 1200}};
                              // n - expected
                            // cột0 - cột 1
        return testData;
    }
    //NHỒI DATA Ở TRÊN VÀO TRONG HÀM assertEquals(expected-cột1, getF(cột0));
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}

/* 
- Kĩ thuật DDT - Data Driven Testing - Tách DATA kiểm thử ra khỏi câu lệnh 
ASSERT() cho dễ theo dõi, dễ bảo trì các bộ TEST CASE, các bộ TEST DATA

- Thường dùng mảng 2 chiều để chứa bộ DATA TEST
- MẢNG 2 CHIỀU GỒM: CÁC INPUT, VÀ EXPECTED
- CÁC UNIT TEST FRAMEWORK TỰ ĐỘNG BIẾT CÁCH TRÍCH TỪNG CẶP INPUT/EXPECTED Ở TRONG
MẢNG RA RỒI NHỒI VÀO TRONG HÀM SO SANH

- MẢNG DỮ LIỆU TEST CASE PHẢI LÀ PUBLIC STATIC - QUY ƯỚC
*/