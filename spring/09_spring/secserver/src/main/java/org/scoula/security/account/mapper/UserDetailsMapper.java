package org.scoula.security.account.mapper;

import org.scoula.security.account.domain.MemberVO;

public interface UserDetailsMapper {

    // 로그인 처리할 때 db 연동할 기능을 정의하면 됨
    MemberVO get(String username);
}
