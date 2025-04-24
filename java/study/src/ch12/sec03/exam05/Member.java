package ch12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;


@Data
public class Member {
    private String id;
    @NonNull
    private String name;
    private int age;
}
