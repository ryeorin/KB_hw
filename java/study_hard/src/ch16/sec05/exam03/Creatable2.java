package ch16.sec05.exam03;


import java.lang.reflect.Member;

@FunctionalInterface
public interface Creatable2 {
    public Member create(String id, String name);
}
