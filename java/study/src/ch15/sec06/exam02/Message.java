package ch15.sec06.exam02;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Message {
    public String command;
    public String to;
}