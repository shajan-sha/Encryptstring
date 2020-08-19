package com.maranatha;

import java.util.Scanner;

public class EncryptString {

        private String _originalString;
        private String _encryptedString;

        public String originalString(){
            return _originalString;
        }
        public String encryptedString(){
            return _encryptedString;
        }
        public void getInput(){
            Scanner in = new Scanner(System.in);
            System.out.println("enter the input name");
            _originalString = in.nextLine();

        }
        public String Encrypt() {
            _encryptedString = new String();
            _encryptedString = "";
            char c;
            for (int i = 0; i < _originalString.length() - 1; i++) {
                c = _originalString.charAt(i);
                c = (char) ((int) c - 1);
                _encryptedString += Character.toString(c);
            }
            return _encryptedString;
        }
    }


