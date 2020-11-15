package pl.mr.javagdy4.spring.pet_demo.model;

import lombok.Getter;

@Getter
public enum Race {
    LABRADOR("labrador"),
    HUSKY("husky"),
    GOLDEN_RETRIEVER("golden"),
    MOPS("mops"),
    JAMNIK("jamnik"),
    CHIUHUAHUA("tyrytyty");

    private final String commonName;

    Race(String commonName) {
        this.commonName = commonName;
    }

}
