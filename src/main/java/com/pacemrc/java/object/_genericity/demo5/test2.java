package com.pacemrc.java.object._genericity.demo5;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 测试jdk自带的TreeSet类的类型通配符下限
 * TreeSet(Comparator<? super E> comparator)
 */
public class test2 {
    public static void main(String[] args) {

        AnimalComparator animalComparator = new AnimalComparator();
        CatComparator catComparator = new CatComparator();
        SubCatComparator coffeeCatComparator = new SubCatComparator();
        //TreeSet<Cat>，则表明TreeSet(Comparator<? super Cat> comparator),满足的参数类型必须是Cat及其父类
        TreeSet<Cat> treeSet = new TreeSet<>(animalComparator);//Animal是Cat父类，满足要求
//        TreeSet<Cat> treeSet = new TreeSet<>(catComparator);//Cat类本身，满足要求
//        TreeSet<Cat> treeSet = new TreeSet<>(coffeeCatComparator);//SubCat是Cat类的子类，不满足要求
        treeSet.add(new Cat("Amy",20,1));
        treeSet.add(new Cat("Tom",24,2));
        treeSet.add(new Cat("Bob",19,3));

        for (Animal animal : treeSet) {
            System.out.println(animal);
        }

    }
}
class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.Name.compareTo(o2.Name);//根据Name字段排序
    }
}

class CatComparator implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.age - o2.age;//根据Age字段排序
    }
}

class SubCatComparator implements Comparator<SubCat>{
    @Override
    public int compare(SubCat o1, SubCat o2) {
        return o1.level - o2.level;//根据Level字段排序
    }
}
