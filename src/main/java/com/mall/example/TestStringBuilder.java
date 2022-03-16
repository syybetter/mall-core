package com.mall.example;

import com.mall.core.StringBuilder;

public class TestStringBuilder {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("172");
        builder.append("2e299");
        builder.append("fmlkenklenklenklenlenleknklenel2e299");

        System.out.println(builder.toString());
    }
}
