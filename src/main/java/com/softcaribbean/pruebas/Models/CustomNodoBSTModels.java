package com.softcaribbean.pruebas.Models;

public class CustomNodoBSTModels<T> {
    private Integer key;
    private T data;
    private CustomNodoBSTModels<T> prev;
    private CustomNodoBSTModels<T> next;
    private CustomNodoBSTModels<T> parent;

    public CustomNodoBSTModels(Integer key) {
        this.key = key;
        this.parent = null;
        this.prev = null;
        this.next = null;
    }

    public Integer getKey() {
        return key;
    }

    public CustomNodoBSTModels<T> getPrev() {
        return prev;
    }

    public CustomNodoBSTModels<T> getNext() {
        return next;
    }

    public CustomNodoBSTModels<T> getParent() {
        return parent;
    }

    public void setPrev(CustomNodoBSTModels<T> prev) {
        this.prev = prev;
    }

    public void setNext(CustomNodoBSTModels<T> next) {
        this.next = next;
    }

    public void setParent(CustomNodoBSTModels<T> parent) {
        this.parent = parent;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
