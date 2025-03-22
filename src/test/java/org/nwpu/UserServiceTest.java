package org.nwpu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UserServiceTest {
    @Test
    public void testGetAge() {
        UserService userService = new UserService();
        String idCard = "110101199001011234";// 1990年1月1日出生
        Integer age = new UserService().getAge(idCard);
        System.out.println("年龄: " + age);
    }

    @Test
    public void testGetGender() {
        UserService userService = new UserService();
        String idCard = "110101199001011234";// 男
        String gender = new UserService().getGender(idCard);
        assertEquals("男",gender, "性别不正确");
        System.out.println("性别: " + gender);
    }

    @DisplayName("测试身份证号的性别")
    @ParameterizedTest
    @ValueSource(strings = {
            "110101199001011234", // 男
            "110101199001011285", // 女
            "110101199001011236"  // 男
    })
    public void parameterTestGetGender(String id) {
        String gender = new UserService().getGender(id);
        System.out.println("性别: " + gender);

    }
}
