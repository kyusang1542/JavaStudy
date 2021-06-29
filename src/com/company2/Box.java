package com.company2;

//Generic
//<E>는 가상의 타입을 지정해주는 것을 의미함
public class Box<E> {
    private Object obj;

    public void setObj(Object obj){
        this.obj = obj;
    }

    public Object getObj(){
        return obj;
    }

    private E obj2;

    public void setObj2(E obj2){
        this.obj2 = obj2;
    }

    public E getObj2(){
        return obj2;
    }

}
