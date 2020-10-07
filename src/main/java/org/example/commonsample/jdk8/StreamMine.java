package org.example.commonsample.jdk8;

import org.example.commonsample.domain.Employee;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Description: StreamMine
 * @Author: gedachao
 * @Date: 2020-10-06 15:53
 * @Version 1.0
 */
public class StreamMine {
    /**
     * 生成流的几种方式
     */
    @Test
    public void test1() {
        // 1. Collection对象中的stream()和parallelStream()方法
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("pig");
        list.add("monkey");
        list.add("donkey");
        Stream<String> stream = list.stream();
        // 遍历
        // stream.forEach(s -> System.out.println(s));
        stream.forEach(System.out::println);
        System.out.println("---------------->");

        // 2. Arrays工具类的stream()方法
        String[] arr = {"cat", "dog", "pig"};
        Stream<String> arrayStream = Arrays.stream(arr);
        arrayStream.forEach(System.out::println);
        System.out.println("----------------->");

        // 3. Stream接口中的of iterate,generate方法
        Stream<Integer> stream1 = Stream.of(10, 20, 30, 40, 50);
        stream1.forEach(System.out::println);
        System.out.println("----------------->");
        // 迭代流
        Stream<Integer> stream2 = Stream.iterate(0, x -> x + 2);
        stream2.limit(10).forEach(System.out::println);
        System.out.println("------------------>");
        // 生成流
        Stream<Integer> stream3 = Stream.generate(() -> new Random().nextInt(100));
        stream3.limit(10).forEach(System.out::println);
        System.out.println("------------------>");
        // IntStream,LongStream,DoubleStream 的of,range,rangeClosed
        IntStream intStream = IntStream.of(100, 200, 300);
        IntStream intStream1 = IntStream.range(0, 10);
        intStream1.forEach(System.out::println);

    }

    /**
     * 中间操作1
     */
    @Test
    public void test2() {
        Employee liu = new Employee("小刘", 25000);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("小王", 15000));
        list.add(new Employee("小李", 12000));
        list.add(new Employee("小张", 18000));
        list.add(new Employee("小孙", 20000));
        list.add(liu);
        list.add(liu);
        // 中间操作:filter,limit,skip,distinct,sorted
        System.out.println("filter -------------> salary大于15000");
        list.stream()
                .filter(employee -> employee.getSalary() > 15000)
                .forEach(System.out::println);
        System.out.println("limit --------------->限制输出2个元素");
        list.stream()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("skip --------------->跳过2个元素");
        list.stream()
                .skip(2)
                .forEach(System.out::println);
        System.out.println("distinct ------------->去重");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("sorted ----------->排序");
        list.stream()
                .sorted((e1, e2) -> {
                    return e1.getSalary() > e2.getSalary() ? 1 : -1;
                })
                .forEach(System.out::println);
        System.out.println("map ----------------> 获取员工姓名");
        list.stream()
                .map(employee -> employee.getName())
                .forEach(System.out::println);
        System.out.println("map ----------------> 采用多线程");
        list.parallelStream()
                .map(employee -> employee.getName())
                .forEach(System.out::println);
    }

    /**
     * 终止操作 foreach min max count,reduce,collect
     */
    @Test
    public void test3() {
        Employee liu = new Employee("小刘", 25000);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("小王", 15000));
        list.add(new Employee("小李", 12000));
        list.add(new Employee("小张", 18000));
        list.add(new Employee("小孙", 20000));
        list.add(liu);
        list.add(liu);
        System.out.println("min -----------> 获取最小");
        Optional<Employee> min = list.stream()
                .min((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1);
        System.out.println(min.get());
        System.out.println("collect --------> 获取name 集合");
        List<String> nameList = list.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        System.out.println(nameList);


    }


}
