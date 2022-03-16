package com.mall.core;

import java.util.Arrays;

public class StringBuilder {

    private int count;
    private byte [] value;

    public StringBuilder() {
        this.value = new byte[16];
    }

    public StringBuilder(int capacity) {
        this.value = new byte[capacity];
    }


    public StringBuilder append(String str) {
        if (str == null) {
            return this;
        }
        int len = str.length();

        ensureCapacityInternal(count + len);

        putStringAt(count, str);

        count += len;
        return this;
    }

    private void ensureCapacityInternal(int minCapacity) {
        int oldCapacity = this.value.length;

        if (minCapacity > oldCapacity) {
            this.value = Arrays.copyOf(this.value, newCapacity(minCapacity));
        }
    }

    private int newCapacity(int minCapacity) {
        int oldCapacity = value.length;
        int newCapacity = (oldCapacity << 1) + 2;
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        return newCapacity;
    }

    private void putStringAt(int count, String str) {
        System.arraycopy(str.getBytes(), 0 , this.value, count, str.getBytes().length);
    }

    @Override
    public String toString() {
        return new String(this.value, 0, this.count);
    }
}
