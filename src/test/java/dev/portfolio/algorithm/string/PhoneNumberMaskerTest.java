package dev.portfolio.algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneNumberMaskerTest {

    private final PhoneNumberMasker phoneNumberMasker = new PhoneNumberMasker();

    @Test
    void 열한_자리_번호의_뒤_네_자리만_남긴다() {
        String result = phoneNumberMasker.solve("01033334444");

        assertEquals("*******4444", result);
    }

    @Test
    void 아홉_자리_번호의_뒤_네_자리만_남긴다() {
        String result = phoneNumberMasker.solve("027778888");

        assertEquals("*****8888", result);
    }

    @Test
    void 네_자리_번호는_그대로_반환한다() {
        String result = phoneNumberMasker.solve("1234");

        assertEquals("1234", result);
    }

    @Test
    void 다섯_자리_번호는_첫_글자만_가린다() {
        String result = phoneNumberMasker.solve("12345");

        assertEquals("*2345", result);
    }

    @Test
    void 최대_길이에서도_뒤_네_자리의_0을_보존한다() {
        String result = phoneNumberMasker.solve("12345678901234560001");

        assertEquals("****************0001", result);
    }
}
