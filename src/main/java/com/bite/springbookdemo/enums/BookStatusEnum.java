package com.bite.springbookdemo.enums;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public enum BookStatusEnum {
    DELETED(0, "删除"),
    NORMAL(1, "正常"),
    FORBIDDEN(2, "不允许借阅");

    private final Integer code;
    private final String desc;

    BookStatusEnum(Integer code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    public BookStatusEnum getStatusByCode(Integer code) {
        return switch (code) {
            case 0 -> BookStatusEnum.DELETED;
            case 1 -> BookStatusEnum.NORMAL;
            case 2 -> BookStatusEnum.FORBIDDEN;
            default -> null;
        };
    }
}
