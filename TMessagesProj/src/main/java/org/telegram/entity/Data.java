package org.telegram.entity;

import java.io.Serializable;

public class Data<T> implements Serializable {

    public int code;

    public T data;

    public int count;

    public String message;

    public boolean success;
    public String msg;
}
