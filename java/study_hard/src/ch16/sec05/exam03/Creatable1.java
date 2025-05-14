package ch16.sec05.exam03;

import java.lang.reflect.Member;

@FunctionalInterface
public interface Creatable1 {
    public Member create(String id);
}
