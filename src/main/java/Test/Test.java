package Test;

import Dao.Dao;
import Dto.Dto;

public class Test {
    public static void main(String[] args) {
        int num = 2;
        String name = "김보영2";
        String id = "qhdud20";
        String pw = "kkbbyy11";
        String gender = "여자";
        String mail = "qhdud20@naver.com";
        String phone = "010-2449-6358";

        Test.addUserData(num, name, id, pw, gender, mail, phone);
    }

    public static void addUserData(int num, String name, String id, String pw, String gender, String mail, String phone) {
        Dto dto = new Dto(num, name, id, pw, gender, mail, phone);
        Dao dao = new Dao();

        int count = dao.addUser(dto);
        System.out.println(count);
    }
}
