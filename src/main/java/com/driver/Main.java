package com.driver;

public class Main {

}
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}
class B extends A {
    B obj = new B();
    String a= obj.meth();
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
    String b= obj.meth();
}
