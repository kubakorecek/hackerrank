package com.utils.datastructure.trees;

public interface ITrees<T extends Number, TNode> {

    void insert();

    void delete();

    T max();

    T min();
}
