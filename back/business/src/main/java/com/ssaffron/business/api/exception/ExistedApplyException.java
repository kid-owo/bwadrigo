package com.ssaffron.business.api.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExistedApplyException extends RuntimeException{

    // 사용하지 않는 것 같음 모든 테스트 후 사용되지 않으면 삭제 예정
    private ErrorCode errorCode;

    public ExistedApplyException(String message){
        super(message);
    }

    public ErrorCode getErrorCode(){
        return this.errorCode;
    }

}
